<?php
    session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Testing Session Cookies</title>
</head>
<body>
    <h1>Setting a session cookie</h1>
    <?php
        $_SESSION['test2'] = "Second test cookie";
    ?>
    <a href="sessiontest2.php">Click to continue</a>
</body>
</html>