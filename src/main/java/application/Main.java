package application;

import application.lista.ListaSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista);
    }
}