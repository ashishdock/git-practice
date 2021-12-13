// buttonPin = 2
//ledPin = 13

int buttonState = 0;

void setup() {
  pinMode(13, OUTPUT);
  pinMode(2, INPUT);

}

void loop() {
  buttonState = digitalRead(2);

  if (buttonState == HIGH) {
    digitalWrite(13, HIGH);
  }
  else {
    digitalWrite(13, LOW);
  }

}
