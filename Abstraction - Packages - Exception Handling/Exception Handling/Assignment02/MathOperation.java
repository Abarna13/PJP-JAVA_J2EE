public class MathOperation {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException  {
		// TODO Auto-generated method stub
		if(args.length == 5) {
			int[] array = new int[args.length];
			int sum = 0;
			double avg = 0;
			try {
				for (int i = 0; i < args.length; i++)
					array[i] = Integer.parseInt(args[i]);
				for (int i = 0; i < array.length; i++)
					sum += array[i];
				avg = sum / array.length;
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("sum: " + sum);
			System.out.println("avg: " + avg);
		}
		else {
			System.out.println("Enter 5 integers in command line");
		}
	}

}
