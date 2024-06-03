public class Nil extends BT {
	private static Nil nil; // reference to the singleton object
	// dummy constructor
	private Nil()
	{
	}
	// obtaining reference to the singleton object
	public static Nil getNil()
	{
	if(nil == null)
	nil = new Nil();
	return nil;
	}
	
	// overriding method for computing the height of Nil
	public int height()
	{
	return -1;
	}
	public String toString()
	{
	return "Nil";
	}
	public boolean isBST()
	{
		return true;
	}
}