class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound, String x)
     {
     	myType = type;
     	mySound = sound;
     	mySound = x;
     }
     public Chick()
     {
     	myType = "chick";
     	
     	mySound = "cheep";
     	mySound = "cluck";
     }
     
     public void setSound(String cheep, String cluck)
     {

     	if(Math.random() < 0.5)
     	{
     		mySound = "cheep";
     	}
     	else
     	{
     		mySound = "cluck";
     	}
     }
     
     public String getSound()
     {
     	return mySound;

     }
     public String getType()
     {
     	return myType;
     }
}