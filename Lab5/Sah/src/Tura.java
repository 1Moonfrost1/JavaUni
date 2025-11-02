public class Tura extends Piesa{
    public Tura(int x, int y, boolean color){
        super(x, y,color, 'T');
    }

    public boolean canMove(int x, int y, TablaSah table){

        if (table.isOccupied(y, x))
            if(table.getColor(y, x)==getColor())
                return false;

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
