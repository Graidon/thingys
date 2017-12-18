
Ball myBall = new Ball(50, 100, color(163,192,15));
Ball yourBall = new Ball(150, 200, color(163,192,15));

void setup() {
//  size (200, 200);
fullScreen();
print("Screen Dimensions" + "\n My width is " + displayWidth + "\n My height is " + displayHeight);

}

void draw () {
  background (0); //Black on a GreyScale
  
  myBall.EdgeDetection ();
  myBall.ClassDraw ();
  
  yourBall.EdgeDetection ();
  yourBall.ClassDraw ();
} //End of DRAW Loop