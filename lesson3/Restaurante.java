
public class Restaurante extends Empresa {
	protected String tipoDeComida;
	protected double preço;
	
//methods get and set
public void setTipoDeComida( String tipoDeComida) {
	this.tipoDeComida = tipoDeComida;
}
public String getTipoDeComida() {
	return tipoDeComida;
}

public void setPreço( double preço) {
	this.preço = preço;
}
public double getPreço() {
	return preço;
}

//method to show the attributes
public void ExibeAtributos() {
	System.out.println("Tipo de comida: " +tipoDeComida);
	System.out.println("Preço: " +preço);
}

}
