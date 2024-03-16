package proyecto_1;

/**
 *
 * @author pabloispache
 */
class NodoArbol {
    /*se crea dato de tipo objeto, nodo izquierdo y derecho para utilizarlo
    posterior al crear el arbol*/
    
    /*Creamos una variable tipo dato para almacenar*/
    Object dato;
    
    /*Creamos una hijo izquierdo en el arbol*/
    NodoArbol izquierdo;
    
    /*Creamos una hijo derecho en el arbol*/
    NodoArbol derecho;
    
    /*Creamos nuestro constructor*/
    public NodoArbol(Object dato){
        this.dato=dato;
        this.izquierdo=null;
        this.derecho=null;
    }
}
