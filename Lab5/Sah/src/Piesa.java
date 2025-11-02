public abstract class Piesa {

    public Piesa(int x, int y, boolean color, char piesa ) {
        this.x = y;
        this.y = x;
        this.color = color;
        this.piesa = piesa;
    }

    public abstract boolean canMove(int x, int y, TablaSah table);

    public boolean move(int x, int y, TablaSah table) {
        if(canMove(x, y, table)){
            this.x = x;
            this.y = y;
            return true;
        }
        else
            System.out.println("Can't move there!");
        return false;
    }

    public int getPosX(){
        return this.x;
    }

    public int getPosY(){
        return this.y;
    }

    public char getPiesa(){
        return this.piesa;
    }

    public boolean getColor(){
        return this.color;
    }

    private int x;
    private int y;
    private char piesa;
    private boolean color;
}
