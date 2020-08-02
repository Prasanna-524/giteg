package inheritance;
	public class Customerr {
		String id;
		String name;
		private Accountt accountt;
		Customerr(String id,String name)
		{
			this.id=id;
			this.name=name;
		}
		public String getId() {
			return id;
		}
		void setId(String idArg )
		{
			this.id=idArg;
		}
		public String getName()
		{
			return name;
		}
		public Accountt getBalance(){
			return accountt;
		}
		public void setBalance(Accountt balance)
		{
			this.accountt=accountt;
		}
		void setName(String name)
		{
			this.name=name;
		}public Accountt getPancard()
		{
			return accountt;
		}
		public void setPancard(Accountt pancard)
		{
			this.accountt=accountt;
		}

}
