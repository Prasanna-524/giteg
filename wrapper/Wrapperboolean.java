package wrapper;

public class Wrapperboolean {
public static void main(String args[]) {
	boolean bool=false;
	Boolean boolWrapper=new Boolean(true);
	boolean primitiveBoolean=boolWrapper.booleanValue();
	String boolString=boolWrapper.toString();
	System.out.println("Wrapper="+boolWrapper);
	System.out.println("primitive boolean="+primitiveBoolean);
	System.out.println("String="+boolString);
}

}
