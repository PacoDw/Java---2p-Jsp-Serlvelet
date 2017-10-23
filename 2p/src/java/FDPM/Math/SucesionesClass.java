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
    
}
