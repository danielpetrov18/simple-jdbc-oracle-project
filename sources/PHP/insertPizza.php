<link rel="stylesheet" type="text/css" href="styling.css">

<?php
        require_once('DatabaseHelper.php');
        $database = new DatabaseHelper();
        error_reporting(E_ALL ^ E_WARNING);

        $pizza = '';
        if (isset($_POST['pizza'])) {
                $pizza = $_POST['pizza'];
        }

        $price = '';
        if (isset($_POST['price'])) {
                $price = $_POST['price'];
        }
 
        $success = $database->insertIntoPizza($pizza, $price);
        if ($success) {
                echo "Pizza '{$pizza}' successfully inserted!"; 
        } 
        else {
                echo "Error can't insert pizza '{$pizza}'!";
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
        <a href="returnDisplayPizza.php" class="link"> Display pizzas </a>
</div>