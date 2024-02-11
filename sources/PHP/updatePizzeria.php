<link rel="stylesheet" type="text/css" href="styling.css">

<?php
    require_once('DatabaseHelper.php');
    $database = new DatabaseHelper();
    error_reporting(E_ALL ^ E_WARNING);

    $id;
    if(isset($_POST['id'])) {
        $id = $_POST['id'];
    }

    $name;
    if(isset($_POST['name'])) {
        $name = $_POST['name'];
    }

    $success = $database->updatePizzeria($id, $name);
    if($success) {
        echo "Successfully changed the name of the pizzeria!";
    }
    else {
        echo "Error when changing the name of the pizzeria!";
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