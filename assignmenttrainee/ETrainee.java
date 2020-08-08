package assignmenttrainee;

public class ETrainee extends Trainee {
	String deviceused;
	public ETrainee(int id, String name,String deviceused) {
		super(id, name);
		this.deviceused=deviceused;
	}

	public String getdeviceUsed(){
		return deviceused;
		}
		public void setdeviceUsed(String devicesused){
		deviceused=deviceused;
		}	


}
