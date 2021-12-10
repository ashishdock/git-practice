<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Cookie Test</title>
</head>
<body>
    <h1>Retrieving the test cookie</h1>
    <?php
        if(isset($_COOKIE['test1'])){
            $data = $_COOKIE['test1'];
            echo "<p>The cookie was set: $data</p>";
        } else {
            echo "<p>Sorry, I couldn't find the cookie</p>";
        }
    ?>
</body>
</html>