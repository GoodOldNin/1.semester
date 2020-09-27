void setup()
{
  size(1200,800);
  rectMode(CENTER);
  fill(100);
}

void draw()
{
background(255);
rect(mouseX,mouseY,150,150);
println(mouseX+"\t"+mouseY);
strokeWeight(10);
rect(120,700,150,150);
rect(200,620,150,150);
rect(280,700,150,150);
rect(200,750,150,150);

}
