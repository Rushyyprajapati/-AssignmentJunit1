package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingTest {

    @Test
    void testExampleInputs() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("a"));
    }

    @Test
    void testAllUniqueCharacters() {
        assertEquals(6, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcdef"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("aaaaaa"));
    }

    @Test
    void testMixedCaseCharacters() {
        assertEquals(6, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("AaBbCc"));
    }

    @Test
    void testStringWithSpaces() {
        assertEquals(5, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abc abc"));
    }


    @Test
    void testRepeatingPattern() {
        assertEquals(4, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcaabcdba"));
    }
}
