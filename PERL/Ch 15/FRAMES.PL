use Tk;

my $main = MainWindow->new;

my $frame1 = $main->Frame;

$frame1->pack;

my $frame2 = $frame1->Frame;

$frame2->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame2->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame2->pack(-side => 'left');

my $frame3 = $frame1->Frame;

$frame3->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame3->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame3->pack(-side => 'right');

my $frame4 = $main->Frame;

$frame4->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame4->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame4->pack(-fill => 'both');

my $frame5 = $main->Frame;

$frame5->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame5->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame5->pack(-fill => 'both');

my $frame6 = $main->Frame;

$frame6->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame6->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame6->pack(-fill => 'both');


my $frame7 = $main->Frame;

$frame7->pack;

my $frame8 = $frame7->Frame;

$frame8->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame8->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame8->pack(-side => 'left');

my $frame9 = $frame7->Frame;

$frame9->Button(-text => 'Click Me!')->pack(-side => 'left');
$frame9->Button(-text => 'Click Me!')->pack(-side => 'right');

$frame9->pack(-side => 'right');

MainLoop;


