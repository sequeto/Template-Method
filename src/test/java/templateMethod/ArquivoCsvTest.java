package templateMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArquivoCsvTest {
	
	@Test
	public void deveRetonarDadosExtraidos() {
        Arquivo arquivo = new ArquivoCsv();
        arquivo.setName("Planilha de Vendas");
        assertEquals("Dados Extraídos do CSV Planilha de Vendas.", arquivo.extrairDados());
    }
}
