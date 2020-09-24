boolean jobsDone = false;

void setup()
{
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

void isJobDone()
{
    return jobsDone;    
}
