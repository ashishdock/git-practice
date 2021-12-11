<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Testing Link Events in PHP</title>
</head>
<body>
    <h1>Thanks for visiting us!</h1>
    <?php
        $content = $_GET['content'];
        echo "<h2>You are in the $content section</h2><br>";
    ?>
</body>
</html>