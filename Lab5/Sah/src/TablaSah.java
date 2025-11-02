import java.util.Scanner;

public class TablaSah {

    public  TablaSah() {
        size = 8;

        piese = new Piesa[8][8];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                piese[i][j] = null;

        for (int j = 0; j < size; j++)
            piese[1][j] = new Pion(1, j, true);

        for (int j = 0; j < size; j++)
            piese[6][j] = new Pion(6, j, false);

        piese[0][0] = new Tura(0, 0, true);
        piese[0][7] = new Tura(0, 7, true);
        piese[7][0] = new Tura(7, 0, false);
        piese[7][7] = new Tura(7, 7, false);

        piese[0][1] = new Knight(0, 1,  true);
        piese[0][6] = new Knight(0, 6, true);
        piese[7][1] = new Knight(7, 1, false);
        piese[7][6] = new Knight(7, 6, false);

        piese[0][2] = new Bishop(0, 2, true);
        piese[0][5] = new Bishop(0, 5, true);
        piese[7][2] = new Bishop(7, 2,  false);
        piese[7][5] = new Bishop(7, 5, false);

        piese[0][3] = new Queen(0, 3, true);
        piese[7][3] = new Queen(7, 3,  false);

        piese[0][4] = new King(0, 4, true);
        piese[7][4] = new King(7, 4,  false);
    }

    public void printTable() {
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                if (piese[i][j] == null)
                    System.out.print("\u001B[0m_");
                else if(piese[i][j].getColor())
                    System.out.print("\u001B[30m" + piese[i][j].getPiesa());
                else
                    System.out.print("\u001B[0m" + piese[i][j].getPiesa());
            }
            System.out.println();
        }
    }

    public void mutare(){
        Scanner sc = new Scanner(System.in);
        int xi =  sc.nextInt();
        int yi  = sc.nextInt();

        if(xi > 7 || yi >7 || xi <0 || yi <0) {
            System.out.println("Nu putem alege piesa din afara tablei");
            return;
        }

        if(!isOccupied(xi, yi)){
            System.out.println("Nu exista piesa pe pozitia respectiva!");
            return;
        }

        switch(piese[xi][yi].getPiesa()){
            case 'P': System.out.print("Mutam pionul pe pozitia:"); break;
            case 'Q': System.out.print("Mutam regina pe pozitia:"); break;
            case 'K': System.out.print("Mutam regele pe pozitia:"); break;
            case 'k': System.out.print("Mutam calul pe pozitia:"); break;
            case 'B': System.out.print("Mutam nebunul pe pozitia:"); break;
            case 'T': System.out.print("Mutam tura pe pozitia:"); break;
        }
        int xf = sc.nextInt();
        int yf = sc.nextInt();

        if(xf > 7 || yf >7 || xf <0 || yf <0)
            System.out.println("Nu putem muta in afara tablei");

            if(piese[xi][yi].move(yf, xf, this))
            {
                piese[xf][yf] = piese[xi][yi];
                piese[xi][yi] = null;
                printTable();
            }
    }

    public boolean isOccupied(int x, int y){
        if(piese[x][y]==null)
            return false;
        return true;
    }

    public boolean getColor(int x, int y){
        return piese[x][y].getColor();
    }

    public int getSize() {
        return size;
    }

    private int size;
    private Piesa[][] piese;
}
