<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP While Test</title>
</head>
<body>
    <h1>Presenting the Beatles</h1>
    <?php
        $group = array("John", "Paul", "George", "Ringo");
        $count = 0;
        while ($count<4){
            echo "One member of the Beatles is $group[$count].<br>";
            $count++;
        }
    ?>
</body>
</html>