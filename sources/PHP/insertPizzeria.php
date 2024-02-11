<link rel="stylesheet" type="text/css" href="styling.css">

<?php
require_once('DatabaseHelper.php');
$database = new DatabaseHelper();
error_reporting(E_ALL ^ E_WARNING);

$pizzeria;
if (isset($_POST['pizzeria'])) {
    $pizzeria = $_POST['pizzeria'];
}

$zip;
if (isset($_POST['zip'])) {
    $zip = $_POST['zip'];
}

$street;
if (isset($_POST['street'])) {
    $street = $_POST['street'];
}

$success = $database->insertPizzeria($pizzeria, $zip, $street);
if($success) {
    echo "Pizzeria '{$pizzeria}' on '{$street}' '{$zip}' street successfully inserted!";
}
else {
    echo "Error when inserting '{$pizzeria}'!";
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
        <a href="returnDisplayPizzeria.php" class="link"> Display pizzerias </a>
</div>