class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound)
	{
		myName = name;
		myType = type;
		mySound = sound;

	}
	public NamedCow()
	{
		myName = "Elsie";
	}

	public String getName()
	{
		return myName;
	}
}