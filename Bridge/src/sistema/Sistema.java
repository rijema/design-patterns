package sistema;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import relatorios.GeradorDeRelatorios;
import relatorios.RelatorioAnalitico;
import relatorios.RelatorioSimples;
import visualizadores.VisualizacaoConsole;
import visualizadores.VisualizacaoGUI;

public class Sistema {

	public static void main(String[] args) {
	       
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Mouse", 10));
        produtos.add(new Produto("Computador", 1999));
        produtos.add(new Produto("LexLox 360", 500));
        produtos.add(new Produto("Peteca", 5));
        
        VisualizacaoConsole visualizacaoConsole = new VisualizacaoConsole();
        VisualizacaoGUI visualizacaoGUI = new VisualizacaoGUI();

        GeradorDeRelatorios relatorioSimples = new RelatorioSimples(visualizacaoGUI);
        relatorioSimples.gerarRelatorios(produtos);

        GeradorDeRelatorios relatorioAnalitico = new RelatorioAnalitico(visualizacaoConsole);
        relatorioAnalitico.gerarRelatorios(produtos);
    }
	
}