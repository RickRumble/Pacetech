algoritmo "Missão Semana 5"

var
temperatura: vetor [1..4] de real
hora: vetor [1..4] de real
i, j: inteiro
aux1, aux2 : real
tempCelsius, tempFahrenheint : Real
menu : literal

procedimento escolhertemperatura(): inteiro
inicio
     Escreval ("Conversor de Temperatura")
     Escreval ()
     escreval (" 1) Converter Celsius para Fahrenheint")
     Escreval ()
     escreval (" 2) Converter Fahrenheint para Celsius")
     Escreval ()
     escreval (" 3) sair")
     leia (menu)

fimprocedimento

Procedimento registrar ()
inicio

para i de 1 ate 4 faca
       Escreval ("Qual a temperatura nesse momento", i,"?")
       Escreval ()
       Leia(temperatura[i])
       Escreval ()
       Escreval ("Qual a hora do registro da temperatura?")
       Leia (hora[i])
       Escreval ()
fimpara
fimprocedimento

procedimento converter()
inicio
ordenar ()
Escreval ()
se menu = 1 entao
   para i de 1 ate 4 faca
   escreval("Temperatura", temperatura[i], "graus Celsius, registrada às", hora[i], "h corresponde a ", ((temperatura[i] * 1.8) + 32):4:2, "Fahrenheint")
   fimpara
   Escreval ()
senao
    para i de 1 ate 4 faca
    escreval("Temperatura", temperatura[i], "graus Fahrenheint, registrada às", hora[i], "h corresponde a ", ((temperatura[i] * 1.8) + 32):4:2, "graus Fahrenheint")
    fimpara
fimse
fimprocedimento

procedimento ordenar() : inteiro
inicio
para i de 1 ate 4 faca
     para j de 1 ate 4 faca
      se (temperatura [j] > temperatura [i]) entao
      aux1 <- temperatura [i]
      temperatura [i] <- temperatura [j]
      temperatura [j] <- aux1
      aux2 <- hora [i]
      hora[i] <- hora [j]
      hora [j] <- aux2
      fimse
     fimpara
fimpara
fimprocedimento

inicio
Escreval ("==== Sistema de converção Fácil ====")
repita
   escolhertemperatura()

   escolha menu
      caso "1"
         registrar()
         converter()
      caso "2"
         registrar()
         converter()
      caso "3"
      outrocaso
         escreval()
         escreval("Opção inválida.")
   fimescolha
   Escreval ()
ate menu = "3"
Escreval ()
Escreval ("Obrigado por usar nosso conversor!")

fimalgoritmo
