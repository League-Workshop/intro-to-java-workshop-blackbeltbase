PImage mustache;
PImage friend;
PImage hat;

void setup() {
friend = loadImage("friend.jpeg");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("mustache.png");
mustache.resize(400,100);
hat = loadImage("hat.png");
hat.resize(250,200);
}

void draw() {
background(friend);
if(mousePressed)
{
  image(mustache,mouseX,mouseY);
}
if(mouseButton == RIGHT)
{
  image(hat, 200,400);
}
image(mustache, 150, 200);
}
