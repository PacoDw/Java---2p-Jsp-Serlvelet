package FDPM.Math;
import FDPM.Math.Fraccion;
/**
 * @author PacoD
 */
public class SucesionesClass {
    
    //-----------------------------------------------------------------
    //CONSTRUCTOR EMPTY
    public SucesionesClass(){
        
    }

    //-----------------------------------------------------------------
    //METHOD FORMULA 1
    public String formulaOne(){
        String res = "";
        for(int i = 1; i < 11; i++)
        {
            if(i % 2 == 0)
                res += "-";
            res += "1";
            
            if(i < 10)
                res += ", ";
        }
        return res;
    }
    
    //-----------------------------------------------------------------
    //METHOD FORMULA 2
    public String formulaTwo(){
        String res = "";
        for(int i = 1; i < 11; i++)
        {
            res += Math.pow(i, 2);
            
            if(i < 10)
                res += ", ";
        }
        return res.replace(".0", "");
    }
    
    //-----------------------------------------------------------------
    //METHOD FORMULA 3
    public String formulaThree(){
        String res = "";
        Fraccion[] f = new Fraccion[10];
        
        String[] strOne = formulaOne().replace(" ", "").split(",");
        String[] strTwo = formulaTwo().replace(" ", "").split(",");
                
        for(int i = 0; i <10; i++)
            f[i] = Fraccion.getFraccion(Integer.parseInt(strOne[i]), Integer.parseInt(strTwo[i]));
        
        for(int i = 0; i < 10; i++)
        {
            res += f[i].toString();
            
            if(i < 9)
                res += ", ";
        }
        
        return res;
    }
    
    //-----------------------------------------------------------------
    //METHOD FORMULA FIBONACCI
    public String getFibonacci()
    {
        String res="";
   
        int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = 1000;

        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            res+=Integer.toString(n2);
            
            if(n2 + n1 < limite)
                res += ", ";
        }
        return res;
    }
    
    //-----------------------------------------------------------------
    //METHOD FORMULA PRIMOS
    public String getPrimos(){
        int num=10,i,n=4,cont=2;
        String cad="";
        if(num>2){
            cad="2 , 3";
            while(cont<num){
                i=2;
                while(i<=n){
                    if(i==n){
                    cad=cad+" , "+n;
                    cont=cont+1;
                    }else{
                    if(n % i==0){
                    i=n;
                    }
                    }
                    i=i+1;
                }
                n=n+1;
            }
    }
    return cad;
}
    
    //-----------------------------------------------------------------
    //METHOD FORMULA LUCAS
    public int getLucas(int N) {
        if( N == 0 ) return 2;
        if( N == 1 ) return 1;
        return getLucas(N-1) + getLucas(N-2);
}
    
    //-----------------------------------------------------------------
    //METHOD FORMULA LUCAS
    public String getCollatz(){
        int num = 13;
        String res = Integer.toString(num) + ", ";
        
        for(int i = 0; i < 9; i++)
        {
            if(num % 2 == 0)
            {
                num = num/2;
                res += num;
            }
            else
            {
                num = 3 * num + 1;
                res += num;
            }
            
            if(i < 8)
                res += ", ";
        }
        return res;
    }
    
    //-----------------------------------------------------------------
    //METHOD FORMULA PERMUTACION
    public int getPermutacion(String str_n, String str_r){
        int n = Integer.parseInt(str_n);
        int r = Integer.parseInt(str_r);
        int P;
        P=factorial(n)/factorial(n-r);
        return P;
    }

    //-----------------------------------------------------------------
    //METHOD FORMULA COMBINACION
    public int getCombinacion(String str_n, String str_r){
        int n = Integer.parseInt(str_n);
        int r = Integer.parseInt(str_r);
        int c;
        c=(factorial(n)/(factorial(r))*factorial(n-r));
        return c;
    }
    private int factorial(int x){
        int i,f;
        f=1;
        for(i=1;i<=x;i++)
            f=f*i;
        return f;
    }
}
    
