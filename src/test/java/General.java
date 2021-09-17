import java.util.ArrayList;

import org.testng.Assert;

/**
 * 
 */

/**
 * @author kallesha g m
 *
 */
public class General {

	public static void main(String[] args) {
		int[] var = {1, 2, 3, 4, 5, 6};
		ArrayList a2;
		ArrayList a1 = new ArrayList();
		/*for(int i = 0; i<= ((CharSequence) a1).length(); i++) {
		if(a1[i] >= 48 && a[i] <= 57)
		}*/
		/*
		 * a1.add(1); a1.add(2); a1.add(3); a1.add(4); a1.add(5); a1.add(6); a1.add(7);
		 * a1.add(8); a1.add(9);
		 * 
		 * System.out.println(a1); for(int i =0; i<= var.length-1; i++) {
		 * System.out.print(var[i]); }
		 */
		
		Assert.assertEquals(a1, var);
		}
}
