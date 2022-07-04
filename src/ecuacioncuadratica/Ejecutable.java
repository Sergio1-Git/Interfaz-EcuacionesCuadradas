package ecuacioncuadratica;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author Sergio Mercado Salazar
 */
public class Ejecutable extends javax.swing.JFrame {

    //FondoPantalla a = new FondoPantalla();
    public Ejecutable() {
        //this.setContentPane(a);
        initComponents();
        raiz_figura2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        background = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        valorA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signoLineal = new javax.swing.JLabel();
        valorB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        signoIndependiente = new javax.swing.JLabel();
        valorC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cero = new javax.swing.JLabel();
        potencia = new javax.swing.JLabel();
        igual = new javax.swing.JLabel();
        terminoCuadratico = new javax.swing.JLabel();
        terminoLineal = new javax.swing.JLabel();
        terminoInd = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menosB = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        raiz_figura1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        opB3 = new javax.swing.JLabel();
        menos_pt3 = new javax.swing.JLabel();
        mas_pt3 = new javax.swing.JLabel();
        coeficiente1 = new javax.swing.JLabel();
        denominador1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        incognita_pt3 = new javax.swing.JLabel();
        igual_pt3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelX1 = new javax.swing.JLabel();
        labelX2 = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        sub2 = new javax.swing.JLabel();
        igual2_pt4 = new javax.swing.JLabel();
        igual1_pt4 = new javax.swing.JLabel();
        valorXmenos = new javax.swing.JLabel();
        valorXmas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        mas_pt2 = new javax.swing.JLabel();
        opB2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        menos_pt2 = new javax.swing.JLabel();
        coeficiente = new javax.swing.JLabel();
        denominador = new javax.swing.JLabel();
        igual_pt2 = new javax.swing.JLabel();
        incognita_pt2 = new javax.swing.JLabel();
        raiz_figura2 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        background.setBackground(new java.awt.Color(57, 100, 105));
        background.setFocusCycleRoot(true);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Calculadora de ecuaciones cuadráticas");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 920, -1));

        btnCalcular.setBackground(new java.awt.Color(5, 128, 16));
        btnCalcular.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularMouseExited(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        background.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 110, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 0));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar.setText("Clean All");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 100, 40));

        jPanel2.setBackground(new java.awt.Color(131, 169, 173));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valorA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        valorA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorA.setToolTipText("a");
        valorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorAActionPerformed(evt);
            }
        });
        valorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorAKeyTyped(evt);
            }
        });
        jPanel2.add(valorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 42, 35));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("X");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 22));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        signoLineal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        signoLineal.setText("+");
        jPanel2.add(signoLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 22));

        valorB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        valorB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorBActionPerformed(evt);
            }
        });
        valorB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorBKeyTyped(evt);
            }
        });
        jPanel2.add(valorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 42, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("X");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 22));

        signoIndependiente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        signoIndependiente.setText("+");
        jPanel2.add(signoIndependiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 22));

        valorC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        valorC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorCActionPerformed(evt);
            }
        });
        valorC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorCKeyTyped(evt);
            }
        });
        jPanel2.add(valorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 42, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("=");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 22));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel25.setText("0");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, 22));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Ecuación Final", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        cero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        potencia.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        igual.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        igual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        terminoCuadratico.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        terminoCuadratico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        terminoLineal.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        terminoLineal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        terminoInd.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        terminoInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminoCuadratico, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(potencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminoLineal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminoInd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(terminoCuadratico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(terminoLineal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(terminoInd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(potencia)))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 20, 350, -1));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 780, 140));

        mensaje.setBackground(new java.awt.Color(0, 255, 255));
        mensaje.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        background.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 780, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel14.setText("+");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 14));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("-");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 12, 10));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel13.setText("-");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 22));

        menosB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        menosB.setText("b");
        jPanel1.add(menosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 20, -1));

        b2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setText("b");
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 32, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel16.setText("2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel17.setText("-");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 22));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("4");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 22));

        a4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        a4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a4.setText("(a)");
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel26.setText("*");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 22));

        c4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        c4.setText("(c)");
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 40, -1));

        c2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        c2.setText("(c)");
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 39, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setText("2");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel27.setText("*");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 22));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(211, 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 55, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("=");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 15, 22));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setText("X");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 15, 22));

        raiz_figura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d.jpg"))); // NOI18N
        jPanel1.add(raiz_figura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, -1, 130, 70));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opB3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel11.add(opB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 20, -1));

        menos_pt3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        menos_pt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(menos_pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 12, 9));

        mas_pt3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel11.add(mas_pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 14, 14));

        coeficiente1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        coeficiente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(coeficiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 50, 22));

        denominador1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        denominador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(denominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 56, 39, 22));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(211, 2));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 53, 125, 2));

        incognita_pt3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel11.add(incognita_pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 14, 22));

        igual_pt3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel11.add(igual_pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 14, 22));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelX1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel5.add(labelX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 20, 15, 22));

        labelX2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel5.add(labelX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 60, 15, 22));

        sub1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel5.add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 32, 7, 12));

        sub2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel5.add(sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 72, 7, 12));

        igual2_pt4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        igual2_pt4.setToolTipText("");
        jPanel5.add(igual2_pt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 63, 14, 22));

        igual1_pt4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        igual1_pt4.setToolTipText("");
        jPanel5.add(igual1_pt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 23, 14, 22));

        valorXmenos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        valorXmenos.setToolTipText("");
        jPanel5.add(valorXmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 47, 28));

        valorXmas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        valorXmas.setToolTipText("");
        jPanel5.add(valorXmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 47, 28));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mas_pt2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        mas_pt2.setToolTipText("");
        jPanel4.add(mas_pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 12, 14));

        opB2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        opB2.setToolTipText("");
        jPanel4.add(opB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 20, 22));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(211, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 54, 115, 2));

        menos_pt2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        menos_pt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menos_pt2.setToolTipText("");
        jPanel4.add(menos_pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 12, 9));

        coeficiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        coeficiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        coeficiente.setToolTipText("");
        jPanel4.add(coeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 50, 22));

        denominador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        denominador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        denominador.setToolTipText("");
        jPanel4.add(denominador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 39, 22));

        igual_pt2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel4.add(igual_pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 15, 22));

        incognita_pt2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel4.add(incognita_pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 14, 22));

        raiz_figura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/op2.jpg"))); // NOI18N
        jPanel4.add(raiz_figura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 8, 71, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 780, 230));

        btnLimpiar1.setBackground(java.awt.Color.red);
        btnLimpiar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar1.setText("Salir");
        btnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        background.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 80, 40));

        btnMostrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        background.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        btnMostrar.setVisible(false);
        int a, b, c;

        a = Integer.parseInt(valorA.getText());
        b = Integer.parseInt(valorB.getText());
        c = Integer.parseInt(valorC.getText());

        if (a != 0) {

            potencia.setText("2");

            igual.setText("=");
            cero.setText("0");

            //CONDICIONES DE A PARA ORDENAR LA ECUACIÓN
            if (a < 0) {
                if (a == -1) {
                    terminoCuadratico.setText("- X");
                } else {
                    terminoCuadratico.setText("- " + a * -1 + "X");
                }
            } else if (a > 0) {
                if (a == 1) {
                    terminoCuadratico.setText("X");
                } else {
                    terminoCuadratico.setText(a + "X");
                }
            }

            //CONDICIONES DE B PARA ORDENAR LA ECUACIÓN
            if (b < 0) {
                if (b == -1) {
                    terminoLineal.setText("-  X");
                } else {
                    terminoLineal.setText("-  " + b * -1 + "X");
                }
            } else if (b >= 0) {
                if (b == 1) {
                    terminoLineal.setText("+  X");
                } else {
                    terminoLineal.setText(" +   " + b + "X");
                }
            }

            //CONDICIONES DE C PARA ORDENAR LA ECUACIÓN
            if (c < 0) {
                terminoInd.setText("-  " + c * -1);
            } else {
                terminoInd.setText("+  " + c);
            }

        } else {
            mensaje.setText("Error, la regla dice que 'a' debe ser diferente de 0");
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void valorCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorCKeyTyped
        JTextField campo = (JTextField) evt.getSource();
        char tecla = evt.getKeyChar();

        if (!Character.isDigit(tecla) && campo.getText().indexOf('-') >= 0) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            mensaje.setText("Caracter invalido, Solo digite Números");
        }

    }//GEN-LAST:event_valorCKeyTyped

    private void valorCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorCKeyPressed
        KeyEvent e = null;
        boolean name = e.getKeyCode() == KeyEvent.VK_ENTER;
        /*if (campo.getText().indexOf(ENTER) >= 0) {
        }*/
    }//GEN-LAST:event_valorCKeyPressed

    private void valorCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorCActionPerformed

    }//GEN-LAST:event_valorCActionPerformed

    private void valorBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorBKeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla) && campo.getText().indexOf('-') >= 0) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            mensaje.setText("Caracter invalido, Solo digite Números y al menos un signo");
        }
    }//GEN-LAST:event_valorBKeyTyped

    private void valorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorBActionPerformed

    private void valorAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorAKeyTyped
        char tecla = evt.getKeyChar();
        JTextField campo = (JTextField) evt.getSource();

        if (!Character.isDigit(tecla) && campo.getText().indexOf('-') >= 0) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            mensaje.setText("Caracter invalido, Solo digite Números y al menos un signo");
        }
    }//GEN-LAST:event_valorAKeyTyped

    private void valorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorAActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        valorA.setText("");
        valorB.setText("");
        valorC.setText("");
        valorXmas.setText("");
        valorXmenos.setText("");
        menosB.setText("b");
        b2.setText("b");
        a4.setText("a");
        c4.setText("c");
        c2.setText("c");
        jLabel13.setText("-");//Menos
        terminoCuadratico.setText("");
        potencia.setText("");
        terminoLineal.setText("");
        terminoInd.setText("");
        igual.setText("");
        cero.setText("");

        btnMostrar.setVisible(true);

        opB2.setText("");
        coeficiente.setText("");

        denominador.setText("");

        incognita_pt2.setText("");
        igual_pt2.setText("");
        mas_pt2.setText("");
        menos_pt2.setText("");
        //jLabel10.setText("V");
        jPanel9.setBackground(Color.white);
        raiz_figura2.setVisible(false);

        incognita_pt3.setText("");
        igual_pt3.setText("");
        opB3.setText("");
        mas_pt3.setText("");
        menos_pt3.setText("");

        coeficiente1.setText("");
        jPanel12.setBackground(Color.white);
        denominador1.setText("");

        labelX1.setText("");
        labelX2.setText("");
        sub1.setText("");
        sub2.setText("");
        igual1_pt4.setText("");
        igual2_pt4.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        /*Creamos las variables que en una ecuacion serian a(termino cuadrado),
        b(termino lineal), c(termino independiente. Ejemplo: ax^2+bx+c=0*/
        int a, b, c;

        /*Creamos los resultados de x en la ecuacion*/
        float x1, x2;

        //Obtenemos los datos ingresados
        a = Integer.parseInt(valorA.getText());
        b = Integer.parseInt(valorB.getText());
        c = Integer.parseInt(valorC.getText());

        if (!valorA.getText().isEmpty() && !valorB.getText().isEmpty() && !valorC.getText().isEmpty()) {
            if (a != 0) {// SI a ES DIFERENTE DE 0 REALIZAR LA SIGUIENTE ACCION

                x1 = (float) ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a)); //Aqui se efectua la formula general para resolver ecuaciones cuadraticas para X1
                //Al obtener los datos ingresados aseguramos si los resultados de x son decimales o enteros

                if (x1 % 1 == 0) {
                    valorXmas.setText(String.valueOf((long) x1));
                } else {
                    //double x1d;
                    //x1d = Double.parseDouble(valorXmenos.getText());
                    DecimalFormat x1d = new DecimalFormat("#.##");
                    x1d.setRoundingMode(RoundingMode.CEILING);
                    valorXmas.setText(String.valueOf(x1d.format(x1)));
                }
                x2 = (float) ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));//Aqui se efectua la formula general para resolver ecuaciones cuadraticas para X2
                if (x2 % 1 == 0) {
                    valorXmenos.setText(String.valueOf((long) x2));
                } else {
                    //double x2d;
                    //x2d = Double.parseDouble(valorXmenos.getText());
                    DecimalFormat x2d = new DecimalFormat("#.##");
                    x2d.setRoundingMode(RoundingMode.CEILING);
                    valorXmenos.setText(String.valueOf(x2d.format(x2)));
                }
                int numB = Integer.parseInt(valorB.getText());
                jLabel13.setText("");
                menosB.setText((numB * -1) + "");
                b2.setText("(" + valorB.getText() + ")");
                a4.setText("(" + valorA.getText() + ")");
                c4.setText("(" + valorC.getText() + ")");
                c2.setText("(" + valorC.getText() + ")");

                //Part 2
                opB2.setText((numB * -1) + "");
                int coef = ((b * b) - 4 * a * c);
                coeficiente.setText(coef + "");

                int denominadorN = (2 * c);
                denominador.setText(denominadorN + "");

                incognita_pt2.setText("X");
                igual_pt2.setText("=");
                mas_pt2.setText("+");
                menos_pt2.setText("-");
                //jLabel10.setText("V");
                raiz_figura2.setVisible(true);
                jPanel9.setBackground(Color.black);

                //Part 3
                incognita_pt3.setText("X");
                igual_pt3.setText("=");
                opB3.setText((numB * -1) + "");
                mas_pt3.setText("+");
                menos_pt3.setText("-");

                float rad = (float) Math.sqrt(coef);
                DecimalFormat radd = new DecimalFormat("#.#");
                radd.setRoundingMode(RoundingMode.CEILING);
                coeficiente1.setText(radd.format(rad) + "");
                jPanel12.setBackground(Color.black);
                denominador1.setText(denominadorN + "");

                //Part 4
                labelX1.setText("X");
                labelX2.setText("X");
                sub1.setText("1");
                sub2.setText("2");
                igual1_pt4.setText("=");
                igual2_pt4.setText("=");
            } else {
                mensaje.setText("Error, la regla dice que 'a' debe ser diferente de 0");
            }
        } else {
            mensaje.setText("No debe dejar ningun campo vacio");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseExited
        /*JButton boton = (JButton) evt.getSource();
        boton.setBackground(Color.BLUE);*/
    }//GEN-LAST:event_btnCalcularMouseExited

    private void btnCalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseEntered
        /*JButton boton = (JButton) evt.getSource();
        boton.setBackground(Color.GREEN);*/
    }//GEN-LAST:event_btnCalcularMouseEntered

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
            java.util.logging.Logger.getLogger(Ejecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejecutable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a4;
    private javax.swing.JLabel b2;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel cero;
    private javax.swing.JLabel coeficiente;
    private javax.swing.JLabel coeficiente1;
    private javax.swing.JLabel denominador;
    private javax.swing.JLabel denominador1;
    private javax.swing.JLabel igual;
    private javax.swing.JLabel igual1_pt4;
    private javax.swing.JLabel igual2_pt4;
    private javax.swing.JLabel igual_pt2;
    private javax.swing.JLabel igual_pt3;
    private javax.swing.JLabel incognita_pt2;
    private javax.swing.JLabel incognita_pt3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelX1;
    private javax.swing.JLabel labelX2;
    private javax.swing.JLabel mas_pt2;
    private javax.swing.JLabel mas_pt3;
    private javax.swing.JLabel menosB;
    private javax.swing.JLabel menos_pt2;
    private javax.swing.JLabel menos_pt3;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel opB2;
    private javax.swing.JLabel opB3;
    private javax.swing.JLabel potencia;
    private javax.swing.JLabel raiz_figura1;
    private javax.swing.JLabel raiz_figura2;
    private javax.swing.JLabel signoIndependiente;
    private javax.swing.JLabel signoLineal;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel terminoCuadratico;
    private javax.swing.JLabel terminoInd;
    private javax.swing.JLabel terminoLineal;
    private javax.swing.JTextField valorA;
    private javax.swing.JTextField valorB;
    private javax.swing.JTextField valorC;
    private javax.swing.JLabel valorXmas;
    private javax.swing.JLabel valorXmenos;
    // End of variables declaration//GEN-END:variables

    /*class FondoPantalla extends JPanel {

        private Image imagen;

        public void paint(Graphics s) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jp")).getImage();
            s.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(s);
        }
    }*/
}
