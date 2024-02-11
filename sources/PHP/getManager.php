<link rel="stylesheet" type="text/css" href="styling.css">

<?php

require_once('DatabaseHelper.php');
$database = new DatabaseHelper();

$id;
if(isset($_POST['id'])) {
    $id = $_POST['id'];
}

$manager = $database->getPizzeriaManager($id);
?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>Surname</th>
                <th>Lastname</th>
                <th>Salary</th>
                <th>Start Date</th>
            </tr>
        </thead>
        <tbody>    
            <?php foreach ($manager as $el)   : ?>
            <tr class="css_row">
                <td><?php echo $el['SURNAME']; ?></td>
                <td><?php echo $el['LASTNAME']; ?>  </td>
                <td><?php echo $el['SALARY'] . '$'; ?></td>
                <td><?php echo $el['STARTDATE']; ?></td>
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