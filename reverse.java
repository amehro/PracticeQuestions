package misc;

import java.util.HashSet;

public class reverse {
	@SuppressWarnings("unchecked")
	private HashSet<String> map = new HashSet<String>();
		
	
	  public String reverseWords(String message) {
		  map.add(">");
			map.add("&");
			map.add("<");

		    char[] messageChars = message.toCharArray();
		    

		    // first we reverse all the characters in the entire messageChars array
		    reverseCharacters(messageChars, 0, messageChars.length - 1);
		    System.out.println("***************");
		    System.out.println(messageChars);
		    System.out.println("###########################");
		    //System.out.println(messageChars);
		    // this gives us the right word order
		    // but with each word backwards

		    // now we'll make the words forward again
		    // by reversing each word's characters

		    // we hold the index of the *start* of the current word
		    // as we look for the *end* of the current word
		    int currentWordStartIndex = 0;
		    for (int i = 0; i <= messageChars.length; i++) {

		        // found the end of the current word!
		        if (i == messageChars.length || messageChars[i] == ' ') {

		            // if we haven't exhausted the string our
		            // next word's start is one character ahead
		            reverseCharacters(messageChars, currentWordStartIndex, i - 1);
		            currentWordStartIndex = i + 1;
		        }
		    }

		    return new String(messageChars);
		}

		public void reverseCharacters(char[] message, int startIndex, int endIndex) {

		    // walk towards the middle, from both sides
		    while (startIndex < endIndex) {
                
		    	while (startIndex < endIndex) {
		    		if (map.contains(String.valueOf(message[startIndex])))
		    		startIndex++;
		    		else break;
		    	}
		    	
		    	while (startIndex < endIndex) {
		    		if (map.contains(String.valueOf(message[endIndex])))
		    		endIndex--; else break;
		    	}
		    	
		        // swap the front char and back char
		        char temp = message[startIndex];
		        message[startIndex] = message[endIndex];
		        message[endIndex] = temp;
		        startIndex++;
		        endIndex--;
		        
		    }
		   
		}
		
		public static void main(String[] args) {
			reverse ob = new reverse();
			System.out.println(ob.reverseWords("i ♥ † u"));
		}
}
