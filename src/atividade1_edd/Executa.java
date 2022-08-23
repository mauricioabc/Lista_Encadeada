package atividade1_edd;

public class Executa {

    public static void main(String[] args) {
        listaEncadeada lista = new listaEncadeada();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(5);
        novoNodo.setProximo(null);
        lista.insereInicio(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(10);
        novoNodo.setProximo(null);
        lista.insereInicio(novoNodo);
        
        System.out.println(lista.toString());
        
        novoNodo = new Nodo();
        novoNodo.setValor(15);
        novoNodo.setProximo(null);
        lista.insereFinal(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(20);
        novoNodo.setProximo(null);
        lista.insereMeio(novoNodo);
        
        System.out.println(lista.toString());
        
        novoNodo = new Nodo();
        novoNodo.setValor(25);
        novoNodo.setProximo(null);
        lista.insereMeio(novoNodo);
        
        System.out.println(lista.toString());
        
//        System.out.println(lista.acesso(5));
        
        System.out.println(lista.acesso(4));
//        
        System.out.println(lista.pesquisa(5));
//        
//        System.out.println(lista.toString());
//        
        lista.removeMeio();
        System.out.println(lista.toString());
//        
//        lista.removeFinal();
//        System.out.println(lista.toString());
        
    }

}
