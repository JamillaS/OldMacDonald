class Farm 
{     
   private Animal[] animals = new Animal[3];
   public Farm()
   {
   	animals[0] = new Cow("cow", "moo");
   	animals[1] = new Chick("chick", "cheep", "cluck");
   	animals[2] = new Pig("pig", "oink");
   }
   public void animalSounds()
   {
   	for(int i = 0; i < animals.length; i ++)
   	{
   		System.out.println(animals[i].getType() + " goes " + animals[i].getSound());
   	}
   }
}
