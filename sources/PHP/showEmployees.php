<link rel="stylesheet" type="text/css" href="styling.css">

<br>
<br>
<br>
<a href="index.php" class="link"> Return to main page </a>

<div id="parent">   
    <form method="post" action="decreaseSalary.php">
        <div>
            <label for="id">ID:</label>
            <input id="id" name="id" type="number" min="0" required placeholder="Please enter id.">
        </div>
        <div>
            <label for="percentage">Percentage:</label>
            <input id="percentage" name="percentage" type="number" min="0" required placeholder="Please enter percentage">
        </div>
        <div>
            <button type="submit" name="btn" class="form-submit-button">RUN</button>
        </div>
    </form>
</div>

<?php
require_once('DatabaseHelper.php');
$database = new DatabaseHelper();
error_reporting(E_ALL ^ E_WARNING);

$employees;
if (isset($_POST['btn'])) {
    $employees = $database->fetchEmployees();
}
?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Surname</th>
                <th>Lastname</th>
                <th>Salary</th>
                <th>Start Date</th>
            </tr>
        </thead>    
        <tbody>
            <?php foreach ($employees as $employee) : ?>
                <tr class="css_row">
                    <td><?php echo $employee['EID']?></td>
                    <td><?php echo $employee['SURNAME']; ?>  </td>
                    <td><?php echo $employee['LASTNAME']; ?>  </td>
                    <td><?php echo $employee['SALARY'] . '$'; ?>  </td>
                    <td><?php echo $employee['STARTDATE']; ?>  </td>
                </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</div>


<br>
<br>