/*
1.a Write a function that prints an empty line and call it from setup();
1.b Write a function that receives a string as a parameter and prints it. call this function from setup()
1.c Write a function that receives a string called "name" and an integer called "age" and call it from setup with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old."
*/

void setup()
{

emptyline();
stringP("smør");
stringNameAge("Ole","35");
}

void emptyline()
{
  println();
}

void stringP(String x)
{
  println(x);  
}

void stringNameAge(String name, String age)
{
  println("My name is "+name+", I am "+age+" years old.");
  
}
