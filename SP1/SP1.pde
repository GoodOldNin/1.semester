/**
 * Array 2D. 
 * 
 * Demonstrates the syntax for creating a two-dimensional (2D) array.
 * Values in a 2D array are accessed through two index values.  
 * 2D arrays are useful for storing images. In this example, each dot 
 * is colored in relation to its distance from the center of the image. 
 */
 
import java.util.Random;
// game (boardHeight,boardLength, enemys, lives)

int numEnemies = 15;
int numLife = 50;
Game game = new Game(30, 20, numEnemies, numLife);
PFont font;

boolean startScreen = true;
boolean endScreen = false;
boolean playGame = false;



public void settings() {
  size(1201, 801);
}

void setup()
{  
  background(0);
  frameRate(10);
  fill(0);
  font = createFont("Arial", 16, true);
  textFont(font, 16);
}

void keyReleased()
{
  if (playGame)
  {
    game.onKeyReleased(key, keyCode);
  }
  else if (startScreen)
  {
    playGame = true;
    startScreen = false;
  }
  else if (endScreen)
  {
    //resetGame(int numberOfEnemies,int life)
    game.resetGame(numEnemies,numLife);
    playGame = true;
    endScreen = false;
  }
}

void keyPressed()
{
  if (playGame)
  {
    game.onKeyPressed(key, keyCode);
  }
  else if (startScreen)
  {
    playGame = true;
    startScreen = false;
  }
  else if (endScreen)
  {
    game.resetGame(numEnemies,numLife);
    playGame = true;
    endScreen = false;
  }
}


void draw()
{
  if (startScreen)
  {
    welcomeScreen();
  }
  else if (endScreen)
  {
    ending();
  }
  else if (playGame)
  {
    if (game.getPlayerLife() <= 0)
    {
      background(0);
      endScreen = true;
      playGame = false;
    }
    else
    {
      game.update();
      background(0); //Black
      // This embedded loop skips over values in the arrays based on
      // the spacer variable, so there are more values in the array
      // than are drawn here. Change the value of the spacer variable
      // to change the density of the points
      int[][] board = game.getBoard();
      for (int y = 0; y < game.getHeight(); y++)
      {
        for (int x = 0; x < game.getWidth(); x++)
        {
          if(board[x][y] == 0)
          {
            fill(0,0,0);
          }
          //player1
          else if(board[x][y] == 1)
          {
            fill(0,0,255);
          }
          //enemies
          else if(board[x][y] == 2)
          {
            fill(255,0,0);
          }
          //food
          else if(board[x][y] == 3)
          {
            fill(0,255,0);
          }
          //player2
          else if(board[x][y] == 4)
          {
            fill(255,255,0);
          }
            stroke(100,100,100);
            rect(x*40, y*40, 40, 40);
        }
      }
      fill(255);
      text("Lives: "+game.getPlayerLife(), 25,25);
    }
  }
}

void welcomeScreen()
{
  fill(255,50,255);
  textSize(42);
  textAlign(CENTER, CENTER);
  text("THE\nKILLER SQUARES\n!!111oneone!", 600, 400);
  textSize(30);
  textAlign(CENTER, CENTER);
  text("Press Any Key To Start...", 600, 750);
  drawPlayer(200,150,"blue");
  drawPlayer(600,600,"yellow");
  drawPlayer(1000,150,"green");
  drawPlayer(120,700,"red");
  drawPlayer(200,620,"red");
  drawPlayer(280,700,"red");
  drawPlayer(200,750,"red");
  drawPlayer(920,700,"red");
  drawPlayer(1000,620,"red");
  drawPlayer(1080,700,"red");
  drawPlayer(1000,750,"red");
  defaultSettings();
  
}

void drawPlayer(int x,int y,String colour)
{
  int size = 150;
  rectMode(CENTER);
  strokeWeight(7);
  if (colour == "red")
  {
    fill(255,0,0);
  }
  else if (colour == "green")
  {
    fill(0,255,0);
  }
  else if (colour == "blue")
  {
    fill(0,0,255);
  }
  else if (colour == "yellow")
  {
    fill(255,255,0);
  }
  else 
  {
    fill(255,0,255);
  }
  rect(x,y,size,size);
  defaultSettings();
}

void defaultSettings()
{
  strokeWeight(1);
  rectMode(CORNER);
  textSize(16);
  textAlign(TOP,LEFT);  
}

void ending()
{
  String winner = "blue";
  fill(255,50,255);
  textSize(42);
  textAlign(CENTER, CENTER);
  text("Game Over\nAnd The Winner IS...\n"+winner, 600, 400);
  textSize(30);
  textAlign(CENTER, CENTER);
  text("Press Any Key To Restart...", 600, 750);
  drawPlayer(600,600,winner);
  defaultSettings();
  
} 
