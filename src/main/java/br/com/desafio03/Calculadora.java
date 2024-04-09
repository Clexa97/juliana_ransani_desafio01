package br.com.desafio03;

import java.util.ArrayList;
import java.util.List;
import br.com.desafio03.tipos.Multiplicador;
import br.com.desafio03.tipos.Multiplicando;
import br.com.desafio03.tipos.Resultado;

public class Calculadora {
	
	
	public Integer soma(Integer a, Integer b) {
		return a + b;
	}
	
	public Integer subtracao(String a, Integer b) {
		return Integer.parseInt(a) - b;
	}
	
	
	
	public Resultado multiplicacao(Multiplicador a, Multiplicando b) {
		return new Resultado(a.getY() * b.getX()) ;
		
	}
	public List<Resultado> multiplicacao(Multiplicando b, Multiplicador a) {
		List<Resultado> resultados = new ArrayList<>();
		resultados.add(new Resultado(b.getX() * a.getY()));
		return resultados;
		
	}
	
}
