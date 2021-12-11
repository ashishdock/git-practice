<?php

$make = $_GET['make'];
switch ($make)
{
    case "buick":
        echo "Enclave,Lacrosse,Regal";
        break;
    case "chevy":
        echo "Camero,Corvette,Impala";
        break;
    case "dodge":
        echo "Challenger,Charger,Viper";
        break;
    case "ford":
        echo "Fusion,Mustang,Taurus";
}

?>