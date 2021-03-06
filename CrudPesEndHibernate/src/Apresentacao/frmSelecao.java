/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Estaticos;
import Modelo.Pessoa;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rever
 */
public class frmSelecao extends javax.swing.JDialog
{

    /**
     * Creates new form frmSelecao
     */
    public frmSelecao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        preencherTabela();
    }
    
    private void preencherTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tblPesquisarPessoa.getModel();
        modelo.setNumRows(0);
        for (Pessoa p : Estaticos.listaPessoas)
        {
            modelo.addRow(new Object[]
            {
                p.getId(), p.getNome(), p.getRg(), p.getCpf()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisarPessoa = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleção de Pessoa");

        tblPesquisarPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "ID", "Nome", "RG", "CPF"
            }
        ));
        tblPesquisarPessoa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPesquisarPessoa.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblPesquisarPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPesquisarPessoa);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tblPesquisarPessoaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblPesquisarPessoaMouseClicked
    {//GEN-HEADEREND:event_tblPesquisarPessoaMouseClicked
        int linha = tblPesquisarPessoa.getSelectedRow();
        for (Pessoa p : Estaticos.listaPessoas)
        {
            if (p.getId() == (int)tblPesquisarPessoa.getValueAt(linha, 0))
            {
                Estaticos.pessoa = p;
            }
        }
//        Estaticos.pessoa.setId((int) tblPesquisarPessoa.getValueAt(linha, 0));
//        Estaticos.pessoa.setNome((String) tblPesquisarPessoa.getValueAt(linha, 1));
//        Estaticos.pessoa.setRg((String) tblPesquisarPessoa.getValueAt(linha, 2));
//        Estaticos.pessoa.setCpf((String) tblPesquisarPessoa.getValueAt(linha, 3));
    }//GEN-LAST:event_tblPesquisarPessoaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmSelecao dialog = new frmSelecao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisarPessoa;
    // End of variables declaration//GEN-END:variables
}
