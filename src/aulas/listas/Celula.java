package aulas.listas;

public class Celula<T> {

    private T elemento;
    private Celula<T> proxima;

    public Celula(T elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula<T> proxima, T elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public Celula<T> getProxima() {
        return proxima;
    }

    public void setProxima(Celula<T> proxima) {
        this.proxima = proxima;
    }
}