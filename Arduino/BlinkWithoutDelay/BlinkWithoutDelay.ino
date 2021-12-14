//BlinkWithoutDelay

int ledState = LOW;
//Using PIN 9 for LED

unsigned long previousMillis = 0; // will store last time LED was updated

const long interval = 1000;

void setup() {
  pinMode(9, OUTPUT);

}

void loop() {
  unsigned long currentMillis = millis();
  if(currentMillis - previousMillis >= interval) 
  {
    //save the last time you blinked the LED
    previousMillis = currentMillis;

    //if the LED is off turn it on and vice versa
    if(ledState == LOW)
    {
      ledState = HIGH;
    } else
    {
      ledState = LOW;
    }

    digitalWrite(9, ledState);
  }

}
