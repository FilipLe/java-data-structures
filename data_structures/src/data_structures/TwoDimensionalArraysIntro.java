package data_structures;

public class TwoDimensionalArraysIntro {

	public static void main(String[] args) {
		//4 = number of rows
		//6 = number of column
		int[][] grid = new int[4][6];
		int start = 1;
		
		/*
		 * Task 1
		 * 
		 * 123456
		 * 234567
	     * 345678
		 * 456789
		 * 
		 */
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {				
				grid[i][j] = (start + i) + j;
			}
		}
		
		for(int i = 0; i<4; i++)
		{
		    for(int j = 0; j<6; j++)
		    {
		        System.out.print(grid[i][j]);
		    }
		    System.out.println();
		}

		
		//Question a)
		System.out.println(grid[3][5]);
		/*
		 * Outputs 9
		 */
		
		//Question b)
		System.out.println(grid[5][3]);
		/*
		 * Error because it is outside the dimensions of the array
		 */
		
		//Question c)
		System.out.println(grid.length);
		/*
		 * Outputs 4 --> number of rows
		 */
		
		//Question d)
		System.out.println(grid[1].length);
		/*
		 * Outputs 6 --> number of elements in the 1st row (2nd row because here index starts with 0)
		 */
	}

}
