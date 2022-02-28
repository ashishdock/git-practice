use Tk; 
               
my $main = MainWindow->new;        

my $menubar = $main->Frame;

$menubar->pack(-fill => 'x');

my $filemenu = $menubar->Menubutton(-text => 'File');

$filemenu->command(
    -label       => 'Open', 
    -command     => sub {$text1->insert('1.0', "You chose open.\n")},
    -accelerator => 'Ctrl+O',
);

$main->bind('<Control-o>' => sub {$text1->insert('1.0', "You chose open.\n")});

$filemenu->cascade(-label => 'Check buttons');
$filemenu->cascade(-label => 'Radio buttons');

my $checkcascade = $filemenu->cget(-menu); 
my $checkmenu = $checkcascade->Menu;
$filemenu->entryconfigure('Check buttons', -menu => $checkmenu);

$checkmenu->checkbutton(-label => 'Check 1', -variable => \$check1,
    -command => sub {$text1->insert('1.0', "You chose check 1.\n")});
$checkmenu->checkbutton(-label => 'Check 2', -variable => \$check2,
    -command => sub {$text1->insert('1.0', "You chose check 2.\n")});
$checkmenu->checkbutton(-label => 'Check 3', -variable => \$check3,
    -command => sub {$text1->insert('1.0', "You chose check 3.\n")});
$checkmenu->checkbutton(-label => 'Check 4', -variable => \$check4,
    -command => sub {$text1->insert('1.0', "You chose check 4.\n")});
$checkmenu->checkbutton(-label => 'Check 5', -variable => \$check5,
    -command => sub {$text1->insert('1.0', "You chose check 5.\n")});
$checkmenu->checkbutton(-label => 'Check 6', -variable => \$check6,
    -command => sub {$text1->insert('1.0', "You chose check 6.\n")});
$checkmenu->checkbutton(-label => 'Check 7', -variable => \$check7,
    -command => sub {$text1->insert('1.0', "You chose check 7.\n")});
$checkmenu->checkbutton(-label => 'Check 8', -variable => \$check8,
    -command => sub {$text1->insert('1.0', "You chose check 8.\n")});

my $radiocascade = $filemenu->cget(-menu); 
my $radiomenu = $radiocascade->Menu;
$filemenu->entryconfigure('Radio buttons', -menu => $radiomenu);

$radiomenu->radiobutton(-label => 'Radio 1', -variable => \$radio1,
    -command => sub {$text1->insert('1.0', "You chose radio 1.\n")});
$radiomenu->radiobutton(-label => 'Radio 2', -variable => \$radio1,
    -command => sub {$text1->insert('1.0', "You chose radio 2.\n")});
$radiomenu->radiobutton(-label => 'Radio 3', -variable => \$radio1,
    -command => sub {$text1->insert('1.0', "You chose radio 3.\n")});
$radiomenu->radiobutton(-label => 'Radio 4', -variable => \$radio1,
    -command => sub {$text1->insert('1.0', "You chose radio 4.\n")});
$radiomenu->separator;
$radiomenu->radiobutton(-label => 'Radio 5', -variable => \$radio2,
    -command => sub {$text1->insert('1.0', "You chose radio 5.\n")});
$radiomenu->radiobutton(-label => 'Radio 6', -variable => \$radio2,
    -command => sub {$text1->insert('1.0', "You chose radio 6.\n")});
$radiomenu->radiobutton(-label => 'Radio 7', -variable => \$radio2,
    -command => sub {$text1->insert('1.0', "You chose radio 7.\n")});
$radiomenu->radiobutton(-label => 'Radio 8', -variable => \$radio2,
    -command => sub {$text1->insert('1.0', "You chose radio 8.\n")});
$radiomenu->separator;

$filemenu->command('-label' => 'Exit', '-command' => sub {exit});

$filemenu->pack(-side => 'left');

$editmenu = $menubar->Menubutton('-text' => 'Edit')->pack('-side' => 
'left');

$editmenu->command(-label => 'Search', 
    -background => "red",
    -command => sub
    {$text1->delete('1.0', 'end');
    $text1->insert('end', "You chose search.");});

$editmenu->command(-label => 'Replace', 
    -background => "orange",
    -command => sub
    {$text1->delete('1.0', 'end');
    $text1->insert('end', "You chose replace.");});

$editmenu->command(-label => 'Find', 
    -background => "yellow",
    -command => sub
    {$text1->delete('1.0', 'end');
    $text1->insert('end', "You chose find.");});


$editmenu->pack(-side => 'left');

$text1 = $main->Text;

$text1->pack(-fill => 'both');

MainLoop;
