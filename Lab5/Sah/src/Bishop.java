public class Bishop extends Piesa{
    public Bishop(int x, int y, boolean color){
        super(x, y,color, 'B');
    }

    public boolean canMove(int x, int y, TablaSah table){

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

        return false;
    }
}
