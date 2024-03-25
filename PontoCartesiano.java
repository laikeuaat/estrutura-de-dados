import java.lang.Math;

public class PontoCartesiano {
    private double pontoX;
    private double pontoY;

    public PontoCartesiano(double pontoX, double pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public double getPontoX() {
        return pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }

    public void setPontoX(double x) {
        pontoX = x;
    }

    public void setPontoY(double y) {
        pontoY = y;
    }

    public double calcular_distancia(PontoCartesiano p) {
        double cateto_a = pontoX - p.pontoX;
        System.out.println(cateto_a);
        double cateto_b = pontoY - p.pontoY;
        System.out.println(cateto_b);
        double distancia = Math.sqrt(Math.pow(cateto_a, 2) + Math.pow(cateto_b, 2));
        return distancia;
    }
}
