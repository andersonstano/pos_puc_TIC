/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primeNumbers;

import javax.jws.WebService;

/**
 *
 * @author adurelli
 */

@WebService(serviceName = "WS_PrimeNumbers")
public class WS_PrimeNumbers {

    public boolean isPrimeNumber(long numero) {
        long i = 2;
        //numeros primos só são divisiveis por 1 e por ele mesmo (no universo dos inteiros)
        while (i < numero) {
            if (numero % i == 0) {
                //não é primo
                return false;
            }
            i++;
        }
        //é primo
        return true;
    }
}
