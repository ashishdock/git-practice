<?php

include("bidder.php");
include("item.php");
$bidders = Bidder::getTotalBidders();
$items = Item::getTotalItems();
$itemtotal = Item::getTotalPrice();
$bidtotal = Item::getTotalBids();
$doc = new DOMDocument("1.0");
$auction = $doc->createElement("auction");
$auction = $doc->appendChild($auction);
$bidders = $doc->createElement("bidders", $bidders);
$bidders = $auction->appendChild($bidders);
$items = $doc->createElement("items", $items);
$items = $auction->appendChild($items);
$itemtotal = $doc->createElement("itemtotal", $itemtotal);
$itemtotal = $auction->appendChild($itemtotal);
$bidtotal = $doc->createElement("bidtotal", $bidtotal);
$bidtotal = $auction->appendChild($bidtotal);
$output = $doc->saveXML();
header("Content-type: application/xml");
echo $output;

?>