package it.unical.ingsw2020.testLaboratorio.TestLaboratorio;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {

	private List<Integer> l;
	
	public MyListUtil() {
		l= new ArrayList<Integer>();
	}
	
	List<Integer> getCrescente(List<Integer> lista) {
		l = lista;
		l.sort(null);
		return l;
	}
	
	List<Integer> getDecrescente(List<Integer> lista) {
		l = lista;
		l.sort(null);
		List<Integer> l2 = new ArrayList<Integer>();
		for (int i=l.size()-1; i>=0; i--)
			l2.add(l.get(i));
		return l2;
	}
	

}
