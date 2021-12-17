import processing.serial.*;

float boxX;
float boxY;
int boxSize = 20;
boolean mouseOverBox = false;

Serial port;

void setup()
{
  size(200, 200);
  boxX = width/2.0;
  boxY = height/2.0;
  rectMode(RADIUS);
  
  println(Serial.list());
  
  port = new Serial(this, Serial.list()[0], 9600);
  
}

void draw()
{
  background(0);
  
  if(mouseX > boxX-boxSize && mouseX <boxX+boxSize && mouseY > boxY - boxSize && mouseY < boxY+boxSize) 
  {
    mouseOverBox = true;
    stroke(255);
    fill(153);
    port.write('H');
  }
  else
  {
    stroke(153);
    fill(153);
    port.write('L');
    mouseOverBox = false;
  }
  
  rect(boxX, boxY, boxSize, boxSize);
}
