
void setup()
{
	size(400, 400);
	Cow c = new Cow("cow", "moo");
	System.out.println(c.getType() + " goes " + c.getSound());

	Chick ch = new Chick("chick", "cheep", "cluck");
	ch.setSound("cluck","cheep" );
	System.out.println(ch.getType() + " goesm " + ch.getSound());

	Pig p = new Pig("pig", "oink");
	System.out.println(p.getType() + " goes " + p.getSound());
	Farm one = new Farm();
	one.animalSounds();
}
