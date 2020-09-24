int div = 2;
int max = 100;
int o = 0;
int[] arr = {1,1,1,2,2,3,3,3,4,5,5,5,6,6,7,8,8,9,9,10};
float r = random(20);

void setup()
{
printDiv(100,5);
returnArr();
recur(29);
fibo(1,1);
}

void draw()
{
 
}


void printDiv(int max, int div)
{
  for (int i = 0; i <= max; i++)
    if (i%div == 0)
    {
    println(i);
    }
}
int returnArr()
{
  println (arr[int(r)]);
  return arr[int(r)];
}

void recur (int p)
{
  if (p > 0)
  {
  println(p);
  p = p-1;
  recur(p);
  }
  return;
}

void fibo(int e, int c)
{
  if (c < 10000)
  {
  println(e+"\t"+c);
  fibo(c,c+e);
  }

}
