/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import newpackage.Cuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import newpackage.*;

/**
 *
 * @author marina.burgut
 */
public class CuentaTest {
    
    private Cuenta cuenta;

    @BeforeEach
    void inicializarCuenta() {
        cuenta = new Cuenta("ES21099865462528660871295", 100);
    }
    //LOS MÉTODOS NO SE PRUEBAN EN ESTE ORDEN, SINO EN ORDEN ALFABÉTICO
    @Test
    void testGetSaldo() {
        float saldo = cuenta.getSaldo();
        assertEquals(500, saldo);
    }

    @Test
    void testSetSaldo() {
        cuenta.setSaldo(100);
        assertEquals(100, cuenta.getSaldo());
    }

    @Test
    void testIngresarDinero() {
        cuenta.ingresarDinero(400);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    void testExtraerDinero() {
        try {
            cuenta.extraerDinero(120); // Intentamos extraer más dinero del saldo disponible
            fail("ERROR. Se debería haber lanzado una excepción al resultar un saldo negativo");
        } catch (ArithmeticException ae) {
            // Prueba correcta: se lanzó la excepción esperada
            System.out.println("Prueba correcta: se lanzó la excepción esperada debido a saldo negativo");
        }
    }
}