package it.unical.ingsw2020.testLaboratorio.TestLaboratorio;


import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
       MyListUtil ut= new MyListUtil();
       List<Integer> lista = Arrays.asList(2,3,1) ;
       
       System.out.println(ut.getCrescente(lista));
       System.out.println(ut.getDecrescente(lista));
   
    }
}
