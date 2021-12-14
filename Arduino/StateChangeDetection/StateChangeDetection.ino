


//Button Pin : 2
//LED PIN: 13

int buttonPushCounter = 0;
int buttonState = 0;
int lastButtonState = 0;

void setup() {
  pinMode(2, INPUT);
  pinMode(13, OUTPUT);
  Serial.begin(9600);

}

void loop() {
  buttonState = digitalRead(2);

  if(buttonState != lastButtonState)
  {
    if(buttonState == HIGH)
    {
      buttonPushCounter++;
      Serial.println("On");
      Serial.print("number of button puushes: ");
      Serial.println(buttonPushCounter);
    } else
    {
      Serial.println("Off");
    }
    delay(50);
  }

  lastButtonState = buttonState;

  if((buttonPushCounter % 4 )== 0)
  {
    digitalWrite(13, HIGH);
  } else 
  {
    digitalWrite(13, LOW);
  }
}
