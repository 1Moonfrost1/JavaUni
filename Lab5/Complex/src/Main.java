//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Complex z1 = new Complex(3, 5);
        Complex z2 = new Complex(1, 2);

        z1.sum(z2);
        z1.showComplexln();
        z1.setReal(3);
        z1.setImag(5);
        z1.dif(z2);
        z1.showComplexln();
        z1.setReal(3);
        z1.setImag(5);
        z1.mul(z2);
        z1.showComplexln();
        z1.setReal(3);
        z1.setImag(5);
        z1.div(z2);
        z1.showComplexln();
        z1.setReal(3);
        z1.setImag(5);

        Complex z3 = new Complex(5, 2);
        Complex z4 = new Complex(-1, 6);
        Complex z5 = new Complex(-2, 1);
        Complex z6 = new Complex(1, 4);

        Matrice tablou = new Matrice();

        Complex[][] matrix1 = {{z1, z2},  {z3, z4}};
        tablou.getMatrix(matrix1, 2, 2);

        Complex[][] matrix2 = {{z5, z6}, {z1, z2}};
        tablou.getMatrix(matrix2, 2, 2);

        //Clasa matrice nu verifica erorile. Trebuie sa introducem marimile exacte la a, b si matrici de aceeasi dimensiune
        Complex[][] matrix3 = tablou.multiMatrix(matrix1, matrix2, 2, 2);
        tablou.getMatrix(matrix3, 2, 2);

        /*
        tablou.getMatrix(matrix1, 2, 2);
        tablou.scalarMul(matrix1, 2, 2, 3);
        tablou.getMatrix(matrix1, 2, 2);
        */
    }
}