<link rel="stylesheet" type="text/css" href="styling.css">

<?php
require_once('DatabaseHelper.php');
$database = new DatabaseHelper();
error_reporting(E_ALL ^ E_WARNING);

$id;
if (isset($_POST['id'])) {
    $id = $_POST['id'];
}

$percentage;
if(isset($_POST['percentage'])) {
    $percentage = $_POST['percentage'];
}

$rowsAffected = $database->decreaseSalary($id, $percentage);

if ($rowsAffected == 1) {
    echo ("Salary reduced by $percentage%!");
} else {
    echo ("Could not reduce salary by $percentage%!");
}

?>

<br>
<br>
<br>

<div>
    <a href="index.php" class="link"> Return to main page </a>
</div>

<br>
<br>
<br>

<div>
    <a href="returnShowEmployees.php" class="link"> Return to employees </a>
</div>