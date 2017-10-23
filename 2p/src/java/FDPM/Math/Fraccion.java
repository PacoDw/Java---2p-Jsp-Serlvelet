package FDPM.Math;

/**
 *
 * @author PacoDw
 */
public class Fraccion {
     private int num;
     private int den;
     
  public Fraccion() {
     this.num=0;
     this.den=1;
  }
  public Fraccion(int num, int den) {
     this.num = num;
     this.den = den;
  }
  
  public void setFraccion(int num, int den){
     this.num = num;
     this.den = den;
  }
  
  public static Fraccion getFraccion(int num, int den) {
     return new Fraccion(num, den);
  }
  
  public static Fraccion sumar(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.num=a.num*b.den+b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }
  public static Fraccion restar(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.num=a.num*b.den-b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }
  public static Fraccion multiplicar(Fraccion a, Fraccion b){
     return new Fraccion(a.num*b.num, a.den*b.den);
  }
  public static Fraccion inversa(Fraccion a){
     return new Fraccion(a.den, a.num);
  }
  public static Fraccion dividir(Fraccion a, Fraccion b){
     return multiplicar(a, inversa(b));
  }
  private int mcd(){
     int u=Math.abs(num);
     int v=Math.abs(den);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
  }
  public Fraccion simplificar(){
     int dividir=mcd();
     num/=dividir;
     den/=dividir;
     return this;
  }
     @Override
  public String toString(){
     if(num == den)
         return Integer.toString(num);
     else
        return num+" / "+den;
  }
}