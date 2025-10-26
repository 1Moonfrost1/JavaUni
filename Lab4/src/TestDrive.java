public class TestDrive {

    private static int km = 0;

    public static void test(Autovehicul masina){
        System.out.println("Vom accelera cu 20 km/h si schimbam in treapta 1 pentru 0.2h");
        masina.accelerare(20);
        masina.schimbare_treapta(1);
        masina.stare();
        km += masina.getSpeed()*0.2;

        System.out.println("Marim viteza cu 30 km/h cu treapta 2 pentru 0.2h");
        masina.accelerare(30);
        masina.schimbare_treapta(2);
        masina.stare();
        km += masina.getSpeed()*0.2;

        System.out.println("Acum vom propulsa masina cu 150 de km pentru 0.1h si schimbam in treapta 6");
        masina.accelerare(150);
        masina.schimbare_treapta(6);
        masina.stare();
        km += masina.getSpeed()*0.1;

        System.out.println("Incetinim cu 80 km/h si schimbam in treapta 3 si mergem 0.2h");
        masina.decelerare(80);
        masina.schimbare_treapta(3);
        km += masina.getSpeed()*0.2;

        System.out.println("Incetinim cu 160 km/h si schimbam in treapta 1 si mergem 0.5h");
        masina.decelerare(160);
        masina.schimbare_treapta(1);
        km += masina.getSpeed()*0.5;
    }

    public static void showKm(){
        System.out.println("Kilometrii parcursi: " + km);
    }
}
