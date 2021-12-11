<?php

class Item {
    public $itemid;
    public $name;
    public $description;
    public $resaleprice;
    public $winbidder;
    public $winprice;

    function __contruct($itemid, $name, $description, $resaleprice, $winbidder, $winprice){
        $this->itemid = $itemid;
        $this->name= $name;
        $this->description = $description;
        $this->resaleprice = $resaleprice;
        $this->winbidder = $winbidder;
        $this->winprice = $winprice;
    }

    function __toString() {
        $output = "<h2>Item: $this->item</h2>" .
                  "<h2>Name: $this->name</h2>" .
                  "<h2>Description: $this->description</h2>" .
                  "<h2>Resale Price: $this->resaleprice</h2>" .
                  "<h2>Winning Bid: $this->winbid at $this->winprice</h2>";
        return $output;
    }

    function saveItem(){
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "INSERT INTO items VALUES (?, ?, ?, ?, ?, ?)";
        $stmt = $db->prepare($query);
        $stmt->bind_param("issdid", $this->itemid, $this->name, $this->description, $this->resaleprice, $this->winbidder, $this->winprice);
        $result = $stmt->execute();
        $db->close();
        return $result;
    }

    function removeItem(){
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "DELETE FROM items WHERE itemid = $this->itemid";
        $result = $db->query($query);
        $db->close();
        return $result;
    }

    static function getItems(){
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "SELECT * FROM items";
        $result = $db->query($query);
        if(mysqli_num_rows($result) > 0){
            $items = array();
            while ($row = $result->fetch_array(MYSQLI_ASSOC)){
                $item = new Item($row['itemid'], $row['name'], $row['description'], $row['resaleprice'], $row['winbidder'], $row['winprice']);
                array_push($items, $item);
                $db->close();
                return $items;
            }
        } else {
            $db->close();
            return NULL;
        }
    }

    static function getItemsbyBidder($bidderid){
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "SELECT * FROM items";
        $result = $db->query($query);
        if (mysqli_num_rows($result) > 0){
            $items = array();
            while($row = $result->fetch_array(MYSQLI_ASSOC)){
                $item = new Item ($row['itemid'], $row['name'], $row['description'], $row['resaleprice'], $row['winbidder'], $row['winprice']);
                array_push($items, $item);
            }
            $db->close();
            return $items;
        } else {
            $db->close();
            return NULL;
        }
    }

    static function findItem($itemid) {
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "SELECT * FROM items WHERE itemid = $itemid";
        $result = $db->query($query);
        $row = $result->fetch_array(MYSQLI_ASSOC);
        if($row){
            $item = new Item ($row['itemid'], $row['name'], $row['description'], $row['resaleprice'], $row['winbidder'], $row['winprice']);
            $db->close();
            return $item;
        } else {
            $db->close();
            return NULL;
        }
    }

    static function getTotalItems() {
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "SELECT count(itemid) FROM items";
        $result = $db->query($query);
        $row = $result->fetch_array();
        if ($row) {
            return $row[0];
        } else {
            return NULL;
        }
    }

    static function getTotalPrice() {
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "SELECT sum(resaleprice) FROM items";
        $result = $db->query($query);
        $row = $result->fetch_array();
        if ($row) {
            return $row[0];
        } else {
            return NULL;
        }
    }
    
    static function getTotalBids() {
        $db = new mysqli("localhost", "ah_user", "AuctionHelper", "auction");
        $query = "SELECT sum(winprice) FROM items";
        $result = $db->query($query);
        $row = $result->fetch_array();
        if ($row) {
          return $row[0];
        } else {
            return NULL;
        }
    }

}

?>