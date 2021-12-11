<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Test Web Page</title>
    <style>
        table, td, th {
            border: 1px solid black;
            border-collapse: collapse;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>My Bowling Team</h1>
    <table>
        <tr><th>Bowler</th><th>Games Played</th><th>Average</th></tr>
        <?php
            $db = new mysqli("localhost", "appuser1", "MyL0ngP@ssword", "apptest1");
            if(!$db){
                echo "Sorry, I could not connect to the database server!";
                exit;
            }

            $query = "SELECT bowlerid, name FROM bowlers ORDER BY name";
            $result = $db->query($query);
            while ($row = $result->fetch_assoc()) {
                $bowlerid = $row['bowlerid'];
                $name = $row['name'];

                $query2 = "SELECT COUNT(score) AS games, AVG(score) AS average FROM games WHERE bowlerid = $bowlerid";
                $result2 = $db->query($query2);
                $row2 = $result2->fetch_assoc();
                $games = $row2['games'];
                $average = $row2['average'];

                echo "<tr><td>$name</td><td>$games</td><td>$average</td></tr>";
            }
        ?>
    </table>
</body>
</html>