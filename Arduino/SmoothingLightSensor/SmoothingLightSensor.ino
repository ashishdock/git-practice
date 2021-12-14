//SmoothingLightSensor

const int numReadings = 10;
int readings[numReadings];
int readIndex = 0;
int total = 0;
int average = 0;

int inputPin = A0;

void setup() {
  Serial.begin(9600);
  for (int thisReading = 0; thisReading < numReadings; thisReading++)
    readings[thisReading] = 0;

}

void loop() {
  total = total - readings[readIndex];
  readings[readIndex] = analogRead(A0);
  total += readings[readIndex];
  readIndex += 1;

  if(readIndex >= numReadings)
    readIndex = 0;

   //calculate the average
   average = total / numReadings;

   //send it to the serial monitor
   Serial.println(average);
   delay(1); //delay for stability 

}
