<link rel="stylesheet" type="text/css" href="styling.css">

<?php 
    require_once('DatabaseHelper.php');
    $database = new DatabaseHelper();
    error_reporting(E_ALL ^ E_WARNING);

$id;
if (isset($_POST['id'])) {
    $id = $_POST['id'];
}

$success = $database->deletePizzeria($id);
if ($success){
	echo "Pizzeria successfully deleted!";
}
else{
	echo "Error while deleting pizzeria!";
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
    <a href="returnDisplayPizzeria.php" class="link">
        Display pizzerias
    </a>
</div>