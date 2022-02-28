use Tk;

my $main = MainWindow->new;

$canvas = $main->Canvas('-width' => 330,
    -height => 90); 

$main->Photo('image1', 
    -file => 'image.gif');

$canvas->createImage(0, 0, 
    -anchor => 'nw',
    -image => image1);

$canvas->pack;

MainLoop;

