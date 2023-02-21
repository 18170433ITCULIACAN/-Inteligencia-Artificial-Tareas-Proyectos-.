package Unidad1;


public class Arbol {
    
    Nodo RAIZ;
  
    public static void main (String a[]){
        Arbol arbol = new Arbol();
        arbol.INSERTAR(30);
        arbol.INSERTAR(40);
        arbol.INSERTAR(85);
        arbol.INSERTAR(65);
        arbol.INSERTAR(20);
        arbol.INSERTAR(30);
        System.out.println("");
        arbol.POSTORDEN();
    }
    
    public boolean VACIO(){
        return RAIZ==null;
    }
    
    
    public void INSERTAR(int VALOR) {
        Nodo ND = new Nodo();
        ND.SETVALOR(VALOR);
        if (VACIO()) {
            RAIZ = ND;
        } else {
            this.INSERTAR(this.RAIZ, VALOR);
        }
    }
    
    private void INSERTAR(Nodo PADRE, int VALOR) {
        if (VALOR > PADRE.GETVALOR()) {
            if (PADRE.GETHIJO_DERECHO() == null) {
                Nodo ND = new Nodo();
                ND.SETVALOR(VALOR);
                PADRE.SETHIJO_DERECHO(ND);
            } else {
                this.INSERTAR(PADRE.GETHIJO_DERECHO(), VALOR);
            }
        } else {
            if (PADRE.GETHIJO_IZQUIERDO() == null) {
                Nodo ND = new Nodo();
                ND.SETVALOR(VALOR);
                PADRE.SETHIJO_IZQUIERDO(ND);
            } else {
                this.INSERTAR(PADRE.GETHIJO_IZQUIERDO(), VALOR);
            }
        }
    }
    
     private void POSTORDEN(Nodo ND) {
        if (ND != null) {
        	POSTORDEN(ND.GETHIJO_IZQUIERDO());
        	POSTORDEN(ND.GETHIJO_IZQUIERDO());
            ND.IMPRIMIR();
        }
    }
       public void POSTORDEN() {
        this.POSTORDEN(this.RAIZ);
    }

    
    
}
