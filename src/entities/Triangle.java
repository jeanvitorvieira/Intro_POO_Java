//pacote da classe
package entities;

//classe Triangle define o tipo
public class Triangle {
    //atributos da classe (static)
    //public: pode ser usado em outros arquivos
    public double a;
    public double b;
    public double c;

    //método da classe/função
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
