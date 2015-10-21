class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound, String soundtwo)
     {
     	myType = type;
     	mySound = sound;
     	mySound = soundtwo;
     }
     public Chick()
     {
     	myType = "chick";
     	if( (int)(Math.random() > 0.5))
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