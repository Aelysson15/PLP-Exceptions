/**
 * 
 */
package exercicio;
import junit.framework.*;
/**
 * @author aelysson
 *
 */
public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;
    private float valor;

    public ContaCorrente(float limite, float saldo, float valorLimite, float valor) {
        this.limite = limite;
        this.saldo = saldo;
        this.valorLimite = valorLimite;
        this.valor = valor;
    }

    public ContaCorrente() {
        
    }

    public void depositar (float valor) throws IllegalArgumentException{
        valor += valor;
        System.err.println("Deposito realizado");
        
    }
    public void sacar(float valor) throws IllegalArgumentException{
        if (valor <= this.saldo) {
            saldo -= valor;
            System.err.println("Saque realizado");
        } else {
            System.err.println("Saldo insuficiente");
        }
    }

    public void setValorLimite(float valor) throws Exception {
            this.valor = valor;
    }
}
