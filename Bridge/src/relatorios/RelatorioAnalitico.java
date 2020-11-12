package relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.Produto;
import visualizadores.VisualizadorDeRelatorios;

public class RelatorioAnalitico extends GeradorDeRelatorios {

	/**
	 * Construtor recebendo o visualizador (que está na classe mae)
	 * 
	 * @param visualizador
	 */
    public RelatorioAnalitico(VisualizadorDeRelatorios visualizador) {
		super(visualizador);
	}

	@Override
    protected String gerarCabecalho(){
        SimpleDateFormat sdf = new SimpleDateFormat("H:m:s d/M/y ");
        return new String(
            "RELATORIO ANALÍTICO DE PRODUTOS VENDIDOS\n"+
            sdf.format(new Date()) +
            "\nZeroRay\n"
        );
    }

    @Override
    protected String gerarConteudo(List<Produto> produtos) {
        StringBuilder conteudo = new StringBuilder();
        double totalProdutos = 0;
        conteudo.append("\nPRODUTOS VENDIDOS\n");
        for (Produto produto : produtos) {
            totalProdutos += produto.getPreco();
            conteudo.append(produto.getNome() + "R$ " + produto.getPreco() + "\n");
        }
        conteudo.append("\nTOTAL EM R$" + totalProdutos);
        return conteudo.toString();
    }

    @Override
    protected void gerarVisualizacao(String cabecalho, String conteudo) {
        this.visualizador.gerarVisualizacaoDoRelatorio(cabecalho, conteudo);
    }
	
}