package menus;

import Dados.DadosCliente;
import Dados.DadosFuncionario;
import java.awt.CardLayout;
import componentes.UtilsDesign;
import codigos.Cliente;
import codigos.Funcionario;
import codigos.GerenciadorGeral;
import codigos.Pessoa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import menus.TelaMain;
import persistencia.conexao;


public class InicialCriarConta extends javax.swing.JFrame {
    
    public InicialCriarConta() {
        initComponents();
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_ClienteSelect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_FuncionarioSelect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panel_inserirDadosCard = new javax.swing.JPanel();
        panel_CadastroClienteCard = new javax.swing.JPanel();
        textCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textNameC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textEndereço = new javax.swing.JTextField();
        textDataNasc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        criarContaCliente = new javax.swing.JButton();
        textSenha = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        panel_CadastroFuncionarioCard = new javax.swing.JPanel();
        textNameFunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textCpfFunc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textEndereçoFunc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textDataNascFunc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textSenhaFunc = new javax.swing.JTextField();
        criarContraFunc = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        textCarteiraFunc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(30, 39, 114));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Junte-se à Udi-Decola!");

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

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Crie sua conta tenha acesso a passagens aéreas incríveis.");

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

        panel_inserirDadosCard.setLayout(new java.awt.CardLayout());

        panel_CadastroClienteCard.setBackground(new java.awt.Color(255, 255, 255));

        textCpf.setBackground(new java.awt.Color(255, 255, 255));
        textCpf.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCpf.setToolTipText("");
        textCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textCpf.setCaretColor(new java.awt.Color(30, 39, 114));
        textCpf.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCpf.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nome");

        textNameC.setBackground(new java.awt.Color(255, 255, 255));
        textNameC.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNameC.setToolTipText("");
        textNameC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textNameC.setCaretColor(new java.awt.Color(30, 39, 114));
        textNameC.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNameC.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("CPF");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Endereço");

        textEndereço.setBackground(new java.awt.Color(255, 255, 255));
        textEndereço.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEndereço.setToolTipText("");
        textEndereço.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textEndereço.setCaretColor(new java.awt.Color(30, 39, 114));
        textEndereço.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEndereço.setSelectionColor(new java.awt.Color(153, 204, 255));

        textDataNasc.setBackground(new java.awt.Color(255, 255, 255));
        textDataNasc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textDataNasc.setToolTipText("");
        textDataNasc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textDataNasc.setCaretColor(new java.awt.Color(30, 39, 114));
        textDataNasc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textDataNasc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Data de nascimento");

        textEmail.setBackground(new java.awt.Color(255, 255, 255));
        textEmail.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEmail.setToolTipText("");
        textEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textEmail.setCaretColor(new java.awt.Color(30, 39, 114));
        textEmail.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEmail.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Senha");

        criarContaCliente.setBackground(new java.awt.Color(255, 198, 0));
        criarContaCliente.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarContaCliente.setForeground(new java.awt.Color(0, 0, 0));
        criarContaCliente.setText("Criar conta");
        criarContaCliente.setBorderPainted(false);
        criarContaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaClienteActionPerformed(evt);
            }
        });

        textSenha.setBackground(new java.awt.Color(255, 255, 255));
        textSenha.setForeground(new java.awt.Color(51, 51, 51));
        textSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Já possui uma conta?");

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(30, 39, 114));
        btn_login.setText("Faça Login");
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_CadastroClienteCardLayout = new javax.swing.GroupLayout(panel_CadastroClienteCard);
        panel_CadastroClienteCard.setLayout(panel_CadastroClienteCardLayout);
        panel_CadastroClienteCardLayout.setHorizontalGroup(
            panel_CadastroClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CadastroClienteCardLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panel_CadastroClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CadastroClienteCardLayout.createSequentialGroup()
                        .addGroup(panel_CadastroClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEndereço, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(textNameC, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(textSenha))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CadastroClienteCardLayout.createSequentialGroup()
                        .addGroup(panel_CadastroClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_CadastroClienteCardLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_login))
                            .addComponent(criarContaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))))
        );
        panel_CadastroClienteCardLayout.setVerticalGroup(
            panel_CadastroClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CadastroClienteCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNameC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(textDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criarContaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_CadastroClienteCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_login))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_inserirDadosCard.add(panel_CadastroClienteCard, "cliente");

        panel_CadastroFuncionarioCard.setBackground(new java.awt.Color(255, 255, 255));

        textNameFunc.setBackground(new java.awt.Color(255, 255, 255));
        textNameFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNameFunc.setToolTipText("");
        textNameFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textNameFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textNameFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNameFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Nome");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("CPF");

        textCpfFunc.setBackground(new java.awt.Color(255, 255, 255));
        textCpfFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCpfFunc.setToolTipText("");
        textCpfFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textCpfFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textCpfFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCpfFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Endereço");

        textEndereçoFunc.setBackground(new java.awt.Color(255, 255, 255));
        textEndereçoFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEndereçoFunc.setToolTipText("");
        textEndereçoFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textEndereçoFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textEndereçoFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEndereçoFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Data de nascimento");

        textDataNascFunc.setBackground(new java.awt.Color(255, 255, 255));
        textDataNascFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textDataNascFunc.setToolTipText("");
        textDataNascFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textDataNascFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textDataNascFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textDataNascFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Senha");

        textSenhaFunc.setBackground(new java.awt.Color(255, 255, 255));
        textSenhaFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textSenhaFunc.setToolTipText("");
        textSenhaFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textSenhaFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textSenhaFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textSenhaFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        criarContraFunc.setBackground(new java.awt.Color(255, 198, 0));
        criarContraFunc.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarContraFunc.setForeground(new java.awt.Color(0, 0, 0));
        criarContraFunc.setText("Criar conta");
        criarContraFunc.setBorderPainted(false);
        criarContraFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContraFuncActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Numero da carteira");

        textCarteiraFunc.setBackground(new java.awt.Color(255, 255, 255));
        textCarteiraFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCarteiraFunc.setToolTipText("");
        textCarteiraFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textCarteiraFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textCarteiraFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCarteiraFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout panel_CadastroFuncionarioCardLayout = new javax.swing.GroupLayout(panel_CadastroFuncionarioCard);
        panel_CadastroFuncionarioCard.setLayout(panel_CadastroFuncionarioCardLayout);
        panel_CadastroFuncionarioCardLayout.setHorizontalGroup(
            panel_CadastroFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CadastroFuncionarioCardLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panel_CadastroFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CadastroFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textCarteiraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_CadastroFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textSenhaFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textDataNascFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textEndereçoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textCpfFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addComponent(textNameFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
            .addGroup(panel_CadastroFuncionarioCardLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(criarContraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_CadastroFuncionarioCardLayout.setVerticalGroup(
            panel_CadastroFuncionarioCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CadastroFuncionarioCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNameFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(textCarteiraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEndereçoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addComponent(textDataNascFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(4, 4, 4)
                .addComponent(textSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criarContraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        panel_inserirDadosCard.add(panel_CadastroFuncionarioCard, "funcionario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel4)
                        .addGap(249, 249, 249)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_ClienteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_FuncionarioSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_inserirDadosCard, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ClienteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_FuncionarioSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_inserirDadosCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClienteSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteSelectActionPerformed
        CardLayout passagensCard = (CardLayout) panel_inserirDadosCard.getLayout();
        passagensCard.show(panel_inserirDadosCard, "cliente");
        UtilsDesign.buttonEffect(btn_ClienteSelect, btn_FuncionarioSelect);
        
    }//GEN-LAST:event_btn_ClienteSelectActionPerformed

    private void btn_FuncionarioSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FuncionarioSelectActionPerformed
        CardLayout passagensCard = (CardLayout) panel_inserirDadosCard.getLayout();
        passagensCard.show(panel_inserirDadosCard, "funcionario");
        UtilsDesign.buttonEffect(btn_FuncionarioSelect, btn_ClienteSelect );
    }//GEN-LAST:event_btn_FuncionarioSelectActionPerformed

    private void criarContraFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContraFuncActionPerformed
        String nome = textNameFunc.getText();
        String cpf = textCpfFunc.getText();
        String endereco = textEndereçoFunc.getText();
        LocalDate dataNascimento = LocalDate.parse(textDataNascFunc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String senha = textSenhaFunc.getText();
        String numero = textCarteiraFunc.getText();
        
        if (!nome.isEmpty() && !cpf.isEmpty() && !endereco.isEmpty() && !senha.isEmpty() && !numero.isEmpty()) {
            if(DadosFuncionario.buscar(numero) == null && Pessoa.validarCpf(cpf)){
                Pessoa funcionario = new Funcionario(nome, cpf, endereco, dataNascimento,numero,senha);
                this.setVisible(false);
                TelaMain telaMain = new TelaMain(funcionario); 
                telaMain.setLocationRelativeTo(null);
                telaMain.setVisible(true); 
                DadosFuncionario.adicionarFuncionario((Funcionario) funcionario);
                conexao.inserirFuncionarioBanco((Funcionario) funcionario);
            }
            else{
                JOptionPane.showMessageDialog(this, "Funcionario já foi cadastrado ou CPF invalido", "Erro", JOptionPane.WARNING_MESSAGE);
                
            }
            
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Preencha todos os dados", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_criarContraFuncActionPerformed

    private void criarContaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaClienteActionPerformed
        String nome = textNameC.getText();
        String cpf = textCpf.getText();
        String endereco = textEndereço.getText();
        LocalDate dataNascimento = LocalDate.parse(textDataNasc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String email = textEmail.getText();
        String senha = textSenha.getText();

        
        if (!nome.isEmpty() && !cpf.isEmpty() && !endereco.isEmpty() && !email.isEmpty() && !senha.isEmpty()) {
                if(DadosCliente.buscar(cpf) == null && Pessoa.validarCpf(cpf)){
                    Pessoa cliente = new Cliente(nome, cpf, endereco, dataNascimento, email, senha);
                    this.setVisible(false);
                    TelaMain telaMain = new TelaMain(cliente); 
                    telaMain.setLocationRelativeTo(null);
                    telaMain.setVisible(true);
                    DadosCliente.adicionarCliente((Cliente) cliente);
                    conexao.inserirClienteBanco((Cliente) cliente);
            }
                else{
                   JOptionPane.showMessageDialog(this, "Cliente já foi cadastrado ou CPF invalido", "Erro", JOptionPane.WARNING_MESSAGE); 
                }
            
        } 
        else {
            JOptionPane.showMessageDialog(this, "Preencha todos os dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_criarContaClienteActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        InicialLogin login = new InicialLogin(); 
        login.setLocationRelativeTo(null);
        login.setVisible(true); 
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btn_loginActionPerformed
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ClienteSelect;
    private javax.swing.JButton btn_FuncionarioSelect;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton criarContaCliente;
    private javax.swing.JButton criarContraFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_CadastroClienteCard;
    private javax.swing.JPanel panel_CadastroFuncionarioCard;
    private javax.swing.JPanel panel_inserirDadosCard;
    private javax.swing.JTextField textCarteiraFunc;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textCpfFunc;
    private javax.swing.JTextField textDataNasc;
    private javax.swing.JTextField textDataNascFunc;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEndereço;
    private javax.swing.JTextField textEndereçoFunc;
    private javax.swing.JTextField textNameC;
    private javax.swing.JTextField textNameFunc;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textSenhaFunc;
    // End of variables declaration//GEN-END:variables
}
