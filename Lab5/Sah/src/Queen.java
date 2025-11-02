public class Queen extends Piesa{
    public Queen(int x, int y, boolean color){
        super(x,y,color, 'Q');
    }

    public boolean canMove(int x, int y, TablaSah table) {

        if (table.isOccupied(y, x))
            if(table.getColor(y, x)==getColor())
                return false;

        if(getPosX() < x) {
            if ((x - y) == (getPosX() - getPosY())) {
                for (int i = 1; i < x - getPosX(); i++)
                    if (table.isOccupied(getPosY() + i, getPosX() + i))
                        return false;
                return true;
            }

            if((x + y) == (getPosX() + getPosY())) {
                for (int i = 1; i < x - getPosX(); i++)
                    if (table.isOccupied(getPosY() - i, getPosX() + i))
                        return false;
                return true;
            }
        }else {
            if ((x - y) == (getPosX() - getPosY())) {
                for (int i = 1; i < getPosX() - x; i++)
                    if (table.isOccupied(getPosY() - i, getPosX() - i))
                        return false;
                return true;
            }

            if((x + y) == (getPosX() + getPosY())) {
                for (int i = 1; i < getPosX() - x; i++)
                    if (table.isOccupied(getPosY() + i, getPosX() - i))
                        return false;
                return true;
            }
        }

        if(getPosX() == x) {
            if (getPosY() < y) {
                for (int i = getPosY() + 1; i < y; i++)
                    if (table.isOccupied(i, x))
                        return false;
            } else
                for (int i = getPosY() - 1; i > y; i--)
                    if (table.isOccupied(i, x))
                        return false;
        }else return true;

        if(getPosY() == y) {
            if (getPosX() < x) {
                for (int i = getPosX() + 1; i < x; i++)
                    if (table.isOccupied(y, i))
                        return false;
            } else
                for (int i = getPosX() - 1; i > x; i--)
                    if (table.isOccupied(y, i))
                        return false;
        }else return true;

        return false;
    }
}
