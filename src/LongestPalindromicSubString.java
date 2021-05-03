
public class LongestPalindromicSubString {
	public static void main(String[] args) {
		String r = longestPalindrome("cbbd");
		System.out.println("String is> "+ r);
	}

	public static String longestPalindrome(String s) {

		int max = 0;
		int st = 0;
		int en = 0;
		int length = s.length();
		if (length == 1)
			return s;
		if (length == 2) {
			if (s.charAt(0) == s.charAt(1))
				return s;
			// return any
			else
				return s.charAt(0) + "";
		}

		int[][] dp = new int[length][length];

		for (int i = 0; i < length; i++) {
			dp[i][i] = 1;

		}

		for (int i = 1; i < length; i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				dp[i - 1][i] = 1;
				max = 2;
				st = i-1;
				en = i;
			} else {
				dp[i - 1][i] = 0;
			}
		}

		for (int k = 2; k <= length; k++) {
			for (int i = 0; i < length-k+1; i++) {
				int j = i+k-1;
				if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
					dp[i][j] = 1;
					if (k > max) {
						System.out.println("Inside this");
						max = k;
						st = i;
						en = j;
					}

				} else {
					dp[i][j] = 0;
				}
			}
		}

		System.out.println("max> " + max);
		if (max > 0) {
			return s.substring(st, en + 1);
		}
		return "";
	}
}
