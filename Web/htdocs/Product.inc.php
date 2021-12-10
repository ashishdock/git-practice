<?php

class Product {
    private $description;
    private $price;
    private $inventory;
    private $onsale;

    public function __construct($name, $cost, $quantity, $sale) {
        $this->description = $name;
        $this->onsale = $sale;
        if ($cost < 0){
            $this->price = 0;
        } else {
            $this->price = $cost;
        }
        if ($quantity < 0){
            $this->inventory = 0;
        } else {
            $this->inventory = $quantity;
        }
    }

    public function __set($name, $value){
        if($name == "price" && $value == 0){
            echo "<p>Invalid price set</p>";
            $this->price = 0;
        } else if ($name == "inventory" && value < 0){
            echo "<p>Invalid inventory set: $value</p>";
        } else {
            $this->$name = $value;
        }
    }

    public function __get($name){
        return $this->$name;
    }

    public function __clone(){
        $this->price = 0;
        $this->inventory = 0;
        $this->onsale = false;
    }

    public function __toString(){
        $output = "<p>Product: ". $this->description . "<br>";
        $output .= "Price: $" . number_format($this->price,2) . "<br>" ;
        $output .= "Inventory: " . $this->inventory . "<br>";
        $output .= "On sale: ";
        if ($this->onsale){
            $output .= "Yes </p>";
        } else {
            $output .= "No </p>";
        }
        return $output;
    }
    public function buyProduct(){
        if($this->inventory >= $amount){
            $this->inventory-= $amount;
        } else {
            echo "<p>Sorry, invalid inventory requested: $amount</p>";
            echo "<p>There are only $this->inventory left</p>";
        }
    }

    public function putonsale(){
        $this->onsale = true;
    }

    public function takeoffsale(){
        $this->onsale= false;
    }
}

?>