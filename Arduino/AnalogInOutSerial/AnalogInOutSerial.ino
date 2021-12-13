// Analog Input Out Serial

//LED pin = 9
//Potentiometer Analog Input pin = A0

/* Attached Potetiometer to A0, GND and 5V pins respectively.
 * Using external LED with 220 ohm resistor.
 
 */

int sensorValue = 0;  // value read from the potentiometer
int outputValue = 0;  // value output to the PWM (analog OUTPUT)

void setup() {
  Serial.begin(9600);
  
}

void loop() {
  //read the analog input value
  sensorValue = analogRead(A0);
  // map it to the range of analog output
  outputValue = map(sensorValue,0, 1023, 0, 255);
  // change the analog output value
  analogWrite(9, outputValue);

  // print the results to the serial monitor
  Serial.print("sensor = ");
  Serial.print(sensorValue);
  Serial.print("\t output = ");
  Serial.println(outputValue);

  //wait 2 milliseconds before the next loop for the analog-to-digital converter to settle after the last reading

  delay(2);

}
