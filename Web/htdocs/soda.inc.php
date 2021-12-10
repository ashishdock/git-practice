<?php

include("Product1.inc.php");

class Soda extends Product1 {
    private $ounces;

    public function __construct($name, $value, $amount, $sale, $size) {
        parent::__construct($name, $value, $amount, $sale);
        $this->ounces = $size;
    }

    public function __toString(){
        $output = "<p>Product: " . $this->description . "<br>";
        $output .= "Price: $" . number_format($this->price, 2) . "<br>";
        $output .= "Inventory: " .$this->inventory . "<br>";
        $output .= "On Sale: ";
        if($this->onsale){
            $output .= "Yes<br>";
        } else {
            $output .= "No<br>";
        }
        $output .= "Ounces: " . $this->ounces . "</p>";        
        return $output;
    }

    public function restock($amount){
        $this->inventory += $amount;
    }
}


?>