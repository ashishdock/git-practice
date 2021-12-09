/*
* Pig Latin Filter
*/

#include <stdio.h>
#include <ctype.h>
#include <string.h>

void iglatinpay(char *english);
void strlower(char *string);

int main(){
	char word[32];
	char *w;
	char ch;
	int count;

	while((ch = fgetc(stdin)) != EOF){
		if(isalpha(ch)){        	/* a word starts */
			count=0;
			while(isalpha(ch)){	/* read the word */
				word[count] = ch;	/* store the word */
				count++;
				ch = fgetc(stdin);
			}
			word[count] = '\0'; 	/* cap word with NULL */
			iglatinpay(word);	/* process the word */

/* This routine displays the word stored in word[] */
			w = word;
			while(*w){
				fputc(*w, stdout);
				w++;
			}

/* Finally, original non-alpha character is displayed */
			fputc(ch, stdout);
		}
		else
			fputc(ch, stdout);	/* non-alpha char */
	}
	return(0);
}
/*
*This function converts a word (all letters terminated with a NULL) into pig Latin by 
*following some made-up rules. The word is stored in the piglatin[] buffer. Various string routines
*copy and concatenate parts of the reconstructed word into that buffer. The original starting letter
*is also saved in a buffer, append[], because only strings, not single chars, can be concatenated to each other.
*
*A pointer variable saves the original address of the word being translated, so the word is sent and
*returned as the same variable. This saves going through the pains of returning a string from a function.
*/

void iglatingpay(char *english){
	char piglatin[32];			/* temporary word sto. */
	char *e;
	char append[] = "h";			/* first letter sto. */
	char ch;

	e = english;				/* Save starting loc. */

	strlower(english);
}

/*
* RULES FOR TRANSLATING ENGLISH INTO PIG LATIN
*As told to a switch-case loop
*
*First rule: Words starting with a vowel are merely given the AY ending.
*
*Note how strcpy() is used first and then strcat() is used to continue building the pig Latin word.
*
*Also: See how the case statements "fall through," enabling several of them to catch common situations.
*/

	ch = *english;
	switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			strcpy(piglatin, english);
			strcat(piglatin,"ay");
			break;
/* Second rule: Words starting with SH, CH, TH, PH, RH, WH, and QU have both letters moved to the end before adding AY. */
		case 'c':
		case 'p':
		case 'r':
		case 's':
		case 't':
		case 'w':
			if(*(english+1) == 'h'){
				english+=2;
				strcpy(piglatin, english);
				append[0] = ch;
				strcat(piglatin, append);
				strcat(piglatin, "hay");
				break;
			}
		case 'q':
			if(*(english+1) == 'u'){
				english+=2;
				strcpy(piglatin, english);
				append[0] = ch;
				strcat(piglatin, append);
				strcat(piglatin,"uay");
				break;
			}

/* Standard rule: Move the first letter to the end of the word and add AY. */

		/* Continuing switch-case */
		default:
			english++;
			strcpy(piglatin, english);
			append[0] = ch;
			strcat(piglatin, append);
			strcat(piglatin, "ay");
			break;
	}
	strcpy(e, piglatin);
	*e = toupper(*e);
}

/* Convert a string to lowercase. Uses pointers to modify the string elsewhere in memory */

void strlower(char *string){
	int len, x;
	
	len = strlen(string);
	for(x=0;x<len;x++)
		*(string+x) = tolower(*(string+x));

}