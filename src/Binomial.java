/*Alirio Rivera Cuervo
 Codigo 257612*/

public class Binomial {
    /**
     * @param n numero de ensayos
     * @param p probabilidad de exito
     */
    private int n;
    private double p;

    public Binomial(int ne, double pe){
        n=ne;
        p=pe;
    }

    public int generar(){
        int x=0;
        double px=Math.pow(1-p, n);
        double Fx=px;
        double u=Math.random();
        while(u>Fx){
            x=x+1;
            px=probabilidadBinomial(x);
            Fx=Fx+px;
        }

        return x;
    }

    public double probabilidadBinomial(int x){
        double prob=0;
        if(x==n){
             prob=Math.pow(p, n);
        }else{
        int denom=1;
        for(int i=1;i<=x;++i){
            denom=denom*i;
        }
        int num=1;
        for(int i=n;i>(n-x);--i){
            num=num*i;
        }
        prob=(num/denom)*Math.pow(p, x)*Math.pow(1-p, n-x);
        }
        return prob;

    }

    public static void main(String[] args){
        Binomial b1=new Binomial(10,0.45);
        int[] obs=new int[11];
        for(int j=0;j<=100000;++j){
            int vx=b1.generar();
            obs[vx]=obs[vx]+1;
        }
        for(int i=0;i<obs.length;++i){
            System.out.println(obs[i]);
        }
    }

}
