
class Ball {
  float radius;
  float x;
  float y;
  color c;
  float xSpeed;
  float ySpeed;
  
  Ball (float x, float y, color myColor){
    this.x = x;
    this.y = y;
    c = myColor;
    xSpeed=6.0;
    ySpeed=10.0;
    radius = 25;
    
  } //End of Constructor
  
  void EdgeDetection () {
      //Ensureing Ball does not leave the screen
    if(x+xSpeed < 0 || x+xSpeed > width) {
      xSpeed *= -1;
    }
    if(y+ySpeed < 0 || y+ySpeed > height) {
      ySpeed *= -1;
    }
  
    x += xSpeed;
    y += ySpeed;
  }
  
  void ClassDraw () {
    fill(c); //Fills the Ball with color
    ellipse(x, y, radius, radius); //Shape for myBall
  }
  
} //End of Class Ball