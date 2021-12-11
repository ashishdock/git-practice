<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Image Manipulation Test</title>
</head>
<body>
    <h1>The uploaded image</h1>
    <?php
        $file = $_FILES['picture']['tmp_name'];
        $picture = file_get_contents($file);
        $sourceImage = imagecreatefromstring($picture);
        
        $width = imageSX($sourceImage);
        $height = imageSY($sourceImage);

        $newHeight = 400;
        $newWidth = $newHeight * ($width / $height);

        $newImage = imagecreatetruecolor($newWidth, $newHeight);
        $result = imagecopyresampled($newImage, $sourceImage, 0, 0, 0, 0, $newWidth, $newHeight, $width, $height);
        imagejpeg($newImage, "newimage.jpg");
    ?>
    <img src="newimage.jpg">
</body>
</html>