use Socket;
use IO::Handle;

socketpair(CHILDHANDLE, PARENTHANDLE, AF_UNIX, SOCK_STREAM, PF_UNSPEC)
    or  die "Could not create socketpair.";

CHILDHANDLE->autoflush(1);
PARENTHANDLE->autoflush(1);

if ($pid = fork) {

    close PARENTHANDLE;

    print CHILDHANDLE "Hello from the parent!\n";

    $line = <CHILDHANDLE>;

    print "Parent read: $line";

    close CHILDHANDLE;

    waitpid($pid,0);

} else {

    close CHILDHANDLE;

    $line = <PARENTHANDLE>;

    print "Child read: $line";

    print PARENTHANDLE "Hello from the child!\n";

    close PARENTHANDLE;

    exit;
}

