package misc;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class AirbnbIterator implements Iterator {
    private ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
    private int end = 0, cursor = 0;
    private boolean canRemove = false;
    private int modCount =0;
    private int expectedModCount = 0;
	

//    public AirbnbIterator(int[][] array) {
//        copyArray(array);
//        this.end = list.size();
//    }

//    private void copyArray(int[][] array) {
//        for (int[] data : array) {
//            for (int val : data) {
//                list.add(val);
//            }
//        }
//        System.out.println(list);
//    }
    
    public AirbnbIterator(ArrayList<List<Integer>> all) {
    	this.list = all;
    	this.end = all.size();
    }

    @Override
    public boolean hasNext() {
        if (cursor < end) {
            return true;
        }

        return false;
    }

    @Override
    public List<Integer> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        List<Integer> result =  list.get(cursor);
        cursor++;

        //canRemove = true;
        return result;
    }

    @Override
    public void remove() {
        if (cursor - 1 < 0) {
            throw new IllegalStateException();
        }

        if(canRemove) {
            canRemove = false;
            list.remove(cursor - 1);
            --end;
        } else {
             throw new UnsupportedOperationException();
       }
    }

    public void reset(){
        this.cursor = 0;
        this.canRemove = false;
    }
    
    final void checkForComodification() {
    
	if (modCount != expectedModCount)
    throw new ConcurrentModificationException();
    }
    
    public static void main(String[] args) {
    	ArrayList<List<Integer>> al = new ArrayList<List<Integer>>();
    	List<Integer> l1 = new ArrayList<Integer>();
    	List<Integer> l2 = new ArrayList<Integer>();
    	List<Integer> l3 = new ArrayList<Integer>();
    	l1.add(1);
    	l1.add(2);
    	l1.add(3);
    	l2.add(5);
    	l2.add(6);
    	l2.add(7);
    	l3.add(8);
    	l3.add(9);
    	al.add(l1);
    	al.add(l2);
    	al.add(l3);
    	
        //int input[][] = { {}, { 1, 2, 3 }, { 4, 5 }, {}, {}, { 6 }, { 7, 8 }, {}, { 9 }, { 10 }, {} };

        AirbnbIterator itr = new AirbnbIterator(al);
 
        while(itr.hasNext()) {
        	List<Integer> listA = itr.next();
            if( listA.size() == l3.size() && listA.containsAll(l3)) {
                itr.remove();
                System.out.println("ghhf");
            }
        }

        itr.reset();
        while(itr.hasNext()) {
        	
            System.out.println(itr.next());
        }
    }
}

