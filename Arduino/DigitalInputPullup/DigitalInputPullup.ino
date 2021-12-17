//pin 2 = button

void setup() {
  Serial.begin(9600);
  pinMode(2, INPUT_PULLUP);
  pinMode(13, OUTPUT);

}

void loop() {
  //read the pushbutton value into a variable
  int sensorVal = digitalRead(2);
  //print out the value of the pushbutton
  Serial.println(sensorVal);

  if(sensorVal == HIGH)
  {
    digitalWrite(13, LOW);
  }
  else
  {
    digitalWrite(13, HIGH);
  }
}
