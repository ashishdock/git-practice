#include <Servo.h> //Servo header file needs to be attached to work with Servos. It has the functions to use for running Servo.

Servo myServo; //create servo object to control a servo
              // twelve servo objects can be created on most boards

int pos = 0; // variable to store the servo position

void setup() {
  myServo.attach(9); // attaches the servo on pin 9 to the servo object

}

void loop() {
  for(pos = 0; pos < 180; pos +=1) //goes from 0 degrees to 180 degrees in steps of 1 degree
  {
    myServo.write(pos); //tell servo to go to position in variable pos
    delay(15);  // waits 15ms for the servo to reach the position
  }
  
  for(pos = 180; pos >= 1; pos -= 1)
  {
    myServo.write(pos);
    delay(15);
  }
  

}
