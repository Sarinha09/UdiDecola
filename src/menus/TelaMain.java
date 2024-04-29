package menus;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.time.*;
import java.util.*;
import persistencia.*;
import Dados.*;
import codigos.*;
import componentes.*;
import java.time.format.DateTimeFormatter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class TelaMain extends javax.swing.JFrame {
    
    //variaveis auxiliares
    private CompanhiaAerea companhia;
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private TrechoVoo trechoSelecionado;
    private Voo vooSelecionado;
    private int AUXILIAR = 0;
    private JButton btn_selecionado = null;
    
    //cores
    Color blue = new Color(54,64,131);
    Color blueB = new Color (30,39,114);
    
    //funcionario e cliente
    private Cliente cliente;
    private Funcionario funcionario;
    

    public TelaMain(Pessoa pessoa) {
        if(pessoa instanceof Funcionario){
            this.funcionario = (Funcionario) pessoa;
        }
        else if(pessoa instanceof Cliente){
            this.cliente = (Cliente) pessoa;
        }
        
        initComponents();
        ComboBoxPersonalizado();
        verificarCliqueTable();
        exibirDadosCliente(pessoa);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    PersistenciaArquivo.atualizarArquivo(DadosTrechosVoo.getListaTrechoVoo(), "src/arquivos/trechosVoo.dat");
                    PersistenciaArquivo.atualizarArquivo(DadosAeroporto.getListaAeroporto(), "src/arquivos/aeroportos.dat");
                    PersistenciaArquivo.atualizarArquivo(DadosCompanhia.getCompanhia(), "src/arquivos/companhiaAerea.dat");
                    PersistenciaArquivo.atualizarArquivo(DadosFuncionario.getlistFuncionario(), "src/arquivos/funcionario.dat");
                    System.exit(0);
                }
            }
        });
        
        this.setResizable(false);
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panel_container = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_historico = new javax.swing.JButton();
        btn_carrinho = new javax.swing.JButton();
        btn_passagem = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btn_config = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panel_top = new javax.swing.JPanel();
        btn_user = new javax.swing.JButton();
        panelMenuCard = new javax.swing.JPanel();
        panel_carinhoCard = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_removerItem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label_destino = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        label_valorunitario = new javax.swing.JLabel();
        label_origem = new javax.swing.JLabel();
        label_horapartida = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        label_horachegada = new javax.swing.JLabel();
        label_quantidade = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_data = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_valortotal = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        btn_FinalizarCompra = new javax.swing.JButton();
        panel_passagemPCard = new javax.swing.JPanel();
        panel_passagemP = new javax.swing.JPanel();
        label_codigoP = new javax.swing.JLabel();
        label_passageiroP = new javax.swing.JLabel();
        label_origemP = new javax.swing.JLabel();
        label_horarioP = new javax.swing.JLabel();
        label_estadoD = new javax.swing.JLabel();
        label_destinoP2 = new javax.swing.JLabel();
        label_estadoO = new javax.swing.JLabel();
        label_passageiroP1 = new javax.swing.JLabel();
        label_back = new javax.swing.JLabel();
        btn_download = new javax.swing.JButton();
        panel_configCard = new javax.swing.JPanel();
        btn_addFunc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_removeFunc = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btn_registroFunc = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn_salario = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btn_qtdVip = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        btn_taxaVoo = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btn_addVoo = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btn_addCompanhia = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btn_descontoVip = new javax.swing.JButton();
        btn_removeCompanhia = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        subpanel_CardConfig = new javax.swing.JPanel();
        panel_addAeroporto = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        textNameAero = new javax.swing.JTextField();
        textCidadeAero = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        textEstadoAero = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        textPaisAero = new javax.swing.JTextField();
        textCodigoAero = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        criarAeroporto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panel_addTrecho = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        textCodigoTrecho = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        textHoraSaidaTrecho = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        textHoraChegadaTrecho = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        criarTrecho = new javax.swing.JButton();
        comboBox_origem = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        comboBox_destino = new javax.swing.JComboBox<>();
        comboBoxCompanhia = new javax.swing.JComboBox<>();
        panel_addFuncionario = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        textEmailFunc = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textDataNascFunc = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        textEndereçoFunc = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        textCpfFunc = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        textCarteiraFunc = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        textNameFunc = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        criarContaFunc = new javax.swing.JButton();
        textSenhaFunc = new javax.swing.JPasswordField();
        panel_addCompanhia = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        textNomeOficial = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        textNomeDivulga = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        textCnpj = new javax.swing.JTextField();
        criarCompanhia = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        panel_addVoo = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        textDataVoo = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        textHoraPartida = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        textHoraChegada = new javax.swing.JTextField();
        textNumeroVagas = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        textValorPassagem = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        comboBox_trecho = new javax.swing.JComboBox<>();
        criarVoo = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        btn_addVoo1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btn_addAeroporto = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        panel_dashboardCard = new javax.swing.JPanel();
        panel_userCard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lavel_data = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        label_cpf = new javax.swing.JLabel();
        label_endereco = new javax.swing.JLabel();
        panel_passagensCard = new javax.swing.JPanel();
        textOrigem = new javax.swing.JTextField();
        btn_busca = new javax.swing.JButton();
        textDestino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_filtroData = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        btn_All = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_container.setBackground(new java.awt.Color(255, 255, 255));

        panel_menu.setBackground(new java.awt.Color(30, 39, 114));
        panel_menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Udi-Decola");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("menu usuario");

        btn_historico.setBackground(new java.awt.Color(30, 39, 114));
        btn_historico.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btn_historico.setForeground(new java.awt.Color(255, 255, 255));
        btn_historico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/passagem-aerea (1).png"))); // NOI18N
        btn_historico.setText("Passagem");
        btn_historico.setBorder(null);
        btn_historico.setBorderPainted(false);
        btn_historico.setFocusPainted(false);
        btn_historico.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_historico.setIconTextGap(10);
        btn_historico.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historicoActionPerformed(evt);
            }
        });

        btn_carrinho.setBackground(new java.awt.Color(30, 39, 114));
        btn_carrinho.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btn_carrinho.setForeground(new java.awt.Color(255, 255, 255));
        btn_carrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carrinho-de-compras (2).png"))); // NOI18N
        btn_carrinho.setText("Carrinho     ");
        btn_carrinho.setBorder(null);
        btn_carrinho.setBorderPainted(false);
        btn_carrinho.setFocusPainted(false);
        btn_carrinho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_carrinho.setIconTextGap(10);
        btn_carrinho.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinhoActionPerformed(evt);
            }
        });

        btn_passagem.setBackground(new java.awt.Color(30, 39, 114));
        btn_passagem.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btn_passagem.setForeground(new java.awt.Color(255, 255, 255));
        btn_passagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/procurar (1).png"))); // NOI18N
        btn_passagem.setText("Pesquisar");
        btn_passagem.setBorder(null);
        btn_passagem.setBorderPainted(false);
        btn_passagem.setFocusPainted(false);
        btn_passagem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_passagem.setIconTextGap(10);
        btn_passagem.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_passagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passagemActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gerenciamento");

        btn_config.setBackground(new java.awt.Color(30, 39, 114));
        btn_config.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btn_config.setForeground(new java.awt.Color(255, 255, 255));
        btn_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/configIconWhite.png"))); // NOI18N
        btn_config.setText("Configurações");
        btn_config.setBorder(null);
        btn_config.setBorderPainted(false);
        btn_config.setFocusPainted(false);
        btn_config.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_config.setIconTextGap(10);
        btn_config.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configActionPerformed(evt);
            }
        });

        btn_dashboard.setBackground(new java.awt.Color(30, 39, 114));
        btn_dashboard.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estatisticasIconWhite.png"))); // NOI18N
        btn_dashboard.setText("Dashboard      ");
        btn_dashboard.setBorder(null);
        btn_dashboard.setBorderPainted(false);
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_dashboard.setIconTextGap(10);
        btn_dashboard.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viagem.png"))); // NOI18N

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_passagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_menuLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btn_config, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_passagem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_config, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        panel_top.setBackground(new java.awt.Color(255, 255, 255));
        panel_top.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btn_user.setBackground(new java.awt.Color(255, 255, 255));
        btn_user.setForeground(new java.awt.Color(254, 254, 254));
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/userIconBlue.png"))); // NOI18N
        btn_user.setBorder(null);
        btn_user.setBorderPainted(false);
        btn_user.setFocusPainted(false);
        btn_user.setPreferredSize(new java.awt.Dimension(50, 40));
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_user, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        panelMenuCard.setBackground(new java.awt.Color(255, 255, 255));
        panelMenuCard.setLayout(new java.awt.CardLayout());

        panel_carinhoCard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Seu itens do carrinho");

        btn_removerItem.setBackground(new java.awt.Color(255, 255, 255));
        btn_removerItem.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btn_removerItem.setForeground(new java.awt.Color(255, 198, 0));
        btn_removerItem.setText("Remover Item");
        btn_removerItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 198, 0), 2));
        btn_removerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerItemActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));

        label_destino.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        label_destino.setForeground(new java.awt.Color(51, 51, 51));
        label_destino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_destino.setText("-");

        jLabel75.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setText("Valor unitario");

        label_valorunitario.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        label_valorunitario.setForeground(new java.awt.Color(51, 51, 51));
        label_valorunitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_valorunitario.setText("R$ 0");

        label_origem.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        label_origem.setForeground(new java.awt.Color(51, 51, 51));
        label_origem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_origem.setText("-");

        label_horapartida.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        label_horapartida.setForeground(new java.awt.Color(102, 102, 102));
        label_horapartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_horapartida.setText("00:00 H");

        jLabel79.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 102, 102));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Quantidade");

        label_horachegada.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        label_horachegada.setForeground(new java.awt.Color(102, 102, 102));
        label_horachegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_horachegada.setText("00:00 H");

        label_quantidade.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        label_quantidade.setForeground(new java.awt.Color(51, 51, 51));
        label_quantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_quantidade.setText("0");

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));

        label_data.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        label_data.setForeground(new java.awt.Color(153, 153, 153));
        label_data.setText("-/-/----");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_data)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(label_data))
        );

        label_valortotal.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_valortotal.setForeground(new java.awt.Color(0, 102, 204));
        label_valortotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_valortotal.setText("R$ 0");

        jLabel89.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 102, 102));
        jLabel89.setText("Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(label_valorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(label_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel75)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel79)))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_origem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label_horapartida)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(label_valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_horachegada)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel89)
                        .addGap(78, 78, 78))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(jLabel75)
                            .addComponent(jLabel89)
                            .addComponent(label_horachegada))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_destino)
                                    .addComponent(label_valortotal))
                                .addContainerGap(29, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_valorunitario)
                                    .addComponent(label_quantidade))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_horapartida)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_origem))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btn_FinalizarCompra.setBackground(new java.awt.Color(255, 198, 0));
        btn_FinalizarCompra.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btn_FinalizarCompra.setForeground(new java.awt.Color(51, 51, 51));
        btn_FinalizarCompra.setText("Finalizar Compra");
        btn_FinalizarCompra.setBorder(null);
        btn_FinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinalizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_carinhoCardLayout = new javax.swing.GroupLayout(panel_carinhoCard);
        panel_carinhoCard.setLayout(panel_carinhoCardLayout);
        panel_carinhoCardLayout.setHorizontalGroup(
            panel_carinhoCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_carinhoCardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_carinhoCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_carinhoCardLayout.createSequentialGroup()
                        .addComponent(btn_removerItem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_FinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_carinhoCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_carinhoCardLayout.setVerticalGroup(
            panel_carinhoCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_carinhoCardLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(panel_carinhoCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_removerItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_FinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        panelMenuCard.add(panel_carinhoCard, "carrinho");

        panel_passagemPCard.setBackground(new java.awt.Color(255, 255, 255));

        panel_passagemP.setLayout(null);

        label_codigoP.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_codigoP.setForeground(new java.awt.Color(0, 0, 0));
        panel_passagemP.add(label_codigoP);
        label_codigoP.setBounds(310, 80, 210, 16);

        label_passageiroP.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_passageiroP.setForeground(new java.awt.Color(0, 0, 0));
        panel_passagemP.add(label_passageiroP);
        label_passageiroP.setBounds(583, 80, 200, 16);

        label_origemP.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_origemP.setForeground(new java.awt.Color(0, 0, 0));
        panel_passagemP.add(label_origemP);
        label_origemP.setBounds(63, 162, 210, 16);

        label_horarioP.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_horarioP.setForeground(new java.awt.Color(0, 0, 0));
        label_horarioP.setText("00:00 H");
        panel_passagemP.add(label_horarioP);
        label_horarioP.setBounds(291, 241, 180, 20);

        label_estadoD.setFont(new java.awt.Font("Noto Sans", 1, 28)); // NOI18N
        label_estadoD.setForeground(new java.awt.Color(0, 0, 0));
        label_estadoD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_passagemP.add(label_estadoD);
        label_estadoD.setBounds(700, 136, 70, 50);

        label_destinoP2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_destinoP2.setForeground(new java.awt.Color(0, 0, 0));
        panel_passagemP.add(label_destinoP2);
        label_destinoP2.setBounds(312, 162, 180, 20);

        label_estadoO.setFont(new java.awt.Font("Noto Sans", 1, 28)); // NOI18N
        label_estadoO.setForeground(new java.awt.Color(0, 0, 0));
        label_estadoO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_passagemP.add(label_estadoO);
        label_estadoO.setBounds(590, 136, 70, 50);

        label_passageiroP1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label_passageiroP1.setForeground(new java.awt.Color(0, 0, 0));
        panel_passagemP.add(label_passageiroP1);
        label_passageiroP1.setBounds(64, 80, 210, 16);

        label_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/passagem.png"))); // NOI18N
        label_back.setText("Londrina");
        panel_passagemP.add(label_back);
        label_back.setBounds(0, 0, 800, 365);

        btn_download.setBackground(new java.awt.Color(255, 255, 255));
        btn_download.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btn_download.setForeground(new java.awt.Color(30, 39, 114));
        btn_download.setText("Download");
        btn_download.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 39, 114), 2, true));
        btn_download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_downloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_passagemPCardLayout = new javax.swing.GroupLayout(panel_passagemPCard);
        panel_passagemPCard.setLayout(panel_passagemPCardLayout);
        panel_passagemPCardLayout.setHorizontalGroup(
            panel_passagemPCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_passagemPCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_passagemPCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_passagemPCardLayout.createSequentialGroup()
                        .addComponent(panel_passagemP, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_passagemPCardLayout.createSequentialGroup()
                        .addComponent(btn_download, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(491, 491, 491))))
        );
        panel_passagemPCardLayout.setVerticalGroup(
            panel_passagemPCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_passagemPCardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_passagemP, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_download, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        panelMenuCard.add(panel_passagemPCard, "historico");

        panel_configCard.setBackground(new java.awt.Color(255, 255, 255));

        btn_addFunc.setBackground(new java.awt.Color(247, 247, 247));
        btn_addFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionar.png"))); // NOI18N
        btn_addFunc.setBorder(null);
        btn_addFunc.setBorderPainted(false);
        btn_addFunc.setFocusPainted(false);
        btn_addFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addFuncActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Adicionar");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Funcionario");

        jLabel17.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Remover");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Funcionario");

        btn_removeFunc.setBackground(new java.awt.Color(247, 247, 247));
        btn_removeFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remover.png"))); // NOI18N
        btn_removeFunc.setBorder(null);
        btn_removeFunc.setBorderPainted(false);
        btn_removeFunc.setFocusPainted(false);
        btn_removeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeFuncActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Funcionario");

        btn_registroFunc.setBackground(new java.awt.Color(247, 247, 247));
        btn_registroFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cracha.png"))); // NOI18N
        btn_registroFunc.setBorder(null);
        btn_registroFunc.setBorderPainted(false);
        btn_registroFunc.setFocusPainted(false);
        btn_registroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroFuncActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("buscar");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Salario");

        btn_salario.setBackground(new java.awt.Color(247, 247, 247));
        btn_salario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salario_1.png"))); // NOI18N
        btn_salario.setBorder(null);
        btn_salario.setBorderPainted(false);
        btn_salario.setFocusPainted(false);
        btn_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salarioActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Ajustar");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Quantidade");

        btn_qtdVip.setBackground(new java.awt.Color(247, 247, 247));
        btn_qtdVip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/analise.png"))); // NOI18N
        btn_qtdVip.setBorder(null);
        btn_qtdVip.setBorderPainted(false);
        btn_qtdVip.setFocusPainted(false);
        btn_qtdVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qtdVipActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Vip");

        btn_taxaVoo.setBackground(new java.awt.Color(247, 247, 247));
        btn_taxaVoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/taxa.png"))); // NOI18N
        btn_taxaVoo.setBorder(null);
        btn_taxaVoo.setBorderPainted(false);
        btn_taxaVoo.setFocusPainted(false);
        btn_taxaVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taxaVooActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Taxa");

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Voo");

        btn_addVoo.setBackground(new java.awt.Color(247, 247, 247));
        btn_addVoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/assento.png"))); // NOI18N
        btn_addVoo.setBorder(null);
        btn_addVoo.setBorderPainted(false);
        btn_addVoo.setFocusPainted(false);
        btn_addVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addVooActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Adicionar");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Voo");

        btn_addCompanhia.setBackground(new java.awt.Color(247, 247, 247));
        btn_addCompanhia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/aviao.png"))); // NOI18N
        btn_addCompanhia.setBorder(null);
        btn_addCompanhia.setBorderPainted(false);
        btn_addCompanhia.setFocusPainted(false);
        btn_addCompanhia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCompanhiaActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Adicionar");

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Companhia");

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Desconto");

        jLabel40.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Vip");

        btn_descontoVip.setBackground(new java.awt.Color(247, 247, 247));
        btn_descontoVip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/desconto.png"))); // NOI18N
        btn_descontoVip.setBorder(null);
        btn_descontoVip.setBorderPainted(false);
        btn_descontoVip.setFocusPainted(false);
        btn_descontoVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descontoVipActionPerformed(evt);
            }
        });

        btn_removeCompanhia.setBackground(new java.awt.Color(247, 247, 247));
        btn_removeCompanhia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/removeraviao.png"))); // NOI18N
        btn_removeCompanhia.setBorder(null);
        btn_removeCompanhia.setBorderPainted(false);
        btn_removeCompanhia.setFocusPainted(false);
        btn_removeCompanhia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeCompanhiaActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Remover");

        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Companhia ");

        subpanel_CardConfig.setLayout(new java.awt.CardLayout());

        panel_addAeroporto.setBackground(new java.awt.Color(247, 247, 247));

        jLabel45.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Nome do aeroporto");

        textNameAero.setBackground(new java.awt.Color(255, 255, 255));
        textNameAero.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNameAero.setToolTipText("");
        textNameAero.setCaretColor(new java.awt.Color(30, 39, 114));
        textNameAero.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNameAero.setSelectionColor(new java.awt.Color(153, 204, 255));

        textCidadeAero.setBackground(new java.awt.Color(255, 255, 255));
        textCidadeAero.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCidadeAero.setToolTipText("");
        textCidadeAero.setCaretColor(new java.awt.Color(30, 39, 114));
        textCidadeAero.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCidadeAero.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel46.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Cidade");

        textEstadoAero.setBackground(new java.awt.Color(255, 255, 255));
        textEstadoAero.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEstadoAero.setToolTipText("");
        textEstadoAero.setCaretColor(new java.awt.Color(30, 39, 114));
        textEstadoAero.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEstadoAero.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel47.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Estado");

        jLabel48.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Pais");

        textPaisAero.setBackground(new java.awt.Color(255, 255, 255));
        textPaisAero.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textPaisAero.setToolTipText("");
        textPaisAero.setCaretColor(new java.awt.Color(30, 39, 114));
        textPaisAero.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textPaisAero.setSelectionColor(new java.awt.Color(153, 204, 255));

        textCodigoAero.setBackground(new java.awt.Color(255, 255, 255));
        textCodigoAero.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCodigoAero.setToolTipText("");
        textCodigoAero.setCaretColor(new java.awt.Color(30, 39, 114));
        textCodigoAero.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCodigoAero.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel49.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Codigo (#0000) ");

        criarAeroporto.setBackground(new java.awt.Color(255, 198, 0));
        criarAeroporto.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarAeroporto.setForeground(new java.awt.Color(0, 0, 0));
        criarAeroporto.setText("Adicionar aeroporto");
        criarAeroporto.setBorderPainted(false);
        criarAeroporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarAeroportoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Adicionar um aeroporto no sistema");

        javax.swing.GroupLayout panel_addAeroportoLayout = new javax.swing.GroupLayout(panel_addAeroporto);
        panel_addAeroporto.setLayout(panel_addAeroportoLayout);
        panel_addAeroportoLayout.setHorizontalGroup(
            panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addAeroportoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textCodigoAero, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textPaisAero, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textEstadoAero, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textCidadeAero, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textNameAero, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addAeroportoLayout.createSequentialGroup()
                        .addComponent(criarAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_addAeroportoLayout.setVerticalGroup(
            panel_addAeroportoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addAeroportoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNameAero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCidadeAero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEstadoAero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPaisAero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCodigoAero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(criarAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        subpanel_CardConfig.add(panel_addAeroporto, "aeroporto");

        panel_addTrecho.setBackground(new java.awt.Color(247, 247, 247));
        panel_addTrecho.setForeground(new java.awt.Color(247, 247, 247));

        jLabel51.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Adicionar um trecho de voo no sistema");

        jLabel52.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Codigo (AAA00000)");

        textCodigoTrecho.setBackground(new java.awt.Color(255, 255, 255));
        textCodigoTrecho.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCodigoTrecho.setToolTipText("");
        textCodigoTrecho.setCaretColor(new java.awt.Color(30, 39, 114));
        textCodigoTrecho.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCodigoTrecho.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel53.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Aeroporto Destino");

        jLabel54.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("Hora de saida (00:00)");

        textHoraSaidaTrecho.setBackground(new java.awt.Color(255, 255, 255));
        textHoraSaidaTrecho.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textHoraSaidaTrecho.setToolTipText("");
        textHoraSaidaTrecho.setCaretColor(new java.awt.Color(30, 39, 114));
        textHoraSaidaTrecho.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textHoraSaidaTrecho.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel55.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Hora de chegada (00:00)");

        textHoraChegadaTrecho.setBackground(new java.awt.Color(255, 255, 255));
        textHoraChegadaTrecho.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textHoraChegadaTrecho.setToolTipText("");
        textHoraChegadaTrecho.setCaretColor(new java.awt.Color(30, 39, 114));
        textHoraChegadaTrecho.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textHoraChegadaTrecho.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel56.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Companhia Aerea");

        criarTrecho.setBackground(new java.awt.Color(255, 198, 0));
        criarTrecho.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarTrecho.setForeground(new java.awt.Color(0, 0, 0));
        criarTrecho.setText("Adicionar Trecho de Voo");
        criarTrecho.setBorderPainted(false);
        criarTrecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarTrechoActionPerformed(evt);
            }
        });

        comboBox_origem.setBackground(new java.awt.Color(255, 255, 255));
        comboBox_origem.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        comboBox_origem.setForeground(new java.awt.Color(0, 0, 0));
        comboBox_origem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_origem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel57.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("Aeroporto Origem");

        comboBox_destino.setBackground(new java.awt.Color(255, 255, 255));
        comboBox_destino.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        comboBox_destino.setForeground(new java.awt.Color(0, 0, 0));
        comboBox_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_destino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        comboBoxCompanhia.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxCompanhia.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        comboBoxCompanhia.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxCompanhia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCompanhia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout panel_addTrechoLayout = new javax.swing.GroupLayout(panel_addTrecho);
        panel_addTrecho.setLayout(panel_addTrechoLayout);
        panel_addTrechoLayout.setHorizontalGroup(
            panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addTrechoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(criarTrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addTrechoLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addTrechoLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel57)
                        .addGroup(panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCodigoTrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_origem, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBox_destino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textHoraSaidaTrecho, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textHoraChegadaTrecho, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_addTrechoLayout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addGap(268, 268, 268))
                                    .addComponent(comboBoxCompanhia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(27, 27, 27))
        );
        panel_addTrechoLayout.setVerticalGroup(
            panel_addTrechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addTrechoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCodigoTrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(1, 1, 1)
                .addComponent(comboBox_origem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textHoraSaidaTrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textHoraChegadaTrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(criarTrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subpanel_CardConfig.add(panel_addTrecho, "trecho");

        panel_addFuncionario.setBackground(new java.awt.Color(247, 247, 247));

        jLabel21.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Senha");

        textEmailFunc.setBackground(new java.awt.Color(255, 255, 255));
        textEmailFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEmailFunc.setToolTipText("");
        textEmailFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textEmailFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEmailFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel22.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Email");

        textDataNascFunc.setBackground(new java.awt.Color(255, 255, 255));
        textDataNascFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textDataNascFunc.setToolTipText("");
        textDataNascFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textDataNascFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textDataNascFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel33.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Data de nascimento (dd/mm/yyyy)");

        textEndereçoFunc.setBackground(new java.awt.Color(255, 255, 255));
        textEndereçoFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textEndereçoFunc.setToolTipText("");
        textEndereçoFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textEndereçoFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textEndereçoFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel34.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Endereço");

        textCpfFunc.setBackground(new java.awt.Color(255, 255, 255));
        textCpfFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCpfFunc.setToolTipText("");
        textCpfFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textCpfFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCpfFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel58.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("CPF ");

        textCarteiraFunc.setBackground(new java.awt.Color(255, 255, 255));
        textCarteiraFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCarteiraFunc.setToolTipText("");
        textCarteiraFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textCarteiraFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCarteiraFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel59.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Numero da carteira");

        textNameFunc.setBackground(new java.awt.Color(255, 255, 255));
        textNameFunc.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNameFunc.setToolTipText("");
        textNameFunc.setCaretColor(new java.awt.Color(30, 39, 114));
        textNameFunc.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNameFunc.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel60.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Nome do funcionario");

        criarContaFunc.setBackground(new java.awt.Color(255, 198, 0));
        criarContaFunc.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarContaFunc.setForeground(new java.awt.Color(0, 0, 0));
        criarContaFunc.setText("Adicionar Funcionario");
        criarContaFunc.setBorderPainted(false);
        criarContaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaFuncActionPerformed(evt);
            }
        });

        textSenhaFunc.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_addFuncionarioLayout = new javax.swing.GroupLayout(panel_addFuncionario);
        panel_addFuncionario.setLayout(panel_addFuncionarioLayout);
        panel_addFuncionarioLayout.setHorizontalGroup(
            panel_addFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addFuncionarioLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(panel_addFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addFuncionarioLayout.createSequentialGroup()
                        .addComponent(criarContaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel59)
                        .addComponent(textCarteiraFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addComponent(jLabel60)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(textEmailFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel33)
                        .addComponent(textDataNascFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel34)
                        .addComponent(textEndereçoFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel58)
                        .addComponent(textCpfFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textNameFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addComponent(textSenhaFunc)))
                .addGap(26, 26, 26))
        );
        panel_addFuncionarioLayout.setVerticalGroup(
            panel_addFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNameFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addGap(4, 4, 4)
                .addComponent(textCarteiraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEndereçoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addGap(4, 4, 4)
                .addComponent(textDataNascFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addGap(4, 4, 4)
                .addComponent(textEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(criarContaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        subpanel_CardConfig.add(panel_addFuncionario, "addFuncionario");

        panel_addCompanhia.setBackground(new java.awt.Color(247, 247, 247));

        jLabel61.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Nome Oficial");

        textNomeOficial.setBackground(new java.awt.Color(255, 255, 255));
        textNomeOficial.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNomeOficial.setToolTipText("");
        textNomeOficial.setCaretColor(new java.awt.Color(30, 39, 114));
        textNomeOficial.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNomeOficial.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel62.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Nome de divulgação");

        textNomeDivulga.setBackground(new java.awt.Color(255, 255, 255));
        textNomeDivulga.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNomeDivulga.setToolTipText("");
        textNomeDivulga.setCaretColor(new java.awt.Color(30, 39, 114));
        textNomeDivulga.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNomeDivulga.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel63.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Cnpj");

        textCnpj.setBackground(new java.awt.Color(255, 255, 255));
        textCnpj.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textCnpj.setToolTipText("");
        textCnpj.setCaretColor(new java.awt.Color(30, 39, 114));
        textCnpj.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textCnpj.setSelectionColor(new java.awt.Color(153, 204, 255));

        criarCompanhia.setBackground(new java.awt.Color(255, 198, 0));
        criarCompanhia.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarCompanhia.setForeground(new java.awt.Color(0, 0, 0));
        criarCompanhia.setText("Adicionar Companhia");
        criarCompanhia.setBorderPainted(false);
        criarCompanhia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarCompanhiaActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Adicionar Companhia Aerea");

        javax.swing.GroupLayout panel_addCompanhiaLayout = new javax.swing.GroupLayout(panel_addCompanhia);
        panel_addCompanhia.setLayout(panel_addCompanhiaLayout);
        panel_addCompanhiaLayout.setHorizontalGroup(
            panel_addCompanhiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addCompanhiaLayout.createSequentialGroup()
                .addGroup(panel_addCompanhiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_addCompanhiaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel_addCompanhiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_addCompanhiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textNomeDivulga, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_addCompanhiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textCnpj)
                                .addComponent(textNomeOficial, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_addCompanhiaLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(criarCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_addCompanhiaLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel64)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel_addCompanhiaLayout.setVerticalGroup(
            panel_addCompanhiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addCompanhiaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel64)
                .addGap(35, 35, 35)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNomeOficial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addGap(4, 4, 4)
                .addComponent(textNomeDivulga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(criarCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        subpanel_CardConfig.add(panel_addCompanhia, "Companhia");

        panel_addVoo.setBackground(new java.awt.Color(247, 247, 247));

        jLabel65.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Data do voo (dd/mm/yyyy)");

        textDataVoo.setBackground(new java.awt.Color(255, 255, 255));
        textDataVoo.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textDataVoo.setToolTipText("");
        textDataVoo.setCaretColor(new java.awt.Color(30, 39, 114));
        textDataVoo.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textDataVoo.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel66.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 102));
        jLabel66.setText("Hora de partida (00:00)");

        textHoraPartida.setBackground(new java.awt.Color(255, 255, 255));
        textHoraPartida.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textHoraPartida.setToolTipText("");
        textHoraPartida.setCaretColor(new java.awt.Color(30, 39, 114));
        textHoraPartida.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textHoraPartida.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel67.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("Hora de chegada (00:00)");

        textHoraChegada.setBackground(new java.awt.Color(255, 255, 255));
        textHoraChegada.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textHoraChegada.setToolTipText("");
        textHoraChegada.setCaretColor(new java.awt.Color(30, 39, 114));
        textHoraChegada.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textHoraChegada.setSelectionColor(new java.awt.Color(153, 204, 255));

        textNumeroVagas.setBackground(new java.awt.Color(255, 255, 255));
        textNumeroVagas.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textNumeroVagas.setToolTipText("");
        textNumeroVagas.setCaretColor(new java.awt.Color(30, 39, 114));
        textNumeroVagas.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textNumeroVagas.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel68.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 102, 102));
        jLabel68.setText("Numero de vagas");

        jLabel69.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("Trecho de Voo");

        textValorPassagem.setBackground(new java.awt.Color(255, 255, 255));
        textValorPassagem.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textValorPassagem.setToolTipText("");
        textValorPassagem.setCaretColor(new java.awt.Color(30, 39, 114));
        textValorPassagem.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textValorPassagem.setSelectionColor(new java.awt.Color(153, 204, 255));

        jLabel70.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 102, 102));
        jLabel70.setText("Valor da passagem (100.0)");

        comboBox_trecho.setBackground(new java.awt.Color(255, 255, 255));
        comboBox_trecho.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        comboBox_trecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        criarVoo.setBackground(new java.awt.Color(255, 198, 0));
        criarVoo.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        criarVoo.setForeground(new java.awt.Color(0, 0, 0));
        criarVoo.setText("Adicionar Voo");
        criarVoo.setBorderPainted(false);
        criarVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarVooActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 102, 102));
        jLabel71.setText("ID do voo (único para cada voo do Trecho)");

        textID.setBackground(new java.awt.Color(255, 255, 255));
        textID.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        textID.setToolTipText("");
        textID.setCaretColor(new java.awt.Color(30, 39, 114));
        textID.setMargin(new java.awt.Insets(2, 13, 2, 13));
        textID.setSelectionColor(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout panel_addVooLayout = new javax.swing.GroupLayout(panel_addVoo);
        panel_addVoo.setLayout(panel_addVooLayout);
        panel_addVooLayout.setHorizontalGroup(
            panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addVooLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addVooLayout.createSequentialGroup()
                        .addGroup(panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel70)
                                .addComponent(textValorPassagem)
                                .addComponent(textNumeroVagas)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel66)
                                    .addComponent(textHoraPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textHoraChegada)
                                        .addComponent(textDataVoo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel69)
                                .addComponent(comboBox_trecho, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addVooLayout.createSequentialGroup()
                        .addComponent(criarVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        panel_addVooLayout.setVerticalGroup(
            panel_addVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_addVooLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDataVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addGap(4, 4, 4)
                .addComponent(textHoraPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textHoraChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNumeroVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textValorPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_trecho, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criarVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        subpanel_CardConfig.add(panel_addVoo, "voo");

        btn_addVoo1.setBackground(new java.awt.Color(247, 247, 247));
        btn_addVoo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trecho.png"))); // NOI18N
        btn_addVoo1.setBorder(null);
        btn_addVoo1.setBorderPainted(false);
        btn_addVoo1.setFocusPainted(false);
        btn_addVoo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addVoo1ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Criar");

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("TrechoVoo");

        btn_addAeroporto.setBackground(new java.awt.Color(247, 247, 247));
        btn_addAeroporto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bagagem.png"))); // NOI18N
        btn_addAeroporto.setBorder(null);
        btn_addAeroporto.setBorderPainted(false);
        btn_addAeroporto.setFocusPainted(false);
        btn_addAeroporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addAeroportoActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Adicionar");

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Aeroporto");

        javax.swing.GroupLayout panel_configCardLayout = new javax.swing.GroupLayout(panel_configCard);
        panel_configCard.setLayout(panel_configCardLayout);
        panel_configCardLayout.setHorizontalGroup(
            panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configCardLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addGroup(panel_configCardLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel20)))
                        .addGap(22, 22, 22)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel23))
                                    .addComponent(jLabel24)))))
                    .addGroup(panel_configCardLayout.createSequentialGroup()
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_configCardLayout.createSequentialGroup()
                                .addComponent(btn_addFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_removeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_configCardLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))))
                        .addGap(18, 18, 18)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_addAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel44)
                                        .addComponent(jLabel43)))
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel35))
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(btn_addVoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(panel_configCardLayout.createSequentialGroup()
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_qtdVip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26))
                            .addComponent(jLabel25))
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_descontoVip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel39))
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel40))))
                    .addGroup(panel_configCardLayout.createSequentialGroup()
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_addCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_configCardLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel30))
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29)
                                    .addComponent(btn_addVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38)
                                .addComponent(jLabel37)))
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_removeCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btn_taxaVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel28))
                                    .addComponent(jLabel27))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(subpanel_CardConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panel_configCardLayout.setVerticalGroup(
            panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configCardLayout.createSequentialGroup()
                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_configCardLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addComponent(btn_addFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(2, 2, 2)
                                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel23)))
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_removeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_registroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel20))))
                                .addGap(18, 18, 18)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addComponent(btn_qtdVip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26)
                                        .addGap(0, 0, 0)
                                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel39)))
                                    .addGroup(panel_configCardLayout.createSequentialGroup()
                                        .addComponent(btn_descontoVip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel40))))
                            .addGroup(panel_configCardLayout.createSequentialGroup()
                                .addComponent(btn_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_configCardLayout.createSequentialGroup()
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_removeCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_addCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_addAeroporto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel43))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_configCardLayout.createSequentialGroup()
                                .addComponent(btn_addVoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel36))))
                        .addGap(36, 36, 36)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_addVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_taxaVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(0, 0, 0)
                        .addGroup(panel_configCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28)))
                    .addGroup(panel_configCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subpanel_CardConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelMenuCard.add(panel_configCard, "config");

        javax.swing.GroupLayout panel_dashboardCardLayout = new javax.swing.GroupLayout(panel_dashboardCard);
        panel_dashboardCard.setLayout(panel_dashboardCardLayout);
        panel_dashboardCardLayout.setHorizontalGroup(
            panel_dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        panel_dashboardCardLayout.setVerticalGroup(
            panel_dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        panelMenuCard.add(panel_dashboardCard, "dashboard");

        panel_userCard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Nome");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("CPF");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Endereço");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Data de nascimento");

        lavel_data.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        lavel_data.setForeground(new java.awt.Color(0, 0, 0));
        lavel_data.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Sua conta");

        label_name.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(0, 0, 0));
        label_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        label_cpf.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        label_cpf.setForeground(new java.awt.Color(0, 0, 0));
        label_cpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        label_endereco.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        label_endereco.setForeground(new java.awt.Color(0, 0, 0));
        label_endereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        javax.swing.GroupLayout panel_userCardLayout = new javax.swing.GroupLayout(panel_userCard);
        panel_userCard.setLayout(panel_userCardLayout);
        panel_userCardLayout.setHorizontalGroup(
            panel_userCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_userCardLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panel_userCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(label_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lavel_data, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(663, Short.MAX_VALUE))
        );
        panel_userCardLayout.setVerticalGroup(
            panel_userCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_userCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavel_data, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        panelMenuCard.add(panel_userCard, "user");

        panel_passagensCard.setBackground(new java.awt.Color(255, 255, 255));

        textOrigem.setBackground(new java.awt.Color(255, 255, 255));
        textOrigem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        textOrigem.setForeground(new java.awt.Color(102, 102, 102));
        textOrigem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textOrigem.setPreferredSize(new java.awt.Dimension(45, 25));

        btn_busca.setBackground(new java.awt.Color(255, 198, 0));
        btn_busca.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btn_busca.setForeground(new java.awt.Color(0, 0, 0));
        btn_busca.setText("Buscar");
        btn_busca.setBorderPainted(false);
        btn_busca.setFocusPainted(false);
        btn_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaActionPerformed(evt);
            }
        });

        textDestino.setBackground(new java.awt.Color(255, 255, 255));
        textDestino.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        textDestino.setForeground(new java.awt.Color(102, 102, 102));
        textDestino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        textDestino.setPreferredSize(new java.awt.Dimension(46, 25));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        table.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setToolTipText("");
        table.setGridColor(new java.awt.Color(153, 153, 153));
        table.setRowHeight(28);
        table.setRowMargin(3);
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table.setSelectionForeground(new java.awt.Color(102, 102, 102));
        table.setShowGrid(false);
        table.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(table);

        btn_filtroData.setBackground(new java.awt.Color(247, 247, 247));
        btn_filtroData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        btn_filtroData.setBorder(null);
        btn_filtroData.setBorderPainted(false);
        btn_filtroData.setFocusPainted(false);

        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("origem");

        jLabel74.setForeground(new java.awt.Color(102, 102, 102));
        jLabel74.setText("destino");

        btn_All.setBackground(new java.awt.Color(247, 247, 247));
        btn_All.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/globo.png"))); // NOI18N
        btn_All.setBorder(null);
        btn_All.setBorderPainted(false);
        btn_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_passagensCardLayout = new javax.swing.GroupLayout(panel_passagensCard);
        panel_passagensCard.setLayout(panel_passagensCardLayout);
        panel_passagensCardLayout.setHorizontalGroup(
            panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_passagensCardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_passagensCardLayout.createSequentialGroup()
                        .addGroup(panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_passagensCardLayout.createSequentialGroup()
                                .addComponent(textDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_filtroData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_passagensCardLayout.createSequentialGroup()
                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_passagensCardLayout.setVerticalGroup(
            panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_passagensCardLayout.createSequentialGroup()
                .addGroup(panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_passagensCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_filtroData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        panelMenuCard.add(panel_passagensCard, "passagem");

        javax.swing.GroupLayout panel_containerLayout = new javax.swing.GroupLayout(panel_container);
        panel_container.setLayout(panel_containerLayout);
        panel_containerLayout.setHorizontalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMenuCard, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_containerLayout.setVerticalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMenuCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //metodos para trocar de tela
    private void btn_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historicoActionPerformed
        btn_efeito(evt, btn_historico);
        CardLayout passagensCard = (CardLayout) panelMenuCard.getLayout();
        passagensCard.show(panelMenuCard, "historico");
    }//GEN-LAST:event_btn_historicoActionPerformed
    
    private void btn_carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinhoActionPerformed
        btn_efeito(evt, btn_carrinho);
        CardLayout passagensCard = (CardLayout) panelMenuCard.getLayout();
        passagensCard.show(panelMenuCard, "carrinho");
 
    }//GEN-LAST:event_btn_carrinhoActionPerformed

    private void btn_passagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_passagemActionPerformed
        btn_efeito(evt, btn_passagem);  
        CardLayout passagensCard = (CardLayout) panelMenuCard.getLayout();
        passagensCard.show(panelMenuCard, "passagem");
    }//GEN-LAST:event_btn_passagemActionPerformed

    private void btn_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configActionPerformed
        String senhaDigitada = JOptionPane.showInputDialog(this, "Area com acesso restrito\nDigite a senha:", "Autenticação", JOptionPane.PLAIN_MESSAGE);
        if (senhaDigitada != null && senhaDigitada.equals("admin")) {
            btn_efeito(evt, btn_config);
            CardLayout passagensCard = (CardLayout) panelMenuCard.getLayout();
            passagensCard.show(panelMenuCard, "config");
        } 
        else {
            JOptionPane.showMessageDialog(this, "Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_configActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        btn_efeito(evt, btn_dashboard);
        CardLayout passagensCard = (CardLayout) panelMenuCard.getLayout();
        passagensCard.show(panelMenuCard, "dashboard");
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        CardLayout passagensCard = (CardLayout) panelMenuCard.getLayout();
        passagensCard.show(panelMenuCard, "user");

    }//GEN-LAST:event_btn_userActionPerformed
    
    //definir a quantidade de comprar necessarias para se tornar vip
    private void btn_qtdVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qtdVipActionPerformed
        int quantidadeAtual = GerenciadorGeral.getNumeroCompraVip();
        String qtd = JOptionPane.showInputDialog(this, "Digite a nova quantidade para cliente se tornar VIP\nQuantidade atual: " + quantidadeAtual);
        if (qtd != null) {
            int novaQuantidade = Integer.parseInt(qtd);
            GerenciadorGeral.setNumeroCompraVip(novaQuantidade);
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_qtdVipActionPerformed
    
    //definir o desconto para vip
    private void btn_descontoVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descontoVipActionPerformed
        float descontoAtual = GerenciadorGeral.getDescontoVip();
        String desconto = JOptionPane.showInputDialog(this, "Digite valor do desconto em decimal\nexemplo 0.05 (5%).\nValor de 0.01 a 1\n\nDesconto atual: " + descontoAtual);
        float novoDesconto = Float.parseFloat(desconto);
        if (novoDesconto >= 0.01 && novoDesconto <= 1) {
            GerenciadorGeral.setDescontoVip(novoDesconto);
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, digite um valor válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_descontoVipActionPerformed
    
    //atualizar o table para mostrar os Trechos de acordo com a pesquisa do cliente
    private void btn_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaActionPerformed
        String origem = textOrigem.getText();
        String destino = textDestino.getText();
        Pesquisa pesquisa = new Pesquisa(origem, destino);
        
        ArrayList<TrechoVoo> resultados = (ArrayList<TrechoVoo>) GerenciadorPesquisas.pesquisarVoos(pesquisa);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnCount(4); 
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"Codigo","Cidade origem", "Cidade destino","Companhia Aérea"});

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.setBackground(Color.WHITE);
        table.setOpaque(true); 

        table.setShowGrid(false);
        table.setShowVerticalLines(false);

        if(resultados.isEmpty()){
            JOptionPane.showMessageDialog(this, "Não foi encontrado Trechos para sua pesquisa\n", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
           for (TrechoVoo trecho : resultados) {
                model.addRow(new Object[] {trecho.getCodigo(), trecho.getAeroportoCidadeOrigem(), trecho.getAeroportoCidaDestino(),trecho.getCompanhiaAerea().getNomeDivulga()});
            } 
        }
        revalidate();
        repaint();
        AUXILIAR = 0;
    }//GEN-LAST:event_btn_buscaActionPerformed
    
    //criação de aeroporto
    private void criarAeroportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarAeroportoActionPerformed
       String nomeAero = textNameAero.getText();
       String cidade = textCidadeAero.getText();
       String estado = textEstadoAero.getText();
       String pais = textPaisAero.getText();
       String codigo = textCodigoAero.getText();
       
       if(!nomeAero.isEmpty() && !cidade.isEmpty() && !estado.isEmpty() && !pais.isEmpty() && !codigo.isEmpty()){
            Aeroporto aeroporto = new Aeroporto(nomeAero, cidade, estado, pais, codigo);
            DadosAeroporto.adicionarAeroporto(aeroporto);
            ComboBoxPersonalizado();
            JOptionPane.showMessageDialog(this, "Aeroporto adicionado!", "Cadastro concluido", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           JOptionPane.showMessageDialog(this, "Por favor, preencha todos os dados", "Erro", JOptionPane.ERROR_MESSAGE);
       }

    }//GEN-LAST:event_criarAeroportoActionPerformed
    
    //criação do Trecho de voo
    private void criarTrechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarTrechoActionPerformed
       String codigo = textCodigoTrecho.getText();
       String horaSaidaString = textHoraSaidaTrecho.getText();
       String horaChegadaString = textHoraChegadaTrecho.getText();
       
       if (TrechoVoo.validarCodigo(codigo) && GerenciadorGeral.validarFormatoHora(horaSaidaString) && GerenciadorGeral.validarFormatoHora(horaChegadaString) && aeroportoOrigem != null && aeroportoDestino != null) {
           if(DadosTrechosVoo.buscarTrecho(codigo) == null){
                LocalTime horaSaida = LocalTime.parse(horaSaidaString);
                LocalTime horaChegada = LocalTime.parse(horaChegadaString);
                TrechoVoo trecho = new TrechoVoo(codigo, aeroportoOrigem, aeroportoDestino, horaSaida, horaChegada, companhia);
                DadosTrechosVoo.adicionarTrechoo(trecho);
                JOptionPane.showMessageDialog(this, "Trecho de Voo adicionado!\n\n" + trecho.getAeroportoCidadeOrigem() + " --> " + trecho.getAeroportoCidaDestino(), "Cadastro concluido", JOptionPane.INFORMATION_MESSAGE);
                ComboBoxPersonalizado();
           }
           else{
               JOptionPane.showMessageDialog(this, "Já existe este codigo cadastrado\nPorfavor tente outro.", "Erro", JOptionPane.ERROR_MESSAGE); 
           }
       } 
       else {
           JOptionPane.showMessageDialog(this, "Não foi possivel cadastrar o Trecho de Voo\n Porfavor, tente novamente!", "Erro", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_criarTrechoActionPerformed
    
    //metodos para trocar de tela
    private void btn_addAeroportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addAeroportoActionPerformed
       CardLayout passagensCard = (CardLayout) subpanel_CardConfig.getLayout();
       passagensCard.show(subpanel_CardConfig, "aeroporto");
    }//GEN-LAST:event_btn_addAeroportoActionPerformed

    private void btn_addVoo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addVoo1ActionPerformed
       comboBox_origem.repaint();
       CardLayout passagensCard = (CardLayout) subpanel_CardConfig.getLayout();
       passagensCard.show(subpanel_CardConfig, "trecho");
    }//GEN-LAST:event_btn_addVoo1ActionPerformed

    private void btn_addFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addFuncActionPerformed
       CardLayout passagensCard = (CardLayout) subpanel_CardConfig.getLayout();
       passagensCard.show(subpanel_CardConfig, "addFuncionario");
    }//GEN-LAST:event_btn_addFuncActionPerformed
    
    //Criação de conta para funcionario
    private void criarContaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaFuncActionPerformed
        String nome = textNameFunc.getText();
        String cpf = textCpfFunc.getText();
        String endereco = textEndereçoFunc.getText();
        LocalDate dataNasc = LocalDate.parse(textDataNascFunc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String numeroCarteira = textCarteiraFunc.getText();
        String senha = textSenhaFunc.getText();
        
        if (!nome.isEmpty() && !cpf.isEmpty() && !endereco.isEmpty() && !numeroCarteira.isEmpty() && !senha.isEmpty() && Pessoa.validarCpf(cpf)){
            Funcionario funcionario = new Funcionario(nome, cpf, endereco, dataNasc, numeroCarteira, senha);
            DadosFuncionario.adicionarFuncionario(funcionario);
            conexao.inserirFuncionarioBanco(funcionario);
            JOptionPane.showMessageDialog(this, "Funcionário criado com sucesso!", "Cadastro comcluido", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar funcionário\nTente novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_criarContaFuncActionPerformed

    //Remoção de funcionario
    private void btn_removeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeFuncActionPerformed
        String numero = JOptionPane.showInputDialog(this, "Digite numero carteira do funcionário\nque deseja remover: " );
        if (numero != null) {
            if(DadosFuncionario.excluir(numero)){
                conexao.removerFuncionarioBanco(numero);
                JOptionPane.showMessageDialog(this, "Funcionario removido do sistema com sucesso.", "Funcionario Removido", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Funcionário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_removeFuncActionPerformed
    
    //Buscar e verificar funcionario
    private void btn_registroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroFuncActionPerformed
       String numero = JOptionPane.showInputDialog(this, "Digite numero carteira do funcionário: ", "Buscar Funcionário", JOptionPane.QUESTION_MESSAGE);
        if (numero != null) {
            Funcionario funcionarioEncontrado = null;
            funcionarioEncontrado = DadosFuncionario.buscar(numero);
            if (funcionarioEncontrado != null) {
                String mensagem = "Nome: " + funcionarioEncontrado.getNome() + "\n"
                                + "CPF: " + funcionarioEncontrado.getCpf() + "\n"
                                + "Cargo: " + funcionarioEncontrado.getEndereco() + "\n"
                                + "Salário: " + funcionarioEncontrado.getDataNasc() + "\n"
                                + "Salário: " + funcionarioEncontrado.getSalarioFixo() + "\n";

                JOptionPane.showMessageDialog(this, mensagem, "Informações do Funcionário", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
                JOptionPane.showMessageDialog(this, "Funcionário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Digite um numero válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_registroFuncActionPerformed
    
    //Ajustar salario do funcionario
    private void btn_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salarioActionPerformed
        String numero = JOptionPane.showInputDialog(this, "Digite numero carteira do funcionário: ", "Buscar Funcionário", JOptionPane.QUESTION_MESSAGE);
        if (numero != null) {
            Funcionario funcionarioEncontrado = null;
            funcionarioEncontrado = DadosFuncionario.buscar(numero);
            if(funcionarioEncontrado != null){
                float salarioAtual = funcionarioEncontrado.getSalarioFixo();
                String salario = JOptionPane.showInputDialog(this, "Digite valor novo salário.\nSalário atual: " + salarioAtual);
                
                float novoSalario = Float.parseFloat(salario);
                funcionarioEncontrado.setSalarioFixo(novoSalario);
                conexao.atualizarSalarioFuncionario(numero, novoSalario);
            }
            else{
                JOptionPane.showMessageDialog(this, "Funcionário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_salarioActionPerformed
    
    //metodo trocar de tela
    private void btn_addCompanhiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCompanhiaActionPerformed
       CardLayout passagensCard = (CardLayout) subpanel_CardConfig.getLayout();
       passagensCard.show(subpanel_CardConfig, "Companhia");
    }//GEN-LAST:event_btn_addCompanhiaActionPerformed
    
    //Criação de companhia Aerea
    private void criarCompanhiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarCompanhiaActionPerformed
        String nomeOficial = textNomeOficial.getText();
        String nomeDivulga = textNomeDivulga.getText();
        String cnpj = textCnpj.getText();
        
        if(!nomeOficial.isEmpty() && !nomeDivulga.isEmpty() && !cnpj.isEmpty()){
                CompanhiaAerea companhia = new CompanhiaAerea(cnpj, nomeOficial, nomeDivulga);
                DadosCompanhia.adicionarCompanhia(companhia);
                ComboBoxPersonalizado();
                JOptionPane.showMessageDialog(this, "Companhia Aerea adicionada!", "Cadastro concluido", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, preencha os dados corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_criarCompanhiaActionPerformed
    
    //metodo trocar de tela
    private void btn_addVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addVooActionPerformed
        CardLayout passagensCard = (CardLayout) subpanel_CardConfig.getLayout();
        passagensCard.show(subpanel_CardConfig, "voo");  
    }//GEN-LAST:event_btn_addVooActionPerformed
    
    //Criação de voos
    private void criarVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarVooActionPerformed
       String horaSaidaString = textHoraPartida.getText();
       String horaChegadaString = textHoraChegada.getText();
       LocalDate data = LocalDate.parse(textDataVoo.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       String numeroVagasString = textNumeroVagas.getText();
       String valorPassagemString = textValorPassagem.getText();
       String IDString = textID.getText();
       
      if(!horaSaidaString.isEmpty() && !horaChegadaString.isEmpty() && !numeroVagasString.isEmpty() && !valorPassagemString.isEmpty() && !IDString.isEmpty() && GerenciadorGeral.validarFormatoHora(horaSaidaString) && GerenciadorGeral.validarFormatoHora(horaChegadaString)){
            LocalTime horaSaida = LocalTime.parse(horaSaidaString);
            LocalTime horaChegada = LocalTime.parse(horaChegadaString);
            float valorPassagem = Float.parseFloat(valorPassagemString);
            int numeroVagas = Integer.parseInt(numeroVagasString);
            
            Voo voo = new Voo(IDString, data, horaSaida, horaChegada, numeroVagas, valorPassagem, trechoSelecionado);

            trechoSelecionado.adicionarVooDisponivel(voo);
            JOptionPane.showMessageDialog(this, "Voo adicionado para: " + trechoSelecionado.getCodigo(), "Cadastro concluido", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           JOptionPane.showMessageDialog(this, "Não foi possivel adicionar.\nRevise os campos e tente novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_criarVooActionPerformed
    
    //Finalizar compra do carrinho
    private void btn_FinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinalizarCompraActionPerformed
         if(DadosCarrinho.getListaCarrinho().isEmpty()){
           JOptionPane.showMessageDialog(this, "Carrinho vazio, porfavor selecione um item.", "Carrinho vazio", JOptionPane.WARNING_MESSAGE);
         }
         else{
            if(cliente instanceof Cliente){
                TelaCompra telaCompra = new TelaCompra(cliente); 
                telaCompra.setLocationRelativeTo(null);
                telaCompra.setVisible(true);
            }
            else{
             JOptionPane.showMessageDialog(this, "Ops, apenas clientes podem comprar\nFaça login como cliente para comprar", "Erro", JOptionPane.WARNING_MESSAGE);
            }
         }
    }//GEN-LAST:event_btn_FinalizarCompraActionPerformed
    
    //remover companhia aerea
    private void btn_removeCompanhiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeCompanhiaActionPerformed
        String cnpj = JOptionPane.showInputDialog(this, "Digite o CNPJ da companhia\nque deseja remover: " );
        if (cnpj != null) {
            if(DadosCompanhia.excluir(cnpj)){
                JOptionPane.showMessageDialog(this, "Companhia removida do sistema com sucesso.", "Companhia Removida", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Companhia não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, digite um CPNJ válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_removeCompanhiaActionPerformed
    
    //Ajustar taxa de voo em que a companhia pagará para a plataforma
    private void btn_taxaVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taxaVooActionPerformed
        float taxaAtual = GerenciadorGeral.getTaxaVoo();
        String taxa = JOptionPane.showInputDialog(this, "Digite valor da taxa em decimal\nexemplo 0.05 (5%).\nValor de 0.01 a 1\n\nTaxa atual: " + taxaAtual);
        float novaTaxa = Float.parseFloat(taxa);
        
        if (novaTaxa >= 0.01 && novaTaxa <= 1) {
            GerenciadorGeral.setTaxaVoo(novaTaxa);
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, digite um valor válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_taxaVooActionPerformed
    
    //Metodo para mostrar todos os trechos de voo disponiveis no table
    private void btn_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AllActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnCount(4); 
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"Codigo","Cidade origem", "Cidade destino","Companhia Aérea"});

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.setBackground(Color.WHITE);
        table.setOpaque(true); 

        table.setShowGrid(false);
        table.setShowVerticalLines(false);

        
        for (TrechoVoo trecho : DadosTrechosVoo.getListaTrechoVoo()) {
                model.addRow(new Object[] {trecho.getCodigo(), trecho.getAeroportoCidadeOrigem(), trecho.getAeroportoCidaDestino(),trecho.getCompanhiaAerea().getNomeDivulga()});
        } 
        
        revalidate();
        repaint();
        AUXILIAR = 0;
    }//GEN-LAST:event_btn_AllActionPerformed
    
    //remover item do carrinho
    private void btn_removerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerItemActionPerformed
       int result = JOptionPane.showConfirmDialog(null, "Deseja remover item do carrinho?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    DadosCarrinho.esvaziarCarrinho();
                }
    }//GEN-LAST:event_btn_removerItemActionPerformed
    
    //metodo trocar de tela
    private void btn_downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_downloadActionPerformed
        PanelToImage.savePanelAsImage(panel_passagemP, "passagem.png");
    }//GEN-LAST:event_btn_downloadActionPerformed
    
    //efeito do botao
    private void btn_efeito(java.awt.event.ActionEvent evt, JButton botao){
        JButton btn_clicado = botao;
        btn_clicado.setBackground(blue);

        if (btn_selecionado != null) {
            btn_selecionado.setBackground(blueB);
        }
        btn_selecionado = btn_clicado;
    }   
    
    //exibir dados da pessoa no perfil
    public void exibirDadosCliente(Pessoa pessoa) {
        label_name.setText(pessoa.getNome());
        label_cpf.setText(pessoa.getCpf());
        label_endereco.setText(pessoa.getEndereco());
        label_data.setText(pessoa.getDataNasc().toString());
    }
    
    //Combo box personalizado, para exibir os trechos, companhia etc
    public void ComboBoxPersonalizado() {
        //ComboBox aeroporto origem e destino
        DefaultComboBoxModel<String> comboBoxModelOrigem = new DefaultComboBoxModel<String>();
        DefaultComboBoxModel<String> comboBoxModelDestino = new DefaultComboBoxModel<String>();

        for (Aeroporto aeroporto : DadosAeroporto.getListaAeroporto()) {
            comboBoxModelOrigem.addElement(aeroporto.getNomeAeroporto() + " - " + aeroporto.getCidade());
            comboBoxModelDestino.addElement(aeroporto.getNomeAeroporto() + " - " + aeroporto.getCidade());
        }

        comboBox_origem.setModel(comboBoxModelOrigem);
        comboBox_destino.setModel(comboBoxModelDestino);
        comboBox_origem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedAeroporto = (String) comboBox_origem.getSelectedItem();
                aeroportoOrigem = buscarAeroporto(selectedAeroporto);
            }
        });

        comboBox_destino.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedAeroportoStr = (String) comboBox_destino.getSelectedItem();
                aeroportoDestino = buscarAeroporto(selectedAeroportoStr);
            }
        });
        
        //ComboBox companhia aerea
        DefaultComboBoxModel<String> comboBoxModelCompanhia = new DefaultComboBoxModel<String>();
        for (CompanhiaAerea companhia : DadosCompanhia.getCompanhia()) {
            comboBoxModelCompanhia.addElement(companhia.getNomeDivulga());
        }
        
        comboBoxCompanhia.setModel(comboBoxModelCompanhia);
        comboBoxCompanhia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCompanhia = (String) comboBoxCompanhia.getSelectedItem();
                companhia = DadosCompanhia.buscarNome(selectedCompanhia);
            }
        });
        
        //ComboBox TrechoVoo
         DefaultComboBoxModel<String> comboBoxModelTrecho = new DefaultComboBoxModel<String>();
        for (TrechoVoo trecho : DadosTrechosVoo.getListaTrechoVoo()) {
            comboBoxModelTrecho.addElement(trecho.getCodigo());
        }
        
        comboBox_trecho.setModel(comboBoxModelTrecho);    
        comboBox_trecho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedTrecho = (String) comboBox_trecho.getSelectedItem();
                trechoSelecionado = DadosTrechosVoo.buscarTrecho(selectedTrecho);
            }
        });
    }
    
    //buscar aeroporto selecionado do combo box
    private Aeroporto buscarAeroporto(String selectedAeroportoStr) {
        String[] parts = selectedAeroportoStr.split(" - ");
        String nomeAeroporto = parts[0];
        String cidade = parts[1];

        for (Aeroporto aeroporto : DadosAeroporto.getListaAeroporto()) {
            if (aeroporto.getNomeAeroporto().equals(nomeAeroporto) && aeroporto.getCidade().equals(cidade)) { 
                return aeroporto;
            }
        }
        return null;
    }
    
    //verificar clique do table, para pegar o trecho ou voo selecionado
    private void verificarCliqueTable(){
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int rowIndex = table.getSelectedRow();
                    int colIndex = 0;
                    if (rowIndex != -1) {
                        Object valor = table.getValueAt(rowIndex, colIndex);
                        String valorString = valor != null ? valor.toString() : "";
                       
                        if(AUXILIAR == 0){
                            AUXILIAR = 1;
                            trechoSelecionado = DadosTrechosVoo.buscarTrecho(valorString);
                            exibirVoosDisponiveis(trechoSelecionado);
                        }
                        else if(AUXILIAR == 1){
                            vooSelecionado = trechoSelecionado.buscarVoo(valorString);
                            adicionarCarrinho();
                            DadosCarrinho();
                        }
                    }
                }
            }
        });
    }
    
    //exibir voos dado um trecho, no table
    private void exibirVoosDisponiveis(TrechoVoo trecho) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnCount(5); 
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"ID","Data", "Hora de Saída", "Hora de Chegada", "Vagas disponíveis", "Valor Passagem (R$)"});
        ArrayList<Voo> voosDisponiveis = trecho.getVoosDisponiveis();
        for (Voo voo : voosDisponiveis) {
            model.addRow(new Object[]{voo.getID(), voo.getData(), voo.getHoraPartida(), voo.getHoraChegada(), voo.getNumeroVagas(), voo.getValorPassagem()});
        }
        revalidate();
        repaint();
    }
    
    //adicionar item no carrinho
    private void adicionarCarrinho(){
        if(DadosCarrinho.getListaCarrinho().isEmpty()){
            String qtdString = JOptionPane.showInputDialog(this, 
                                           "Deseja adicionar no carrinho?\nValor unitario: "+
                                           vooSelecionado.getValorPassagem() + 
                                           "\n\nInsira a quantidade:", "Aidiconar carrinho", JOptionPane.QUESTION_MESSAGE);
            int qtd = Integer.parseInt(qtdString);
            if(qtd != 0){
                DadosCarrinho.adicionarVoo(vooSelecionado, qtd);
           }
            else{
                JOptionPane.showMessageDialog(this, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Você tem uma passagem adicionada ao carrinho\nRemova para adicionar esta", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }
       
    //dados da passagem comprada pelo cliente
    public static void DadosPassagem(Voo voo, Cliente cliente){
        label_passageiroP.setText(cliente.getNome());
        label_origemP.setText(voo.getTrechoVoo().getAeroportoCidadeOrigem());
        label_destinoP2.setText(voo.getTrechoVoo().getAeroportoCidaDestino());
        label_horarioP.setText(String.valueOf(voo.getHoraPartida())+ " H");
        label_estadoO.setText(voo.getTrechoVoo().getAeroportoOrigem().getEstado());
        label_estadoD.setText(voo.getTrechoVoo().getAeroportoDestino().getEstado());
        label_codigoP.setText(voo.getTrechoVoo().getCodigo());
        label_passageiroP1.setText(cliente.getNome());
    
    }
    
    //dados a ser mostrado no carrinho que cliente selecionou
    private void DadosCarrinho(){
          for (ItemCarrinho itemCarrinho : DadosCarrinho.getListaCarrinho()) {
            Object item = itemCarrinho.getItem();
            if (item instanceof Voo) {
                Voo voo = (Voo) item;
                TrechoVoo trecho = voo.getTrechoVoo();
                if (trecho != null) {
                    label_valorunitario.setText("R$ "+ String.valueOf(voo.getValorPassagem()));
                    label_quantidade.setText(String.valueOf(itemCarrinho.getQuantidade()));
                    label_origem.setText(trecho.getAeroportoCidadeOrigem());
                    label_destino.setText(trecho.getAeroportoCidaDestino());
                    label_horapartida.setText(String.valueOf(voo.getHoraPartida())+ " H");
                    label_horachegada.setText(String.valueOf(voo.getHoraChegada())+ " H");
                    label_valortotal.setText("R$ "+String.valueOf(Compra.calcularTotalCarrinho()));
                    label_data.setText(String.valueOf(voo.getData()));
                }       
            }
        } 
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_All;
    private javax.swing.JButton btn_FinalizarCompra;
    private javax.swing.JButton btn_addAeroporto;
    private javax.swing.JButton btn_addCompanhia;
    private javax.swing.JButton btn_addFunc;
    private javax.swing.JButton btn_addVoo;
    private javax.swing.JButton btn_addVoo1;
    private javax.swing.JButton btn_busca;
    private javax.swing.JButton btn_carrinho;
    private javax.swing.JButton btn_config;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_descontoVip;
    private javax.swing.JButton btn_download;
    private javax.swing.JButton btn_filtroData;
    private javax.swing.JButton btn_historico;
    private javax.swing.JButton btn_passagem;
    private javax.swing.JButton btn_qtdVip;
    private javax.swing.JButton btn_registroFunc;
    private javax.swing.JButton btn_removeCompanhia;
    private javax.swing.JButton btn_removeFunc;
    private javax.swing.JButton btn_removerItem;
    private javax.swing.JButton btn_salario;
    private javax.swing.JButton btn_taxaVoo;
    private javax.swing.JButton btn_user;
    private javax.swing.JComboBox<String> comboBoxCompanhia;
    private javax.swing.JComboBox<String> comboBox_destino;
    private javax.swing.JComboBox<String> comboBox_origem;
    private javax.swing.JComboBox<String> comboBox_trecho;
    private javax.swing.JButton criarAeroporto;
    private javax.swing.JButton criarCompanhia;
    private javax.swing.JButton criarContaFunc;
    private javax.swing.JButton criarTrecho;
    private javax.swing.JButton criarVoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_back;
    private static javax.swing.JLabel label_codigoP;
    private javax.swing.JLabel label_cpf;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_destino;
    private static javax.swing.JLabel label_destinoP2;
    private javax.swing.JLabel label_endereco;
    private static javax.swing.JLabel label_estadoD;
    private static javax.swing.JLabel label_estadoO;
    private javax.swing.JLabel label_horachegada;
    private javax.swing.JLabel label_horapartida;
    private static javax.swing.JLabel label_horarioP;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_origem;
    private static javax.swing.JLabel label_origemP;
    private static javax.swing.JLabel label_passageiroP;
    private static javax.swing.JLabel label_passageiroP1;
    private javax.swing.JLabel label_quantidade;
    private javax.swing.JLabel label_valortotal;
    private javax.swing.JLabel label_valorunitario;
    private javax.swing.JLabel lavel_data;
    private javax.swing.JPanel panelMenuCard;
    private javax.swing.JPanel panel_addAeroporto;
    private javax.swing.JPanel panel_addCompanhia;
    private javax.swing.JPanel panel_addFuncionario;
    private javax.swing.JPanel panel_addTrecho;
    private javax.swing.JPanel panel_addVoo;
    private javax.swing.JPanel panel_carinhoCard;
    private javax.swing.JPanel panel_configCard;
    private javax.swing.JPanel panel_container;
    private javax.swing.JPanel panel_dashboardCard;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_passagemP;
    private javax.swing.JPanel panel_passagemPCard;
    private javax.swing.JPanel panel_passagensCard;
    private javax.swing.JPanel panel_top;
    private javax.swing.JPanel panel_userCard;
    private javax.swing.JPanel subpanel_CardConfig;
    private javax.swing.JTable table;
    private javax.swing.JTextField textCarteiraFunc;
    private javax.swing.JTextField textCidadeAero;
    private javax.swing.JTextField textCnpj;
    private javax.swing.JTextField textCodigoAero;
    private javax.swing.JTextField textCodigoTrecho;
    private javax.swing.JTextField textCpfFunc;
    private javax.swing.JTextField textDataNascFunc;
    private javax.swing.JTextField textDataVoo;
    private javax.swing.JTextField textDestino;
    private javax.swing.JTextField textEmailFunc;
    private javax.swing.JTextField textEndereçoFunc;
    private javax.swing.JTextField textEstadoAero;
    private javax.swing.JTextField textHoraChegada;
    private javax.swing.JTextField textHoraChegadaTrecho;
    private javax.swing.JTextField textHoraPartida;
    private javax.swing.JTextField textHoraSaidaTrecho;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNameAero;
    private javax.swing.JTextField textNameFunc;
    private javax.swing.JTextField textNomeDivulga;
    private javax.swing.JTextField textNomeOficial;
    private javax.swing.JTextField textNumeroVagas;
    private javax.swing.JTextField textOrigem;
    private javax.swing.JTextField textPaisAero;
    private javax.swing.JPasswordField textSenhaFunc;
    private javax.swing.JTextField textValorPassagem;
    // End of variables declaration//GEN-END:variables
}

