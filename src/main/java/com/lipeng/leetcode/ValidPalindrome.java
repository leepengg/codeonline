package com.lipeng.leetcode;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			Character first = s.charAt(i);
			Character last = s.charAt(j);

			while (!first.isLetterOrDigit(first) && i < j) {
				i++;
				first = s.charAt(i);
			}
			first = first.toLowerCase(first);
			while (!last.isLetterOrDigit(last) && j > i) {
				j--;
				last = s.charAt(j);
			}
			last = last.toLowerCase(last);
			if (first.charValue() != last.charValue()) {
				return false;
			}

			// first = s.charAt(++i);
			// last = s.charAt(--j);
			++i;
			--j;
		}

		return true;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidPalindrome s = new ValidPalindrome();

		System.out.println(s.isPalindrome("  A man, a plan, a canal: Panama"));
		System.out.println(s.isPalindrome("race a car"));
		System.out.println(s.isPalindrome("a."));
		System.out.println(s.isPalindrome(".,"));
	}

}
