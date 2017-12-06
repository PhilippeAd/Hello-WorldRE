package exercises;

import java.util.ArrayList;

public class ArrayListExample {
	
	double average (ArrayList<Double> aList) {
		double sum = 0;
		for (Double item: aList) {
			sum += item;
		}
		return sum / aList.size();
	}

}
