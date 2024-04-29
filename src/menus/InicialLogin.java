
package menus;

import codigos.Cliente;
import menus.InicialCriarConta;
import java.awt.CardLayout;
import componentes.UtilsDesign;

public class InicialLogin extends javax.swing.JFrame {

    public InicialLogin() {
        this.setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        login_container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ClienteSelect = new javax.swing.JButton();
        btn_FuncionarioSelect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loginCard = new javax.swing.JPanel();
        loginClienteCard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textSenha = new javax.swing.JTextField();
        btn_loginCliente = new javax.swing.JButton();
        loginFuncionarioCard = new javax.swing.JPanel();
        btn_loginFuncionario = new javax.swing.JButton();
        textSenhaFunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textCarteira = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(30, 39, 114));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        login_container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bem-vindo(a) de volta à Udi-Decola!");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Por favor, faça login para acessar sua conta.");

        btn_ClienteSelect.setBackground(new java.awt.Color(255, 255, 255));
        btn_ClienteSelect.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btn_ClienteSelect.setForeground(new java.awt.Color(30, 39, 114));
        btn_ClienteSelect.setText("Cliente");
        btn_ClienteSelect.setAlignmentY(0.0F);
        btn_ClienteSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 39, 114), 2, true));
        btn_ClienteSelect.setFocusPainted(false);
        btn_ClienteSelect.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_ClienteSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClienteSelectActionPerformed(evt);
            }
        });

        btn_FuncionarioSelect.setBackground(new java.awt.Color(255, 255, 255));
        btn_FuncionarioSelect.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btn_FuncionarioSelect.setForeground(new java.awt.Color(30, 39, 114));
        btn_FuncionarioSelect.setText("Funcionario");
        btn_FuncionarioSelect.setAlignmentY(0.0F);
        btn_FuncionarioSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 39, 114), 2, true));
        btn_FuncionarioSelect.setFocusPainted(false);
        btn_FuncionarioSelect.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_FuncionarioSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FuncionarioSelectActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("----- Insiras os dados -----");

        loginCard.setLayout(new java.awt.CardLayout());

        loginClienteCard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Email");

        textEmail.setBackground(new java.awt.Color(255, 255, 255));
        textEmail.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEmail.setForeground(new java.awt.Color(102, 102, 102));
        textEmail.setText("   ");
        textEmail.setToolTipText("");
        textEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textEmail.setCaretColor(new java.awt.Color(30, 39, 114));
        textEmail.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEmail.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Senha");

        textSenha.setBackground(new java.awt.Color(255, 255, 255));
        textSenha.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textSenha.setForeground(new java.awt.Color(102, 102, 102));
        textSenha.setText("   ");
        textSenha.setToolTipText("");
        textSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textSenha.setCaretColor(new java.awt.Color(30, 39, 114));
        textSenha.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textSenha.setSelectionColor(new java.awt.Color(153, 204, 255));

        btn_loginCliente.setBackground(new java.awt.Color(255, 198, 0));
        btn_loginCliente.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btn_loginCliente.setForeground(new java.awt.Color(0, 0, 0));
        btn_loginCliente.setText("Entrar");
        btn_loginCliente.setBorderPainted(false);
        btn_loginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginClienteCardLayout = new javax.swing.GroupLayout(loginClienteCard);
        loginClienteCard.setLayout(loginClienteCardLayout);
        loginClienteCardLayout.setHorizontalGroup(
            loginClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginClienteCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSenha)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginClienteCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_loginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        loginClienteCardLayout.setVerticalGroup(
            loginClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginClienteCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_loginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        loginCard.add(loginClienteCard, "cliente");

        loginFuncionarioCard.setBackground(new java.awt.Color(255, 255, 255));

        btn_loginFuncionario.setBackground(new java.awt.Color(255, 198, 0));
        btn_loginFuncionario.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btn_loginFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        btn_loginFuncionario.setText("Entrar");
        btn_loginFuncionario.setBorderPainted(false);
        btn_loginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginFuncionarioActionPerformed(evt);
            }
        });

        textSenhaFunc.setBackground(new java.awt.Color(255, 255, 255));
        textSenhaFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textSenhaFunc.setForeground(new java.awt.Color(102, 102, 102));
        textSenhaFunc.setText("   ");
        textSenhaFunc.setToolTipText("");
        textSenhaFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textSenhaFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textSenhaFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textSenhaFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Senha");

        textCarteira.setBackground(new java.awt.Color(255, 255, 255));
        textCarteira.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCarteira.setForeground(new java.awt.Color(102, 102, 102));
        textCarteira.setText("   ");
        textCarteira.setToolTipText("");
        textCarteira.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textCarteira.setCaretColor(new java.awt.Color(30, 39, 114));
        textCarteira.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCarteira.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Numero carteira");

        javax.swing.GroupLayout loginFuncionarioCardLayout = new javax.swing.GroupLayout(loginFuncionarioCard);
        loginFuncionarioCard.setLayout(loginFuncionarioCardLayout);
        loginFuncionarioCardLayout.setHorizontalGroup(
            loginFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFuncionarioCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSenhaFunc)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFuncionarioCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_loginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        loginFuncionarioCardLayout.setVerticalGroup(
            loginFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFuncionarioCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(textCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(textSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_loginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        loginCard.add(loginFuncionarioCard, "funcionario");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ainda não tem uma conta?");

        btn_cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(30, 39, 114));
        btn_cadastrar.setText("Cadastrar-se");
        btn_cadastrar.setBorder(null);
        btn_cadastrar.setBorderPainted(false);
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_containerLayout = new javax.swing.GroupLayout(login_container);
        login_container.setLayout(login_containerLayout);
        login_containerLayout.setHorizontalGroup(
            login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_containerLayout.createSequentialGroup()
                .addGroup(login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_containerLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrar))
                    .addGroup(login_containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(login_containerLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn_ClienteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_FuncionarioSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_containerLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4))
                    .addGroup(login_containerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(loginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        login_containerLayout.setVerticalGroup(
            login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_containerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ClienteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_FuncionarioSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(97, 97, 97)
                .addComponent(loginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(login_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClienteSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteSelectActionPerformed
        CardLayout passagensCard = (CardLayout) loginCard.getLayout();
        passagensCard.show(loginCard, "cliente");
        UtilsDesign.buttonEffect(btn_ClienteSelect, btn_FuncionarioSelect);
    }//GEN-LAST:event_btn_ClienteSelectActionPerformed

    private void btn_FuncionarioSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FuncionarioSelectActionPerformed
        CardLayout passagensCard = (CardLayout) loginCard.getLayout();
        passagensCard.show(loginCard, "funcionario");
        UtilsDesign.buttonEffect(btn_FuncionarioSelect, btn_ClienteSelect);
    }//GEN-LAST:event_btn_FuncionarioSelectActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        
        this.setVisible(false);
        InicialCriarConta criarConta = new InicialCriarConta(); 
        criarConta.setLocationRelativeTo(null);
        criarConta.setVisible(true); 
        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_loginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginFuncionarioActionPerformed
        //codigo para verificar login
        
        //this.setVisible(false);
        //Funcionario funcionario = new Funcionario(dados do funcionario aqui);
        //TelaMain telaMain = new TelaMain(funcionario); 
        //telaMain.setLocationRelativeTo(null);
        //telaMain.setVisible(true);
    }//GEN-LAST:event_btn_loginFuncionarioActionPerformed

    private void btn_loginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginClienteActionPerformed
        //codigo para verificar login
        
        //this.setVisible(false);
        //Cliente cliente = new Cliente(dados do cliente aqui);
        //TelaMain telaMain = new TelaMain(cliente); 
        //telaMain.setLocationRelativeTo(null);
        //telaMain.setVisible(true);
    }//GEN-LAST:event_btn_loginClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ClienteSelect;
    private javax.swing.JButton btn_FuncionarioSelect;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_loginCliente;
    private javax.swing.JButton btn_loginFuncionario;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel loginCard;
    private javax.swing.JPanel loginClienteCard;
    private javax.swing.JPanel loginFuncionarioCard;
    private javax.swing.JPanel login_container;
    private javax.swing.JTextField textCarteira;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textSenha;
    private javax.swing.JTextField textSenhaFunc;
    // End of variables declaration//GEN-END:variables
}
