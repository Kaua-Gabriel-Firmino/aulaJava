
public class classePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classePessoas objetoPessoa1 = new classePessoas();
		classePessoas objetoPessoa2 = new classePessoas();
		
		objetoPessoa1.receberNomeMet("Mel");
		objetoPessoa1.receberRendaMet(15_000);
		
		objetoPessoa2.receberNomeMet("Ryan");
		objetoPessoa2.receberRendaMet(15_000);
		
		objetoPessoa1.mostrarNomeMet();
		objetoPessoa1.mostrarRendaMet();
		
		objetoPessoa2.mostrarNomeMet();
		objetoPessoa2.mostrarRendaMet();
		
		classeFuncionários objetoFuncionario1 =  new classeFuncionários();
		objetoFuncionario1.receberNomeMet("Miguel");
		objetoFuncionario1.receberRendaMet(50_000);
		objetoFuncionario1.cargoAt = "CEO";
	}

}
