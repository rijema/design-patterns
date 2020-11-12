package telas;

public class TelaProfessoraBede extends TelaUsuarioBede {
	
    public TelaProfessoraBede(String nome, String senha) {
    	this.setNome(nome);
    	this.setSenha(senha);
	}

	public boolean login(String nome, String senha){
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
        velocidadeSistemaProfessor();
        System.out.println("Login feito com sucesso ao Bedê, professora " + this.getNome());
        return true;
    }

    public boolean validarLivro(byte[] livro) {
        if (livro.length > 0) {
            System.out.println("Livro '" + new String(livro) + "' foi solicitado para compra");
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("Usuário '" + this.getNome() + "' do tipo 'Professora' saiu da Biblioteca online.");
    }

    private void velocidadeSistemaProfessor() {
        try {
            int i = 0;
            System.out.println();
            System.out.print("Conexão: ");
            while (i < 10) {
                System.out.print(">");
                Thread.sleep(250);
                i++;
            }
            System.out.println();
            System.out.println("Alunos conectados:" + TelaAlunoBede.alunosLogados.size());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
