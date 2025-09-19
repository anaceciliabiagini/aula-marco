package application.lista;

public class ListaSimples {
    private Node head;
    private int tamanho;

    public ListaSimples() {
        this.head = null;
        this.tamanho = 0;
    }

    public void adicionar(String valor) {
        Node novo = new Node(valor);

        if (this.head == null) {
            this.head = novo;
        } else {
            Node atual = this.head;
            while (atual.getProximo() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }

        tamanho++;
    }

    public String toString(){
        String resultado = "";

        if(this.head != null){
            Node atual = this.head;
            do{
                resultado += atual.getValor() + " ";
                atual = atual.getProximo();
            } while (atual != null);
        }
        
        return resultado;
    }

}