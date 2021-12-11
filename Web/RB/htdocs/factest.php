<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Function Test</title>
</head>
<body>
    <?php
        function factorial($value1){
            $factorial = 1;
            $count = 1;
            while ($count <= $value1) {
                $factorial *= $count;
                $count++;
            }
            return $factorial;
        }
    ?>
    <h1>Calculating factorials</h1>
    <?php
        echo "The factorial of 10 is " . factorial(10) . "<br>";
        echo "The factorial of 5 is " . factorial(5);
    ?>
</body>
</html>