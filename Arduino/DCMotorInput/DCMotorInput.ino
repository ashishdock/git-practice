//motorPin = 9;
int Speed; //Variable to store Speed, by defaul 0 PWM

void setup() {
  Serial.begin(9600);
  pinMode(9, OUTPUT);
  Serial.println("Give a number from 120 to 255. The motor will continue to run with that speed."); //Why minimun value 120? Because with values below 120 the motor doesn't spin ;)
  Serial.println(""); //Blank line

}

void loop() {
  
  if (Serial.available() > 0){
    Speed = Serial.parseInt();
    // If it is, we'll use parseInt() to pull out only numbers:
    analogWrite(9, Speed);
    //Print message only once
    //Print PWM value
    Serial.print("Motor spinning with ");
    Serial.print(Speed);
    Serial.println(" PWM");
  }

  
  //delay(5000);

}



// Using this code I found out that my DC motor needs at least the speed value of 120, which means it needs at least around 50% power to rotate. Otherwise
// it just makes a buzzing sound
