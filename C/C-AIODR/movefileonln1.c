  #include <stdio.h>
  #include <string.h>
  #define MAX 256

  int main() {
        int ch;
        FILE *fp1, *fp2;
        char source[MAX], target[MAX];

        /* get the source file name from the user */
        printf("Enter your source file name:");
        fgets(source, MAX, stdin);
        source[strlen(source) - 1] = '\0';

        /* get the destination file name from the user */
        printf("Enter your destination file name:");
        fgets(target, MAX, stdin);
        target[strlen(target) - 1] = '\0';

        /* open the source file in read mode */
        fp1 = fopen(source, "r");
        /* open the destination file in write mode */
        fp2 = fopen(target, "w");

        /* error handling */
        if (!fp1) {
                printf("Unable to open source file to read!!\n");
                fclose(fp2);
                return 0;
        }

        if (!fp2) {
                printf("Unable to open target file to write\n");
                return 0;
        }

        /* copying contents of source file to target file */
        while ((ch = fgetc(fp1)) != EOF) {
                fputc(ch, fp2);
        }

        /* closing the opened files */
        fclose(fp1);
        fclose(fp2);

        /* removing the source file */
        remove(source);
        return 0;
  }