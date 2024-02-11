<link rel="stylesheet" type="text/css" href="styling.css">

<?php 

    require_once('DatabaseHelper.php');
    $database = new DatabaseHelper();
    error_reporting(E_ALL ^ E_WARNING);

    $pizzerias = array();
    if (isset($_POST['btn'])) {
        $pizzerias = $database->fetchPizzerias();
    }
?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>ZIP</th>
                <th>Street</th>
                <th>Average Salary</th>
            </tr>
        </thead>    
        <tbody>
            <?php foreach ($pizzerias as $pizzeria) : ?>
                <tr class="css_row">
                    <td><?php echo $pizzeria['PIZZERIAID']?></td>
                    <td><?php echo $pizzeria['PIZZERIANAME']; ?>  </td>
                    <td><?php echo $pizzeria['ZIP']; ?>  </td>
                    <td><?php echo $pizzeria['STREET']; ?>  </td>
                    <td><?php 
                        $avgSalary = $database->fetchAvgSalary($pizzeria['PIZZERIANAME']);
                        foreach($avgSalary as $element) {
                            echo $element['AVERAGE'] . '$';
                        }
                    ?></td>
                </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</div>


<br>
<br>
<br>

<a href="index.php" class="link">
    Return to main page
</a>

<br>
<br>
<br>

<form method="post" action="insertPizzeria.php" class="form">
    <div>
        <label for="pizzeria">Name:</label>
        <input id="pizzeria" name="pizzeria" type="text" required placeholder="Please enter new name." maxlength="64">
    </div>
    <br>
    <div>
        <label for="zip">ZIP code:</label>
        <input id="zip" name="zip" type="text" required placeholder="Please enter ZIP." maxlength="16">
    </div>
    <br>
    <div>
        <label for="street">Street:</label>
        <input id="street" name="street" type="text" required placeholder="Please enter street." maxlength="32">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Insert pizzeria</button>
    </div>
</form>

<br>

<form method="post" action="getEmployees.php" class="form">
    <div>
        <label for="id">ID:</label>
        <input id="id" name="id" type="number" min="1" required placeholder="Please enter id.">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Get employees</button>
    </div>
</form>

<br>

<form method="post" action="deletePizzeria.php" class="form">
    <div>
        <label for="id">ID:</label>
        <input id="id" name="id" type="text" required placeholder="Please enter id." maxlength="64">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Delete pizzeria</button>
    </div>
</form>

<br>

<form method="post" action="updatePizzeria.php" class="form">
    <div>
        <label for="id">ID:</label>
        <input id="id" name="id" type="number" min="0" required placeholder="Please enter id.">
    </div>
    <div>
        <label for="name">New name:</label>
        <input id="name" name="name" type="text" required placeholder="Please enter name." maxlength="64">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Update pizzeria</button>
    </div>
</form>

<br>

<form method="post" action="getManager.php" class="form">
    <div>
        <label for="id">Pizzeria ID:</label>
        <input id="id" name="id" type="number" min="0" required placeholder="Please enter id.">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Display manager</button>
    </div>
</form>