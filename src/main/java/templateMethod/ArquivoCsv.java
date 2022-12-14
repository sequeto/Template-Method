package templateMethod;

public class ArquivoCsv extends Arquivo{    
	public String extrairDados() {
		return "Dados Extraídos do CSV " + this.name + ".";
	}
	
}
