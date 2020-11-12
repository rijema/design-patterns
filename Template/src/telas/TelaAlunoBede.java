package telas;

import java.util.ArrayList;
import java.util.List;

public class TelaAlunoBede extends TelaUsuarioBede {
	public static List<TelaAlunoBede> alunosLogados = new ArrayList<TelaAlunoBede>();
	
    public TelaAlunoBede(String nome, String senha) {
    	this.setNome(nome);
    	this.setSenha(senha);
	}

	public boolean login(String nome, String senha) {
        System.out.println("[Verifique seus dados]");
        System.out.println("Nome: " + this.getNome());
        System.out.print("Senha: ");
        for (int i = 0; i < this.getSenha().length(); i++) {
        	if(i <= this.getSenha().length()-3) {
        		System.out.print("*");
        	} else {
        		System.out.print(this.getSenha().charAt(i));
        	}
        }
        velocidadeSistemaAluno();
        System.out.println("Login feito com sucesso ao Bedê, aluno " + this.getNome());
        alunosLogados.add(this);
        return true;
    }

    public boolean validarLivro(byte[] livro) {
        if (livro.length > 0) {
            System.out.println("Livro '" + new String(livro) + "' foi adicionado a lista de livros a serem analisados");
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("Usuário '" + this.getNome() + "' do tipo 'Aluno' saiu da Biblioteca online.");
    }

    private void velocidadeSistemaAluno() {
        try {
            int i = 0;
            System.out.println();
            System.out.print("Conexão: ");
            while (i < 10) {
                System.out.print(">");
                Thread.sleep(350);
                i++;
            }
            System.out.println();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

