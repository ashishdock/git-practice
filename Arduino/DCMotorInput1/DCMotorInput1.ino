//motorPin = 9;
int Speed; //Variable to store Speed, by defaul 0 PWM
int flag;

void setup() {
  Serial.begin(9600);
  pinMode(9, OUTPUT);
  Serial.println("Give a number from 120 to 255. The motor will continue to run with that speed."); //Why minimun value 120? Because with values below 120 the motor doesn't spin ;)
  Serial.println(""); //Blank line

}

void loop()
{  
  //Check if incoming data is available:
    if (Serial.available() > 0)
    {
      // If it is, we'll use parseInt() to pull out only numbers:
      Speed = Serial.parseInt();
      flag=0;
    }

  //Valid range is from 50 to 255
  if (Speed>=50 && Speed<=255){
    //Send PWM value with analogWrite to Arduino pin 3 and print a message to serial monitor
    analogWrite(9, Speed);
      //Print message only once
      if (flag==0){ 
        //Print PWM value
        Serial.print("Motor spinning with ");
        Serial.print(Speed);
        Serial.println(" PWM");
        flag=1;
      }
  }
  
  delay(1000); //This delay is useless here. The motor continues to spin.
}

// Using this code I found out that my DC motor needs at least the speed value of 120, which means it needs at least around 50% power to rotate. Otherwise
// it just makes a buzzing sound
