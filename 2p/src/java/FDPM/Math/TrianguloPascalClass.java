package FDPM.Math;

public class TrianguloPascalClass {
    
    //-----------------------------------------------------------------
    //ATRIBUTES
    private String[][] matriz;
    private int _size;
    
    //-----------------------------------------------------------------
    //CONSTRUCTOR EMPTY
    public TrianguloPascalClass()
    {
    }
    
    //-----------------------------------------------------------------
    //CONSTRUCTOR
    public TrianguloPascalClass(int size)
    {
        this.matriz = new String[size][(size * 2)-1];
        this._size = size;
        this.cleanMatriz(); 
        this.fillMatriz();
    }
    
    //-----------------------------------------------------------------
    //METHOD GET SIZE
    public int getSize()
    {
        return _size;
    }
    
    //-----------------------------------------------------------------
    //METHOD CLEAN MATRIZ
    public void cleanMatriz()
    {
        for(int r = 0; r < _size; r++)
            for(int c = 0; c < (_size * 2)-1; c++)
                matriz[r][c] = "&#160";
    }
    
    //-----------------------------------------------------------------
    //METHOD GET LINE
    public String getLine(int num_line)
    {
        this._size = num_line;
        this.matriz = new String[_size][(_size * 2)-1];
        this.cleanMatriz();
        this.fillMatriz();
        
        String line = "";
        
        for(int colum = 0; colum < (_size*2)-1;colum++)
            if(!matriz[num_line-1][colum].equals("&#160"))
                line += matriz[num_line-1][colum];
            else
                line += "  ";
        
        return line;
    }
    
    //-----------------------------------------------------------------
    //METHOD FILL MATRIZ
    public void fillMatriz()
    {
        int c_aux_alto = _size-1;
        int c_aux_bajo = _size-1;
            
        if(_size % 2 == 0)
            {
                for(int r = 0; r < _size ; r++)
                {
                    for(int c = c_aux_bajo; c <= c_aux_alto; c++)
                    {
                        
                        if(r % 2 != 0 && (c == 0 || c % 2 == 0))
                        {
                            if(c == c_aux_bajo || c == c_aux_alto)
                                matriz[r][c] = "1";
                            else //sumamos el anterior de la izquierda con el anterior de la derecha
                                matriz[r][c] = Integer.toString(
                                Integer.parseInt(matriz[r-1][c-1]) +
                                Integer.parseInt(matriz[r-1][c+1])
                                );
                        } 
                        else if (r % 2 == 0 && c % 2 != 0) 
                        {
                            if(c == c_aux_bajo || c == c_aux_alto)
                                matriz[r][c] = "1";
                            else
                                matriz[r][c] = Integer.toString(
                                Integer.parseInt(matriz[r-1][c-1]) +
                                Integer.parseInt(matriz[r-1][c+1])
                                );
                        }
                    }
                    c_aux_bajo--;
                    c_aux_alto++;
                }
            }
            else
            {
                for(int r = 0; r < _size ; r++)
                {
                    for(int c = c_aux_bajo; c <= c_aux_alto; c++)
                    {                        
                        if(r % 2 != 0 && (c == 0 || c % 2 != 0))
                        {
                            if(c == c_aux_bajo || c == c_aux_alto)
                                matriz[r][c] = "1";
                            else //sumamos el anterior de la izquierda con el anterior de la derecha
                                matriz[r][c] = Integer.toString(
                                Integer.parseInt(matriz[r-1][c-1]) +
                                Integer.parseInt(matriz[r-1][c+1])
                                );
                        } 
                        else if (r % 2 == 0 && c % 2 == 0) 
                        {
                            if(c == c_aux_bajo || c == c_aux_alto)
                                matriz[r][c] = "1";
                            else
                                matriz[r][c] = Integer.toString(
                                Integer.parseInt(matriz[r-1][c-1]) +
                                Integer.parseInt(matriz[r-1][c+1])
                                );
                        }
                    }
                    c_aux_bajo--;
                    c_aux_alto++;
                }
            }
    }
    
    public String[][] getTable()
    {
        return matriz;
    }
}
