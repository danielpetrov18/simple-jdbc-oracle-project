<link rel="stylesheet" type="text/css" href="styling.css">

<?php
require_once('DatabaseHelper.php');
$database = new DatabaseHelper();

$ingredient;
if(isset($_POST['ingredient'])) {
    $ingredient = $_POST['ingredient'];
}

$filtered = $database->fetchPizzaWithIngredient($ingredient);
?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>Pizza</th>
            </tr>
        </thead>
        <tbody>    
            <?php foreach ($filtered as $pizza)   : ?>
            <tr class="css_row">
                <td><?php echo $pizza['PIZNAME']; ?></td>
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
        <a href="returnDisplayPizza.php" class="link"> Display pizzas </a>
</div>

<br>
<br>