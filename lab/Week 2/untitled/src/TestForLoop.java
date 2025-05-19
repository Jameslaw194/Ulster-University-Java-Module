/**
 * @(#)TestForLoop.java
 *
 *
 * @author COM102
 * @version 1.00 2018/10/29
 */


public class TestForLoop {
	public static void main(String[] args) {
		String[] studentName = {"John","Mary", "Stephen","James", "Amy", "Fiona"};
		int[] studentMarks = {90,56,70,66,81,96};
		int highestMark = -1;
		String highestMarkStudent = "";

		for(int i = studentName.length - 1; i >= 0; i--){
			System.out.println("Student = " + studentName[i] + ", his/her mark = " + studentMarks[i]);

			if(studentMarks[i] > highestMark) {
				highestMark = studentMarks[i];
				highestMarkStudent = studentName[i];
			}
		}
		System.out.println("\nThe student with the highest marks is " + highestMarkStudent + " with marks " + highestMark);
	}
}

