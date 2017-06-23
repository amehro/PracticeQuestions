package misc;

public class isNumber {
    public boolean isNumber1(String s) {
        boolean flag=true;
       String st = s.trim();
       if (st.length() == 0) {
           return false;
       }
       for (int i=0;i<st.length();i++) {
          if(st.charAt(i) == 'e') {
             if (i+1 < st.length() && !(st.charAt(i+1) >=48 && st.charAt(i+1) <=57)) {
               flag = false;
             }
           } else if(st.charAt(i) == '.') {
               System.out.println(st.charAt(i));
               if (!(st.charAt(i+1) >=48 && st.charAt(i+1) <=57)) {
                   System.out.println(st.charAt(i+1));
                flag = false;
               }
           } else if (!(st.charAt(i) >=48 && st.charAt(i) <=57)) {
               flag =  false;
           } 
       }
       
       return flag; 
    }
    
    public static void main(String[] args) {
    	isNumber ob = new isNumber();
    	System.out.println(ob.isNumber1("e"));
    }
    
}
