//motorPin = 9;
int powerState;
int Speed; //Variable to store Speed, by defaul 0 PWM
int flag;

void setup() {
  Serial.begin(9600);
  pinMode(9, OUTPUT);
  Serial.println("Give a number from 0 to 255."); //Why minimun value 50? Because with values below 50 the motor doesn't spin ;)
  Serial.println(""); //Blank line

}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(9, HIGH);
  powerState = digitalRead(9);
  Serial.println(powerState);
  delay(1000);

  digitalWrite(9, LOW);
  powerState = digitalRead(9);
  Serial.println(powerState);
  delay(1000);

}
