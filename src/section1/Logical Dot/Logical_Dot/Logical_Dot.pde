

void setup() {
  size(600,600);
}

void draw() {
  fill(#CE6A43);
  ellipse(300,300, 550,550);
  if(mousePressed){
    fill(#2708FF);
    ellipse(300,300,550,550);
  }
  else{
    fill(#218E34);
    ellipse(300,300,550,550);
  }
}
