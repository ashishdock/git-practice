<?php
    session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart Test</title>
</head>
<body>
    <h1>Items available</h1>
    <form action="carttest.php" method="post">
        <table>
            <tr><th>Item</th><th>Quantity</th></tr>
            <tr><td>Apples</td><td><input type="text" name="apples" size = "2"></td></tr>
            <tr><td>Bananas</td><td><input type="text" name="bananas" size="2"></td></tr>
        </table>
        <input type="submit" value="Click to add to cart">
    </form>
    <br>
    
    <?php
        if(isset($_POST['apples'])){
            if(is_numeric($_POST['apples'])){
                $_SESSION['cart']['apples'] = $_POST['apples'];
            } elseif ($_POST['apples'] == "Remove") {
                unset($_SESSION['cart']['apples']);
            }
        }
        
        if (isset($_POST['bananas'])){
            if(is_numeric($_POST['bananas'])){
                $_SESSION['cart']['bananas'] = $_POST['bananas'];
            } elseif ($_POST['bananas'] == "Remove") {
                unset($_SESSION['cart']['bananas']);
            }
        }
    ?>
    <fieldset style="width:300px">
    <legend>Your Shopping Cart</legend>
    <?php
        if(!isset($_SESSION['cart'])){
            $_SESSION['cart'] = array();
            echo "Your shopping cart is empty";
        } else {
            echo "<form action=\"carttest.php\" method=\"post\">";
            echo "<table>";
            echo "<tr><th>Item</th><th>Quantity</th><th/></tr>";
            foreach ($_SESSION['cart'] as $key => $value) {
                echo "<tr><td>$key</td><td>$value</td>";
                echo "<td><input type=\"submit\" name = \"$key\" value=\"Remove\"></td></tr>";
            }
            echo "</table>";
            echo "</form>";
        }
    ?>
    </fieldset>
</body>
</html>