<link rel="stylesheet" type="text/css" href="styling.css">

<?php

require_once('DatabaseHelper.php');
$database = new DatabaseHelper();

$orders;
if (isset($_POST['btn'])) {
    $pizza = $_POST['pizza'];
    $orders = $database->getOrders($pizza);
}

?>

<div>
    <table class="css_table">
        <thead>
            <tr>
                <th>Surname</th>
                <th>Lastname</th>
                <th>Phone number</th>
                <th>Pizza</th>
                <th>Price</th>
                <th>Ammount</th>
                <th>Order date</th>
            </tr>
        </thead>
        <tbody>    
            <?php foreach ($orders as $order)   : ?>
            <tr class="css_row">
                <td><?php echo $order['SURNAME']; ?>  </td>
                <td><?php echo $order['LASTNAME']; ?>  </td>
                <td><?php echo $order['TELEPHONENUMBER']; ?>  </td>
                <td><?php echo $order['PIZZANAME']; ?></td>
                <td><?php echo $order['PRICE'] . '$'; ?></td>
                <td><?php echo $order['AMMOUNT']; ?></td>
                <td><?php echo $order['ORDERDATE']; ?></td>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</div>


<link rel="stylesheet" type="text/css" href="styling.css">

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