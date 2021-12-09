#include <stdio.h>
#include <stdlib.h>

int main (void)
{
    size_t len = 0 ;
    const char a[] = "c:/a/a.exe" ;
    const char b[] = "d:/b/b.exe" ;
    char buffer[BUFSIZ] = { '\0' } ;

    FILE* in = fopen( a, "rb" ) ;
    FILE* out = fopen( b, "wb" ) ;

    if( in == NULL )
    {
        perror( "An error occured while opening files!!!" ) ;
        in = out = 0 ;
    }

    if( out == NULL )
    {
        perror( "An error occured while opening files!!!" ) ;
        in = out = 0 ;
    }

    while( (len = fread( buffer, BUFSIZ, 1, in)) > 0 )
    {
        fwrite( buffer, BUFSIZ, 1, out ) ;
    }

    fclose(in) ;
    fclose(out) ;

    if(  remove(a) )
    {
        printf( "File successfully moved. Thank you for using this mini app" ) ;
    }
    else
    {
        printf( "An error occured while moving the file!!!" ) ;
    }

    return 0 ;
}