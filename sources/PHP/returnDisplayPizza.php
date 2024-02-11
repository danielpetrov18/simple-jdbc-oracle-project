<link rel="stylesheet" type="text/css" href="styling.css">

<?php 
    require_once('DatabaseHelper.php');
    $database = new DatabaseHelper();
    $pizzas = $database->fetchPizzas();
    error_reporting(E_ALL ^ E_WARNING);
?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
                <th>Ingredients</th>
            </tr>
        </thead>
        <tbody>    
            <?php foreach ($pizzas as $pizza)   : ?>
            <tr class="css_row">
                <td><?php echo $pizza['PIZZANAME']; ?>  </td>
                <td><?php echo $pizza['PRICE'] . '$'; ?>  </td>
                <td><?php
                    $ingredients = $database->fetchIngredients($pizza['PIZZANAME']);
                    echo '[';
                    foreach ($ingredients as $ingredient) {
                        echo $ingredient['NAME'] . "   ";
                    }
                    echo ']';
                ?></td>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</div>


<br>
<br>

<a href="index.php" class="link">
    Return to main page
</a>

<br>
<br>
<br>
<br>

<form method="post" action="insertPizza.php" class="form">
    <div>
        <label for="pizza">Name of pizza:</label>
        <input id="pizza" name="pizza" type="text" required placeholder="Please enter name." maxlength="32">
    </div>
    <br>
    <div>
        <label for="price">New price:</label>
        <input id="price" name="price" type="number" min="3" step=".01" required placeholder="Please enter price.">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Insert pizza</button>
    </div>
</form>

<br>

<form method="post" action="updatePizza.php" class="form">
    <div>
        <label for="pizza">Name of pizza:</label>
        <input id="pizza" name="pizza" type="text" required placeholder="Please enter name." maxlength="32">
    </div>
    <br>
    <div>
        <label for="price">New price:</label>
        <input id="price" name="price" type="number" min="3" step=".01" required placeholder="Please enter new price.">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Update pizza price</button>
    </div>
</form>

<br>

<form method="post" action="deletePizza.php" class="form">
    <div>
        <label for="name">Name of pizza:</label>
        <input id="name" name="name" type="text" required placeholder="Please enter name." maxlength="32">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Delete pizza</button>
    </div>
</form>

<br>

<form method="post" action="pizzaOrders.php" class="form">
    <div>
        <label for="pizza">Name of pizza:</label>
        <input id="pizza" name="pizza" type="text" required placeholder="Please enter name." maxlength="32">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Find all orders</button>
    </div>
</form>

<br>

<form method="post" action="pizzaWithIngredient.php" class="form">
    <div>
        <label for="ingredient">Ingredient:</label>
        <input id="ingredient" name="ingredient" type="text" required placeholder="Please enter ingredient." maxlength="128">
    </div>
    <br>
    <div>
        <button type="submit" name="btn" class="form-submit-button">Filter</button>
    </div>
</form>