package relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import visualizadores.VisualizadorDeRelatorios;
import model.Produto;

public abstract class GeradorDeRelatorios {

	/**
	 * Abstra��o dos visualizadores de relat�rios (BRIDGE)
	 */
	protected VisualizadorDeRelatorios visualizador;

	/**
	 * Construtor que precisa de um visualizador (SOLU��O) (M�GICA)
	 * 
	 * @param visualizador
	 */
	public GeradorDeRelatorios(VisualizadorDeRelatorios visualizador) {
		this.visualizador = visualizador;
	}

	/**
	 * Methodo template (template Method) Organiza as chamadas dos m�todos na ordem
	 * necess�ria (META ALGOR�TIMO)
	 * 
	 * @param produtos
	 */
	public final void gerarRelatorios(List<Produto> produtos) {
		String cabecalho = this.gerarCabecalho();
		String conteudo = this.gerarConteudo(produtos);
		this.gerarVisualizacao(cabecalho, conteudo);
	}

	/**
	 * Gera um cabe�alho padr�o e simplificado
	 * 
	 * @return String cabe�alho
	 */
	protected String gerarCabecalho() {
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
		return new String(
				"RELATORIO DE PRODUTOS VENDIDOS\n" + sdf.format(new Date()) + "\nZeroRay.\n");
	}

	/**
	 * Deixa a gera��o de conte�do para as subclasses
	 */
	protected abstract String gerarConteudo(List<Produto> produtos);

	/**
	 * Deixa a visualiza��o para as subclasses e ainda: cada subclasse vai (pode)
	 * ter um visualizador diferente Dependendo do que a gente injetar no campo
	 * VisualizadorDeRelatorios visualizador dessa classe aqui
	 */
	protected abstract void gerarVisualizacao(String cabecalho, String conteudo);
	
}