package misc;

public class reverseSentence {
    public static void main(String[] args) {
    	String str = "sony loves navya";
    	int l = str.length();
    	char[] chArr = str.toCharArray();
    	for (int i=0; i< chArr.length; i++) {
    		char ch = chArr[i];
    		chArr[i] = chArr[chArr.length - 1];
    		chArr[chArr.length - 1] = ch;
    	}
    	
    	String newStr = new String(chArr);
    	int endIndex = 0;
    	int beginIndex = 0;
    	StringBuffer sb = new StringBuffer();
    	for(int j = 0; j < newStr.length();j++) {
    		if (str.charAt(j) == ' ') {    			
    			sb.append(newStr.substring(beginIndex , endIndex+1)).reverse();
    			beginIndex = endIndex + 2;
    			sb.append(" ");
    		} else {
    			endIndex++;
    		}
    		
    		
    	}
    }
}
