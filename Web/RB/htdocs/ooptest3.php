<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Total OOP Test</title>
</head>
<body>
    <h1>Testing the PHP class</h1>
    <?php
        spl_autoload_register(function($class){
            include $class . ".inc.php";
        });

        $prod1 = new Product ("Carrots", 4.00, 10, false);
        echo "<p>Creating one product</p>";
        echo $prod1;

        $prod2 = new Product("Eggplant", 2.00, 5, true);
        echo "<p>Creating one product:</p>";
        echo $prod2;
        echo "<p>Putting $prod1->description on sale.</p>";
        $prod1->price = 3.00;
        $prod1->putonsale();
        echo "<p>New Product Status:</p>";
        echo $prod1;
    ?>
</body>
</html>