use IO::Socket;

$server = IO::Socket::INET->new
(
    LocalPort => 1247,
    Type      => SOCK_STREAM,
    Reuse     => 1,
    Listen    => 5 
) or die "Could not create server.\n";

while ($client = $server->accept()) {

    unless (defined($child_pid = fork())) {die "Can not fork.\n"};

    if ($child_pid) {

        while ($line = <$client>) {

            print "Read this from client: $line";

        }

    } else {

        while ($line = <>) {

            print $client $line; 

        }
    }    
}
