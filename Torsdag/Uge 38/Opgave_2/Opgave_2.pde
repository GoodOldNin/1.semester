int x = 1;
int y = 2;
String ZZ = "Abc";

boolean happy = false;

void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
SUM(5,2);
ReturnUpper("keep it realz");
CAPS("abc");
println (CAPS("abc"));
}



boolean iAmHappy()
{
  return(happy); 
  
}

int SUM(int x,int y)
{
  println (x+y);
  return x + y;
  
}


String ReturnUpper(String xyz)
{
println (xyz.toUpperCase());
return (xyz.toUpperCase());
}
  
boolean CAPS(String ZZ)
{
char O = ZZ.charAt(0);
  if (Character.isUpperCase(O))
  {
  return true;
  }
  return false;
}
