#include "lotto.h"

int ball[BALLS];  /* Global lotto ball array */

int main(){
	init();
	select();
	sort();
	display();
	return(0);
}