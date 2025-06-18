package Ds.Graphs;

import java.util.*;

class Cell{
	int xPos;
	int yPos;
	int distance;
	
	Cell(int xPos, int yPos, int distance){
		this.xPos = xPos;
		this.yPos = yPos;
		this.distance = distance;
	}
}

public class KnightMinMoves {

	public static void main(String[] args) {
		int[] startingPoint = {1,1};
		
		int[] targetPoint = {20,20};
		
		int N = 30;
		
		System.out.println(BFSKnight(startingPoint, targetPoint, N));

	}

	private static int BFSKnight(int[] startingPoint, int[] targetPoint, int N) {
		int x[] = {-2,-2,-1,-1,1,2,2,1};
		int y[] = {-1,1,2,-2,2,1,-1,-2};
		ArrayDeque<Cell> queue = new ArrayDeque<>();
		boolean[][] visited = new boolean[N+1][N+1];
		
		
		Cell c = new Cell(startingPoint[0], startingPoint[1], 0);

		visited[startingPoint[0]][startingPoint[1]] = true;
		queue.add(c);
		
		while(!queue.isEmpty()) {
			Cell cell = queue.poll();
						
			if(cell.xPos == targetPoint[0] && cell.yPos == targetPoint[1]) {
				System.out.println("("+cell.xPos + "," + cell.yPos + "," + cell.distance+")");
				return cell.distance;
			}
			
			for(int i=0;i<8;i++) {
				
				int nextX = cell.xPos + (x[i]);
				int nextY = cell.yPos + (y[i]);
				
				if(nextX>= 1 && nextY >= 1  && nextX <= 30 &&  nextY <= 30) {		
					if(visited[nextX][nextY] == false) {
							visited[nextX][nextY] = true;
							queue.add(new Cell(nextX, nextY, cell.distance+1));

					}
				}
			}
		}
		return -1;
	}

}
