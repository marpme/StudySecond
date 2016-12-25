import java.util.List;
import java.util.Objects;

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

    private Vector[] points;

    private int boundRow, boundColumn;

    public Labyrinth(char[][] lab, int boundRow, int boundColumn){
        laby = lab;
        points = new Vector[8];
        this.boundRow = boundRow;
        this.boundColumn = boundColumn;

        for (int i = 0; i < boundRow; i++) {
            for (int j = 0; j < boundColumn; j++) {
                switch (laby[i][j]){
                    case '0':
                        playerPos = new Vector(i, j);
                        break;
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        points[Integer.parseInt(Character.toString(laby[i][j]))] = new Vector(i,j);
                }
            }
        }
    }

    private boolean isFree(char k){
        return k != '#';
    }

    private boolean isNumber(int i, char k){
        return Character.toString(k).equals(Integer.toString(i));
    }


}
