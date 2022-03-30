//A sequência de Fibonacci, ou sucessão de Fibonacci,
//é uma sequência matemática composta por números inteiros.
//Normalmente, começa por 0 e 1 e cada termo subsequente é formado
//pela soma dos dois anteriores. Por exemplo, os primeiros 7 termos
//da sequencia são "0, 1, 1, 2, 3, 5 e 8". 
//Proponha um algoritmo em java que calcule os primeiros 20 termos da sequencia.

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;

        System.out.println(num2);
        System.out.println(num1);

        for(int i = 0;i < 18; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
}