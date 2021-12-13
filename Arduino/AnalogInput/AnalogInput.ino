// Analog Input

//LED pin = 13
//Potentiometer Analog Input pin = A0

/* Attached Potetiometer to A0, GND and 5V pins respectively.
 * Using external LED with 220 ohm resistor.
 * Potentiometer = A0
 * LED = 13
 */

int sensorValue = 0;

void setup() {
  pinMode(13, OUTPUT);
}

void loop() {
  sensorValue = analogRead(A0);

  //turn the LED pin ON
  digitalWrite(13, HIGH);

  // stop the process for <sensorValue> milliseconds
  delay(sensorValue);
  // turn the ledPIN off
  digitalWrite(13, LOW);
  //stop the program for <sensorValue> milliseconds
  delay(sensorValue);

}
