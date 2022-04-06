package missaosemana7;

public class Empregado {

    private String PrimeiroNome;
    private String Sobrenome;
    private float SalarioMensal;
    private float SalarioAnual;
 
    

    public Empregado(String PrimeiroNome, String Sobrenome, float SalarioMensal) {
        this.PrimeiroNome = PrimeiroNome;
        this.Sobrenome = Sobrenome;
        this.SalarioMensal = SalarioMensal;
    }
   
    public float CalcularSalarioAnual (){
       float SalarioAnual = SalarioMensal * 12;
       return SalarioAnual;
    }
    
    public float AumentarSalarioAnual(){
        float SalarioPlus = (SalarioMensal*1.1f)*12;
        return SalarioPlus;        

    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public void setPrimeiroNome(String PrimeiroNome) {
        this.PrimeiroNome = PrimeiroNome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public float getSalarioMensal() {
        return SalarioMensal;
    }

    public void setSalarioMensal(float SalarioMensal) {
        if (SalarioMensal < 0) {
            this.SalarioMensal = 0;
            } else {
            this.SalarioMensal = SalarioMensal;
        } 

    }

}
