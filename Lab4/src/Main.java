import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Autovehicul masina = new Autovehicul("Mercedes", new Color(0, 0, 255));
//        TestDrive.test(masina);
//        TestDrive.showKm();
        masina.create_rezervor(100, 30);
        masina.create_sofer("Neagu", "Nicolas", 19, 123594);

        /*
        masina.getIdentity();
        masina.nivel_rezervor();
        masina.golire(50);
        masina.umplere(30);
        masina.nivel_rezervor();
        masina.umplere(600);
        masina.nivel_rezervor();

         */
    }
}