use Tk;

$main = MainWindow->new();

$main->Radiobutton( -text => "Radio 1",
    -command => sub{
    $text1->delete('1.0', 'end');
    $text1->insert('end', "You clicked radio 1");}
)->pack;

$main->Radiobutton( -text => "Radio 2",
    -value => "0",
    -command => sub{
    $text1->delete('1.0', 'end');
    $text1->insert('end', "You clicked radio 2");
    }
)->pack;

$main->Checkbutton( -text => "Check 1",
    -variable => $check1,
    -command => sub{
    $text1->delete('1.0', 'end');
    $text1->insert('end', "You clicked check 1 $check1");
    }
)->pack;

$main->Checkbutton( -text => "Check 2",
    -command => sub{
    $text1->delete('1.0', 'end');
    $text1->insert('end', "You clicked check 2");
    }
)->pack;

$text1 = $main->Text ('-width'=> 40, '-height' => 2)->pack;

MainLoop;

