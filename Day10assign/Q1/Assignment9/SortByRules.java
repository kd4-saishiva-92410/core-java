package Assignment9;

import Assignment9.*;
import java.util.Comparator;

   public  class SortByRules{

		public static class SortByRollNo implements Comparator<Student>{
	      @Override
			public int compare(Student o1, Student o2) {
				return o1.getRollNo()-o2.getRollNo();
			}
			  
		  }
		
		public static class SortByName implements Comparator<Student>{
		      @Override
				public int compare(Student o1, Student o2) {
					return o1.getName().compareToIgnoreCase(o2.getName());
				}
				  
			  }
		public static class SortByMarks implements Comparator<Student>{
		      @Override
				public int compare(Student o1, Student o2) {
					return (int)(o1.getMarks()-o2.getMarks());
				}
				  
			  }
		
		
   }

