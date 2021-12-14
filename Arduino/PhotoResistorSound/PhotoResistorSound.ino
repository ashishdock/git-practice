//LightSensorSound
//Using Light Sensor and piezo buzzer to make sounds
//Piezo connected to pin 9
//Light Sensor connected to A0

void setup() {
  //initialize serial communication
  Serial.begin(9600);

}

void loop() {
  //read the sensor:
  int sensorReading = analogRead(A0);

  //print the sensor reading to know its range
  Serial.println(sensorReading);

  //map the analog input range (in this case, 400-1000 from the photo resistor) to the output pitch range(120-1500Hz)
  //change the minimum and maximum input number below depending on the range your sensor's giving;

  int thisPitch = map(sensorReading, 400, 1000, 120, 1500);

  //play the pitch:
  tone(9, thisPitch, 10);
  delay(1); //delay for stability 

}
