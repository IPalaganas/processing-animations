
float randomStarsX = random(0, 640);
float randomStarsY = random(0, 400);
float randomCometX = random(0, 640);
float cometX = 640;
float cometY = -75;
float cometX2 = 640;
float cometY2 = -75;
int starsCounter = 0;
void setup() {
  size(640, 400);
    background(#000033);
}

void draw() {
  
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
  
 //stars
  fill(250);
  ellipse(randomStarsX, randomStarsY, 1, 1);
  randomStarsX = random(0, 640);
  randomStarsY = random(0, 400);
  starsCounter ++;
  
  if(starsCounter >= 1000) {
  randomStarsX = 0;
  randomStarsY = 0;
  }
  
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
