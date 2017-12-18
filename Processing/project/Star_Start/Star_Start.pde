private Star[] stars = new Star[70000];

public void setup() {
  size(500,500);
 //fullScreen();
 ellipseMode(CENTER);
 for (int i = 0; i < stars.length; i++) {
   stars[i] = new Star(random(width), random(height), Star.maxRadius);
 }
}

public void draw() {
  background(0);
  fill(random(255), random(255), random(255));
  for(int i = 0; i < stars.length; i++) {
    ellipse(stars[i].getX(), stars[i].getY(), stars[i].getRadius(), stars[i].getRadius());
 }
}


public void mouseClicked() {
 for (int i = 0; i < stars.length; i++) {
   stars[i] = new Star(random(width), random(height), Star.maxRadius);
 }
}