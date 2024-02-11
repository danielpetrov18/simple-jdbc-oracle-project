<?php
class DatabaseHelper
{
    const username = "a12028482";
    const password = "1337_7331_2000"; 
    const con_string = "//oracle19.cs.univie.ac.at:1521/orclcdb";
    protected $conn; 

    public function __construct()
    {
        try {
            $this->conn = oci_connect(DatabaseHelper::username, DatabaseHelper::password, DatabaseHelper::con_string);
            if (!$this->conn) {
                die("DB error: Connection can't be established!");
            }
            error_reporting(E_ALL ^ E_WARNING);

        } catch (Exception $e) { die("DB error: {$e->getMessage()}"); }
    }

    public function __destruct() { oci_close($this->conn); }

    public function fetchPizzas() {
        $sql = "SELECT * FROM Pizza";
        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        // 32 = OCI_FETCHSTATEMENT_BY_ROW
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }

    public function fetchIngredients($pizza) {
        $sql = "select i.name from ingredient i join pizzaIngredient ing 
                    on i.ingredientId = ing.ingredientNr
                    where pizName = UPPER('{$pizza}')";
        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }

    public function insertIntoPizza($pizza, $price) {
        $sql = "INSERT INTO Pizza(pizzaName, price) VALUES(UPPER('{$pizza}'), '{$price}')";
        $statement = oci_parse($this->conn, $sql);
        $result = oci_execute($statement) && oci_commit($this->conn);
        oci_free_statement($statement);
        return $result;
    }

    public function updatePizza($pizza, $price) {
        $sql = "UPDATE Pizza SET price = '{$price}' WHERE pizzaName = UPPER('{$pizza}')";
	    $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        $result = oci_num_rows($statement) >= 1 ? true : false;
	    oci_free_statement($statement);
	    return $result;
    }

    public function deleteFromPizza($name) {
        // delete orders that contain that particular pizza
        $sql1 = "delete from orderContent where orderedPizza = UPPER('{$name}')";
        $statement1 = oci_parse($this->conn, $sql1);
        oci_execute($statement1) && oci_commit($this->conn);

        // delete pizza from ingredient table
        $sql2 = "delete from pizzaIngredient where pizName = UPPER('{$name}')";
        $statement2 = oci_parse($this->conn, $sql2);
        oci_execute($statement2) && oci_commit($this->conn);

        // delete pizza from database
        $sql3 = "delete from pizza where pizzaName = UPPER('{$name}')";
        $statement3 = oci_parse($this->conn, $sql3);
        oci_execute($statement3) && oci_commit($this->conn);
        $result = oci_num_rows($statement3) >= 1 ? true : false;

        oci_free_statement($statement1);
        oci_free_statement($statement2);
        oci_free_statement($statement3);
        return $result;
    }

    public function getOrders($pizza) {
        $sql = "select per.surname, per.lastname, c.telephoneNumber, p.pizzaName, p.price, con.ammount, o.orderDate from pizza p 
        join orderContent con 
            ON p.pizzaName = con.orderedPizza 
        join customer c 
            on con.custId = c.cId
        join person per 
            on per.pId = c.cId
        join orders o
            on con.ordId = o.orderId
        where p.pizzaName = UPPER('{$pizza}')";

        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }

    public function fetchPizzaWithIngredient($ingredient) {
        $sql = "select ing.pizName from ingredient i join pizzaIngredient ing 
                    on i.ingredientId = ing.ingredientNr
                    where i.name = UPPER('{$ingredient}')";

        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }

    public function fetchPizzerias() {
        $sql = "SELECT * FROM Pizzeria";
        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }

    public function fetchAvgSalary($pizzeria) {
        $sql = "select round(avg(salary)) as average from pizzeria p
                    join workplace w on p.pizzeriaId = w.workplaceId 
                    join employee e on w.empId = e.eId
                    where pizzeriaName = UPPER('{$pizzeria}')";

        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }

    public function insertPizzeria($pizzeria, $zip, $street) {
        $sql = "INSERT INTO Pizzeria(pizzeriaName,zip,street) VALUES(UPPER('{$pizzeria}'), UPPER('{$zip}'), UPPER('{$street}'))";
        $statement = oci_parse($this->conn, $sql);
        $check = oci_execute($statement) && oci_commit($this->conn);
        oci_free_statement($statement);
        return $check;
    }

    public function getEmployees($id) {
        $sql = "select e.eid, p.surname, p.lastname, e.startDate, e.salary from person p 
        join employee e on p.pid = e.eid 
        join workplace w on e.eid = w.empId 
        join pizzeria piz on w.workplaceId = piz.pizzeriaId
        where w.workplaceId = ('{$id}')
        order by e.eid asc";
        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }
    public function deletePizzeria($id) {
        $sql1 = "UPDATE Workplace SET workplaceId = NULL where workplaceId = ('{$id}')";
        $statement1 = oci_parse($this->conn, $sql1);
        oci_execute($statement1) && oci_commit($this->conn);

	    $sql2 = "DELETE FROM Pizzeria WHERE pizzeriaId = ('{$id}')";
	    $statement2 = oci_parse($this->conn, $sql2);
        oci_execute($statement2) && oci_commit($this->conn);

        $result = oci_num_rows($statement2) >= 1 ? true : false;
	    oci_free_statement($statement1);
        oci_free_statement($statement2);
	    return $result;
    }
    public function updatePizzeria($id, $name) { 
        $sql1 = "UPDATE Pizzeria SET pizzeriaName = UPPER('{$name}') WHERE pizzeriaId = ('{$id}')";       
	    $statement1 = oci_parse($this->conn, $sql1);
        oci_execute($statement1) && oci_commit($this->conn);

        $result = oci_num_rows($statement1) >= 1 ? true : false;
	    oci_free_statement($statement1);
	    return $result;
    }

    public function getPizzeriaManager($id) {
        $sql = "
        select p.surname, p.lastname, e.salary, e.startDate, piz.pizzerianame, piz.zip, piz.street from workplace wp join employee e
            on wp.empid = e.eid
        join pizzeria piz 
            on wp.workplaceId = piz.pizzeriaId
        join person p 
            on e.eid = p.pid
        where bid is null and workplaceId = ('{$id}')";       
	    $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
	    oci_free_statement($statement);
	    return $res;
    }

    public function decreaseSalary($id, $percentage){
        $nrows = 0;
        $sql = 'BEGIN decreaseSalary(:id, :percentage, :nrows); END;';
        $statement = oci_parse($this->conn, $sql);
   
        oci_bind_by_name($statement, ':id', $id);
        oci_bind_by_name($statement, ':percentage', $percentage);
        oci_bind_by_name($statement, ':nrows', $nrows);
   
        oci_execute($statement) && oci_commit($this->conn);
        oci_free_statement($statement);
        return $nrows;
    }

    public function fetchEmployees() {
        $sql = "SELECT e.eid, p.surname, p.lastname, e.salary, e.startDate FROM employee e 
            join person p on e.eID = p.pID order by e.eid";
        $statement = oci_parse($this->conn, $sql);
        oci_execute($statement) && oci_commit($this->conn);
        oci_fetch_all($statement, $res, null, null, 32);
        oci_free_statement($statement);
        return $res;
    }
}
?>