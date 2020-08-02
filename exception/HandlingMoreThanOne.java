package exception;

public class HandlingMoreThanOne {
	/**public static void main(String args[])
	{
		HandlingMoreThanOne demo=new HandlingMoreThanOne ();
		int number[]= {1,2,3};
		try {
			int ele=number[4];
			int result=ele/0;
		}
		catch(Exception e)
		{
			System.out.println("exception");
			e.printStackTrace();
		}
}
}*/
public static void main(String[]args){
    HandlingMoreThanOne demo=new HandlingMoreThanOne();
    demo.display(1);

}

public void display(int index){
    //opened a file
	try {
        Product store[] = new Product[10];
        store[0] = new Product("p1", "galaxy");
        store[1] = new Product("p2", "nokia");
        Product fetched=store[index];
        String id=fetched.getId();
        String name=fetched.getName();
        System.out.println(id+" "+name);
       
    }

    catch(ArrayIndexOutOfBoundsException exception){
        System.out.println("index your provided is out of range, index="+index);   

    }
    catch(NullPointerException exception){
        System.out.println("element does not exist in the store at index="+index);
    }

    catch (Exception e){
        System.out.println("some problem occurred");
    }
    //
   // finally is always executed and is mstly used at places to 
   // close resources like file handles or socket
    finally {
    //closing or releasing resource here because this always be executed
    System.out.println("i will always get executed");	
    } }
    
}