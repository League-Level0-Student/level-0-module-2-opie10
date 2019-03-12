//Make a variable to hold the X co-ordinate of the dot and set it to void setup() {
import ddf.minim.*;
boolean soundPlayed = false;
void playSound(String s) {
  if (!soundPlayed) {
    Minim minim = new Minim(this);
    AudioSample sound = minim.loadSample(s);
    sound.trigger();
    soundPlayed = true;
  }
}

int z=20 ;
int y=20 ;
int x=20 ;
void setup() {
  size(800, 200);
}
void draw() {
  //make it a nice color
  fill(#00AA42);
  noStroke();
  //if the mouse is pressed...
  background(#3A00FF);
  ellipse(x, 75, 20, 20);
  fill(#FF0A0A);
  ellipse(y, 125, 20, 20);
  fill(#2100AA);
  ellipse(z, 175, 20, 20);
  playSound("groove.mp3");
  if (mousePressed) {
    z=z+(int)random(5);
    x=x+(int)random(5);
    y=y+(int)random(5);
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.


    //Make your dot move really fast so that it can win the race
  }
  //(you have to figure out what part of your code to change)
  //Use this method to play a ding when your dot crosses the finish line.
  if (x>800){
  

    playSound("jeoprady.wav");
  }
  if (y>800)
  {

    playSound("jeoprady.wav");
  }
  if (z>800)
  {

    playSound("jeoprady.wav");
  }
}
