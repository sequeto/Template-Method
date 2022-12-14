package templateMethod;

public class ArquivoPdf extends Arquivo{
	public String extrairDados() {
		return "Dados Extraídos do PDF " + this.name + ".";
	}
}
