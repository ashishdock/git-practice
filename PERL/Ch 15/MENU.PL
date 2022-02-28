use Tk;

my $main = MainWindow->new();

$menubar = $main->Frame()->pack('-side' => 'top', '-fill' => 'x');

$filemenu = $menubar->Menubutton('-text' => 'File')->pack('-side' => 
'left');

$filemenu->command('-label' => 'Open', '-command' => sub
    {$text->delete('1.0', 'end');
    $text->insert('end', "You clicked open.");});

$filemenu->separator();

$filemenu->command('-label' => 'Exit', '-command' => sub {exit});

$editmenu = $menubar->Menubutton('-text' => 'Edit')->pack('-side' => 
'left');

$editmenu->command('-label' => 'Search', '-command' => sub
    {$text->delete('1.0', 'end');
    $text->insert('end', "You clicked search.");});

$editmenu->command('-label' => 'Replace', '-command' => sub
    {$text->delete('1.0', 'end');
    $text->insert('end', "You clicked replace.");});

$text = $main->Text ('-width' => 40, '-height' => 3)->pack();

MainLoop;

