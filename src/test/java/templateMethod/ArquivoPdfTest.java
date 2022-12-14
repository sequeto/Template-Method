package templateMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArquivoPdfTest {

	@Test
	public void deveRetonarDadosExtraidos() {
        Arquivo arquivo = new ArquivoPdf();
        arquivo.setName("Clean Code");
        assertEquals("Dados Extraídos do PDF Clean Code.", arquivo.extrairDados());
    }

}
