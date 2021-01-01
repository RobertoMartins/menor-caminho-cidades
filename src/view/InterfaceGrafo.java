package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import modelo.Aresta;
import modelo.Dijkstra;
import modelo.Grafo;
import modelo.OrdenaNomeVertice;
import modelo.Vertice;

public class InterfaceGrafo extends javax.swing.JFrame {

    Dijkstra d = new Dijkstra();
    Grafo g = new Grafo();
    List<Vertice> vertices;
    List<Vertice> MenorCaminho = new ArrayList<>();
    Vertice origem;
    Vertice destino;

    public InterfaceGrafo() {
        initComponents();

        List<Vertice> vertices = new ArrayList<>();
        Dijkstra d = new Dijkstra();

        //CRIANDO TODOS VERTICES
        Vertice cn = new Vertice("Caldas Novas");
        Vertice pr = new Vertice("Pires do Rio");
        Vertice uru = new Vertice("Urutai");
        Vertice ipa = new Vertice("Ipameri");
        Vertice cat = new Vertice("Catalão");
        Vertice bv = new Vertice("Bela Vista");
        Vertice cnp = new Vertice("Cristianópolis");
        Vertice ana = new Vertice("Anápolis");
        Vertice gyn = new Vertice("Goiânia");
        Vertice ozn = new Vertice("Orizona");
        Vertice agl = new Vertice("Agua Limpa");
        Vertice gtb = new Vertice("Goiatuba");
        Vertice bta = new Vertice("Burití Alegre");
        Vertice pjb = new Vertice("Piracanjuba");
        Vertice vnp = new Vertice("Vianópolis");
        Vertice svn = new Vertice("Silvania");
        Vertice trd = new Vertice("Trindade");
        Vertice mzg = new Vertice("Marzagão");
        Vertice mrr = new Vertice("Morrinhos");
        Vertice itb = new Vertice("Itumbiara");

        // CRIANDO TODAS ARESTAS
        Aresta a1 = new Aresta(cnp, mrr, 113);
        Aresta b1 = new Aresta(mrr, cnp, 113);
        Aresta a2 = new Aresta(cnp, pjb, 43);
        Aresta b2 = new Aresta(pjb, cnp, 43);
        Aresta a3 = new Aresta(gyn, trd, 26);
        Aresta b3 = new Aresta(trd, gyn, 26);
        Aresta a4 = new Aresta(ana, gyn, 59);
        Aresta b4 = new Aresta(gyn, ana, 59);
        Aresta a5 = new Aresta(bv, gyn, 51);
        Aresta b5 = new Aresta(gyn, bv, 51);
        Aresta a6 = new Aresta(bv, cnp, 43);
        Aresta b6 = new Aresta(cnp, bv, 43);
        Aresta a7 = new Aresta(bv, svn, 61);
        Aresta b7 = new Aresta(svn, bv, 61);
        Aresta a8 = new Aresta(cnp, vnp, 67);
        Aresta b8 = new Aresta(vnp, cnp, 67);
        Aresta a9 = new Aresta(vnp, svn, 20);
        Aresta b9 = new Aresta(svn, vnp, 20);
        Aresta a10 = new Aresta(cnp, ozn, 63);
        Aresta b10 = new Aresta(ozn, cnp, 63);
        Aresta a11 = new Aresta(pr, cnp, 56);
        Aresta b11 = new Aresta(cnp, pr, 56);
        Aresta a12 = new Aresta(pr, ozn, 33);
        Aresta b12 = new Aresta(ozn, pr, 33);
        Aresta a13 = new Aresta(pr, uru, 20);
        Aresta b13 = new Aresta(uru, pr, 20);
        Aresta a14 = new Aresta(cn, pr, 61);
        Aresta b14 = new Aresta(pr, cn, 61);
        Aresta a15 = new Aresta(ipa, uru, 33);
        Aresta b15 = new Aresta(uru, ipa, 33);
        Aresta a16 = new Aresta(cn, ipa, 60);
        Aresta b16 = new Aresta(ipa, cn, 60);
        Aresta a17 = new Aresta(ipa, cat, 60);
        Aresta b17 = new Aresta(cat, ipa, 60);
        Aresta a18 = new Aresta(bv, ozn, 84);
        Aresta b18 = new Aresta(ozn, bv, 84);
        Aresta a19 = new Aresta(ozn, vnp, 47);
        Aresta b19 = new Aresta(vnp, ozn, 47);
        Aresta a20 = new Aresta(bv, pjb, 42);
        Aresta b20 = new Aresta(pjb, bv, 42);
        Aresta a21 = new Aresta(cn, pjb, 78);
        Aresta b21 = new Aresta(pjb, cn, 78);
        Aresta a22 = new Aresta(cn, cnp, 78);
        Aresta b22 = new Aresta(cnp, cn, 78);
        Aresta a23 = new Aresta(pjb, mrr, 55);
        Aresta b23 = new Aresta(mrr, pjb, 55);
        Aresta a24 = new Aresta(cn, mrr, 58);
        Aresta b24 = new Aresta(mrr, cn, 58);
        Aresta a25 = new Aresta(mzg, mrr, 69);
        Aresta b25 = new Aresta(mrr, mzg, 69);
        Aresta a26 = new Aresta(cn, mzg, 28);
        Aresta b26 = new Aresta(mzg, cn, 28);
        Aresta a27 = new Aresta(agl, mrr, 63);
        Aresta b27 = new Aresta(mrr, agl, 63);
        Aresta a28 = new Aresta(agl, mzg, 21);
        Aresta b28 = new Aresta(mzg, agl, 21);
        Aresta a29 = new Aresta(bta, mrr, 55);
        Aresta b29 = new Aresta(mrr, bta, 55);
        Aresta a30 = new Aresta(agl, bta, 39);
        Aresta b30 = new Aresta(bta, agl, 39);
        Aresta a31 = new Aresta(mrr, itb, 87);
        Aresta b31 = new Aresta(itb, mrr, 87);
        Aresta a32 = new Aresta(gtb, itb, 55);
        Aresta b32 = new Aresta(itb, gtb, 55);
        Aresta a33 = new Aresta(bta, itb, 40);
        Aresta b33 = new Aresta(itb, bta, 40);
        Aresta a34 = new Aresta(gtb, mrr, 55);
        Aresta b34 = new Aresta(mrr, gtb, 55);
        Aresta a35 = new Aresta(gyn, pjb, 86);
        Aresta b35 = new Aresta(pjb, gyn, 86);
        Aresta a36 = new Aresta(gtb, bta, 44);
        Aresta b36 = new Aresta(bta, gtb, 44);

        //ADICIONANDO AS ARESTAS DE CADA VERTICE
        cn.getArestas().add(a14);
        cn.getArestas().add(a16);
        cn.getArestas().add(a20);
        cn.getArestas().add(a22);
        cn.getArestas().add(a24);
        cn.getArestas().add(a26);

        ipa.getArestas().add(a15);
        ipa.getArestas().add(b16);
        ipa.getArestas().add(a17);

        pr.getArestas().add(a11);
        pr.getArestas().add(a12);
        pr.getArestas().add(a13);
        pr.getArestas().add(b14);

        cat.getArestas().add(b17);

        bv.getArestas().add(a6);
        bv.getArestas().add(a7);
        bv.getArestas().add(a5);
        bv.getArestas().add(a18);
        bv.getArestas().add(a21);

        cnp.getArestas().add(a1);
        cnp.getArestas().add(a2);
        cnp.getArestas().add(b6);
        cnp.getArestas().add(a8);
        cnp.getArestas().add(a10);
        cnp.getArestas().add(b11);
        cnp.getArestas().add(b22);

        ana.getArestas().add(a4);

        gyn.getArestas().add(a3);
        gyn.getArestas().add(b4);
        gyn.getArestas().add(b5);
        gyn.getArestas().add(a35);

        uru.getArestas().add(b13);
        uru.getArestas().add(b15);

        ozn.getArestas().add(b10);
        ozn.getArestas().add(b12);
        ozn.getArestas().add(b18);
        ozn.getArestas().add(a19);

        agl.getArestas().add(a27);
        agl.getArestas().add(a28);
        agl.getArestas().add(a30);

        gtb.getArestas().add(a32);
        gtb.getArestas().add(a34);
        gtb.getArestas().add(a36);

        bta.getArestas().add(a29);
        bta.getArestas().add(b30);
        bta.getArestas().add(a33);
        bta.getArestas().add(b36);

        pjb.getArestas().add(b2);
        pjb.getArestas().add(b20);
        pjb.getArestas().add(b21);
        pjb.getArestas().add(a23);
        pjb.getArestas().add(b35);

        vnp.getArestas().add(b8);
        vnp.getArestas().add(a9);
        vnp.getArestas().add(b19);

        svn.getArestas().add(b7);
        svn.getArestas().add(b9);

        trd.getArestas().add(b3);

        mzg.getArestas().add(a25);
        mzg.getArestas().add(b26);
        mzg.getArestas().add(b28);

        mrr.getArestas().add(a1);
        mrr.getArestas().add(b23);
        mrr.getArestas().add(b24);
        mrr.getArestas().add(b25);
        mrr.getArestas().add(b27);
        mrr.getArestas().add(b29);
        mrr.getArestas().add(b31);
        mrr.getArestas().add(b34);
        mrr.getArestas().add(b1);
        mrr.getArestas().add(a31);

        itb.getArestas().add(b31);
        itb.getArestas().add(b32);
        itb.getArestas().add(b33);

        //ADICIONANDO TODOS VERTICES A UMA LISTA.
        vertices.add(ipa);
        vertices.add(pr);
        vertices.add(cn);
        vertices.add(uru);
        vertices.add(cat);
        vertices.add(bv);
        vertices.add(cnp);
        vertices.add(ana);
        vertices.add(gyn);
        vertices.add(ozn);
        vertices.add(agl);
        vertices.add(gtb);
        vertices.add(bta);
        vertices.add(pjb);
        vertices.add(vnp);
        vertices.add(svn);
        vertices.add(trd);
        vertices.add(mzg);
        vertices.add(mrr);
        vertices.add(itb);

        g.setVertices(vertices);
        g.getVertices().sort(new OrdenaNomeVertice());
        for (int i = 0; i < g.getVertices().size(); i++) {
            cbo.addItem(g.getVertices().get(i).getDescricao());
            cbd.addItem(g.getVertices().get(i).getDescricao());

        }
        bpassos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrigem = new javax.swing.JLabel();
        labelDestino = new javax.swing.JLabel();
        cbd = new javax.swing.JComboBox<>();
        bcr = new javax.swing.JButton();
        cbo = new javax.swing.JComboBox<>();
        bSair = new javax.swing.JButton();
        labelDis = new javax.swing.JLabel();
        texDistancia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoResult = new javax.swing.JTextArea();
        labelResul = new javax.swing.JLabel();
        limage = new javax.swing.JLabel();
        bpassos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelOrigem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelOrigem.setText("Origem");

        labelDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDestino.setText("Destino");

        bcr.setText("Calcular Rota");
        bcr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcrActionPerformed(evt);
            }
        });

        cbo.setToolTipText("");

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        labelDis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDis.setText("Ditância Total:");

        texDistancia.setEditable(false);
        texDistancia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        campoResult.setEditable(false);
        campoResult.setColumns(20);
        campoResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campoResult.setRows(5);
        jScrollPane1.setViewportView(campoResult);

        labelResul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelResul.setText("Resultado");

        limage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/grafot.jpg"))); // NOI18N
        limage.setText("jLabel1");

        bpassos.setText("Ver Algoritmo Passo a Passo");
        bpassos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpassosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bSair)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOrigem)
                                .addGap(18, 18, 18)
                                .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(labelDestino)
                                .addGap(29, 29, 29)
                                .addComponent(cbd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelResul)
                                .addGap(78, 78, 78)
                                .addComponent(labelDis)
                                .addGap(18, 18, 18)
                                .addComponent(texDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bcr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bpassos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrigem)
                    .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDestino)
                    .addComponent(cbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDis, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelResul)
                        .addComponent(bpassos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texDistancia)
                        .addGap(4, 4, 4)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bcrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcrActionPerformed
        origem = null;
        destino = null;
        for (int i = 0; i < g.getVertices().size(); i++) {
            g.getVertices().get(i).setVisitado(false);
            g.getVertices().get(i).setPai(null);

        }

        campoResult.setText("");
        texDistancia.setText("");

        origem = g.encontrarVertice(cbo.getModel().getElementAt(cbo.getSelectedIndex()));
        destino = g.encontrarVertice(cbd.getModel().getElementAt(cbd.getSelectedIndex()));

        MenorCaminho = d.encontrarMenorCaminhoDijkstra(g, origem, destino);

        String s = "Percurso: ";
        for (int i = 0; i < MenorCaminho.size(); i++) {
            s += (MenorCaminho.get(i).getDescricao() + " >> ");

        }
        campoResult.setText("\n"+s);
        texDistancia.setText(MenorCaminho.get(MenorCaminho.size() - 1).getDistancia() + " Km");
        MenorCaminho.clear();
        bpassos.setEnabled(true);
    }//GEN-LAST:event_bcrActionPerformed

    private void bpassosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpassosActionPerformed
        Passos dialog = new Passos(new javax.swing.JFrame(), true);
        dialog.getTextPassos().setText(d.saida);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

    }//GEN-LAST:event_bpassosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSair;
    private javax.swing.JButton bcr;
    private javax.swing.JButton bpassos;
    private javax.swing.JTextArea campoResult;
    private javax.swing.JComboBox<String> cbd;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelDis;
    private javax.swing.JLabel labelOrigem;
    private javax.swing.JLabel labelResul;
    private javax.swing.JLabel limage;
    private javax.swing.JTextField texDistancia;
    // End of variables declaration//GEN-END:variables
}
