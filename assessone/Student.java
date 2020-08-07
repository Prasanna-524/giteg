package assessone;
import java.util.*;

import equalhashh.Item;

public class Student {
	    private int age;
		private String rollno;
		Student(int age,String rollno)
		{
			this.age=age;
			this.rollno=rollno;
		}
	    int getAge(){
		return age;
		}
		void setAge(int age){
		age=age;
		}
		String getRollno(){
		return rollno;
		}
		void setRollno(String rollArg){
		rollno=rollArg;
		}
		public boolean equals(Object arg) {
			if(this==arg) {
				return true;
			}
			
		   if(arg==null || !(arg instanceof Student) ) {
				return false;
		   }
			
		    Student that=(Student)arg;	
			boolean isequal=this.rollno==that.rollno;
			return isequal;
		}
}
	

