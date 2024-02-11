<link rel="stylesheet" type="text/css" href="styling.css">

<?php

require_once('DatabaseHelper.php');
$database = new DatabaseHelper();

$id;
if(isset($_POST['id'])) {
    $id = $_POST['id'];
}

$employees = $database->getEmployees($id);
?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Surname</th>
                <th>Lastname</th>
                <th>Start Date</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>    
            <?php foreach ($employees as $employee)   : ?>
            <tr class="css_row">
                <td><?php echo $employee['EID']; ?></td>
                <td><?php echo $employee['SURNAME']; ?>  </td>
                <td><?php echo $employee['LASTNAME']; ?>  </td>
                <td><?php echo $employee['STARTDATE']; ?></td>
                <td><?php echo $employee['SALARY'] . '$'; ?></td>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</div>

<br>
<br>

<div>
        <a href="index.php" class="link"> Return to main page </a>
</div>

<br>
<br>
<br>

<div>
        <a href="returnDisplayPizzeria.php" class="link"> Display pizzerias </a>
</div>

<br>
<br>