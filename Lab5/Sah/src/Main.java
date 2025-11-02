//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TablaSah tabla = new TablaSah();
        tabla.printTable();

        for(int mutari=0; mutari<20; mutari++)
            tabla.mutare();

        //Cand muti, te uiti la combinatia linie x coloana.
        //Ex: 1 2 (Muta piesa de pe pozitia 1 2) -> Piesa aleasa se afiseaza in terminal. Apoi Specifici pe ce pozitie
        //Sa mearga.
        //True = culoarea neagra  --- False = culoarea alba
    }
}