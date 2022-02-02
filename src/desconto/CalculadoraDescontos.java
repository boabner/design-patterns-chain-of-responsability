package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoValorItens(
                new DescontoQuantidadeItens(new SemDesconto())
        );

        return desconto.calcular(orcamento);
    }

}
