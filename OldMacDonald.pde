
void setup()
{
	size(400, 400);
	Cow c = new Cow("cow", "moo");
	System.out.println(c.getType() + " goes " + c.getSound());
	Chick ch = new Chick("chick", "cheep", "cluck");
	System.out.println(ch.getType() + " goes " + ch.getSound());
	Pig p = new Pig("pig", "oink");
	System.out.println(p.getType() + " goes " + p.getSound());
	Farm one = new Farm();
	one.animalSounds();
}
