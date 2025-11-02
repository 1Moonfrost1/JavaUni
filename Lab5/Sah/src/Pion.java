public class Pion extends Piesa{

    public Pion(int x, int y, boolean color){
        super(x, y, color,'P');
    }

    public boolean canMove(int x, int y, TablaSah table) {

        if (table.isOccupied(y, x))
            if(table.getColor(y, x)==getColor())
                return false;

        // Daca este alb merge in sus/ altfel merge in jos
        if(!getColor()){

            if (!table.isOccupied(y, x) && getPosX() == x && getPosY() == y + 1)
                return true;
            if (table.isOccupied(y,x) && ((getPosX() == x - 1 || getPosX() == x + 1) && getPosY() == y + 1))
                return true;
        }
        else {
            if (!table.isOccupied(y, x) && getPosX() == x && getPosY() == y - 1)
                return true;
            if (table.isOccupied(y, x) && ((getPosX() == x - 1 || getPosX() == x + 1) && getPosY() == y - 1))
                return true;
        }

        return false;
    }
}
