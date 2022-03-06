import processing.core.PApplet;

/** 
 * This program displays a flower in a random position with a random color. 
 * If the flower falls in the top left corner, the background turns white.
 * If the flower falls in the right half or bottom half of the screen, the background turns blue.
 * The current time is also displayed in the top left. 
 */


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
    int intSeconds = second();
    int intMinutes = minute();
    int intHours = hour();
    String stringTime;

 
    //defines variables, sets random position for center of the flower
    floatFlowerX = random(0, width);
    floatFlowerY = random(0, height);
    floatSize = width / 4;
    floatDistance = floatSize / 2;

    //if the flower falls in the top left corner the background turns white
    if (floatFlowerX < width / 2 && floatFlowerY < height / 2) {
      background(255, 255, 255);
    }

    //if the flower falls in the right side of the screen or the bottom half background turns blue
    if (floatFlowerX > width / 2 || floatFlowerY > height / 2) {
      background(0, 0, 255);
    }
    
    //draws the flower using variables
    fill(floatColor1, floatColor2, floatColor3);

    ellipse(floatFlowerX - floatDistance, floatFlowerY - floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY-floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX-floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);
    
    ellipse(floatFlowerX, floatFlowerY, floatSize, floatSize);

    //draws squares in the center of the flower
    square(floatFlowerX, floatFlowerY, floatSize / 3);
    square(floatFlowerX-floatDistance / 2, floatFlowerY-floatDistance / 2, floatSize / 3);

  
    //sets the time variable
    stringTime = "the current time is: " + intHours + ":" + intMinutes + ":" + intSeconds;

    //adds 0s to the time values if any of them are less than 10 
    if (intHours < 10) {
      stringTime = "the current time is: " + "0" + intHours + ":" + intMinutes + ":" + intSeconds;
    }
    if (intMinutes < 10) {
      stringTime = "the current time is: " + intHours + ":" + "0" + intMinutes + ":" + intSeconds;
    }if (intSeconds < 10) {
      stringTime = "the current time is: " + intHours + ":" + intMinutes + ":" + "0" + intSeconds;
    }

    //actually diplays the text
    text(stringTime, 10, 120);

    //tells the draw method not to loop 
    noLoop();
  }
  
}