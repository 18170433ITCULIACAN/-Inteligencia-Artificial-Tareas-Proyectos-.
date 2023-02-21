package Unidad1;


public class Nodo{
    private int VALOR;
    private Nodo HIJO_DERECHO;
    private Nodo HIJO_IZQUIERDO;
    
    public Nodo(){
    HIJO_DERECHO = null;
    HIJO_IZQUIERDO = null;
    
    }
    
    public void SETHIJO_IZQUIERDO(Nodo AUX) {
    	HIJO_IZQUIERDO = AUX;
    }
    
    public Nodo GETHIJO_IZQUIERDO() {
    
        return HIJO_IZQUIERDO;
    }
    
    public void SETHIJO_DERECHO(Nodo AUX) {
    	HIJO_DERECHO = AUX;
    }
    
    public Nodo GETHIJO_DERECHO() {
    
        return HIJO_DERECHO;
    }
    
    public void SETVALOR(int AUX){
    	VALOR = AUX;
    }
    
    public int GETVALOR(){
        return VALOR;
    }
     public void IMPRIMIR() {
        System.out.println(this.GETVALOR());
    }
}



