class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String name)
	{
		myName = name;

	}
	public NamedCow()
	{
		name = "Elsie";
	}
	public String getName()
	{
		return name;
	}
}