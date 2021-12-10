<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP foreach test</title>
</head>
<body>
    <h1>My Favorites</h1>
    <?php
        $favs = array("fruit"=>"banana", "veggie"=>"carrot", "meat"=>"roast beef");
        foreach($favs as $food=>$type){
            echo "$food \t -\t $type<br>";
        }
    ?>
</body>
</html>