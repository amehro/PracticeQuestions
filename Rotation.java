package misc;
public class Rotation {
	

public int Rotate(String[] words) {
    final String firstWord = words[0];

    int floorIndex = 0;
    int ceilingIndex = words.length - 1;

    while (floorIndex < ceilingIndex) {

        // guess a point halfway between floor and ceiling
        int guessIndex = (floorIndex + ceilingIndex ) /2;
       //System.out.println(guessIndex);

        // if guess comes after first word or is the first word
        if (words[guessIndex].compareTo(firstWord) >= 0) {
            // go right
            floorIndex = guessIndex;
        } else {
            // go left
            ceilingIndex = guessIndex;
        }

        // if floor and ceiling have converged
        if (floorIndex + 1 == ceilingIndex) {

            // between floor and ceiling is where we flipped to the beginning
            // so ceiling is alphabetically first
            break;
        }
    
    } return ceilingIndex; }
    
    
    public static void main(String[] args) {
    	String[] arr = {"abvnt","xcwop","fhxvt", "anc", "bcd","efg"};
    	Rotation x = new Rotation();
    	System.out.println(x.Rotate(arr));
    }
  }
