package imposto;

import java.math.BigDecimal;

import orcamentoVenda.Orcamento;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
