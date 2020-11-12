package telas;

public abstract class TelaUsuarioBede {
    private String nome;
    private String senha;

    public final boolean solicitarLivro(String livro) {
    	agradecimento();
    	System.out.println("===================NEW PROCESS=======================");
    	System.out.print("Digite o nome do livro: ");
    	System.out.println(livro);
    	System.out.println("=====================================================");
        if (login(this.getNome(), this.getSenha())) {
            boolean resultado =  validarLivro(livro.getBytes());
            logout();
        	System.out.println("=========================END=========================\n\n");
            return resultado;
        }
    	System.out.println("=========================END=========================\n\n");
    	System.out.println();
        return false;
    }

    abstract public boolean login(String nome, String senha);
    abstract public boolean validarLivro(byte[] livro);
    abstract public void logout();
    
    private final void agradecimento() {
		System.out.println("\t> Seja bem vindo ao Sistema Bedê <");
	} 
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

