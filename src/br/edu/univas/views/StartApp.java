package br.edu.univas.views;

import br.edu.univas.models.*;
import br.edu.univas.services.GerenciadorDeElementos;

public class StartApp {

	public static void main(String[] args) {
		
		GerenciadorDeElementos gerenciador = new GerenciadorDeElementos();
		Triangulo equilatero = new Triangulo(10.0, 10.0, 10.0);
		Triangulo isosceles = new Triangulo(10.0, 10.0, 13.0);
		Triangulo escaleno = new Triangulo(12.0, 11.0, 13.0);
		Circulo circulo = new Circulo(2.5);
		Quadrilatero quadrado = new Quadrilatero(2.0, 2.0, 2.0, 2.0);
		Quadrilatero retangulo = new Quadrilatero(3.0, 2.0, 3.0, 2.0);
		gerenciador.obterInformacoes(equilatero);
		gerenciador.obterInformacoes(isosceles);
		gerenciador.obterInformacoes(escaleno);
		gerenciador.obterInformacoes(circulo);
		gerenciador.obterInformacoes(quadrado);
		gerenciador.obterInformacoes(retangulo);
	}

}