package inheritance;
public class Account {
	private String name;
	private int doorno;
	private String hometown;
	private String state;
	Account (String name, int doorno,String hometown,String state)
	{
		this.name=name;
		this.doorno=doorno;
		this.hometown=hometown;
		this.state=state;
	}
	public String getName(){
	return name;
	}
	public void setName(String nameArg){
	name=nameArg;
	}
	int getdoorNo(){
		return doorno;
		}
		void setdoorNo(int doorArg){
		doorno=doorArg;
		}
		String getHometown(){
			return hometown;
			}
			void setHometown(String hometownArg){
			hometown=hometownArg;
			}
			String getState(){
				return state;
				}
				void setState(String stateArg){
				state=stateArg;
				}
				public boolean equals(Object obj)
				{
					if(this==obj) {
						return true;
					}
					if(obj==null || !(obj instanceof Account))
					{
						return false;
					}
					Account that=(Account)obj;
					boolean isequal=this.doorno==that.doorno;
					return isequal;
				}
	}
