Particle[] particle = new Particle[1];

void setup () {
 size (500, 500);
 
 for(int i=0; i < particle.length; i++) {
   particle[i] = new Particle();
 }
}

void draw () {
 background(0);
 
 for(int i=0; i < particle.length; i++) {
 particle[i].step();
 }
  for(int i=0; i < particle.length; i++) {
 particle[i].draw();
  }
 for(int i=0; i < particle.length; i++) {
 particle[i].EdgeDetection ();
    }
 for(int i=0; i < particle.length; i++) {
 particle[i].move ();
    }
}

void mousePressed() {
  for(int i=0; i < particle.length; i++) {
 particle[i].reset();
  }
}