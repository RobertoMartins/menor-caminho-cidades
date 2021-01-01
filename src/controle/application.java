/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Aresta;
import modelo.Dijkstra;
import modelo.Grafo;
import modelo.Vertice;
import view.InterfaceGrafo;

/**
 *
 * @author rober
 */
public class application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGrafo janela = new InterfaceGrafo();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
