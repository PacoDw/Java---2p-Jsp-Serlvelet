package FDPM.Math;

public class Discreta {
    
    
    public int getFactorial(int num)
    {
        int aux_num = num;
        for(int i = num-1; i > 0; i--)
            aux_num *= i; 
        
        return aux_num;
    }
}
