package com.ArteriaCompany;


	import java.util.*;
	//import static org.junit.Assert.assertEquals;

import org.junit.Test;

	public class Array {

	    public static int beauty(int n, int m, String s, int[] X, int[] Y) {
	        Map<Character, Integer> countMap = new HashMap<>();
	        int maxBeauty = 0;
	        
	        for (char c : s.toCharArray()) {
	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	            maxBeauty = Math.max(maxBeauty, countMap.get(c));
	        }
	        
	        if (maxBeauty >= 1000000) {
	            return -1;
	        }
	        
	        return maxBeauty;
	    }
	    
	    public static void main(String[] args) {
	        // Example usage
	        int n = 5;
	        int m = 4;
	        String s = "abaca";
	        int[] X = {1, 1, 3, 4};
	        int[] Y = {2, 3, 4, 5};
	        System.out.println(beauty(n, m, s, X, Y)); // Output: 3
	    }
	}
		

		

		   // @Test
//		    public void testBeautyPath1() {
//		        int n = 5;
//		        int m = 4;
//		        String s = "abaca";
//		        int[] X = {1, 1, 3, 4};
//		        int[] Y = {2, 3, 4, 5};
//		        assertEquals(3, BeautyPath.beauty(n, m, s, X, Y));
//		    }
//		    
//		    @Test
//		    public void testBeautyPath2() {
//		        int n = 6;
//		        int m = 6;
//		        String s = "xzyabc";
//		        int[] X = {1, 3, 2, 5, 4, 6};
//		        int[] Y = {2, 1, 3, 4, 3, 4};
//		        assertEquals(-1, BeautyPath.beauty(n, m, s, X, Y));
//		    }
//		}
//
