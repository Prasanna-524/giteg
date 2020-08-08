package assignmenttrainee;

public class CTrainee extends Trainee {
	int languages;
	public CTrainee(int id, String name,int languages) {
		super(id, name);
		this.languages=languages;
	}

	public int getLanguages(){
		return languages;
		}
		public void setLanguages(int languages){
			languages=languages;
		}	

}
