package misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// csv to xml
// https://discuss.leetcode.com/topic/52519/xml-tree-presentation/2
//[
// "open,story",
// "open,id",
// "inner,1234",
// "close,id",
// "open,snaps",
// "open,snap",
// "close,snap",
// "open,snap",
// "close,snap",
// "open,snap",
// "close,snap",
// "open,snap",
// "close,snap",
// "close,snaps",
// "close,story"
//]

//<Story>
//<id>1234</id>
//<Snaps>
//    <Snap></Snap>
//    <Snap></Snap>
//    <Snap></Snap>
//    <Snap></Snap>
//</Snaps>
//<Story>


public class XMLIterator {	
	
	public static void main(String[] args) {
		ArrayList<String[]> list = new ArrayList<String[]>();
		
		String[] str ={"open,story",
						  "open,id",
						  "inner,1234",
						  "close,id",						  
						  "close,story"};
		
		
		
		//printTree(constructXML(str));
		
	}
}
