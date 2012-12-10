package bankcliente;

public class Cola<T> {

    Nodo<T> frente;
    Nodo<T> fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public void insertar(T elem) {
        Nodo<T> nuevoNodo = new Nodo<T>(elem);
        if (vacia()) {
            fin = nuevoNodo;
            frente = fin;
        } else {
            fin.posSig = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public void insertar(Nodo<T> n) {
        if (vacia()) {
            fin = n;
            frente = fin;
        } else {
            fin.posSig = n;
            fin = n;
        }
    }

    public boolean vacia() {
        return ((frente == null) && (fin == null));
    }

    public Nodo<T> nodoCabecera() {
        return frente;
    }

    public Nodo<T> quitar() {
        Nodo<T> x = frente;
        if (!vacia()) {
            frente = frente.posSig;
        }
        if (frente == null) {
            fin = null; // cumple condicion de cola vacia
        }
        return x;
    }

    public T obtener(int pos) {
        T data = null;
        int cont = 0;
        Nodo<T> p = frente;
        while (p != null) {
            if (pos == cont) {
                data = p.dato;
                break;
            }
            cont++;
            p = p.posSig;
        }
        return data;
    }

    public boolean contiene(T element) {
        boolean aux = false;
        Nodo<T> p = frente;
        while (p != null) {
            if (element == p.dato) {
                aux = true;
                break;
            }
            p = p.posSig;
        }
        return aux;
    }

    /*
     * Solo se usa 
     */
    public int contieneElement(T element) {
        int pos = 0, cont = 0;
        Nodo<T> p = frente;
        while (p != null) {
            if (element == p.dato) {
                pos = cont;
                break;
            }//if
            cont++;
            p = p.posSig;
        }//while
        return pos;
    }

    public void imprimir() {
        Nodo<T> p = frente;
        while (p != null) {
            System.out.print("| " + p.dato);
            p = p.posSig;
        }
    }

    public int cantidad() {
        int cont = 0;
        Nodo<T> p = frente;
        while (p != null) {
            cont++;
            p = p.posSig;
        }
        return cont;
    }
}
