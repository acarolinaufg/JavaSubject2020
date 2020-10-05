//This exercise was to use the concepts of class, inheritance, sets and gets

public class mainEmpresa {

public static void main(String [] args) {
	Restaurante r = new Restaurante();
	r.setCEP(75584565);
	r.setCidade("Goiania");
	r.setEndereço("Praça Universitaria, n400");
	r.setEstado("Goias");
    r.setNome("Comida Caseira");
    r.setTelefone(91786215);
    r.setTipoDeComida("Goiana");
    r.setPreço(50.00);
	r.getCEP();
	r.getCidade();
	r.getEndereço();
	r.getEstado();
	r.getNome();
	r.getTelefone();
	r.getTipoDeComida();
	r.getPreço();
	
	r.MostrarAtributos();
	r.ExibeAtributos();
}

}
