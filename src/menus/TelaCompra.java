package menus;
import Dados.DadosCarrinho;
import codigos.Cliente;
import codigos.Compra;
import codigos.Funcionario;
import codigos.ItemCarrinho;
import codigos.Pessoa;
import codigos.Voo;
import componentes.UtilsDesign;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class TelaCompra extends javax.swing.JFrame {

    private Cliente cliente;
    private String formaPagamento;
    

    public TelaCompra(Cliente cliente) {
        initComponents(); 
        calcularValores();
        this.cliente = cliente;
        this.setResizable(false);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_cartao = new javax.swing.JButton();
        btn_pix = new javax.swing.JButton();
        panel_pagamentoCard = new javax.swing.JPanel();
        panelCartao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_Ncartao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_validade = new javax.swing.JTextField();
        text_cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelPix = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        text_pix = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_Pagar = new javax.swing.JButton();
        txt_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_cartao.setBackground(new java.awt.Color(255, 255, 255));
        btn_cartao.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btn_cartao.setForeground(new java.awt.Color(30, 39, 114));
        btn_cartao.setText("Cartão de Crédito");
        btn_cartao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 39, 114), 2, true));
        btn_cartao.setFocusPainted(false);
        btn_cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cartaoActionPerformed(evt);
            }
        });

        btn_pix.setBackground(new java.awt.Color(255, 255, 255));
        btn_pix.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btn_pix.setForeground(new java.awt.Color(30, 39, 114));
        btn_pix.setText("Pix");
        btn_pix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(30, 39, 114), 2, true));
        btn_pix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pixActionPerformed(evt);
            }
        });

        panel_pagamentoCard.setBackground(new java.awt.Color(255, 102, 102));
        panel_pagamentoCard.setLayout(new java.awt.CardLayout());

        panelCartao.setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Número do cartão");
        jLabel1.setToolTipText("");

        text_Ncartao.setBackground(new java.awt.Color(247, 247, 247));
        text_Ncartao.setForeground(new java.awt.Color(51, 51, 51));
        text_Ncartao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_Ncartao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        text_Ncartao.setMargin(new java.awt.Insets(2, 13, 2, 13));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Validade");
        jLabel2.setToolTipText("");

        textCodigo.setBackground(new java.awt.Color(247, 247, 247));
        textCodigo.setForeground(new java.awt.Color(51, 51, 51));
        textCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        textCodigo.setMargin(new java.awt.Insets(2, 13, 2, 13));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Código de segurança");
        jLabel3.setToolTipText("");

        text_validade.setBackground(new java.awt.Color(247, 247, 247));
        text_validade.setForeground(new java.awt.Color(51, 51, 51));
        text_validade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_validade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        text_validade.setMargin(new java.awt.Insets(2, 13, 2, 13));

        text_cpf.setBackground(new java.awt.Color(247, 247, 247));
        text_cpf.setForeground(new java.awt.Color(51, 51, 51));
        text_cpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_cpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        text_cpf.setMargin(new java.awt.Insets(2, 13, 2, 13));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CPF do titular");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout panelCartaoLayout = new javax.swing.GroupLayout(panelCartao);
        panelCartao.setLayout(panelCartaoLayout);
        panelCartaoLayout.setHorizontalGroup(
            panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCartaoLayout.createSequentialGroup()
                        .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCartaoLayout.createSequentialGroup()
                                    .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCartaoLayout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(textCodigo))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(text_validade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(text_Ncartao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCartaoLayout.setVerticalGroup(
            panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_Ncartao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_validade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        panel_pagamentoCard.add(panelCartao, "cartao");

        panelPix.setBackground(new java.awt.Color(247, 247, 247));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Falta pouco! Pague com seu pix atráves do app");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pixcode.png"))); // NOI18N

        text_pix.setBackground(new java.awt.Color(240, 240, 240));
        text_pix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_pix.setText("CODIGO VAI FICAR AQUI");
        text_pix.setActionCommand("<Not Set>");
        text_pix.setBorder(null);

        jButton6.setBackground(new java.awt.Color(95, 162, 215));
        jButton6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Copiar codigo");
        jButton6.setBorderPainted(false);

        javax.swing.GroupLayout panelPixLayout = new javax.swing.GroupLayout(panelPix);
        panelPix.setLayout(panelPixLayout);
        panelPixLayout.setHorizontalGroup(
            panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPixLayout.createSequentialGroup()
                .addGroup(panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPixLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel9))
                    .addGroup(panelPixLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(text_pix, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPixLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton6)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelPixLayout.setVerticalGroup(
            panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPixLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_pix, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(12, 12, 12))
        );

        panel_pagamentoCard.add(panelPix, "pix");

        jPanel4.setBackground(new java.awt.Color(247, 247, 247));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Subtotal");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Desconto");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Total");
        jLabel7.setToolTipText("");

        btn_Pagar.setBackground(new java.awt.Color(95, 215, 126));
        btn_Pagar.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btn_Pagar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Pagar.setText("Pagar");
        btn_Pagar.setBorderPainted(false);
        btn_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PagarActionPerformed(evt);
            }
        });

        txt_total.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        txt_total.setForeground(new java.awt.Color(51, 51, 51));
        txt_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_total.setText("R$ 0,00");
        txt_total.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("R$ 0.00");
        jLabel11.setToolTipText("");

        txt_subtotal.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        txt_subtotal.setForeground(new java.awt.Color(51, 51, 51));
        txt_subtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_subtotal.setText("R$ 0.00");
        txt_subtotal.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_subtotal)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Pagar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_pagamentoCard, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pix, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pix, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(panel_pagamentoCard, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PagarActionPerformed
        if(formaPagamento == "Cartão de crédito"){
            String numero = text_Ncartao.getText();
            String codigo = textCodigo.getText();
            String validade = text_validade.getText();
            String cpf = text_cpf.getText();  
        }
        for (ItemCarrinho itemCarrinho : DadosCarrinho.getListaCarrinho()) {
                 Object item = itemCarrinho.getItem();
                 if (item instanceof Voo) {
                     Voo voo = (Voo) item;
                     if(voo.conferirVagas()){
                        Compra compra = new Compra(cliente, voo, LocalDate.now(), LocalTime.now());
                        compra.setFormaPagamento(formaPagamento);
                        voo.darBaixaVagas(itemCarrinho.getQuantidade());
                        JOptionPane.showMessageDialog(this, "Compra realizada com sucesso!\nConfira sua passagem em 'Passagem'.", "Compra finalizada", JOptionPane.INFORMATION_MESSAGE);
                        DadosCarrinho.getListaCarrinho().clear();
                        TelaMain.DadosPassagem(voo, cliente);
                        this.setVisible(false);
                     }
                     else{
                         JOptionPane.showMessageDialog(this, "Não tem vagas disponiveis para este voo\n Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                     }
                     
                 } 
                 else{
                     JOptionPane.showMessageDialog(this, "Houve algum erro inesperado\n Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                 }
        }
        
    }//GEN-LAST:event_btn_PagarActionPerformed

    private void btn_cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cartaoActionPerformed
       CardLayout passagensCard = (CardLayout) panel_pagamentoCard.getLayout();
       passagensCard.show(panel_pagamentoCard, "cartao");
       formaPagamento = "Cartão de crédito";
       UtilsDesign.buttonEffect(btn_cartao, btn_pix);
    }//GEN-LAST:event_btn_cartaoActionPerformed

    private void btn_pixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pixActionPerformed
       CardLayout passagensCard = (CardLayout) panel_pagamentoCard.getLayout();
       passagensCard.show(panel_pagamentoCard, "pix");
       formaPagamento = "Pix";
       String pix = Compra.gerarPix();
       text_pix.setText(pix);
       UtilsDesign.buttonEffect(btn_pix, btn_cartao);    
    }//GEN-LAST:event_btn_pixActionPerformed
    
    private void calcularValores(){
        float total = Compra.calcularTotalCarrinho();
        txt_subtotal.setText(String.valueOf(total));
        txt_total.setText(String.valueOf(total));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pagar;
    private javax.swing.JButton btn_cartao;
    private javax.swing.JButton btn_pix;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelCartao;
    private javax.swing.JPanel panelPix;
    private javax.swing.JPanel panel_pagamentoCard;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField text_Ncartao;
    private javax.swing.JTextField text_cpf;
    private javax.swing.JTextField text_pix;
    private javax.swing.JTextField text_validade;
    private javax.swing.JLabel txt_subtotal;
    private javax.swing.JLabel txt_total;
    // End of variables declaration//GEN-END:variables
}
