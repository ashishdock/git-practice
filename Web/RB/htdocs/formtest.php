<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP form test</title>
</head>
<body>
    <h1>Form results:</h1>
    <?php
        $fname = $_POST['fname'];
        $lname = $_POST['lname'];
        if (isset($_POST['sport'])){
            $sport = $_POST['sport'];
        } else {
            $sport = "not selected";
        }
        $essay = $_POST['essay'];

        echo "<h2>First name: $fname</h2><br>";
        echo "<h2>Last name: $lname</h2><br>";
        echo "<h2>Favorite sport: $sport</h2><br>";
        echo "<h2>Essay response: </h2><br>";
        echo "<p>$essay</p><br>";
    ?>
</body>
</html>