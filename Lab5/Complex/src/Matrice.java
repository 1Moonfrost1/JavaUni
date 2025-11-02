public class Matrice {

    public Matrice() {
    }

    public void getMatrix(Complex[][] matrix, int a, int b) {
        for(int i = 0; i < a; i++) {
            System.out.print("(");
            for(int j = 0; j < b; j++) {
                matrix[i][j].showComplex();
                if(matrix[i][j].getReal()< 0 || matrix[i][j].getImag() <0)
                    System.out.print(" ");
                else
                    System.out.print("  ");
            }
            System.out.println(")");
        }
        System.out.println();
    }

    public void addMatrix(Complex[][] matrix1, Complex[][] matrix2, int a, int b) {
        for(int i = 0; i < a; i++)
            for(int j = 0; j < b; j++)
                matrix1[i][j].sum(matrix2[i][j]);
    }

    public void subMatrix(Complex[][] matrix1, Complex[][] matrix2, int a, int b) {
        for(int i = 0; i < a; i++)
            for(int j = 0; j < b; j++)
                matrix1[i][j].dif(matrix2[i][j]);
    }

    public Complex[][] multiMatrix(Complex[][] matrix1, Complex[][] matrix2, int a, int b) {
        Complex[][] matrix3= new Complex[a][b];
        for(int i = 0; i < a; i++)
            for(int j = 0; j < b; j++)
                matrix3[i][j] = new Complex(0 ,0);

        for(int i = 0; i < a; i++)
            for(int j = 0; j < b; j++)
                for (int k = 0; k < b; k++) {
                    Complex z = new Complex(matrix1[i][k].getReal(), matrix1[i][k].getImag());
                    z.mul(matrix2[k][j]);
                    matrix3[i][j].sum(z);
                }

        //Fiecare element din linia i coloana k se inmulteste cu fiecare element din linia k coloana j.
        //Poti incerca pe foaie

        return matrix3;
    }

    public void scalarMul(Complex[][] matrix1, int a, int b, int k) {
        for(int i = 0; i < a; i++)
            for(int j = 0; j < b; j++) {
                matrix1[i][j].setReal(matrix1[i][j].getReal() * k);
                matrix1[i][j].setImag(matrix1[i][j].getImag() * k);
            }
    }
}
