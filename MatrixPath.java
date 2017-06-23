package misc;


import java.awt.Point;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


class Cell {
	Point ob ;
	int distance;
	public Cell(Point x, int i) {
		try {
			ob = x;
			distance = i;
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
		}
		
		
		
	}
	
}
	
public class MatrixPath {
	
	private static int[][] arr = {{1,1,0},
							       {0,1,0},
							       {1,1,0}};
	static boolean[][] visit = new boolean[2][2];


	 
	
static int[] row = {-1,0,1,0};
static int[] col = {0,-1,0,1};
	private static int findPath(Cell sourcePoint, Cell destinationPoint) {
		for (boolean[] p : visit) {
			Arrays.fill(p, false);
		}
		Queue<Cell> q = new LinkedList();
		q.add(sourcePoint);
		while (!q.isEmpty()) {
			Cell point = q.peek();
			if ((point.ob.x == destinationPoint.ob.x) &&  (point.ob.y == destinationPoint.ob.y)) {
				point.distance = point.distance + 1;
				return point.distance;
			}
			point = q.poll();
			for (int k=0; k< 4; k++) {				
				int x = point.ob.x + row[k];
				int y = point.ob.y + col[k];					
				
					if ( (isValid(arr, x , y )) && !(visit[x][y]) && arr[x][y] == 1 ) {						
							Point p = new Point(x,y);
							visit[x ][y ] = true;
							q.add(new Cell(p,  point.distance + 1));							
				
				    }	
							
			}
					
		}
		return -1;
		
	}
	
	
	
private static boolean isValid (int arr[][], int i, int j) {
		if (i < arr.length && j < arr[0].length && i>=0 && j>=0) {
			return true;
		}			
		return false;
	}



public static void main(String[] args) {
		
		Point source = new Point(0,0);
		Point destination = new Point(1,1);
		Cell sourcePoint = new Cell(source, 0);
		Cell destinationPoint = new Cell(destination, -1);
		System.out.println(findPath(sourcePoint, destinationPoint));
		}


}

