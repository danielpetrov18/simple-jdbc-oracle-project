<link rel="stylesheet" type="text/css" href="styling.css">

<?php
	require_once('DatabaseHelper.php');
	$database = new DatabaseHelper();
	//error_reporting(E_ALL ^ E_WARNING);

	$name = '';
	if(isset($_POST['name'])){
    		$name = $_POST['name'];
	}

	$success = $database->deleteFromPizza($name);
    if ($success){
		echo "Pizza '{$name}' successfully deleted!";
    }
    else{
		echo "Error while deleting pizza '{$name}'!";
    }
?>

<br>
<br>
<br>

<div>
	<a href="index.php" class="link">   Return to main page </a>
</div>

<br>
<br>
<br>

<div>
	<a href="returnDisplayPizza.php" class="link"> Display pizzas </a>
</div>