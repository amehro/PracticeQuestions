package misc;

public class shortestDistance {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int index =0;
        int res = Integer.MAX_VALUE;
        HashMap<String,ArrayList<Integer>> hm = new HashMap<String,ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String word: words) {
            if(!(hm.containsKey(word))) {
                list.add(index);
                hm.put(word,list);
                
            } else {
                 ArrayList<Integer> l1 = hm.get(word);
                 l1.add(index);
                hm.put(word, l1);
            }
            index++;
        }
         ArrayList<Integer> l1;
         ArrayList<Integer> l2;
          
        if (word1.compareTo(word2) == 0) {
           l1 = hm.get(word1);
            l2 = l1; 
        } else {
            l1 = hm.get(word1);
             l2 = hm.get(word2);
        }
        
        for (int i =0; i< l1.size(); i++) {
             for (int j =0; j< l2.size(); j++){
                 res = Math.min(res, Math.abs(i-j));
             }
        }
        
       return res; 
    }
}