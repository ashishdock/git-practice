#include <stdio.h>

int main(){
	int r, c, total;
	int m[3][3] = {8, 1, 6, 3, 5, 7, 4, 9, 2};
	total = 0;
	
	puts("Presenting the Magic Square: \n");
/* Displaying the Magic Square */
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			printf("%d ", m[r][c]);
		}
		putchar('\n');
	}
/* Sum of columns */
	for(r=0;r<3;r++){
		for(c=0;c<3;c++){
			total = total + m[r][c];
		}
		printf("Total for row %d is %d", r+1, total);
		total = 0;
		putchar('\n');
	}

/* Sum of rows */
	for(c=0;c<3;c++){
		for(r=0;r<3;r++){
			total = total + m[r][c];
		}
		printf("Total for column %d is %d", c+1, total);
		total = 0;
		putchar('\n');
	}

/* Sum of diagonal NW/SE */
	for(c=0;c<3;c++)
		total = total + m[c][c];
	printf("Total for NW/SE diagonal is %d", total);
	putchar('\n');
	
/* Alternate for above diagonal */
	total=0;
	for(r=0;r<3;r++){
		for(c=2;c>=0;c--){
			if(r == c) {
				total = total + m[r][c];
			}
		}
	}
	printf("Total for NW/SE diagonal is %d\n", total);

/* Sum of diagonal SW/NE */
	total=0;
	for(r=0;r<3;r++){
		for(c=2;c>=0;c--){
			if(r+c==2){
				total = total + m[r][c];
			}
		}
	}
	printf("Total for SW/NE diagonal is %d\n", total);
	return(0);
}