package cl.iplacex.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void sumaCorrecta() {
        Calculadora c = new Calculadora();
        assertEquals(5, c.sumar(2, 3));
    }

    @Test
    public void restaCorrecta() {
        Calculadora c = new Calculadora();
        assertEquals(1, c.restar(3, 2));
    }
}
