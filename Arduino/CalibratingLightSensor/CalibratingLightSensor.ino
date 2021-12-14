//CalibratingLightSensor

// Sensor PIN is A0
// LED PIN is 9
//For calibration start and stop indicator built in LED will be used as signal


//variables
int sensorValue = 0;
int sensorMin = 1023;
int sensorMax = 0;


void setup() {
  pinMode(13,OUTPUT);
  digitalWrite(13, HIGH);

  while (millis() < 5000)
  {
    sensorValue = analogRead(A0);

    //record the maximum sensor value
    if(sensorValue > sensorMax)
      sensorMax = sensorValue;
  

    //record the minimum sensor value
    if(sensorValue<sensorMin)
      sensorMin = sensorValue;
    
  }

  //signal the end of calibration
  digitalWrite(13, LOW);
}

void loop() {
  //read the sensor
  sensorValue = analogRead(A0);

  //apply the calibration to the sensor reading
  sensorValue = map(sensorValue, sensorMin, sensorMax, 0, 255);

  //in case the sensor value is outside the range seen during calibration
  sensorValue = constrain(sensorValue, 0, 255);

  //fade the LED using the calibrated value;
  analogWrite(9, sensorValue);

}
