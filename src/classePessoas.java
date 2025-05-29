
public class classePessoas {

	public static void main(String[] args) {
		
		// Atributo: Sempre em baixo da class
		String nomeAt;
		float rendaAt;
		
		// Método
		public void mostrarNomeMet() {
			System.out.println(this.nomeAt); // sysout segura CTRL + SPACE
		}
		
		public void mostrarRendaMet() {
			System.out.println(this.rendaAt);
		}
		
		public void mostrarNomeRendaMet() {
			System.out.println(this.rendaAt);
			System.out.println(this.rendaAt);
		}
		
		public void receberNomeMet(String nomePar) {
			this.nomeAt = nomePar;
		}

		public void receberRendaMet(float rendaPar) {
			this.rendaAt = rendaPar;
	}

}
