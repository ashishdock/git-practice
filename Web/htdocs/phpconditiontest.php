<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Testing PHP Program Control</title>
</head>
<body>
    <h1>Random number test</h1>
    <?php
        $number = rand(1, 100);
        if ($number > 50) {
            echo "<h2>The value $number is big!</h2>";
        } else if ($number >25){
            echo("<h2>The value of $number is medium.</h2>");
        } else {
            echo ("<h2>The value of $number is small.</h2>");
        }
    ?>
</body>
</html>