
public class Empresa {
	protected String nome;
	protected String endereço;
	protected String cidade;
	protected String estado;
	protected int CEP;
	protected int telefone;

//methods get and set
public void setNome( String nome) {
	this.nome = nome;
}
public String getNome() {
	return nome;
}
public void setEndereço( String endereço) {
	this.endereço = endereço;
}
public String getEndereço() {
	return endereço;
}
public void setCidade( String cidade) {
	this.cidade = cidade;
}
public String getCidade() {
	return cidade;
}
public void setEstado( String estado) {
	this.estado = estado;
}
public String getEstado() {
	return estado;
}
public void setCEP( int CEP) {
	this.CEP = CEP;
}
public int getCEP() {
	return CEP;
}
public void setTelefone( int telefone) {
	this.telefone = telefone;
}
public int getTelefone() {
	return telefone;
}
//method to show the attributes
public void MostrarAtributos() {
	System.out.println("Nome da empresa: "+nome);
	System.out.println("Endereço da empresa: "+endereço);
	System.out.println("Cidade: "+cidade);
	System.out.println("Estado: "+estado);
	System.out.println("CEP: "+CEP);
	System.out.println("Telefone para contato: "+telefone);
}
	
}
