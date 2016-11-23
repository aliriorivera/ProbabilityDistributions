/*Alirio Rivera Cuervo
 Codigo 257612*/

public class Poisson {
    private double k;

    public Poisson(double l){
        k=l ;
    }

    public int generar(){
        int x=0;
        double px = Math.exp((-1.0)*k);
        double Fx=px;
        double u=Math.random();
        while(u>Fx){
            x=x+1;
            px=(px*k)/x;
            Fx=Fx+px;
        }
        return x;
    }

    
    public static void main(String[] args){
        Poisson b1=new Poisson(10.0);
        int suma=0;
        int n=100000;
        for(int j=1;j<=n;++j){
            int vx=b1.generar();
           // System.out.print(vx + "\n");
            suma+=vx;
        }
        System.out.print("el valor de la media muestral es = " + suma/(n*1d) + "  ");
    }

}
