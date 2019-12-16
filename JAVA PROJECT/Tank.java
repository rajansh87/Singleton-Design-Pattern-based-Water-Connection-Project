class Tank
{
	private static Tank instance;
	private Tank(){}
	public static Tank getInstance()
	{
		if(instance == null)
			instance=new Tank();
			
		return instance;
	}
}