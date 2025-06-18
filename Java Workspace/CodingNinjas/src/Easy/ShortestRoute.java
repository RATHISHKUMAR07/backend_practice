// 2/5/24
package Easy;

import java.util.ArrayDeque;


import java.util.*;

class Cell {
    int x;
    int y;
    int dist;
    StringBuilder path;

    Cell(int x, int y, int dist, StringBuilder path) {
        this.x = x;
        this.y = y;
        this.dist = dist;
        this.path = new StringBuilder(path);
    }
}

public class ShortestRoute {
    public static void main(String[] args) {
        String str = "SSWWNNE";
        System.out.println(findShortestRoute(str));
    }

    public static String findShortestRoute(String str) {
        int[] endPoint = findEnd(str);
        StringBuilder result = BFS(new int[] {0, 0}, endPoint);
        return result.toString();
    }

    public static int[] findEnd(String str) {
        int[] position = new int[2];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'E': position[0]++; break;
                case 'W': position[0]--; break;
                case 'N': position[1]++; break;
                case 'S': position[1]--; break;
            }
        }
        return position;
    }

    public static StringBuilder BFS(int[] start, int[] end) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        char[] dir = {'E', 'W', 'N', 'S'};

        Set<String> visited = new HashSet<>();
        Queue<Cell> queue = new LinkedList<>();

        Cell startCell = new Cell(start[0], start[1], 0, new StringBuilder());
        queue.add(startCell);
        visited.add(start[0] + "," + start[1]);

        while (!queue.isEmpty()) {
            Cell current = queue.poll();

            if (current.x == end[0] && current.y == end[1]) {
                return current.path;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                String key = nx + "," + ny;

                if (!visited.contains(key)) {
                    visited.add(key);
                    Cell nextCell = new Cell(nx, ny, current.dist + 1, current.path);
                    nextCell.path.append(dir[i]);
                    queue.add(nextCell);
                }
            }
        }

        return new StringBuilder("No path found");
    }
}
