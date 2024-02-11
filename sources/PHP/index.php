<html>
<head>
        <title>Index Page</title>
        <link rel="stylesheet" type="text/css" href="styling.css">
</head>
<body>
<h1 class="title_main">Online Pizza Bestellung<h1>

<?php
    require_once("DatabaseHelper.php");
    $database = new DatabaseHelper();
?>
<div id="parent">
    <div>
        <form method="post" action="displayPizza.php">
            <button type="submit" name="btn" class="form-submit-button">Display pizzas</button>
        </form>
    </div>
    <div>
        <form method="post" action="displayPizzeria.php">
            <button type="submit" name="btn" class="form-submit-button">Display pizzerias</button>
        </form> 
    </div>
    <div>
        <form method="post" action="showEmployees.php">
            <button type="submit" name="btn" class="form-submit-button">Test procedure</button>
        </form>
    </div>
</div>
</body>
</html>