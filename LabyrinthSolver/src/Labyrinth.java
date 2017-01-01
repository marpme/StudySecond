import java.util.*;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 24. Dec 2016
 */
public class Labyrinth {

    private char[][] laby;

    private Vector playerPos;

    private Map<Character, Vector> points;

    private int boundRow, boundColumn;

    public Labyrinth(char[][] lab, int boundRow, int boundColumn){
        laby = lab;
        points = new HashMap<>();
        this.boundRow = boundRow;
        this.boundColumn = boundColumn;

        for (int i = 0; i < boundRow; i++) {
            for (int j = 0; j < boundColumn; j++) {
                switch (laby[i][j]){
                    case '0':
                        points.put('0', new Vector(j,i));
                        playerPos = new Vector(j, i);
                        break;
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        points.put(laby[i][j], new Vector(j,i));
                }
            }
        }

        System.out.println(playerPos);
        System.out.println(points);
        System.out.println(laby[1][9]);

        lengthToPoint(points.get('0'), points.get('1'), 0);

    }

    private boolean isFree(Vector z, Vector k){
        return charAtPos(z.add(k)) != '#';
    }

    private char charAtPos(Vector pos){
        return laby[pos.y][pos.x];
    }

    private boolean isNumber(int i, char k){
        return Character.toString(k).equals(Integer.toString(i));
    }

    private int distance(Vector a, Vector b){
        float x = a.x - b.x;
        float y = a.y - b.y;
        double dist = Math.sqrt(x*x + y*y);
        return dist < 0 ? (int)-dist : (int)dist;
    }

    public int lengthToPoint(Vector from, Vector to, int count){
        if(from.equals(to)){
            return count;
        }

        if(isFree(from, Vector.leftMove())){
            lengthToPoint(from.add(Vector.leftMove()), to, ++count);
        }

        if(isFree(from, Vector.rightMove())){
            lengthToPoint(from.add(Vector.rightMove()), to, ++count);
        }

        if(isFree(from, Vector.bottomMove())){
            lengthToPoint(from.add(Vector.bottomMove()), to, ++count);
        }

        if(isFree(from, Vector.topMove())){
            lengthToPoint(from.add(Vector.topMove()), to, ++count);
        }

        return 0;
    }

}
