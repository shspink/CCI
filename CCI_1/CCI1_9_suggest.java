//package All kind of Java;

public class CCI1_9_suggest {
	public static boolean Find_String_rotate(String s1, String s2) {
		int s2_index = 0, j = 0, i = 0;

		// =========== Check s1 , s2 length ===========//
		if (s1.length() == s2.length() && s1.length() > 0) {

			// =========== Search and Find s2's first char index IN s1 ===========//
			// =========== Check s1 first char IN s2's Searched index ===========//
			for (i = 0; i < s1.length(); i++) {
				if (s2.charAt(0) == s1.charAt(i) && s2.charAt(s2.length() - i) == s1.charAt(0)) {

					// =========== Compare All s1's with s2's ===========//
					for (j = 0; j < s1.length(); j++) {
						s2_index = s2.length() - i + j;
						if (s2_index >= s2.length())
							s2_index -= s2.length();

						if (s2.charAt(s2_index) == s1.charAt(j))
							continue;
						else
							break;

					}

					if (j == s1.length())
						return true;
					else
						continue;
				}
			}
		}
		return false;

	}

}
