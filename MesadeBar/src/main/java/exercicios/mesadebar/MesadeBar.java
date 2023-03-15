/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.mesadebar;

/**
 *
 * @author allan
 */
//Criar uma projeto para Pedido Mesa de Bar.
//
//Criar uma Classe para Cadastrar Pedido, com 5 atributos; Desses 5 atributos pelo menos 1 deverá ser Valor;
//A Classe deverá conter métodos para definir cada 1 dos 5 atributos;
//
//Na classe Principal do Solicitar o Cadastro de 5 pedidos; 
//
//Na Classe Principal Retornar 1 Mensagem destacando o Total dos 5 pedidos;



public class MesadeBar {
     public static void main(String[] args) {
     Pedido Mesa1= new Pedido();
     Mesa1.numeromesa="01";
     Mesa1.pedido=100;
     Mesa1.produto="Cerveja";
     Mesa1.quantidade="6";
     Mesa1.valor=85.00;
   
     Pedido Mesa2= new Pedido();
     Mesa2.numeromesa="02";
     Mesa2.pedido=45;
     Mesa2.produto="Combo de Whisky";
     Mesa2.quantidade="1";
     Mesa2.valor=750.00;
     
     Pedido Mesa3= new Pedido();
     Mesa3.numeromesa="03";
     Mesa3.pedido=232;
     Mesa3.produto="Energético";
     Mesa3.quantidade="8";
     Mesa3.valor=96.00;
     
     Pedido Mesa4= new Pedido();
     Mesa4.numeromesa="04";
     Mesa4.pedido=567;
     Mesa4.produto="Vodka";
     Mesa4.quantidade="1";
     Mesa4.valor=200.00;
     
     Pedido Mesa5= new Pedido();
     Mesa5.numeromesa="05";
     Mesa5.pedido=978;
     Mesa5.produto="Água";
     Mesa5.quantidade="4";
     Mesa5.valor=48.00;     
    
    double total= Mesa1.valor+Mesa2.valor+Mesa3.valor+Mesa4.valor+Mesa5.valor;
       System.out.println("Valor total dos pedidos R$:" +total+"0");
     
    
     }
}

