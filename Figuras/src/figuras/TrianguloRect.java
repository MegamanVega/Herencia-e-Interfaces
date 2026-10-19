
package figuras;

/**
 *
 * @author Aliceur
 */
public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (double) (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        super.imprimeFigura();
        return String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f", 
                alto, ancho, calcularArea(), calcularPerimetro());
    }
}
