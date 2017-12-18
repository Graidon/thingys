class Ball {
 private int x;
 private int y;
 public int targetX = 250;
 public int targetY = 250;

  public Ball(int x,int y){
    this.x = x;
    this.y = y;
   
  }
  
  public void step () {
     if(x < targetX) {
       x++;
     } else {
       x--;
     }
    
     if(y < targetY) {
       y++;
     } else {
       y--;
     }
   }


public int getX () {
 return x; 
}
public int getY () {
 return y; 
}
}