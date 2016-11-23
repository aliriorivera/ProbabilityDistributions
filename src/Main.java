/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alirio
 */

public class Main {
    int k=2;
    int er;
    double lamb=20.0;
    double h=0;
    public void Main(){
    }

    public int poisson(){
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


    public double erlang(){
        double res1=0;
        int po = poisson();
        for(int j=0; j<po;j++){
            for(int i=0; i<4; ++i){
                double u=Math.random();
                h = h +  (Math.log(1-u))/(-1.0 * lamb);
            }
            if(h>0.25){
                    res1 = res1 + 1;
            }
            h=0;
        }
        return res1;
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        double res=0.0;
        for(int r=0; r<1000;r++){
            res = res + m.erlang();
           // System.out.print("\n" + res);
        }
        res = res / 1000.0;
       System.out.print("el valor estimado del numero de pedidos que demoran \n mas de 15 minutos es: " + res);

    }

}