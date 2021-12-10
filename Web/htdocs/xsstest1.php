<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>XSS Test</title>
</head>
<body>
    <h1>XSS Test</h1>
    <?php
        $fname = htmlspecialchars($_POST['fname']);
        echo "<p>Welcome, $fname</p><br>";
    ?>
    <h2>This is the end of the test</h2>
</body>
</html>