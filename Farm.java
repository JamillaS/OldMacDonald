class Farm 
{     
   private Animal[] animals = new Animal[3];
   public Farm()
   {
   	animals[0] = new Cow("cow", "Elsie", "moo");
   	animals[1] = new Chick("chick", "cheep", "cluck");
   	//animals[1].setSound("cheep", "cluck");
   	animals[2] = new Pig("pig", "oink");
   }
   public void animalSounds()
   {

   	for(int i = 0; i < animals.length; i ++)
   	{
   		((Chick)(animals[1])).setSound("cheep","cluck");
   		System.out.println(animals[i].getType() + " goes " + animals[i].getSound());
   	}
   		System.out.println( "The cow is known as " + ((NamedCow)animals[0].getName()));
   }
}
