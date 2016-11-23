/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Expnegativa {
    private double l;

    public Expnegativa(double li){
        l = li;
    }

    public double generar(){
        double u=Math.random();
        double h = (Math.log(1-u))/(-1.0 * l);
        return h;
    }

    public static void main(String[] args){
        Expnegativa b1=new Expnegativa(0.25);
        int suma=0;
        int n=100000;
        for(int j=1;j<=n;++j){
            double vx=b1.generar();
            suma+=vx;
        }
        System.out.print("el valor de la media muestral es = " + suma/(n*1d) + "  ");

    }

}
