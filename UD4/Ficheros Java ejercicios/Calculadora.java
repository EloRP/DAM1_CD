package Ejercicios;

public class Calculadora {
    public double calcularPrecioFinal(double precioBase, int cantidad, boolean esPremium) {
        double precioFinal = precioBase * cantidad;
        
        if (esPremium) {
            precioFinal = getPrecioFinal(precioFinal, 0.9);
        } else {
            precioFinal = getPrecioFinal(precioFinal, 1.1);
        }

        if (cantidad > 100) {
            precioFinal = getPrecioFinal(precioFinal, 0.95);
        }

        precioFinal = precioNegativo(precioFinal);

        return precioFinal;
    }

    private double precioNegativo(double precioFinal) {
        if (precioFinal < 0) {
            precioFinal = 0;
        }
        return precioFinal;
    }

    private double getPrecioFinal(double precioFinal, double porcentaje) {
        precioFinal = precioFinal *= porcentaje;
        return precioFinal;
    }

}
