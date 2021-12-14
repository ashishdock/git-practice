#include <Servo.h>

Servo myServo;
int potPin = A0;
int analogVal;
int degrees;

void setup() {
  myServo.attach(9);
  Serial.begin(9600);
}

void loop() {
  analogVal = analogRead(A0);
  degrees = map(analogVal, 0, 1023, 0, 179);

  myServo.write(degrees);
  Serial.print("Pot reading: " );
  Serial.print(analogVal);
  Serial.print("\t Degrees: ");
  Serial.println(degrees);
  delay(15);
  
}
