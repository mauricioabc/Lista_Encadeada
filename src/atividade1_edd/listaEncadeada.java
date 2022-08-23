package atividade1_edd;

public class listaEncadeada {
    private Nodo lista;
    private int totalElementos;
    
    public listaEncadeada (){ // criação da lista
    this.lista = null; // lista vazia   
    this.totalElementos = 0;
    }    

    public void insereInicio(Nodo novoNodo){
        if (this.lista != null) { // lista possui elementos
            novoNodo.setProximo(this.lista);
            this.lista = novoNodo;
        } else { // está vazia
            this.lista = novoNodo;
        }
        this.totalElementos++;
    }
    
        public void removeInicio(){
        if (this.lista == null) { // lista vazia
            System.out.println("Lista vazia!");
        } else { // possui elemento
            this.lista = this.lista.getProximo();
            this.totalElementos--;
        }
    }
    
    public void insereFinal(Nodo novoNodo){
        if (this.lista == null) {// lista vazia
            this.lista = novoNodo;
        } else  { // possui elemento
            Nodo aux = this.lista;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novoNodo);
        }
        this.totalElementos++;
    }    
    
    public void removeFinal(){
        if (this.lista == null) { // lista vazia
            System.out.println("Lista vazia!");
        } else { // possui elemento
            if (this.totalElementos == 1) {
                this.lista = null;
            } else  {
            Nodo aux = this.lista;
            Nodo anterior = this.lista;
            while (aux.getProximo() != null){
                anterior = aux;
                aux = aux.getProximo();
            }
            anterior.setProximo(null);
                }
            } 
        this.totalElementos--;
        }
    
    public Nodo acesso(int posicao){ //tarefa - 4/2=2
        Nodo nodoRetornado = null;
        if (this.lista == null) { // lista vazia
            System.out.println("Lista vazia!");
        } else { // possui elemento
            if (posicao <= this.totalElementos) {
                Nodo aux = this.lista;
                for (int i = 1; i < posicao; i++) {
                    aux = aux.getProximo();
                }
                nodoRetornado = aux;
                nodoRetornado.setProximo(null);
           }
        }
       return nodoRetornado; //não achou o elemento
    }
    
    
    
    public void insereMeio(Nodo novoNodo){ 
        if (this.lista == null) { //lista vazia   
          insereInicio(novoNodo);  
        } else {                  
            if (this.totalElementos >= 2) {
                int meio = this.totalElementos / 2;
                Nodo aux = this.lista;
                for (int i = 1; i < meio; i++) {
                    aux = aux.getProximo();
                }
                novoNodo.setProximo(aux.getProximo());
                aux.setProximo(novoNodo);
                this.totalElementos++;
            } else  {
                insereFinal(novoNodo);
            }
        }
    }

    public void removeMeio(){
        if (this.lista == null) { // lista vazia
            System.out.println("Lista vazia!");
        } else { // possui elemento
                int meio = this.totalElementos / 2;
                Nodo aux = this.lista;
                Nodo anterior = this.lista;
                for (int i = 1; i < meio; i++) {
                     anterior = aux;
                     aux = aux.getProximo();
                }
                     anterior.setProximo(aux.getProximo());
            } 
        this.totalElementos--;
    }
    
    public boolean pesquisa(int chave){
        boolean status = false;
        if (this.lista == null) { // lista vazia
            System.out.println("Lista vazia!");
        } else { // possui elemento
            if (chave <= this.totalElementos) {
                Nodo aux = this.lista;
                for (int i = 1; i < chave; i++) {
                    aux = aux.getProximo();
                }
                status = true;
           }
        }
       return status; //não achou o elemento
    }   

    @Override
    public String toString() {
        return "listaEncadeada{" + "lista=" + lista + ", totalElementos=" + totalElementos + '}';
    }
    
}

   

