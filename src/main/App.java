package main;

import java.math.BigDecimal;

import imposto.CalculadoraImpostos;
import imposto.ISS;
import orcamentoVenda.Orcamento;

public class App {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        BigDecimal valor = calculadora.calcular(orcamento, new ISS());

        System.out.println(valor);
    }

}
