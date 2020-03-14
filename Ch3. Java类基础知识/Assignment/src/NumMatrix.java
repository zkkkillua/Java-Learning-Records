public class NumMatrix {
	public static void main(String[] args) {
		int num = 1;
		int size = Integer.parseInt(args[0]);	//String->int
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(num++ + " ");
			System.out.println();
		}
	}
}