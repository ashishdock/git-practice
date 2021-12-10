<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Type Test</title>
    <style>
        .warning {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Form results</h1>
    <?php
        $name = htmlspecialchars($_POST['name']);
        $email = htmlspecialchars($_POST['email']);
        $age = htmlspecialchars($_POST['age']);

        echo "<p>Name: $name</p><br>";

        if (filter_var($email, FILTER_VALIDATE_EMAIL)){
            echo "<p>Email: $email</p><br>";
        } else {
            echo "<p class='warning'>Please enter a valid email address</p><br>";
        }
        if (is_numeric($age)){
            echo "<p>Age: $age</p><br>";
        } else {
            echo "<p class='warning'>Please enter a valid age</p><br>";
        }
    ?>
    <br>
    <a href="typetest.html">Return to form</a>
</body>
</html>