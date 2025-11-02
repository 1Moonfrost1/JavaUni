public class Complex {
    private  double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void sum(Complex z) {
        real += z.real;
        imag += z.imag;
    }

    public void dif(Complex z) {
        real -= z.real;
        imag -= z.imag;
    }

    public void mul(Complex z) {
        double real_aux = real;
        real = real*z.real - imag*z.imag;
        imag = real_aux*z.imag  + imag*z.real;
    }

    public void div(Complex z) {
        double real_aux = real;
        real = (real*z.real + imag*z.imag)/(z.imag*z.imag +  z.real*z.real);
        imag = (imag*z.real - real_aux*z.imag)/(z.imag*z.imag +  z.real*z.real);
    }

    public void showComplex() {
        if(imag>0)
            System.out.print(real + "+" + imag + "j");
        else
            System.out.print(real + imag + "j");
    }

    public void showComplexln() {
        if(imag>0)
            System.out.println("z=" + real + "+" + imag + "j");
        else
            System.out.println("z=" + real + imag + "j");
    }

    public double getReal(){
        return real;
    }

    public double getImag(){
        return imag;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public void setReal(double real){
        this.real = real;
    }
}
