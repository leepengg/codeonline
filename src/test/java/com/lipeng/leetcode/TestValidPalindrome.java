package com.lipeng.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestValidPalindrome {
	private ValidPalindrome s;
	@Before
	public void setUp() throws Exception {
		s = new ValidPalindrome();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPalindrome() {
		assertEquals(true, s.isPalindrome("  A man, a plan, a canal: Panama"));
		assertEquals(false, s.isPalindrome("race a car"));
		assertEquals(true, s.isPalindrome("a."));
		assertEquals(true, s.isPalindrome(".,"));
	}

}
