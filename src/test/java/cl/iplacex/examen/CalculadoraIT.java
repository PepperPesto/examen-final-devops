package cl.iplacex.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraIT {

    @Test
    public void flujoCompletoSumaYResta() {
        Calculadora c = new Calculadora();
        int resultadoSuma = c.sumar(10, 5);
        int resultadoFinal = c.restar(resultadoSuma, 5);
        assertEquals(10, resultadoFinal);
    }
}
