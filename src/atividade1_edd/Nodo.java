package atividade1_edd;

public class Nodo {
    private int valor;
    private Nodo proximo;
    
    public Nodo(){
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + ", proximo=" + proximo + '}';
    }

}
