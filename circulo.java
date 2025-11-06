public class circulo {
    double lado;
    double area;
    double perímetro;

    public circulo(double lado) {
    this.lado = lado;
    }

    public void calcularArea(){
        this.area = this.lado * this.lado;
    }

    public void perimetro(){
        this.perímetro = this.lado * 4;
    }

}
