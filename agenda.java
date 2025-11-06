package Contatos;

import java.util.ArrayList;

public class agenda {
    
    private ArrayList<contato> contatos = new ArrayList<>();
        this.contatos.add(contato);
}

public void removerContatos(contato contato){
    this.contatos.remove(contato);
}

public int encontrarContato(String nome){
    for(int i = 0; i < contatos.size(); i++){
        if (contatos.get(i).get_nome ().equals(nome){

            }            
        }return -1;
    }

    public void imprimirContatos(){
        System.out.println(x:"======INICIO======");
        for(contato contato : contatos){ //para cada contato dentro de contatos
            contato.imprimeInformacoes();
            System.out.println(x:"");    
        }
        System.out.println(x: "========FIM=======");
    }

    public void imprimecontato(int posicao){
        this.contatos.get(posicao).imprimeInformacoes();
    }
    
 
