import java.util.Scanner;

import meio_pagamento.Pagamento;




public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Pagamento  pagamento = new Pagamento(a, b, c);

        pagamento.calcular(a, b, c);
        
        pagamento.valorMaior(pagamento.getAux());

        sc.close();
    }
}
