package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CalculadoraDeImpostoTest {

    @Test
    public void calculaValorImpostoQuandoRecebeICMSComoTipoImposto() {
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        TipoImposto tipoImposto = TipoImposto.ICMS;
        BigDecimal impostoCalculado = calculadoraDeImposto.calcular(orcamento, tipoImposto);
        Assertions.assertEquals(new BigDecimal("10.0"), impostoCalculado);
    }

    @Test
    public void calculaValorImpostoQuandoRecebeISSComoTipoImposto() {
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        TipoImposto tipoImposto = TipoImposto.ISS;
        BigDecimal impostoCalculado = calculadoraDeImposto.calcular(orcamento, tipoImposto);
        Assertions.assertEquals(new BigDecimal("6.00"), impostoCalculado);
    }


}