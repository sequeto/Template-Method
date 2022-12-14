package templateMethod;

public abstract class Arquivo {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public abstract String extrairDados();
	
	public void visualizarDadosExtraidos() {
		System.out.println(this.extrairDados());
	}
}
