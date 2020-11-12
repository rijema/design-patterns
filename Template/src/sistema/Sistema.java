package sistema;

import telas.TelaAlunoBede;
import telas.TelaProfessoraBede;

public class Sistema {
	
	
	public static void main(String[] args) {
		TelaAlunoBede alunoUm = new TelaAlunoBede("Dennys", "089X4272X37");
		TelaAlunoBede alunoDois = new TelaAlunoBede("Matheus", "11077XX7429");
		TelaAlunoBede alunoTres = new TelaAlunoBede("João", "1276X4674X9");
		
		TelaProfessoraBede professora = new TelaProfessoraBede("Larissa", "243X442X312");

		alunoUm.solicitarLivro("Modelo de Casos de Uso");
		alunoDois.solicitarLivro("Diagrama de Classes");
		alunoTres.solicitarLivro("Linguagem de Modelagem Unificada");
		
		professora.solicitarLivro("APS");	
	}
	

}
