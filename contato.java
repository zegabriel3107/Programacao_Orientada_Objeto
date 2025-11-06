public class contato {
    private String _nome, _email, _telefone;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String nome) {
        this._nome = nome;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String email) {
        this._email = email;
    }

    public String get_telefone() {
        return _telefone;
    }

    public void set_telefone(String telefone) {
        this._telefone = telefone;
    }

    public contato(String nome, String email, String telefone) {
        this._nome = nome;
        this._email = email;
        this._telefone = telefone;
    }   

    //Método próprio
    public void imprimeInformacoes(){
        System.out.println("_nome: "+ this._nome);
        System.out.println("_email: "+ this._email);
        System.out.println("_telefone: "+ this._telefone);
        
    }    
    
}