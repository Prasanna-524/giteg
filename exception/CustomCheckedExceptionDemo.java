package exception;

public class CustomCheckedExceptionDemo {
	CustomCheckedExceptionDemo demo = new CustomCheckedExceptionDemo();
	Product product = null;
	try {
		demo.display(product);
	}		catch(InvalidArgumentCheckedException e) {
		System.out.println("invalid argument, product is null");
	}
	System.out.println("bye bye");

}

public void display(Product product) throws InvalidArgumentCheckedException{
	if (product == null) {
		InvalidArgumentCheckedException exception = new InvalidArgumentCheckedException("invalid argument");
		throw exception;			
	}
	String id = product.getId();
	String name = product.getName();
	System.out.println("product =" + id + " " + name);

}

}


}
