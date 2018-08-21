package practice;

public class CCI1_8 {

	static void push_zero_element_row_column(int[][] arr) {

		int[] zero_row = new int[arr.length / 65 + 1];
		int[] zero_column = new int[arr[0].length / 65 + 1];

		int row = 0, column = 0, convert_row = 0, convert_column;

		// ===================== find '0' element & setting bit ===================== // Search Count : row x column
		for (row = 0; row < arr.length; row++) {

			for (column = 0; column < arr[0].length; column++) {

				if (arr[row][column] == 0) {

					convert_row = row / 65;
					convert_column = column / 65;

					zero_row[convert_row] = zero_row[convert_row] | (1 << (row % 65 - 1));
					zero_column[convert_column] = zero_column[convert_column] | (1 << (column % 65 - 1));

				}

			}

		}

		// ===================== Change elements ===================== // Search Count : row + column
		for (row = 0; row < arr.length; row++) {

			if ((zero_row[row / 65] & 1 << (row % 65 - 1)) == 1) {
				for (column = 0; column < arr[0].length; column++) {
					arr[row][column] = 0;
				}
			}

		}

		for (column = 0; column < arr[0].length; column++) {
			if ((zero_column[column / 65] & 1 << (column % 65 - 1)) == 1) {
				for (row = 0; row < arr.length; row++) {
					arr[row][column] = 0;
				}
			}
		}
	}

}
