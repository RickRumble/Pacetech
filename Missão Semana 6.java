package missao6v2;
import java.util.Scanner;

public class Missao6v2 {


    public static void main(String[] args) {
    
          Scanner leitor = new Scanner(System.in);     
        
          String menu, menutemperatura, menumoeda;
          float temperatura, temperaturaconvertida, cotacaodolar,
                moeda, moedaconvertida;  
        
    System.out.println("Bem-vim ao conversor de Temperatura e Moeda ");
      do{ 
        
        System.out.println();
        System.out.println("====== O que você deseja converter? =====");
        System.out.println();
        System.out.println(" 1 - Converter Temperatura");
        System.out.println();
        System.out.println(" 2 - Converter Moeda");
        System.out.println();
        System.out.println(" 3 - Sair");
        menu = leitor.next();
                
    switch(menu) {
        case "1":
           do{
           System.out.println("1 - Converter Celsius para Fahrenheit");
           System.out.println();
           System.out.println("2 - Converter Fahrenheit para Celsius");    
           System.out.println();
           System.out.println("3 - Sair");
           menutemperatura = leitor.next();
                
         System.out.println();
         
               switch(menutemperatura){
                   case "1":
                       System.out.print("Qual a temperatura em Celsius?");
                       temperatura = leitor.nextFloat();
                       
                       temperaturaconvertida = (temperatura * 1.8f) + 32;
                       System.out.println();
                       System.out.println("Temperatura em Celsius: " + String.format("%.2f",temperatura));
                       System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f",temperaturaconvertida));
                       break;
        
                    case "2":
                      System.out.print("Qual a temperatura em Fahrenheit?");
                       temperatura = leitor.nextFloat();
                       
                       temperaturaconvertida = (temperatura - 32) / 1.8f;
                       System.out.println();
                       System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f",temperatura));
                       System.out.println("Temperatura em Celsius: " + String.format("%.2f",temperaturaconvertida)); 
                       break;    
                    case "3":
                       break;
                    default:
                        System.out.println("Opção inválida, escolha outra opção!");
                        break;
              
              }
           } while ( !(menutemperatura.equals("3")) );
             break;
             
        case "2": 
            System.out.println();
            System.out.print("Qual a cotacao do dolar, nesse momento? ");
            cotacaodolar = leitor.nextFloat();
            
            do{
               System.out.println();
               System.out.println("1 - Converter real para dolar");
               System.out.println("2 - Converter dolar para real");
               System.out.println("3 - Sair");                                
               menumoeda = leitor.next();
    
              switch(menumoeda) {
                 case "1": 
                   System.out.print("Qual o valor de reais: R$");
                   moeda = leitor.nextFloat();
                
                   moedaconvertida = moeda / cotacaodolar;
                System.out.println();
                System.out.println("Valor em reais: R$" + String.format("%.2f",moeda));
                System.out.println("Valor em dolares: $" + String.format("%.2f",moedaconvertida));                                       
                break;
                
                 case"2":
                System.out.println("Qual o valor de dólares: $");
                moeda = leitor.nextFloat();
                moedaconvertida = moeda * cotacaodolar;
                System.out.println();
                System.out.println("Valor em dolares: $" + String.format("%.2f",moeda));
                System.out.println("Valor em reais: R$" + String.format("%.2f",moedaconvertida));
                break;
                
        case"3":
                break;
                default:
                     System.out.println("opção inválida. Tente outra opção!");
                     break;   
                }   
        } while ( !(menumoeda.equals("3")) ); 
            break;
        case"3":
            break;
        default:
           System.out.println("opção inválida. Tente outra opção!");
            break;
        }
        
      } while( !(menu.equals("3")) ); 
            
                
    }
    
}
