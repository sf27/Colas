package bankcliente;

public class Nodo<T> {

    T dato;
    Nodo posSig;

    public Nodo(T elem) {
        dato = elem;
        posSig = null;
    }
}
