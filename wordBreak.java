package misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class wordBreak {
	private static HashSet<String> dict = new HashSet<String>();
	
	
	public static boolean breakWord(String s, int[][] word) {
		
		int len;
		
		
		for (int l =1; l <= s.length(); l++) {
			for (int i=0; i< s.length() - l + 1; i++) {
				int j = i + l -1;
				String str = s.substring(i, j + 1);
				if(dict.contains(str)){
                    word[i][j] = i;
                    continue;
                } else {
                	for (int k = i+1 ; k <=j ; k++) {
                		if (word[i][k-1] != -1 && word[k][j] !=-1 ) {
                			word[i][j]= k;
                		}
                	}
                }
				
			}
		}
		
		
		for (int i = 0 ; i< s.length() ; i++) {
			for (int j =0; j < s.length() ; j++) {
				System.out.print(word[i][j]);
			}
			System.out.println("");
		}
		
		//create space separate word from string is possible
        StringBuffer buffer = new StringBuffer();
        int i = 0; int j = s.length() -1;
        while(i < j){
            int k = word[i][j];
            if(i == k){
                buffer.append(s.substring(i, j+1));
                break;
            }
            buffer.append(s.substring(i,k) + " ");
            i = k;
        }
        
        System.out.println(buffer.toString());
		return word[0][s.length() -1] > -1;		
		
	}

	
	
	
	public static void main(String[] args) {
		String s = "ilike";
		dict.add("i");
		dict.add("like");
		dict.add("icecream");
		int len = s.length() ;
		int[][] word = new int[len][len];
		for (int i = 0 ; i< len ; i++) {
			for (int j =0; j < len ; j++) {
				word[i][j] = -1;
			}
		}
		
		boolean y = breakWord(s, word);
		System.out.println(y);
	}
}
