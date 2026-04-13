package newpackage;

/**
 * Clase que simula una cuenta bancaria
 * @author marina.burgut
 * @version 1.0
 */

public class Cuenta {
    private String numero;
    private float saldo;
    
    //Cambio en el código para ver qué pasa!!!!!//

    /**
     * Constructor de la clase cuenta
     * @param numCta es el número de cuenta
     * @param saldoCta es el saldo que hay en la cuenta
     */
    public Cuenta(String numCta, float saldoCta) {
        // Número de la cuenta bancaria
        // Saldo de la cuenta bancaria en euros
        this.numero = numCta;
        this.saldo = saldoCta;
    }

    /**
     * Método para obtener el número de cuenta
     * @return numero de cuenta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método para obtener el saldo disponible
     * @return saldo actual de la cuenta 
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Método para asginar el número de cuenta
     * @param numCta número de cuenta
     */
    public void setNumero(String numCta) {
        this.numero = numCta;
    }

    /**
     * Método para saber el saldo de la cuenta
     * @param saldoCta saldo de la cuenta
     */
    public void setSaldo(float saldoCta) {
        this.saldo = saldoCta;
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param importe importe de la cuenta
     */
    public void ingresarDinero(float importe) {
         if ((saldo - importe) < 0) {
            throw new java.lang.ArithmeticException("Saldo negativo");
        } else {
            saldo = saldo - importe;
        }
    }

    /**
     * Método para extrer dinero de la cuenta
     * @param importe importe de la cuenta
     */
    public void extraerDinero(float importe) {
         if ((saldo - importe) < 0) {
            throw new java.lang.ArithmeticException("Saldo negativo");
        } else {
            saldo = saldo - importe;
        }
    }

    /**
     * Método para mostrar cuenta
     */
    public void mostrarCuenta() {
        System.out.println("N° cuenta: " + getNumero());
        System.out.println("Saldo: " + getSaldo() + " €");
    }
}
