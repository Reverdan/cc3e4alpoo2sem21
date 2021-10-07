/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Controle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rever
 */
public class frmCadastro extends javax.swing.JDialog
{

    /**
     * Creates new form frmCadastro
     */
    public frmCadastro(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
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

        lblNome = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txfRg = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txfCpf = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        tbpEnderecos = new javax.swing.JTabbedPane();
        pnlEnderecoResidencial = new javax.swing.JPanel();
        lblLogradouroResidencial = new javax.swing.JLabel();
        txfLogradouroResidencial = new javax.swing.JTextField();
        lblNumeroResidencial = new javax.swing.JLabel();
        txfNumeroResidencial = new javax.swing.JTextField();
        lblEnderecoResidencial = new javax.swing.JLabel();
        txfBairroResidencial = new javax.swing.JTextField();
        lblCidadeResidencial = new javax.swing.JLabel();
        txfCidadeResidencial = new javax.swing.JTextField();
        pnlEnderecoComercial = new javax.swing.JPanel();
        txfBairroComercial = new javax.swing.JTextField();
        lblCidadeComercial = new javax.swing.JLabel();
        txfCidadeComercial = new javax.swing.JTextField();
        lblLogradouroComercial = new javax.swing.JLabel();
        txfLogradouroComercial = new javax.swing.JTextField();
        lblNumeroComercial = new javax.swing.JLabel();
        txfNumeroComercial = new javax.swing.JTextField();
        lblEnderecoComercial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoa");

        lblNome.setText("Nome");

        lblRg.setText("RG");

        lblCpf.setText("CPF");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblLogradouroResidencial.setText("Logradouro");

        lblNumeroResidencial.setText("Numero");

        lblEnderecoResidencial.setText("Bairro");

        lblCidadeResidencial.setText("Cidade");

        javax.swing.GroupLayout pnlEnderecoResidencialLayout = new javax.swing.GroupLayout(pnlEnderecoResidencial);
        pnlEnderecoResidencial.setLayout(pnlEnderecoResidencialLayout);
        pnlEnderecoResidencialLayout.setHorizontalGroup(
            pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoResidencialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogradouroResidencial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfLogradouroResidencial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCidadeResidencial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCidadeResidencial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEnderecoResidencialLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfNumeroResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroResidencial))
                        .addGap(163, 163, 163)
                        .addGroup(pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEnderecoResidencialLayout.createSequentialGroup()
                                .addComponent(lblEnderecoResidencial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE))
                            .addComponent(txfBairroResidencial))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlEnderecoResidencialLayout.setVerticalGroup(
            pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoResidencialLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogradouroResidencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfLogradouroResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroResidencial)
                    .addComponent(lblEnderecoResidencial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoResidencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfBairroResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNumeroResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblCidadeResidencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfCidadeResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbpEnderecos.addTab("Residencial", pnlEnderecoResidencial);

        lblCidadeComercial.setText("Cidade");

        lblLogradouroComercial.setText("Logradouro");

        lblNumeroComercial.setText("Numero");

        lblEnderecoComercial.setText("Bairro");

        javax.swing.GroupLayout pnlEnderecoComercialLayout = new javax.swing.GroupLayout(pnlEnderecoComercial);
        pnlEnderecoComercial.setLayout(pnlEnderecoComercialLayout);
        pnlEnderecoComercialLayout.setHorizontalGroup(
            pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoComercialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogradouroComercial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfLogradouroComercial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCidadeComercial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCidadeComercial, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEnderecoComercialLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfNumeroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroComercial))
                        .addGap(163, 163, 163)
                        .addGroup(pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEnderecoComercialLayout.createSequentialGroup()
                                .addComponent(lblEnderecoComercial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE))
                            .addComponent(txfBairroComercial))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlEnderecoComercialLayout.setVerticalGroup(
            pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoComercialLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogradouroComercial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfLogradouroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroComercial)
                    .addComponent(lblEnderecoComercial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfBairroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNumeroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblCidadeComercial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfCidadeComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbpEnderecos.addTab("Comercial", pnlEnderecoComercial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbpEnderecos)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCadastrar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome)
                            .addComponent(txfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRg)
                                    .addComponent(txfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpf)
                                    .addComponent(txfCpf))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(tbpEnderecos)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        List<String> dadosPessoa = new ArrayList<>();
        dadosPessoa.add("0");
        dadosPessoa.add(txfNome.getText());
        dadosPessoa.add(txfRg.getText());
        dadosPessoa.add(txfCpf.getText());
        
        List<String> enderecoResidencial = new ArrayList<>();
        List<String> enderecoComercial = new ArrayList<>();
        
        enderecoResidencial.add(txfLogradouroResidencial.getText());
        enderecoResidencial.add(txfNumeroResidencial.getText());
        enderecoResidencial.add(txfBairroResidencial.getText());
        enderecoResidencial.add(txfCidadeResidencial.getText());
        
        enderecoComercial.add(txfLogradouroComercial.getText());
        enderecoComercial.add(txfNumeroComercial.getText());
        enderecoComercial.add(txfBairroComercial.getText());
        enderecoComercial.add(txfCidadeComercial.getText());
        
        List<List<String>> listaEnderecos = new ArrayList<>();
        listaEnderecos.add(enderecoResidencial);
        listaEnderecos.add(enderecoComercial);
        
        Controle controle = new Controle();
        controle.cadastrarPessoa(dadosPessoa, listaEnderecos);
        JOptionPane.showMessageDialog(null, controle.getMensagem());
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmCadastro dialog = new frmCadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblCidadeComercial;
    private javax.swing.JLabel lblCidadeResidencial;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEnderecoComercial;
    private javax.swing.JLabel lblEnderecoResidencial;
    private javax.swing.JLabel lblLogradouroComercial;
    private javax.swing.JLabel lblLogradouroResidencial;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumeroComercial;
    private javax.swing.JLabel lblNumeroResidencial;
    private javax.swing.JLabel lblRg;
    private javax.swing.JPanel pnlEnderecoComercial;
    private javax.swing.JPanel pnlEnderecoResidencial;
    private javax.swing.JTabbedPane tbpEnderecos;
    private javax.swing.JTextField txfBairroComercial;
    private javax.swing.JTextField txfBairroResidencial;
    private javax.swing.JTextField txfCidadeComercial;
    private javax.swing.JTextField txfCidadeResidencial;
    private javax.swing.JTextField txfCpf;
    private javax.swing.JTextField txfLogradouroComercial;
    private javax.swing.JTextField txfLogradouroResidencial;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfNumeroComercial;
    private javax.swing.JTextField txfNumeroResidencial;
    private javax.swing.JTextField txfRg;
    // End of variables declaration//GEN-END:variables
}
