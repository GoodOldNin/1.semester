

void setup()
{

Student s1 = new Student("Ole",35,false,'C');
Student s2 = new Student("Morten",28,false,'A');
Student s3 = new Student("Julie",14,true,'A');
Student s4 = new Student("MM",15,false,'C');
Teacher t1 = new Teacher("Jens",40,false);

println ("my teacher is called "+t1.name);
println ("i am called "+s1.name+" and i am on team "+s1.datamatikerTeam);
println ("The person next to me is called "+s2.name+"\n"+"and he am on team "+s2.datamatikerTeam);

}

void draw()
{

}
