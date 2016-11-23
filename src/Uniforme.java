/*Alirio Rivera Cuervo
 Codigo 257612*/

public class Uniforme {

    private double a,b;

    public Uniforme(double li, double ls){
        a = li;
        b = ls;
    }

    public double generar(){
        double f = Math.random()*(b-a)+a;
        System.out.print(f + "\n");
        return f;

    }

    public static void main(String[] args){
        Uniforme b1=new Uniforme(5.0,6.2);
        int suma=0;
        int n=100000;
        for(int j=1;j<=n;++j){
            double vx=b1.generar();
            suma+=vx;
        }
        System.out.print("el valor de la media muestral es = " + suma/(n*1d) + "  ");

    }
}
