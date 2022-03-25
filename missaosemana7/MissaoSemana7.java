package missaosemana7;

public class MissaoSemana7 {

    public static void main(String[] args) {
        
        
        /* 
        OBS: Sei que copiar trecho de código não é uma boa prática, mas não
        consegui pesquisar a tempo, uma forma de otimização. Nas próximas serão
        Melhores!        
        */
    
     Empregado EmpregadoJoao = new Empregado("João", "Silva", 1000.0f);
         
    System.out.println("Olá, " + EmpregadoJoao.getPrimeiroNome() + " " +
            EmpregadoJoao.getSobrenome()); 
    System.out.println();
    System.out.println("Atualmente, você recebe por mês: R$ " + 
            EmpregadoJoao.getSalarioMensal() + " E Esse é o seu salário Anual: R$ " + 
            EmpregadoJoao.CalcularSalarioAnual() );
     System.out.println();
    System.out.println("Mas, temos um ÓTIMA notícia para vocês!");
    System.out.println();    
    System.out.println("Você acabou de ganhar um aumento salarial de 10%"); 
    System.out.println();
    System.out.println("E seu novo Salário Anual é de " +
            EmpregadoJoao.AumentarSalarioAnual());
    System.out.println();
    System.out.println("PARABÉNS! " + EmpregadoJoao.getPrimeiroNome() + " " +
            EmpregadoJoao.getSobrenome() );
    
  System.out.println();
  System.out.println("==============================");
  System.out.println();  
  
  
  Empregado EmpregadoAna = new Empregado("Ana", "Silva", 2000.0f);
         
    System.out.println("Olá, " + EmpregadoAna.getPrimeiroNome() + " " +
            EmpregadoAna.getSobrenome()); 
    System.out.println();
    System.out.println("Atualmente, você recebe por mês: R$ " + 
            EmpregadoAna.getSalarioMensal() + " E Esse é o seu salário Anual: R$ " + 
            EmpregadoAna.CalcularSalarioAnual() );
     System.out.println();
    System.out.println("Mas, temos um ÓTIMA notícia para vocês!");
    System.out.println();    
    System.out.println("Você acabou de ganhar um aumento salarial de 10%"); 
    System.out.println();
    System.out.println("E seu novo Salário Anual é de " + 
            EmpregadoAna.AumentarSalarioAnual());
    System.out.println();
    System.out.println("PARABÉNS! " + EmpregadoAna.getPrimeiroNome() + " " +
            EmpregadoAna.getSobrenome() );
    
 

    }

}
