import java.sql.*;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import javax.xml.transform.Result;

public class InsertData {

    public static void main(String args[]) {

        // separate class for data
        Data data = new Data();

        // insertion logic
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(data.getDatabase(), data.getUsername(), data.getPass());

            String pizInsert = "INSERT INTO pizzeria(pizzeriaName, ZIP, street) VALUES(UPPER(?), UPPER(?), UPPER(?))";
            String perInsert = "INSERT INTO person(surname, lastname) VALUES(UPPER(?), UPPER(?))";
            String custInsert = "INSERT INTO customer(cID, telephoneNumber) VALUES(?, ?)";
            String empInsert = "INSERT INTO employee(eID, startDate, salary, bID) VALUES(?,?,?,?)";
            String workplaceInsert = "INSERT INTO workplace(empId, workplaceId) VALUES(?,?)";
            String pizzaInsert = "INSERT INTO pizza(pizzaName, price) VALUES(UPPER(?), ?)";
            String ingredientInsert = "INSERT INTO ingredient  (name) VALUES(UPPER(?))";
            String pizzaIngredientInsert = "INSERT INTO PizzaIngredient (pizName, ingredientNr) VALUES(UPPER(?), ?)";
            String orderInsert = "INSERT INTO orders(customerID, orderDate) VALUES(?, ?)";
            String orderContentsInsert = "INSERT INTO orderContent(ordID, custId, orderedPizza, ammount) VALUES(?, ?, UPPER(?), ?)";


            PreparedStatement pizStmt = con.prepareStatement(pizInsert);
            PreparedStatement perStmt = con.prepareStatement(perInsert);
            PreparedStatement custStmt = con.prepareStatement(custInsert);
            PreparedStatement empStmt = con.prepareStatement(empInsert);
            PreparedStatement workplaceStmt = con.prepareStatement(workplaceInsert); 
            PreparedStatement pizzaStmt = con.prepareStatement(pizzaInsert);
            PreparedStatement ingredientStmt = con.prepareStatement(ingredientInsert);
            PreparedStatement pizzaIngredientStmt = con.prepareStatement(pizzaIngredientInsert);
            PreparedStatement orderStmt = con.prepareStatement(orderInsert);
            PreparedStatement orderContentsStmt = con.prepareStatement(orderContentsInsert);


            try {
                // inserting pizzerias
                int upperBound = data.getPizzeria().length;
                for(int i = 0; i < upperBound; ++i) {
                    // id, name, zip, street
                    pizStmt.setString(1, data.getPizzeria()[i]);
                    pizStmt.setString(2, data.getZIP()[i]);
                    pizStmt.setString(3, data.getPizzStreet()[i]);
                    pizStmt.addBatch();
                }
                pizStmt.executeBatch();

                upperBound = data.getSurnames().length;
                // inserting people
                for(int i = 0; i < upperBound; ++i) {
                    perStmt.setString(1, data.getSurnames()[i]);
                    perStmt.setString(2, data.getLastnames()[i]);
                    perStmt.addBatch();
                }
                perStmt.executeBatch();

                // insert customers
                for(int i = 0; i < 500; ++i) {
                    custStmt.setInt(1, (i + 1));
                    custStmt.setString(2, data.generatePhone());
                    custStmt.addBatch();
                }
                custStmt.executeBatch();

                // insert employee
                int bossID = 0;
                for(int i = 500; i < 995; i++) {
                    // there are 995 - 500 employees (495) and 15 pizzerias => 33 employees per pizzeria
                    if((i - 500) % 33 == 0) {
                        bossID = i + 1;
                    }
                    // empId, ssn, salary, bossId
                    empStmt.setInt(1, (i + 1));
                    empStmt.setDate(2, data.generateDate());
                    empStmt.setDouble(3, Double.parseDouble(data.generateSalary()));
                    if((i - 500) % 33 != 0) {
                        empStmt.setInt(4, bossID);
                    }
                    else {
                        empStmt.setNull(4, Types.INTEGER);
                    }
                    empStmt.addBatch();
                }
                empStmt.executeBatch();

                // insert workplace relationship
                int workplaceId = 0;
                for(int i = 500; i < 995; i++) {
                    if((i - 500) % 33 == 0) {
                        workplaceId++;
                    }
                    workplaceStmt.setInt(1, (i + 1));
                    workplaceStmt.setInt(2, workplaceId);
                    workplaceStmt.addBatch();
                }
                workplaceStmt.executeBatch();

                // insert pizzas
                upperBound = data.getPizzaName().length;
                for(int i = 0; i < upperBound; ++i) {
                    pizzaStmt.setString(1, data.getPizzaName()[i]);
                    pizzaStmt.setDouble(2, data.getPizzaPrice()[i]);
                    pizzaStmt.addBatch();
                }
                pizzaStmt.executeBatch();

                // insert ingredients
                for(int i = 0; i < data.getIngredients().length; ++i) {
                    ingredientStmt.setString(1, data.getIngredient(i));
                    ingredientStmt.addBatch();
                }
                ingredientStmt.executeBatch();

                // create pizzaIngredient-relationship
                int ingredientNr = 1;
                for(int i = 0; i < data.getPizzaName().length; ++i) {
                    pizzaIngredientStmt.setString(1, data.getPizzaName()[i]);
                    // 5 random ingredients on every pizza
                    if(ingredientNr > 20) {
                        ingredientNr = 1;
                    }
                    for(int j = 0; j < 5; ++j) {
                        pizzaIngredientStmt.setInt(2, ingredientNr);
                        pizzaIngredientStmt.executeQuery();
                        ingredientNr++;
                    }  
                }

                // insert orders
                // 10000 as upper bound is hardcoded
                int customerId = 0;
                for(int i = 0; i < 10000; ++i) {
                    if(i % 20 == 0) {
                        customerId++;
                    }
                    orderStmt.setInt(1, customerId);
                    orderStmt.setDate(2, data.generateDate());
                    orderStmt.addBatch();
                }
                orderStmt.executeBatch();

                // insert contents of orders
                // have to insert custId as well
                customerId = 0;
                for(int i = 0; i < 10000; ++i) {
                    if(i % 20 == 0) {
                        customerId++;
                    }
                    orderContentsStmt.setInt(1, (i + 1));
                    orderContentsStmt.setInt(2, customerId);
                    orderContentsStmt.setString(3, data.generatePizzaName());
                    orderContentsStmt.setInt(4, data.generatePizzaCount());
                    orderContentsStmt.addBatch();
                }
                orderContentsStmt.executeBatch();
            }
            catch (Exception e) {
                System.err.println("Error while executing INSERT INTO statement: " + e.getMessage());
            }

            // 10000 orders are expected
            Statement stmt = con.createStatement();
            ResultSet rs = pizzaStmt.executeQuery("SELECT COUNT(*) FROM Orders");
            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Excepted Number is 10000\nNumber of datasets in the table Orders: " + count);
            }

            // closing all connections
            rs.close();
            stmt.close();
            pizStmt.close();
            perStmt.close();
            custStmt.close();
            empStmt.close();
            workplaceStmt.close();
            pizzaStmt.close();
            ingredientStmt.close();
            pizzaIngredientStmt.close();
            orderStmt.close();
            orderContentsStmt.close();
            con.close();
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}