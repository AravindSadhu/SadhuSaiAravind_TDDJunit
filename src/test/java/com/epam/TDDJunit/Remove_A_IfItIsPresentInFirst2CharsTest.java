package com.epam.TDDJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Remove_A_IfItIsPresentInFirst2CharsTest {
	
	/* TODO list for my feature
	 * 1. 1 A at first char : ABCD => BCD
	 * 2. 2 A char : AACD => CD
	 * 3. 1 A at second char : BACD => BCD
	 * 4. n A chars : BBAA => BBAA
	 * 5. empty char : "" => ""
	 * 6. 2 A char : AABAA => BAA
	 * 7. A char : A => ""
	 */
	
	@Test
	void test() {
		assertEquals("BCD",Remove_A_IfItIsPresentInFirst2Chars.del("ABCD"));
	}
	@Test
	void test1() {
		assertEquals("CD",Remove_A_IfItIsPresentInFirst2Chars.del("AACD"));
	}
	@Test
	void test2() {
		assertEquals("BCD",Remove_A_IfItIsPresentInFirst2Chars.del("BACD"));
	}
	@Test
	void test3() {
		assertEquals("BBAA",Remove_A_IfItIsPresentInFirst2Chars.del("BBAA"));
	}
	@Test
	void test4() {
		assertEquals("",Remove_A_IfItIsPresentInFirst2Chars.del(""));
	}
	@Test
	void test5() {
		assertEquals("BAA",Remove_A_IfItIsPresentInFirst2Chars.del("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",Remove_A_IfItIsPresentInFirst2Chars.del("A"));
	}

}
