<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP OOP Test</title>
</head>
<body>
    <h1>Testing PHP OOP setters and getters</h1>
    <?php
        class Product {
            private $description;
            private $price;
            private $inventory;
            private $onsale;

            public function __set($name, $value){
                if ($name == "price" && $value < 0){
                    echo "<p>Invalid price set</p>";
                    $this->price = 0;
                } else if ($name == "inventory" && $value < 0) {
                    echo "<p>Invalid inventory set: $value</p>";
                } else {
                    $this->$name = $value;
                }
            }

            public function __get($name){
                return $this->$name;
            }

            public function buyProduct($amount){
                if($this->inventory >= $amount){
                    $this->inventory -= $amount;
                } else {
                    echo "<p>Sorry, invalid inventory requested: $amount</p>";
                    echo "<p>There are only $this->inventory left.</p>";
                }
            }
        }

        $prod1 = new Product();
        $prod1->description = "Carrots";
        $prod1->price = 1.50;
        $prod1->inventory = 5;
        $prod1->onsale = false;

        echo "<p>Just added $prod1->inventory $prod1->description</p>";

        echo "<p>Now buying 4 carrots</p>";
        $prod1->buyProduct(4);
        echo "<p>Inventory of $prod1->description is now $prod1->inventory</p>";

        echo "<p>Trying to set carrot inventory to -1:</p>";
        $prod1->inventory = -1;

        echo "<p>Now trying to buy 10 carrots</p>";
        $prod1->buyProduct(10);
        echo "<p>Inventory of $prod1->description is now $prod1->inventory</p>";
    ?>
</body>
</html>