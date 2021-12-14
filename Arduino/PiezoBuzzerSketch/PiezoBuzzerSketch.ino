//PiezoBuzzerSketch

#include "pitches.h"

int melody[] = {NOTE_C4, NOTE_G3, NOTE_G3, NOTE_A3, NOTE_G3, 0, NOTE_B3, NOTE_C4};

//note durations: 4 = quarter note, 8 = eigth note, etc.
int noteDurations[] = { 4, 8, 8, 4, 4, 4, 4, 4 };

void setup() {
  // iterate over the notes of the melody:
  for(int thisNote = 0; thisNote < 8; thisNote++){
    //to calculate the note duration, take one second divided by the note type.
    //eg. quarter note = 1000/4, eigth note = 1000/8, etc.
    int noteDuration = 1000/noteDurations[thisNote];
    tone(8, melody[thisNote], noteDuration);

    //to distinguish the notes, set a minimum time between them
    //the note's duration + 30% seems to work well
    int pauseBetweenNotes = noteDuration * 1.3;
    delay(pauseBetweenNotes);
    //stop the tone playing;
    noTone(8);
  }

}

void loop() {
  // No need to repeat the melody.

}
