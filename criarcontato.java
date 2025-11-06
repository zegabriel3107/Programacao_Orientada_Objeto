package Contatos;

public class Criarcontato {

    public static void main(String[] args){

    contato contato1= new contato(
    _"Mininu ney",
    _ "ney@email.com",
     "(11) 91234-4321"
    );

    contato contato2 = new contato(
    _nome:"BATIMA",
    _email: "bat@mail.com",
    _telefone: "(bat)fone"
    );

     contato contato3 = new contato(
    _nome:"lambarildo",
    _email: "pescador_lambarildo@email.com",
    _telefone: "(69) 99876-5432"
    );

    contato contato4 = new contato(
    _nome:"gabriel",
    _email: "gabriel@email.com",
    _telefone: "11111-1111");

    contato1.imprimeInformacoes();
}
}
