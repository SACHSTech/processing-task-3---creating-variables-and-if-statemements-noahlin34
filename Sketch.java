import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    float floatFlowerX;
    float floatFlowerY;
    float floatDistance;
    float floatSize;
    float floatColor1 = random(0, 255);
    float floatColor2 = random(0, 255);
    float floatColor3 = random(0, 255);
    int intFillColor1 = 1;
    int seconds = second();
    int minutes = minute();
    int hours = hour();
    String hoursString;
    String minutesString;
    String secondsString;

  

    floatFlowerX = random(0, width);
    floatFlowerY = random(0, height);
    floatSize = width/4;
    floatDistance = floatSize/2;

    //if the flower falls in the top right corner the background turns white
    if (floatFlowerX < width/2 && floatFlowerY < height/2) {
      background(255, 255, 255);
    }
    fill(floatColor1, floatColor2, floatColor3);
    ellipse(floatFlowerX - floatDistance, floatFlowerY - floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY-floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX-floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);
    
  

    ellipse(floatFlowerX, floatFlowerY, floatSize, floatSize);

    //square(floatFlowerX - floatFlowerX/6, floatFlowerY - floatFlowerY/6, floatSize/2);
    square(floatFlowerX, floatFlowerY, floatSize/3);
    square(floatFlowerX-floatDistance/2, floatFlowerY-floatDistance/2, floatSize/3);

  

    String time;

    time = "the current time is: " + hours + ":" + minutes + ":" + seconds;

    if (hours < 10) {
      time = "the current time is: " + "0" + hours + ":" + minutes + ":" + seconds;
    }
    if (minutes < 10) {
      time = "the current time is: " + hours + ":" + "0" + minutes + ":" + seconds;
    }if (seconds < 10) {
      time = "the current time is: " + hours + ":" + minutes + ":" + "0" + seconds;
    }

    text(time, 10, 120);

    noLoop();
  }
  
  // define other methods down here.
}