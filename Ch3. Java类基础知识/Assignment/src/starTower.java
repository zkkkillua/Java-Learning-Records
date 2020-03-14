public class starTower {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);	//String -> int
		
		for (int i = 1; i <= n; i++) {
			int spaceNum;	//number of spaces at one side
			if (i < n / 2 + 1)
				spaceNum = (n - 2 * i + 1) / 2;
			else
				spaceNum = (2 * i - n - 1) / 2;
			
			for (int j = 0; j < spaceNum; j++)
				System.out.print(" ");	//left spaces
			for (int j = 0; j < n - 2 * spaceNum; j++)
				System.out.print("*");	//stars
			for (int j = 0; j < spaceNum; j++)
				System.out.print(" ");	//right spaces
			System.out.println();
		}
	}
}
