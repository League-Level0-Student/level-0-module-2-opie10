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
boolean soundPlayed2 = false;
void playSound2(String s) {
  if (!soundPlayed2) {
    Minim minim = new Minim(this);
    AudioSample sound = minim.loadSample(s);
    sound.trigger();
    soundPlayed2 = true;
  }
}
boolean finished= false;
int[] ia = new int[4];
int a=20 ;
int z=20 ;
int y=20 ;
int x=20 ;

void setup() {
  size(800, 200);
}

void draw() {
  //make it a nice color
  fill(#90063B);
  noStroke();
  //if the mouse is pressed...
  background(#3A00FF);
  ellipse(x, 25, 20, 20);
  fill(#FF0303);
  ellipse(y, 125, 20, 20);
  fill(#2100AA);
  ellipse(z, 175, 20, 20);
  fill(#498604);
  ellipse(a, 75, 20, 20);



  playSound("groove.mp3");

  if (mousePressed && finished==false) {
    a=a+(int)random(5);
    z=z+(int)random(5);
    x=x+(int)random(5);
    y=y+(int)random(5);
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.


    //Make your dot move really fast so that it can win the race
  }
  if (x>800) {
    finished=true ;


    playSound2("jeopardy.wav");
  }
  if (y>800)
  {
    finished = true;


    playSound2("jeopardy.wav");
  }
  if (z>800)
  {
    finished=true;

    playSound2("jeopardy.wav");
  }
  if (a>800) {
    finished=true ;


    playSound2("jeopardy.wav");
  }

  if (finished) {
    ia[0]=x;
    ia[1]=y;
    ia[2]=z;
    ia[3]=a;
    ia=sort(ia);
    println(ia);

    if (ia[3]== x) {
      fill(#EAC118);
      ellipse(700, 25, 20, 20);
    } else if (ia[3]== y) {
      fill(#EAC118);
      ellipse(700, 125, 20, 20);
    } else if (ia[3]== z) {
      fill(#EAC118);
      ellipse(700, 175, 20, 20);
    } else if (ia[3]== a ){
      fill(#EAC118);
      ellipse(700, 75, 20, 20);
    }
    if (ia[2]== x) {
      fill(#D3D2CD);
      ellipse(700, 25, 20, 20);
    } else if (ia[2]== y) {
      fill(#D3D2CD);
      ellipse(700, 125, 20, 20);
    } else if (ia[2]== z ){
      fill(#D3D2CD);
      ellipse(700, 175, 20, 20);
    } else if (ia[2]== a) {
      fill(#D3D2CD);
      ellipse(700, 75, 20, 20);
    }
    if (ia[1]== x ){
      fill(#DB7B04);
      ellipse(700, 25, 20, 20);
    } else if (ia[1]== y) {
      fill(#DB7B04);
      ellipse(700, 125, 20, 20);
    } else if (ia[1]== z ){
      fill(#DB7B04);
      ellipse(700, 175, 20, 20);
    } else if (ia[1]== a) {
      fill(#DB7B04);
      ellipse(700, 75, 20, 20);
    }
  }
  
}



  //(you have to figure out what part of your code to change)
  //Use this method to play a ding when your dot crosses the finish line.
