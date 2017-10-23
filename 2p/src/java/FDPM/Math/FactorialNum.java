package FDPM.Math;

/**
 * @author PacoDw
 */
public class FactorialNum {
    
    public String getFactorial(String num)
    {
        if(isNumeric(num))
        {
            int value = Integer.parseInt(num);

            for(int i = value-1; i > 0; i--)
                value *= i;
            
            return String.valueOf(value);
        }
        return "";
    }

    public boolean isNumeric(String str) {
        return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("")==false);
    }
}
