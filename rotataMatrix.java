package misc;
// Rotation of matrix clockwise
public class rotataMatrix {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int totNumOfLevels = column / 2;
        if (row!=column) {
            return;
        }
        int level = 0;
        int last = column -1;
        while (level < totNumOfLevels) {
            for (int i=level; i < last; i++) {
            	// clockwise rotation
//  clockwise          	swap(matrix,level,i ,i,last );
//   clockwise         	swap(matrix,level,i,last,last-i+level);
//  clockwise          	swap(matrix,level,i,last-i+level,level);
            	swap(matrix,i,level,last,i);
            	swap(matrix,i,level,last-i+level, last);
            	swap(matrix,i,level,level,last-i+level);
            }
                
            
            level++;
            last--;
           
        }
        
        
        
    }
    
    public void swap(int[][] array, int i1, int j1, int i2, int j2) {
        int tempObject = array[i1][j1];
        array[i1][j1] = array[i2][j2];
        array[i2][j2] = tempObject;
    }
    
    public static void main(String[] args) {
    	rotataMatrix ob = new rotataMatrix();
    	int[][] matrix = new int[3][3];
    			matrix[0][0] = 1;
    			matrix[0][1]= 2;
    			matrix[0][2]= 3;
    			matrix[1][0]= 4;
    			matrix[1][1]= 5;
    			matrix[1][2]= 6;
    			matrix[2][0]= 7;
    			matrix[2][1]= 8;
    			matrix[2][2]= 9;
    			int ik=0;
    			int n=5;
    			for(ik=0;ik<n/2;ik++) {
    				
    				System.out.println(ik);
    				
    			}
    			 ik=0;
    			 n=5;
    			while(ik<n/2) {
    				System.out.println(ik);
    				ik++;
    			}
    	//ob.rotate(matrix);
    	
    	for (int i =0; i< 3; i++) {
    		for (int j=0; j<3; j++) {
    			//System.out.print(matrix[i][j]);
    			//System.out.print("    ");
    		}
    		//System.out.println();
    	}
    }
  }

