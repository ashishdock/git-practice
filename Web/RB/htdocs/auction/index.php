<?php

session_start();
include("bidder.php");
include("item.php");

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Auction Helper</title>
    <link rel="stylesheet" type="text/css" href="ah_styles.css">

    <script language="javascript" type="text/javascript">
        function getRealTime()
        {
            // retrieve the DOM objects to place the content
            var dombidders = document.getElementById("biddercount");
            var domitems = document.getElementById("itemcount");
            var domitemtotal = document.getElementById("itemtotal");
            var dombidtotal = document.getElementById("bidtotal");
            //send the GET request to retrieve the data
            var request = new XMLHttpRequest();
            request.open("GET", "realtime.php", true);
            request.onreadystatechange = function() 
            {
                if (request.readyState == 4 && request.status == 200)
                {
                    //parse the XML document to get each data element
                    var xmldoc = request.responseXML;
                    var xmlbidders = xmldoc.getElementsByTagName("bidders")[0];
                    var bidders = xmlbidders.childNodes[0].nodeValue;
                    var xmlitems = xmldoc.getElementsByTagName("items")[0];
                    var items = xmlitems.childNodes[0].nodeValue;
                    var xmlitemtotal = xmldoc.getElementsByTagName("itemtotal")[0];
                    var itemtotal = xmlitemtotal.childNodes[0].nodeValue;
                    var xmlbidtotal = xmldoc.getElementsByTagName("bidtotal")[0];
                    var bidtotal = xmlbidtotal.childNodes[0].nodeValue;
                    dombidders.innerHTML = bidders;
                    domitems.innerHTML = items;
                    domitemtotal.innerHTML = itemtotal;
                    dombidtotal.innerHTML = bidtotal;
                }
            };
            request.send();
        }
    </script>

</head>
<body>
    <header>
        <?php include("header.inc.php");  ?>
    </header>
    <section id="container">
        <nav>
            <?php include("nav.inc.php"); ?>
        </nav>
        <main>
            <?php
                if (isset($_REQUEST['content'])){
                    include($_REQUEST['content'] . ".inc.php");
                } else {
                    include("main.inc.php");
                }
            ?>
        </main>
        <aside>
            <?php include("aside.inc.php"); ?>
            <script language="javascript" type="text/javascript")>
                getRealTime();
                setInterval(getRealTime, 5000);
            </script>
        </aside>
    </section>
    <footer>
        <?php include("footer.inc.php");  ?>
    </footer>
</body>
</html>