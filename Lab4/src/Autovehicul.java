import java.awt.*;

public class Autovehicul {

    public Autovehicul() {
        marca = "Unknown";
        color = Color.white;
        speed = 0;
        treapta_viteza = 0;
        max_speed = 0;
        max_trepte = 0;
    }

    public Autovehicul(String name, Color c) {
        marca = name;
        color = c;
        speed = 0;
        treapta_viteza=0;
        max_speed=130;
        max_trepte=6;
    }

    private class Sofer{
        private String nume;
        private String prenume;
        private int varsta;
        private int numar_permis_conducere;

        private Sofer() {
            nume = "Unknown";
            prenume = "Unknown";
            varsta = 0;
            numar_permis_conducere = 0;
        }

        private Sofer(String n, String pn, int age, int nr_permis) {
            nume = n;
            prenume = pn;
            varsta = age;
            numar_permis_conducere = nr_permis;
        }

        private void getIdentity(){
            System.out.println("Soferul: " + nume + " " + prenume + " " + varsta + " " + numar_permis_conducere);
        }
    }

    private class Rezervor{
        private int capacitate_maxima;
        private int nivel_curent;

        public Rezervor() {
            capacitate_maxima = 0;
            nivel_curent = 0;
        }

        public Rezervor(int capacitate, int nivel) {
            capacitate_maxima = capacitate;
            nivel_curent = nivel;
        }

        public void umplere(int nr){
            if((nivel_curent+nr)<=capacitate_maxima)
                nivel_curent += nr;
            else {
                nivel_curent = capacitate_maxima;
                System.out.println("Rezervorul va da pe afara "
                        + Math.abs(capacitate_maxima-nr) + " L");
            }

        }

        public void golire(int nr){
            if(nivel_curent-nr > 0)
                nivel_curent -= nr;
            else {
                nivel_curent = 0;
                System.out.println("Rezervorul este gol");
            }

        }

        public void getNivelCurent() {
            System.out.println("Nivel rezervor: " + nivel_curent);
        }
    }

    public void create_sofer(String name, String prename, int age, int nr_permis){
        sofer= new Sofer(name, prename, age, nr_permis);
    }

    public void create_rezervor(int capacitate, int nivel){
        rezervor = new Rezervor(capacitate, nivel);
    }

    public void getIdentity(){
        sofer.getIdentity();
    }

    public void nivel_rezervor(){
        rezervor.getNivelCurent();
    }

    public void umplere(int nr){
        rezervor.umplere(nr);
    }

    public void golire(int nr){
        rezervor.golire(nr);
    }

    public void accelerare(int km){
        if((speed+km)<=max_speed)
            speed+=km;
        else
            speed=max_speed;
    }

    public void decelerare(int km){
        if(speed>=km)
            speed-=km;
        else
            speed=0;
    }

    public void schimbare_treapta(int nr){
        if(nr > 0 & nr <=max_speed)
            treapta_viteza=nr;
        else
            System.out.println("Treapta " + nr + " excede numarul maxim de trepte");
    }

    public void oprire(){
        speed=0;
        treapta_viteza=0;
    }

    public void stare(){
        System.out.println(color.toString() + " " + marca + " are "
                + speed + " km/h, fiind in treapta " +  treapta_viteza);
    }

    public int getSpeed(){
        return speed;
    }

    private Sofer sofer;
    private Rezervor rezervor;

    private String marca;
    private Color color;
    private int speed;
    private int treapta_viteza;
    private int max_speed;
    private int max_trepte;
}
