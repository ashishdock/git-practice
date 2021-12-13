// led = 9;
int brightness= 0;
int fadeAmount = 2;

void setup() {
  pinMode(9, OUTPUT);
}

void loop() {
  analogWrite(9, brightness);
  brightness = brightness + fadeAmount;

  if(brightness <= 0 || brightness >= 255){
    delay(500);
    fadeAmount = -fadeAmount;
  }

  delay(50);
}
