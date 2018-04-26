float randomCometX = random(0, 640);
float cometX = 640;
float cometY = -75;
float cometX2 = 640;
float cometY2 = -75;
PVector[] stars;

void setup() {
  size(640, 400);
  background(#000033);
  
  stars = new PVector[1000];
  for(int m = 0; m < stars.length; m++) {
    float x = random(0, 640);
    float y = random(0, 400);
    stars[m] = new PVector(x, y);
  }
}

void draw() {

    //stars
  
  for(int m = 0; m < stars.length; m++) {
    noStroke();
    fill(255);
    ellipse(stars[m].x, stars[m].y, 1, 1);
  }
  
  //comet
  fill(#FFD700);
  ellipse(cometX, cometY, 25, 25);
  cometX -= 5; 
  cometY += 5;
  
  //comet trail
  if(cometY >= 50) {
      fill(#000033);
  ellipse(cometX2, cometY2, 30, 30);
  cometX2 -= 5;
  cometY2 += 5;
  }
  
  if(cometY >= 1000) {
    cometX =  randomCometX;
    cometY = -75;
    cometX2 = randomCometX;
    cometY2 = -75;
  }
  
  randomCometX = random(0, 640);
  
  //moon
  noStroke();
  fill(#F0E68C);
  ellipse(100, 90, 100, 100);
  
  fill(0);
  
  //ground
  ellipse(320, 400, 750, 125); 
  
  //tree trunk
  rect(450, 200, 40, 300);
  triangle(450, 400, 400, 400, 450, 200);
  triangle(490, 400, 515, 400, 490, 200);
  
  //leaves
  ellipse(470, 150, 120, 120);  
  ellipse(410, 200, 120, 120);
  ellipse(530, 200, 120, 120);
  
  }
