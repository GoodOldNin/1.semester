/* text()
 textAlign(CENTER or LEFT or RIGHT)
 substring()    and replace()
and trim() 
split() 
join() 
loadStrings() // text file or url
splitTokens()
*/

void setup()
{
background(0);
size(100,100);



//loadStrings

  
//String[] lines = loadStrings("Pewpew.txt");
//println("there are " + lines.length + " lines");
//for (int i = 0 ; i < lines.length; i++) {
//  println(lines[i]);


String[] lines = loadStrings("http://endless.horse");
println("there are " + lines.length + " lines");
for (int i = 0 ; i < lines.length; i++) {
  println(lines[i]);


}



//Replace

//String word = "cake";
//print(word);  //# Prints cake
//String word2 = word.replace('c', 'm');   //erstatter bogstavet c med m,
//print(word2);  //# Prints make


}

void draw()

{
//textSize(6);
//textAlign(LEFT);
//text("left",10,10);
//textAlign(CENTER);
//text("center",10,10);
//textAlign(RIGHT);
//text("right",10,10);  

//Name  
//substring()
//Examples  
//String str1 = "CCCP";         
//String str2 = "Rabbit"; 
//String ss1 = str1.substring(2);     // Returns "CP"      fra plads 2 til slut
//String ss2 = str2.substring(3);     // Returns "bit"    fra plads 3 til slut
//String ss3 = str2.substring(0, 2);  // Returns "Ra"    fra plads 0 til 2 (tager ikke 2 med)
//println(ss1 + ":" + ss2 + ":" + ss3);  // Prints "CP:bit:Ra"


//trim()

//String s1 = "    Somerville MA ";
//println(s1);  // Prints "    Somerville MA "
//String s2 = trim(s1);
//println(s2);  // Prints "Somerville MA"

//String[] a1 = { " inconsistent ", " spacing" };  // Note spaces
//String[] a2 = trim(a1);
//printArray(a2);
// Prints the following array contents to the console:
// [0] "inconsistent"
// [1] "spacing"


}
