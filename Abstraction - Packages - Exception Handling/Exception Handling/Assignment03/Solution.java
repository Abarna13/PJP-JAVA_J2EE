import java.util.Scanner;

class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		System.out.println("NegativeValuesException occured");
	}
}

class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		System.out.println("ValuesOutOfRangeException occured");
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = null;
			int subA = 0;
			int subB = 0;
			int subC = 0;
			try {
				name = scan.nextLine();
				if (scan.hasNextInt())
					subA = scan.nextInt();
				else
					throw new NumberFormatException();
				if (scan.hasNextInt())
					subB = scan.nextInt();
				else
					throw new NumberFormatException();
				if (scan.hasNextInt())
					subC = scan.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeValuesException();
				if (subA > 100) throw new ValuesOutOfRangeException();
				
				if (subB < 0) throw new NegativeValuesException();
				if (subB > 100) throw new ValuesOutOfRangeException();
				
				if (subC < 0) throw new NegativeValuesException();
				if (subC > 100) throw new ValuesOutOfRangeException();		
            } 
            catch (ArithmeticException e) {
				System.out.println(e.getMessage());
            } 
            catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
            } 
            catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
	}

}
