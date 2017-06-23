package misc;

import java.awt.Point;
import java.util.ArrayList;

public class robot {
   
	public static boolean getMaze(ArrayList<Point> list, boolean arr[][], int row, int col) {
		if (col < 0 || row < 0 || !arr[row][col]) {
			return false;
		}
		
//		if (col == 0 && row == 0) {
//			return true;
//		}
		
		boolean isorigin = (row ==0) &&(col==0);
		
		if (getMaze(list,arr,row,col-1) || getMaze(list, arr, row-1, col) ) {
			Point p1 = new Point(row, col);
			list.add(p1);
			System.out.println(list);
			return true;
			
		}
	
		
		//System.out.println(list);
		return false;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		boolean [][] arr = new boolean [3][3];
		for (int i =0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				if (i==j) {
				    arr[i][j] =false;
				} else {
					arr[i][j]=true;
				}
				arr[0][0]=true;
				arr[2][2]=true;
				arr[1][1]=true;
			}
		}
		robot.getMaze(list,arr, 2, 2);
		System.out.println(list);
	}
}
