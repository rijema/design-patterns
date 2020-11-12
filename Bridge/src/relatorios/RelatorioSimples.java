package relatorios;

import java.util.List;

import model.Produto;
import visualizadores.VisualizadorDeRelatorios;

public class RelatorioSimples extends GeradorDeRelatorios {

	/**
	 * Construtor recebendo o visualizador (que está na classe mae)
	 * 
	 * @param visualizador
	 */
	public RelatorioSimples(VisualizadorDeRelatorios visualizador) {
		super(visualizador);
	}

	@Override
	protected String gerarConteudo(List<Produto> produtos) {
		double totalProduto = 0;
		StringBuilder conteudo = new StringBuilder();
		for (Produto produto : produtos) {
			totalProduto += produto.getPreco();
		}
		conteudo.append("QUANTIDADE VENDIDA: " + produtos.size());
		conteudo.append("\nTOTAL VENDIDO: " + totalProduto);
		return conteudo.toString();
	}

	@Override
	protected void gerarVisualizacao(String cabecalho, String conteudo) {
		this.visualizador.gerarVisualizacaoDoRelatorio(cabecalho, conteudo);
	}
	
}