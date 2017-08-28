
package calculadora;


public class Trigonometrico extends Calculadora {
    void transformar(){
        operando1=(float)Math.toRadians(operando1);
     
    
}
    
    void seno(){
        transformar();
        resultado=((float)Math.sin(operando1));
    }
    void coseno(){
        transformar();
        resultado=((float)Math.cos(operando1));
    }    
    void tangente(){
        transformar ();
        resultado=((float)Math.tan(operando1));
    }
}
