package exercises;

public class Max {

	static int max(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else if (z > x && z > y)
			return z;
		else return x;	// Entered numbers are not distinct 
	}

}
