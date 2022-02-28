use Tk;
$main = MainWindow->new;

$canvas1 = $main->Canvas('-width' => 400,
    -height => 200
)->pack;

$canvas1->create ('oval', '50', '50', '160',
    '160', -fill => 'red');

$canvas1->create ('rectangle', '250', '50', '360',
    '160', -fill => 'blue');

$canvas1->create ('line', '105', '105', '305',
    '105');

$canvas1->create ('polygon', '85', '105', '105',
    '85', '125', '105', '105', '125', '85', '105', 
    -fill => 'black');

$canvas1->create ('polygon', '285', '105', '305',
    '85', '325', '105', '305', '125', '285', '105', 
    -fill => 'black');

MainLoop;

