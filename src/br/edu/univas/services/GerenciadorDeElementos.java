package br.edu.univas.services;

import br.edu.univas.models.Triangulo;
import br.edu.univas.models.Circulo;
import br.edu.univas.models.Quadrilatero;

public class GerenciadorDeElementos {
	
	public void obterInformacoes(Triangulo triangulo) {
		System.out.println("Triângulo: " + "\n"
							+ "Perímetro: " + triangulo.getPerimetro() + "\n"
							+ "Área: " + triangulo.getArea() + "\n"
							+ "Classificação: " + triangulo.getClassificacao());
	}
	
	public void obterInformacoes(Quadrilatero quadrilatero) {
		System.out.println("Quadrilatero: " + "\n"
				+ "Perímetro: " + quadrilatero.getPerimetro() + "\n"
				+ "Área: " + quadrilatero.getArea() + "\n"
				+ "Classificação: " + quadrilatero.getClassificacao());
	}
	
	public void obterInformacoes(Circulo circulo) {
		System.out.println("Circulo: " + "\n"
							+ "Perímetro: " + circulo.getPerimetro() + "\n"
							+ "Área: " + circulo.getArea() + "\n"
							+ "Raio: " + circulo.getRaio());
	}
	
}