package proyecto_1;

/**
 *
 * @author cesar
 */
public class Pila_Arbol {

    int Longitud_cadenas;
    char[] Cadena;
    int contador;

    //Necesito usar POO para llamar a mi pila cuantas veces
    //lo necesite por ende
    Pila_Arbol(int longitud){
        this.Longitud_cadenas=longitud;
        this.Cadena=new char [longitud];
        this.contador=0;
    }
    //Necesito realizar un push para  validar la longitud
    public boolean push(char dato){
        if(contador<Longitud_cadenas){
            Cadena[contador++]=dato;
            return true;
        }
        return false;
    }
    
    //extarer un elemento de mi pila si el contador es < o igual a 0
    //Para valaidar
    public char pop(){
        if(contador<=0)
            return 0;
            return Cadena[--contador];
        
    }
    
    //Validar si colocamos muchos signos distintos sin sentido
    public char nextPop(){
        if(contador<=0)
            return 0;
        return Cadena[contador-1];
    }
    
    
}
