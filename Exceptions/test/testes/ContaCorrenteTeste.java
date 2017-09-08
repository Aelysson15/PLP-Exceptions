package testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercicio.ContaCorrente;
import org.junit.Test;

/**
 *
 * @author aelysson
 */
public class ContaCorrenteTeste {
    
    @Test
    public void realizaDeposito() throws exercicio.IllegalArgumentException, Exception{
        ContaCorrente cc = new ContaCorrente();
        try {
            float valor = 10;
            float saldo;
            saldo = 100;
            
            cc.depositar(valor);
            
        } catch (IllegalArgumentException e) {
            System.err.println("erro " + e.getMessage());
        }
        try {
            float valor = 10;
            float saldo = 100;
            
            cc.sacar(valor);
        } catch (IllegalArgumentException e) {
            System.err.println("erro " + e.getMessage());
        }
        try {
            cc.setValorLimite(100);
        } catch (IllegalArgumentException e) {
            System.err.println("erro " + e.getMessage());
        }
    }
}
