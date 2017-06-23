package misc;

import java.util.*;
import java.util.Collections;
import java.util.Comparator; 


class Checker implements Comparator<String>
{
   public int compare(String str1, String str2)
   {
       if (str1.length() < str2.length()) return -1;
       else                               return 1;
   }
}


class comparator1
{  
  public static void main(String args[])
   {  
     PriorityQueue<String> queue=new PriorityQueue<String>(5, new Checker());  
     queue.add("india");  
     queue.add("bangladesh");  
     queue.add("pakistan");  

     while (queue.size() != 0)
     {
        System.out.printf("%s\n",queue.remove());
     }
  }  
}  
