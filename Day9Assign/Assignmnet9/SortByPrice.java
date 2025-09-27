package Assignmnet9;
import Assignmnet9.*;
import java.util.*;

public class SortByPrice implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			int diff = (int)Double.compare(o1.getPrice(), o2.getPrice());
			return diff;
		}
		
	}

