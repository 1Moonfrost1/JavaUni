public class King extends Piesa{
    public King(int x, int y,  boolean color){
        super(x, y, color, 'K');
    }

    public boolean canMove(int x, int y, TablaSah table) {

        if (table.isOccupied(y, x))
            if(table.getColor(y, x)==getColor())
                return false;

        if((getPosX() == (x+1) || getPosX() == (x-1) || getPosX() == x) &&
                (getPosY() == (y-1) ||getPosY() == (y+1) || getPosY() == y))
            return true;

        return false;
    }
}
