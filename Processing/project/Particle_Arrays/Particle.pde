class Particle {
  float gravity = 0.5;
  float x = 250;
  float y = 250;
  float deltaX = random(-10,10);
  float deltaY = random(-10, 10);
  float radius = (30);

  
  // constructor, keyword 'this'
  void reset () {
    x = mouseX;
    y = mouseY;
    deltaX = random(-7, 7);
    deltaY = random(-10, 5);
    radius = (30);
  }
  void step () {
   deltaY += gravity;

  }
  void draw () {
   fill (random(0,255),random(0,255),random(0,255));
   ellipse (x,y,radius,radius);
  }
    void EdgeDetection () {
      //Ensureing Ball does not leave the screen
    if(x+deltaX < 0 || x+deltaX > width) {
      deltaX *= -1;
    }
    if(y+deltaY < 0 || y+deltaY > height) {
      deltaY *= -1;
    }
   x += deltaX;
   y += deltaY;
  }
  
  void move() {
    if(y > 0+radius/2) {
      gravity = 0;
    } else {
      gravity = 0.5;
    }
    
    if(deltaY > 0) {
      gravity = 0;
    } else {
      gravity = 0.5;
    }
    
        if(deltaX > 0) {
      gravity = 0;
    } else {
      gravity = 0.5;
    }
  }
}