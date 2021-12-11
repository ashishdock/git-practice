// led pin being used is 9

void setup() {

}

void loop() {
  for (int fadevalue=0; fadevalue<=255; fadevalue+=2){
    analogWrite(9, fadevalue);
    delay(50);
  }

  delay(500);

  for (int fadevalue = 255; fadevalue >=0; fadevalue-=2){
    analogWrite(9, fadevalue);
    delay(20);
  }
  
  delay (1000);
}
