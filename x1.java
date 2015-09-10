//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,200,250 );                // sky
  fill( 255,255,0 );
  ellipse( width*1/8, height/4, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 500,horizon-25, 550,horizon-25, 525,horizon-75  );  // tree
  noStroke();
  triangle( 500,horizon-15, 550,horizon-15, 525,horizon-75  );
  fill(130, 42, 42 );
  rect(518, horizon-15, 15, 15);
  fill(0);
  text( "Now it is a good tree!!", 522,horizon -100 );
  fill(0, 160,  );
  rect(width*1/4, horizon-50, 50, 50);                                          // house

  fill(0);
  text( "My name is Mud", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,0,0); rect( x,y, 30,50 );        /* REPLACE THIS WITH YOUR OWN CODE! */
  text( "Fred", x,y );

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

