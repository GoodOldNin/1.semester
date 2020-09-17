

void setup()
{
  // int array
  int[] numbers = {1, 2, 3};
  int[] numbers2 = new int[3];
  numbers2[0] = 3;
  numbers2[1] = 5;
  numbers2[2] = 7;

  // String array
  String[] text = {"en","to","tre"};
  String[] text2 = new String[3];
  text2[0] = "fire";
  text2[1] = "fem";
  text2[2] = "seks";

  // Boolean array
  boolean[] bit = {false,true,false};
  boolean[] bit2 = new boolean[3];
  bit2[0] = true;
  bit2[1] = true;
  bit2[2] = false;
textInput(text);
sumNumbers(numbers);
}

void textInput(String tmpText[])
{
  for(int i = 0; i < 3; i++)
    println (tmpText[i]); 
}

void textInput2(String tmpText[])
{
  for(int i = 0; i < tmpText.length; i++)
  {
    println (tmpText[i]);
  }
}

int sumNumbers(int tmpNumbers[])
{
  int totalSum = 0;
  for(int i = 0; i < tmpNumbers.length; i++)
  {
    totalSum = totalSum + tmpNumbers[i];
  
  }
  println (totalSum);
  return totalSum;
  
}
