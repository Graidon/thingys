class Rectangle {
  float x=10;
  float y=10;
  float width=80;
  float height=10;
  
  Rectangle (float x,float y, float width, float height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
 void draw () {
    fill(255);
  rect(x,y, width, height); 
 }
}