package inheritance;

public class ElectronicsStudentt extends Student{

		String gadgetAlloted;
		
		ElectronicsStudentt(String name,int age, boolean placed, String gadget)
		{
			super(name,age,placed);
			this.gadgetAlloted=gadget;
		}

		public String getGadgetAlloted() {
			return gadgetAlloted;
		}

		public void setGadgetAlloted(String gadgetAlloted) {
			this.gadgetAlloted = gadgetAlloted;
		}
		
		
		
	}



