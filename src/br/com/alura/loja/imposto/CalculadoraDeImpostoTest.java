package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.math.BigDecimal;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculadoraDeImpostoTest {

    private CalculadoraDeImposto calculadoraDeImposto;

    @BeforeAll
    void setup() {
        calculadoraDeImposto = new CalculadoraDeImposto();
    }

    @Test
    public void calculaValorImpostoQuandoRecebeICMSComoTipoImposto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        BigDecimal impostoCalculado = calculadoraDeImposto.calcular(orcamento, new ICMS());
        Assertions.assertEquals(new BigDecimal("10.0"), impostoCalculado);
    }

    @Test
    public void calculaValorImpostoQuandoRecebeISSComoTipoImposto() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        BigDecimal impostoCalculado = calculadoraDeImposto.calcular(orcamento, new ISS());
        Assertions.assertEquals(new BigDecimal("6.00"), impostoCalculado);
    }

}