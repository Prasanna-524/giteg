package inheritance;



	public class Course {

		private int id;
		
		private String name;
		
		public Course(int id, String name) {
			this.id=id;
			this.name=name;
			//this.course=course;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		/*public String getCourse() {
			return course;
		}

		public void setCourse(String coursearg) {
			this.course=course;
		}
		*/
		
	
}
