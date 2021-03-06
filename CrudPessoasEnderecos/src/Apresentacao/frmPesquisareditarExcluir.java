/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Controle;
import Modelo.Estaticos;
import Modelo.Pessoa;
import Modelo.Endereco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rever
 */
public class frmPesquisareditarExcluir extends javax.swing.JDialog
{

    /**
     * Creates new form frmPesquisareditarExcluir
     */
    public frmPesquisareditarExcluir(java.awt.Frame parent, boolean modal)
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

        txvId = new javax.swing.JTextField();
        btnPesquisarPorId = new javax.swing.JButton();
        txvNome = new javax.swing.JTextField();
        btnPesquisarPorNome = new javax.swing.JButton();
        txvRg = new javax.swing.JTextField();
        txvCpf = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        tbpEnderecos1 = new javax.swing.JTabbedPane();
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
        setTitle("Pesquisar, editar e excluir");

        btnPesquisarPorId.setText("Pesquisar por ID");
        btnPesquisarPorId.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarPorIdActionPerformed(evt);
            }
        });

        btnPesquisarPorNome.setText("Pesquisar por nome");
        btnPesquisarPorNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarPorNomeActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        lblNome.setText("Nome");

        lblRg.setText("RG");

        lblCpf.setText("CPF");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
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
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpEnderecos1.addTab("Residencial", pnlEnderecoResidencial);

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
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpEnderecos1.addTab("Comercial", pnlEnderecoComercial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txvId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txvNome, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txvRg, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRg)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txvCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisarPorNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbpEnderecos1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPorId))
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPorNome))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tbpEnderecos1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherEndereco(Pessoa pessoa)
    {
        if (pessoa.getListaEnderecos().size() >= 1)
        {
            txfLogradouroResidencial.setText(pessoa.getListaEnderecos().get(0).getLogradouro());
            txfNumeroResidencial.setText(pessoa.getListaEnderecos().get(0).getNumero());
            txfBairroResidencial.setText(pessoa.getListaEnderecos().get(0).getBairro());
            txfCidadeResidencial.setText(pessoa.getListaEnderecos().get(0).getCidade());
        }

        if (pessoa.getListaEnderecos().size() == 2)
        {
            txfLogradouroComercial.setText(pessoa.getListaEnderecos().get(1).getLogradouro());
            txfNumeroComercial.setText(pessoa.getListaEnderecos().get(1).getNumero());
            txfBairroComercial.setText(pessoa.getListaEnderecos().get(1).getBairro());
            txfCidadeComercial.setText(pessoa.getListaEnderecos().get(1).getCidade());
        }
    }

    private void btnPesquisarPorIdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarPorIdActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarPorIdActionPerformed
        Controle controle = new Controle();
        Pessoa pessoa = controle.pesquisarPessoaPorId(txvId.getText());
        if (controle.getMensagem().equals(""))
        {
            txvNome.setText(pessoa.getNome());
            txvRg.setText(pessoa.getRg());
            txvCpf.setText(pessoa.getCpf());
            preencherEndereco(pessoa);
        }
        else
        {
            txvNome.setText("");
            txvRg.setText("");
            txvCpf.setText("");
            txfLogradouroResidencial.setText("");
            txfNumeroResidencial.setText("");
            txfBairroResidencial.setText("");
            txfCidadeResidencial.setText("");
            txfLogradouroComercial.setText("");
            txfNumeroComercial.setText("");
            txfBairroComercial.setText("");
            txfCidadeComercial.setText("");
        }
    }//GEN-LAST:event_btnPesquisarPorIdActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        Controle controle = new Controle();
        List<String> dadosPessoa = new ArrayList<>();
        dadosPessoa.add(txvId.getText());
        dadosPessoa.add(txvNome.getText());
        dadosPessoa.add(txvRg.getText());
        dadosPessoa.add(txvCpf.getText());
        
        List<String> enderecoResidencial = new ArrayList<>();
        List<String> enderecoComercial = new ArrayList<>();
        
        enderecoResidencial.add(String.valueOf(Estaticos.pessoa.getListaEnderecos().get(0).getId()));
        
        enderecoResidencial.add(txfLogradouroResidencial.getText());
        enderecoResidencial.add(txfNumeroResidencial.getText());
        enderecoResidencial.add(txfBairroResidencial.getText());
        enderecoResidencial.add(txfCidadeResidencial.getText());
        
        enderecoComercial.add(String.valueOf(Estaticos.pessoa.getListaEnderecos().get(1).getId()));
        
        enderecoComercial.add(txfLogradouroComercial.getText());
        enderecoComercial.add(txfNumeroComercial.getText());
        enderecoComercial.add(txfBairroComercial.getText());
        enderecoComercial.add(txfCidadeComercial.getText());
        
        List<List<String>> listaEnderecos = new ArrayList<>();
        listaEnderecos.add(enderecoResidencial);
        listaEnderecos.add(enderecoComercial);
        
        controle.editarPessoa(dadosPessoa, listaEnderecos);
        JOptionPane.showMessageDialog(null, controle.getMensagem());
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        Controle controle = new Controle();

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta pessoa?",
                "Exclus??o", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION)
        {
            controle.excluirPessoa(txvId.getText());
            JOptionPane.showMessageDialog(null, controle.getMensagem());
            txvId.setText("");
            txvNome.setText("");
            txvRg.setText("");
            txvCpf.setText("");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarPorNomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarPorNomeActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarPorNomeActionPerformed
        Controle controle = new Controle();
        List<Pessoa> listaPessoas = controle.pesquisarPessoaPorNome(txvNome.getText());
        if (listaPessoas.size() == 0)
        {
            JOptionPane.showMessageDialog(null, "N??o existe registros com esta pesquisa");
        }
        if (listaPessoas.size() == 1)
        {
            txvId.setText(String.valueOf(listaPessoas.get(0).getId()));
            txvNome.setText(listaPessoas.get(0).getNome());
            txvRg.setText(listaPessoas.get(0).getRg());
            txvCpf.setText(listaPessoas.get(0).getCpf());
            preencherEndereco(listaPessoas.get(0));
        }
        if (listaPessoas.size() > 1)
        {
            Estaticos.listaPessoas = listaPessoas;
            frmSelecao frmS = new frmSelecao(null, true);
            frmS.setVisible(true);
            txvId.setText(String.valueOf(Estaticos.pessoa.getId()));
            txvNome.setText(Estaticos.pessoa.getNome());
            txvRg.setText(Estaticos.pessoa.getRg());
            txvCpf.setText(Estaticos.pessoa.getCpf());
            
            
            preencherEndereco(Estaticos.pessoa);

//            for (Pessoa p : listaPessoas)
//            {
//                if (p.getId() == Estaticos.pessoa.getId())
//                {
//                    preencherEndereco(p);
//                }
//
//            }

        }
        if (!controle.getMensagem().equals(""))
        {
            JOptionPane.showMessageDialog(null, controle.getMensagem());
        }
    }//GEN-LAST:event_btnPesquisarPorNomeActionPerformed

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
            java.util.logging.Logger.getLogger(frmPesquisareditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisareditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisareditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisareditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPesquisareditarExcluir dialog = new frmPesquisareditarExcluir(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisarPorId;
    private javax.swing.JButton btnPesquisarPorNome;
    private javax.swing.JLabel lblCidadeComercial;
    private javax.swing.JLabel lblCidadeResidencial;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEnderecoComercial;
    private javax.swing.JLabel lblEnderecoResidencial;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogradouroComercial;
    private javax.swing.JLabel lblLogradouroResidencial;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumeroComercial;
    private javax.swing.JLabel lblNumeroResidencial;
    private javax.swing.JLabel lblRg;
    private javax.swing.JPanel pnlEnderecoComercial;
    private javax.swing.JPanel pnlEnderecoResidencial;
    private javax.swing.JTabbedPane tbpEnderecos1;
    private javax.swing.JTextField txfBairroComercial;
    private javax.swing.JTextField txfBairroResidencial;
    private javax.swing.JTextField txfCidadeComercial;
    private javax.swing.JTextField txfCidadeResidencial;
    private javax.swing.JTextField txfLogradouroComercial;
    private javax.swing.JTextField txfLogradouroResidencial;
    private javax.swing.JTextField txfNumeroComercial;
    private javax.swing.JTextField txfNumeroResidencial;
    private javax.swing.JTextField txvCpf;
    private javax.swing.JTextField txvId;
    private javax.swing.JTextField txvNome;
    private javax.swing.JTextField txvRg;
    // End of variables declaration//GEN-END:variables
}
