/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.AdmMenu;

import sistemaoficina.Funcionarios.*;

import telas.Login;

/**
 *
 * @author marcu
 */
public class MenuAdm extends javax.swing.JFrame {
    
    public Login login;
    
    private Administrador adm;
    
    //Criando e alocando as devidas telas as variáveis
    private CadastroVendedor cadVend = new CadastroVendedor();
    private AlterarDadosVendedor altVend = new AlterarDadosVendedor();
    private SelecionarVendedor selVend = new SelecionarVendedor();
    private ExcluirVendedor delVend = new ExcluirVendedor();
    private ListarVendedores listVend = new ListarVendedores();
    
    //Criando e alocando as devidas telas as variáveis
    private CadastroMecanico cadMeca = new CadastroMecanico();
    private AlterarDadosMecanico altMeca = new AlterarDadosMecanico();
    private SelecionarMecanico selMeca = new SelecionarMecanico();
    private ExcluirMecanico delMeca = new ExcluirMecanico();
    private ListarMecanicos listMeca = new ListarMecanicos();
    
    /**
     * Creates new form MenuAdm
     */
    
    //Construtores
    
    public MenuAdm() {
        initComponents();
    }
    public MenuAdm(Administrador adm) {
        this();
        this.adm = adm;
    }
    
    public void enviaAdmLogin(Login login, Administrador adm) {
        this.login = login;
        this.adm = adm;
    }
    
    public void setAdminstrador(Administrador adm) {
        this.adm = adm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CadastraVendedor = new javax.swing.JButton();
        SelecionaVendedor = new javax.swing.JButton();
        AlteraVendedor = new javax.swing.JButton();
        DeletaVendedor = new javax.swing.JButton();
        AlteraMecanico = new javax.swing.JButton();
        CadastraMecanico = new javax.swing.JButton();
        SelecionaMecanico = new javax.swing.JButton();
        DeletaMecanico = new javax.swing.JButton();
        ListaMecanico = new javax.swing.JButton();
        ListaVendedor = new javax.swing.JButton();
        SairMenuAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Administrador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("MENU ADMINISTRATIVO");

        CadastraVendedor.setText("Cadastrar um Vendedor");
        CadastraVendedor.setName(""); // NOI18N
        CadastraVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraVendedorActionPerformed(evt);
            }
        });

        SelecionaVendedor.setText("Selecionar um Vendedor");
        SelecionaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionaVendedorActionPerformed(evt);
            }
        });

        AlteraVendedor.setText("Alterar dados de um Vendedor");
        AlteraVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlteraVendedorActionPerformed(evt);
            }
        });

        DeletaVendedor.setText("Deletar um Vendedor");
        DeletaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletaVendedorActionPerformed(evt);
            }
        });

        AlteraMecanico.setText("Alterar dados de um Mecânico");
        AlteraMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlteraMecanicoActionPerformed(evt);
            }
        });

        CadastraMecanico.setText("Cadastrar um Mecânico");
        CadastraMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraMecanicoActionPerformed(evt);
            }
        });

        SelecionaMecanico.setText("Selecionar um Mecânico");
        SelecionaMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionaMecanicoActionPerformed(evt);
            }
        });

        DeletaMecanico.setText("Deletar um Mecânico");
        DeletaMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletaMecanicoActionPerformed(evt);
            }
        });

        ListaMecanico.setText("Listar Mecânicos");
        ListaMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMecanicoActionPerformed(evt);
            }
        });

        ListaVendedor.setText("Listar Vendedores");
        ListaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaVendedorActionPerformed(evt);
            }
        });

        SairMenuAdm.setText("Sair");
        SairMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairMenuAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelecionaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastraVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlteraVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlteraMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastraMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelecionaMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletaMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SairMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel1)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(CadastraVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AlteraVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelecionaVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeletaVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CadastraMecanico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AlteraMecanico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelecionaMecanico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeletaMecanico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListaVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListaMecanico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SairMenuAdm)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cadastrar Vendedor
    private void CadastraVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraVendedorActionPerformed
        this.setVisible(false);
        cadVend = new CadastroVendedor();
        cadVend.setLocationRelativeTo(null);
        cadVend.setVisible(true);
        cadVend.setResizable(false);
        this.setVisible(false);
        
        cadVend.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_CadastraVendedorActionPerformed

    //Cadastrar Mecânico
    private void CadastraMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraMecanicoActionPerformed
        this.setVisible(false);
        cadMeca = new CadastroMecanico();
        cadMeca.setLocationRelativeTo(null);
        cadMeca.setVisible(true);
        cadMeca.setResizable(false);
        this.setVisible(false);
        
        cadMeca.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_CadastraMecanicoActionPerformed

    //Seleciona Vendedor
    private void SelecionaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionaVendedorActionPerformed
        this.setVisible(false);
        selVend = new SelecionarVendedor();
        selVend.setLocationRelativeTo(null);
        selVend.setVisible(true);
        selVend.setResizable(false);
        this.setVisible(false);
        
        selVend.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_SelecionaVendedorActionPerformed

    //Seleciona Mecânico
    private void SelecionaMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionaMecanicoActionPerformed
        this.setVisible(false);
        selMeca = new SelecionarMecanico();
        selMeca.setLocationRelativeTo(null);
        selMeca.setVisible(true);
        selMeca.setResizable(false);
        this.setVisible(false);
        
        selMeca.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_SelecionaMecanicoActionPerformed

    //Editar Vendedor
    private void AlteraVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlteraVendedorActionPerformed
        this.setVisible(false);
        altVend = new AlterarDadosVendedor();
        altVend.setLocationRelativeTo(null);
        altVend.setVisible(true);
        altVend.setResizable(false);
        this.setVisible(false);
        
        altVend.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_AlteraVendedorActionPerformed

    //Editar Mecãnico
    private void AlteraMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlteraMecanicoActionPerformed
        this.setVisible(false);
        altMeca = new AlterarDadosMecanico();
        altMeca.setLocationRelativeTo(null);
        altMeca.setVisible(true);
        altMeca.setResizable(false);
        this.setVisible(false);
        
        altMeca.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_AlteraMecanicoActionPerformed

    //Listar Vendedores
    private void ListaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaVendedorActionPerformed
        this.setVisible(false);
        listVend = new ListarVendedores();
        listVend.setLocationRelativeTo(null);
        listVend.setVisible(true);
        listVend.setResizable(false);
        this.setVisible(false);
        
        listVend.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_ListaVendedorActionPerformed

    //Listar Mecãnicos
    private void ListaMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMecanicoActionPerformed
        this.setVisible(false);
        listMeca = new ListarMecanicos();
        listMeca.setLocationRelativeTo(null);
        listMeca.setVisible(true);
        listMeca.setResizable(false);
        this.setVisible(false);
        
        listMeca.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_ListaMecanicoActionPerformed

    //Deletar Vendedor
    private void DeletaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletaVendedorActionPerformed
        this.setVisible(false);
        delVend = new ExcluirVendedor();
        delVend.setLocationRelativeTo(null);
        delVend.setVisible(true);
        delVend.setResizable(false);
        this.setVisible(false);
        
        delVend.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_DeletaVendedorActionPerformed

    //Deletar Mecânico
    private void DeletaMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletaMecanicoActionPerformed
        this.setVisible(false);
        delMeca = new ExcluirMecanico();
        delMeca.setLocationRelativeTo(null);
        delMeca.setVisible(true);
        delMeca.setResizable(false);
        this.setVisible(false);
        
        delMeca.enviaCadastroLogin(this, adm);
    }//GEN-LAST:event_DeletaMecanicoActionPerformed

   //Fechar Janela
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    //Sair Menu Adm
    private void SairMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuAdmActionPerformed
        this.setVisible(false);
        login.setAdmLogin(adm);
        login.setVisible(true);
    }//GEN-LAST:event_SairMenuAdmActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlteraMecanico;
    private javax.swing.JButton AlteraVendedor;
    private javax.swing.JButton CadastraMecanico;
    private javax.swing.JButton CadastraVendedor;
    private javax.swing.JButton DeletaMecanico;
    private javax.swing.JButton DeletaVendedor;
    private javax.swing.JButton ListaMecanico;
    private javax.swing.JButton ListaVendedor;
    private javax.swing.JButton SairMenuAdm;
    private javax.swing.JButton SelecionaMecanico;
    private javax.swing.JButton SelecionaVendedor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}