//Debounce

//Button PIN =2;
//LED inserted in PIN 13

int ledState = HIGH;
int buttonState;
int lastButtonState = LOW;

long lastDebounceTime = 0;
long debounceDelay = 50;

void setup() {
  pinMode(2, INPUT);
  pinMode(13, OUTPUT);

}

void loop() {
  //read the state of the switch into a local variable
  int reading = digitalRead(2);

  if(reading != lastButtonState)
  {
    lastDebounceTime = millis();
  }

  if((millis() - lastDebounceTime) > debounceDelay)
  {
    buttonState = reading;
  }

  digitalWrite(13, buttonState);
  lastButtonState = reading;

}
