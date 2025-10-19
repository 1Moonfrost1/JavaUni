public class Ex4_5 {

    public void sanseCastig() {
        System.out.println("Sanse castig raport: 1/" + (49*48*47*46*45*44L)/(6*5*4*3*2));
        System.out.println("Sanse castig procent:" + (6*5*4*3*2.0)/(49*48*47*46*45*44L) + "%");
    }

    //Math.random() = [0.0, 1.0]

    public void extragere() {
        for(int i=0; i<6; i++)
            System.out.print((int)(Math.random()*48 + 1) + " ");
    }

    //Folosit pentru testarea impachetarii si despachetarii
    public void demoImpachetareExtragere(){
        long numarCondensat=0;

        for(int i=0; i<6; i++){
            byte randNr=(byte)(Math.random()*48 + 1);
            numarCondensat= numarCondensat<<6 | randNr;
            System.out.print(randNr + " ");
        }

        System.out.print("\n");
        for(int i=0; i<6; i++){
            System.out.print( (numarCondensat & 0x3F) +" ");
            numarCondensat=numarCondensat>>6;
        }
    }

    public void extragereSortata(){
        long numarCondensat=0;
        System.out.print("Afisare nesortata: ");
        for(int i=0; i<6; i++){
            byte randNr = (byte) (Math.random() * 48 + 1);
            System.out.print(randNr + " ");
            numarCondensat = numarCondensat << 6 | randNr;
        }
        afisareSortare(numarCondensat);
    }

    private void afisareSortare(long number) {

        System.out.print("\nAfisare sortata: ");
        for (int n = 6; n != 0; n--) {
            int imin=0;
            byte byte_min = (byte)(number & 0x3F);
            for (int i = 1; i < n; i++)
                if( (byte)((number & (0x3F << (6*i))) >> (6*i)) < byte_min){
                    imin=i;
                    byte_min = (byte)((number & (0x3F << (6*i))) >> (6*i));
                }

            System.out.print(byte_min + " ");
            if(imin==0)
                number=number >> 6;
            else {
                long aux=0;
                for (int i = 0; i < imin; i++) {
                    aux=aux | (number & 0x3F);
                    aux=aux<<6;
                    number=number>>6;
                }
                aux=aux>>6;
                number=number>>6;
                number=number<< imin*6;
                number=number | aux;
            }
        }


        /*49 este stocat pe 6 biti => shift pe 6.
        Verificam fiecare "byte" de 6 biti intre el cu o masca de tipu 0x3F shiftata la nr anumit de pozitii
        De ex pt nr 3 vom avea 0x3F << 6*3. Apoi il verificam cu minimul pe care il tinem minte.
        La final cu pozitia minima tinem minte cate nr trb sa eliminam, tinem minte cu ajutorul unei veriabile auxiliare
        ce am eliminat si facem inpoi shift la stanga fara minim dupa care aplicam | (sau) cu auxiliarul.

        Mai bine faceam leetcode decat sa ma chinui pe biti dar na.
         */
    }
}