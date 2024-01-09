// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:

// Input: s = "rat", t = "car"
// Output: false

// Constraints:

//     1 <= s.length, t.length <= 5 * 104
//     s and t consist of lowercase English letters.

// Follow up: What if the inputs contain Unicode characters?
// How would you adapt your solution to such a case?

import java.util.HashMap;

public class validAnagram {
    public static void main (String args[]){
        String s1 = "anagram";
        String t1 = "nagaram";
        //String s2 = "rat";
        //String t2 = "car";
        //String s3 = "";
        //String t3 = "";

        boolean output1 = validAnagram.isAnagram(s1, t1);
        //boolean output2 = validAnagram.isAnagram(s2, t2);
        //boolean output3 = validAnagram.isAnagram(s3, t3);

        System.out.println("s1/t1: " + output1);
        //System.out.println("s2/t2: " + output2);
        //System.out.println("s3/t3: " + output3);

    }

    // The strategy here is to map the frequency of characters in both s and t, and then compare
    public static boolean isAnagram(String s, String t){

        // initialize hashmaps
        HashMap<Character, Integer> freqS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> freqT = new HashMap<Character, Integer>();

        // handle null or 0 case
        if(s.isEmpty() || t.isEmpty()){
            System.out.println("input(s) are empty");
            return true;
        }

        // default case
        // populate hashmaps with String s,t; i.e., k = char, v = frequency 
        for (int i = 0; i < s.length(); i++){
            Character chS = s.charAt(i);
            // set value equal to frequency + 1 (assuming that 0 is default)
            freqS.put(chS, freqS.getOrDefault(chS, 0) + 1);
            System.out.println(freqS.toString());
        }

        for (int i = 0; i < t.length(); i++){
            Character chT = t.charAt(i);
            // set value equal to frequency + 1 (assuming that 0 is default)
            freqT.put(chT, freqT.getOrDefault(chT, 0) + 1);
            System.out.println(freqT.toString());
        }
        return freqS.equals(freqT);
    }
}
