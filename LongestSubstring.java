package Hard_Questions;

import java.util.HashSet;

public class LongestSubstring {
    

    public static void main(String[] args) {
        

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for(int right = 0; right < str.length(); right++) {

            while(set.contains(str.charAt(right))) {

                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(set.size() > max) {

                max = set.size();
            }
        }

        System.out.println(max);
    }
}
