/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package missao08;
        
/**
 *
 * @author 55559
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();        
    }
    
        Double Valor1,Valor2;
        String Operacao;

   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoCalculadora = new javax.swing.JPanel();
        Visor = new javax.swing.JTextField();
        PainelNumeros = new javax.swing.JPanel();
        Botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoigual = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        somar = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FundoCalculadora.setBackground(new java.awt.Color(0, 0, 0));

        PainelNumeros.setBackground(new java.awt.Color(0, 0, 0));

        Botao7.setBackground(new java.awt.Color(0, 0, 0));
        Botao7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao7.setForeground(new java.awt.Color(255, 255, 255));
        Botao7.setText("7");
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        botao8.setBackground(new java.awt.Color(0, 0, 0));
        botao8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao8.setForeground(new java.awt.Color(255, 255, 255));
        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setBackground(new java.awt.Color(0, 0, 0));
        botao9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao9.setForeground(new java.awt.Color(255, 255, 255));
        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao4.setBackground(new java.awt.Color(0, 0, 0));
        botao4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao4.setForeground(new java.awt.Color(255, 255, 255));
        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setBackground(new java.awt.Color(0, 0, 0));
        botao5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao5.setForeground(new java.awt.Color(255, 255, 255));
        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setBackground(new java.awt.Color(0, 0, 0));
        botao6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao6.setForeground(new java.awt.Color(255, 255, 255));
        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao1.setBackground(new java.awt.Color(0, 0, 0));
        botao1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao1.setForeground(new java.awt.Color(255, 255, 255));
        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setBackground(new java.awt.Color(0, 0, 0));
        botao2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 255, 255));
        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setBackground(new java.awt.Color(0, 0, 0));
        botao3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao3.setForeground(new java.awt.Color(255, 255, 255));
        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao0.setBackground(new java.awt.Color(0, 0, 0));
        botao0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao0.setForeground(new java.awt.Color(255, 255, 255));
        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botaoigual.setBackground(new java.awt.Color(0, 0, 0));
        botaoigual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoigual.setForeground(new java.awt.Color(255, 255, 255));
        botaoigual.setText("=");
        botaoigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoigualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNumerosLayout = new javax.swing.GroupLayout(PainelNumeros);
        PainelNumeros.setLayout(PainelNumerosLayout);
        PainelNumerosLayout.setHorizontalGroup(
            PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNumerosLayout.createSequentialGroup()
                        .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelNumerosLayout.createSequentialGroup()
                                .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botao0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoigual, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                    .addGroup(PainelNumerosLayout.createSequentialGroup()
                        .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(Botao7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelNumerosLayout.createSequentialGroup()
                                .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelNumerosLayout.createSequentialGroup()
                                .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelNumerosLayout.setVerticalGroup(
            PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNumerosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botao7, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(botao9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao6, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoigual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        clear.setBackground(new java.awt.Color(255, 255, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(204, 204, 204));
        clear.setText("CE");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        Dividir.setBackground(new java.awt.Color(0, 0, 0));
        Dividir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dividir.setForeground(new java.awt.Color(255, 255, 255));
        Dividir.setText("÷");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        multiplicar.setBackground(new java.awt.Color(0, 0, 0));
        multiplicar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        multiplicar.setText("x");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        subtrair.setBackground(new java.awt.Color(0, 0, 0));
        subtrair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtrair.setForeground(new java.awt.Color(255, 255, 255));
        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        somar.setBackground(new java.awt.Color(0, 204, 153));
        somar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        somar.setForeground(new java.awt.Color(255, 255, 255));
        somar.setText("+");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });

        clear1.setBackground(new java.awt.Color(255, 255, 0));
        clear1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear1.setForeground(new java.awt.Color(204, 204, 204));
        clear1.setText("C");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        clear2.setBackground(new java.awt.Color(0, 204, 153));
        clear2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear2.setForeground(new java.awt.Color(255, 255, 255));
        clear2.setText("ON");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculadora Virtual");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JAVA");

        javax.swing.GroupLayout FundoCalculadoraLayout = new javax.swing.GroupLayout(FundoCalculadora);
        FundoCalculadora.setLayout(FundoCalculadoraLayout);
        FundoCalculadoraLayout.setHorizontalGroup(
            FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                            .addGroup(FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PainelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                                    .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        FundoCalculadoraLayout.setVerticalGroup(
            FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FundoCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PainelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FundoCalculadoraLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(somar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FundoCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoCalculadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
     Visor.setText(Visor.getText() + "0"); 
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
     Visor.setText(Visor.getText() + "3"); 
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
     Visor.setText(Visor.getText() + "2"); 
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
     Visor.setText(Visor.getText() + "6"); 
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
     Visor.setText(Visor.getText() + "5"); 
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
      Visor.setText(Visor.getText() + "9"); 
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
     Visor.setText(Visor.getText() + "8"); 
    }//GEN-LAST:event_botao8ActionPerformed

    private void botaoigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoigualActionPerformed
     Valor2 = Double.parseDouble(Visor.getText());
     if (Operacao == "Soma"){
         Visor.setText(String.valueOf(Valor1+Valor2));
     }
     if (Operacao == "Subtrai"){
         Visor.setText(String.valueOf(Valor1-Valor2));
     }
     if (Operacao == "Multiplica"){
         Visor.setText(String.valueOf(Valor1*Valor2));
     }
     if (Operacao == "Divide"){
         Visor.setText(String.valueOf(Valor1/Valor2));
     }
    }//GEN-LAST:event_botaoigualActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        Operacao = "Divide";
    }//GEN-LAST:event_DividirActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        Operacao = "Multiplica";
    }//GEN-LAST:event_multiplicarActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        Operacao = "Subtrai";
    }//GEN-LAST:event_subtrairActionPerformed

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        Valor1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        Operacao = "Soma";
    }//GEN-LAST:event_somarActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
    Visor.setText(Visor.getText() + "1");    
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
     Visor.setText(Visor.getText() + "4"); 
    }//GEN-LAST:event_botao4ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
     Visor.setText(Visor.getText() + "7"); 
    }//GEN-LAST:event_Botao7ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
     Visor.setText("");
     Valor1 = null;
     Valor2 = null;
    }//GEN-LAST:event_clear1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    Visor.setText(""); 
    }//GEN-LAST:event_clearActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
    Visor.setText("0"); 
    }//GEN-LAST:event_clear2ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Dividir;
    private javax.swing.JPanel FundoCalculadora;
    private javax.swing.JPanel PainelNumeros;
    private javax.swing.JTextField Visor;
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoigual;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton somar;
    private javax.swing.JButton subtrair;
    // End of variables declaration//GEN-END:variables
}
