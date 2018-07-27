package practice;

public class effort {

	static String count_char_overlap(String text) {
		String ret = text;
		char main_char = ret.charAt(0);
		int i = 1;
		int count = 1;
		int start_index = 0;
		while (i != ret.length()) {

			if (main_char == ret.charAt(i)) {
				i++;
				count++;
			}

			else {
				ret = ret.substring(0, start_index + 1) + count + ret.substring(i);
				start_index += 2 + (int) Math.log10(count);
				i = start_index;
				main_char = ret.charAt(i);
				count = 0;
			}

		}
		ret = ret.substring(0, start_index + 1) + count;

		if (ret.length() > text.length())
			return text;
		else
			return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test_T = "tteesssst";
		System.out.println(count_char_overlap(test_T));

	}
}
