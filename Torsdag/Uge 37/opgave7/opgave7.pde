int input;
input = 26;
int x = input;

while(input > 0)
{
  if(input==6)
    {
      println("six"); 
    }
  else if(x/2 == input)
    {
      println("half"); 
    }
  
  else
    {
      println(input);
    }
  input = input -1;
}
