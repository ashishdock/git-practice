use Net::FTP;

$ftp = Net::FTP->new("ftp.cpan.org", Timeout => 30)
        or die "Could not connect.\n";

$username = "anonymous";
$password = "steve";

$ftp->login($username, $password)
        or die "Could not log in.\n";

$ftp->cwd('/pub/CPAN');

$remotefile = "CPAN.html";
$localfile = "file.txt";

$ftp->get($remotefile, $localfile)
        or die "Can not get file.\n";

