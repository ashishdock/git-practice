<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Testing PHP OOP code</title>
</head>
<body>
    <h1>Testing PHP OOP code</h1>
    <?php
        class Product{
            public $description;
            public $price;
            public $inventory;
            public $onsale;

            public function buyProduct($amount){
                $this->inventory -= $amount;
            }
        }
        $prod1 = new Product();
        $prod1->description = "Carrots";
        $prod1->price = 1.50;
        $prod1->inventory = 10;
        $prod1->onsale = false;
        echo "<p>Just added $prod1->description</p><br>";

        $prod2 = new Product();
        $prod2->description = "Eggplants";
        $prod2->price = 2.00;
        $prod2->inventory = 5;
        $prod2->onsale = true;
        echo "<p>Just added $prod2->description</p><br>";

        echo "<p>Now buying 4 carrots...</p><br>";
        $prod1->buyProduct(4);
        echo "<p>Inventory of $prod1->description is now $prod1->inventory</p><br>";
        echo "<p>Inventory of $prod2->description is still $prod2->inventory</p><br>";
    ?>
</body>
</html>