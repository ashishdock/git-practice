//Potentiometer PIN = A1;
//Digital Pin 9 used for motor OUTPUT

int potValue = 0;
int motorSpeed = 0;

void setup(){
  Serial.begin(9600);

}


void loop(){
  potValue = analogRead(A1);
  motorSpeed = map(potValue,0, 1023, 0, 255);

  analogWrite(9, motorSpeed);
  Serial.print("Potentiometer value = ");
  Serial.print(potValue);
  Serial.print("\tMotorSpeed = ");
  Serial.print(motorSpeed);
  Serial.println(" PWM");

  delay(2);

}
