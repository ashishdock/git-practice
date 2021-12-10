<?php
    if(!isset($_COOKIE['test1'])){
        setcookie("test1", "This is a test cookie", time() + 600);
    } else {
        setcookie("test1", "", time() - 1);
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deleting a Cookie</title>
</head>
<body>
    <h1>Cookie Status: </h1>
    <?php
        if(isset($_COOKIE['test1'])){
            $data = $_COOKIE['test1'];
            echo "<p>Cookie set: $data</p>";
        } else {
            echo "<p>Cookie not set</p>";
        }
    ?>
    <a href="cookietest3.php">Click to try again</a>
</body>
</html>