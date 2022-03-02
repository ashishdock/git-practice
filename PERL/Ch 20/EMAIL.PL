use Mail::POP3Client;

$mail = new Mail::POP3Client("username", "password", 
"pop3.yourserver.com");

if ($mail->Count) {

    print "You have ", $mail->Count, " new message(s).\n";

    print "Storing message(s) to disk.\n";

    open FILEHANDLE, ">file.txt";

    for($loop_index = 1; $loop_index <= $mail->Count; $loop_index++) {

        print FILEHANDLE $mail->HeadAndBody(1);

    }

    close FILEHANDLE;
}

