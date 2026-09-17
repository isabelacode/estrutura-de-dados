package aulas.listas;

public interface ListaAPI<T> {
        public void adiciona(T elemento);
        public void adiciona(T elemento, int pos);
        public T pega(int pos);
        public T remove(int pos);
        public boolean contem(T elemento );
        public int tamanho();
}
