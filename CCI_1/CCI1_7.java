package fly;

public class effort {

	public static void Rotate_90_degrees(int[][] image) {

		int do_in_row = image.length - 1;
		int next_element = 0, this_element = 0, count_do = 0;
		int row = 0, column = 0, tmp_row = 0, next_row = 0, next_column = 0;

		while (do_in_row > 0) {
			while (count_do != do_in_row) {
				this_element = image[row][column];
				for (int i = 0; i < 4; i++) {
					next_element = image[image.length - 1 - column][row];
					image[image.length - 1 - column][row] = this_element;
					tmp_row = row;
					row = image.length - 1 - column;
					column = tmp_row;
					this_element = next_element;
				}
				column++;
				count_do++;
			}
			next_row++;
			next_column++;
			row = next_row;
			column = next_column;
			count_do = 0;
			do_in_row -= 2;

		}
	}
	// ASCII 33 ~ 126

	public static void main(String[] args) {
		int[][] test = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, 
			{ 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
		// { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		// {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},
		// {19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
			
		Rotate_90_degrees(test);
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test.length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
