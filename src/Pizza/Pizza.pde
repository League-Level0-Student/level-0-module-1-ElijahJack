PImage sink;

void setup(){
  size(800, 600); 
  sink = loadImage("sink.ppm.gif");
}

void draw(){
  fill(210, 180, 140);
  ellipse (400, 300, 350, 350);
  fill(250, 100, 100);
  ellipse (400, 300, 300, 300);
  
}