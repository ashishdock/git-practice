use Tk;

my $main = MainWindow->new;

$button1 = $main->Button(-text => 'Click Me!')->place(-x => 0, -y => 0);
$button1 = $main->Button(-text => 'Click Me!')->place(-x => 30, -y => 30);
$button1 = $main->Button(-text => 'Click Me!')->place(-x => 60, -y => 60);
$button1 = $main->Button(-text => 'Click Me!')->place(-x => 90, -y => 90);
$button1 = $main->Button(-text => 'Click Me!')->place(-x => 120, -y => 120);
$button1 = $main->Button(-text => 'Click Me!')->place(-x => 150, -y => 150);


MainLoop;


