
package teste;

import java.util.*;
//Exemplo de média com 2 notas
public class ExemploMedia2 {
    
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double nota1;
        double nota2;
       
        
        System.out.println("Digite a primeira nota : ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota : ");
        nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2) / 2;
            System.out.println("Média = "+ media);
        

 if (media >=9) {
            System.out.println("Excelente");
        } else if (media >= 8){
            System.out.println("Ótimo");
        } else if (media >= 7){
            System.out.println("Bom");
        } else {
            System.out.println("Recuperação"); 
        }
      
}
}