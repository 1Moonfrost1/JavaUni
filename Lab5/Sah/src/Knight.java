public class Knight extends Piesa{
    public Knight(int x, int y, boolean color){
        super(x, y,color, 'k');
    }

    public boolean canMove(int x, int y, TablaSah table) {

        if (table.isOccupied(y, x))
            if(table.getColor(y, x)==getColor())
                return false;

        if(getPosX() == (x+1) && (getPosY() == (y-2) || getPosY() == (y+2)))
            return true;
        if(getPosX() == (x-1) && (getPosY() == (y-2) || getPosY() == (y-2)))
            return true;

        return false;
    }
}
