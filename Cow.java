class Cow implements Animal 
{     
     private String myType;
     private String mySound;
     public Cow(String type, String name, String sound)
     {
     	myType = type;
     	mySound = sound;
     	myName = name;
     }
     public Cow()
     {
     	myType = "cow";
     	mySound = "moo";
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