import java.util.Scanner;

public class Ex4_3 {

    private String cuvant;
    private int consoane;
    private int vocale;

    public Ex4_3(String s)
    {
        cuvant = s;
        consoane = 0;
        vocale = 0;
    }

    private void buildLitere()
    {
        char arr[]={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for(int i=0; i<cuvant.length(); i++) {
            boolean vowelExists =  false;
            for (char element : arr)
                if (cuvant.charAt(i) == element) {
                    vowelExists = true;
                    break;
                }

            if (vowelExists == true)
                vocale++;
            else
                consoane++;
        }
    }

    public void showLitere()
    {
        this.buildLitere();
        System.out.println("Cosoane = " + consoane + "\nVocale = " + vocale);
    }

    public void showPosition()
    {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);

        for(int i=0; i<cuvant.length(); i++)
            if(cuvant.charAt(i) == c)
                System.out.print(i + " ");
    }
}
