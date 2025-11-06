public class quadrado {
    //Toda*classe terá atributos e métodos
    //Atributos são as características (variáveis)
    //Métodos são as ações(funções)
    //Classificamos esses métodos de acordo com 
    //as suas características:
    //Método Construtor: Quando for instanciado um novo objeto, ele será 'construído' conforme
    //definido no método construtor
//Métodos get e set:
//get(pegar) -> utilizando para ver qual o valor atual do atributo.
//set(colocar) -> insere/altera o valor do atributo
//Métodos 'próprios': Métodos que criamos para dar mais ações para e nossa classe.

//Atributos de classe quadrado:
double lado;
double area;
double perímetro;

  // metodos
    // método construtor
    public quadrado(double lado) {
        this.lado = lado;
        this.area = calcularArea2();
    }

    // metodo proprios
    // calcular separado
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    // calcular no contrudor
    public double calcularArea2() {
        return this.lado * this.lado;
    }

    public void calcularPerimetro() {
        this.perímetro = this.lado * 4;
    }

    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perímetro);
    }

}