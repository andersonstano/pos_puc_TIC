/*
 * Web service genérico
 */
package primeNumbers;

import javax.jws.WebService;

/**
 *
 * @author andersonstano
 */

@WebService(serviceName = "WS_PrimeNumbers")
public class WS_PrimeNumbers {

    //checa se um dado número é primo e retorna um boolean
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
