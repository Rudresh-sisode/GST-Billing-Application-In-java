/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagar_sir;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rudr'a
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    String printing="";
    String mainPrinting="";
     String dataAvailable="GST No: 27AXPPC6230Q1ZY"
                + "\n\t\t   \tSHREE ENTERPRISES"
                + "\n---------------------------------------------------------------------"
                + "\n\t  SHASHERI NAGAR, JAMNER, Jalgoan, MAHARASTRA, 424206"
                + "\n\t  Mob:(+91) 7507725791, email: amolchavan772@gmail.com"
            + "\n---------------------------------------------------------------------"
            + "\nBilling to:"
            + "\nParty No:"
            + "\nGST No:"
            + "\n*DLL_No  *Desc_Good   *Exp   Quantity   *Free   *Rate   *GST   *GST_Amount  *MRP  *Total";
    public MainWindow() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        initComponents();
        setIcon();
        print_txt_bill.setText(dataAvailable);
    }
    public void Update(){
        print_txt_bill.setText(dataAvailable);
    }

    public void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("shree.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        dlno_txt = new javax.swing.JTextField();
        des_good_txt = new javax.swing.JTextField();
        quant_txt = new javax.swing.JTextField();
        free_txt = new javax.swing.JTextField();
        rate_txt = new javax.swing.JTextField();
        gst_1_txt = new javax.swing.JTextField();
        gross_txt = new javax.swing.JTextField();
        date_txt = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        print_txt_bill = new javax.swing.JTextArea();
        Calculate_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        print_button = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        total_gst_amount = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shree Enterprises");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("D.L No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Descriptoin of Good");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Exp");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Free Item");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Rate");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gross Amount(MRP)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 150, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("GST");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 70, 30));

        total_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        total_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_txtActionPerformed(evt);
            }
        });
        getContentPane().add(total_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 220, 30));

        dlno_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        dlno_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlno_txtActionPerformed(evt);
            }
        });
        getContentPane().add(dlno_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, 30));

        des_good_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        des_good_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                des_good_txtActionPerformed(evt);
            }
        });
        getContentPane().add(des_good_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 30));

        quant_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        quant_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quant_txtActionPerformed(evt);
            }
        });
        getContentPane().add(quant_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, 30));

        free_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        free_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                free_txtActionPerformed(evt);
            }
        });
        getContentPane().add(free_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 220, 30));

        rate_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        rate_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_txtActionPerformed(evt);
            }
        });
        getContentPane().add(rate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 220, 30));

        gst_1_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        gst_1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gst_1_txtActionPerformed(evt);
            }
        });
        getContentPane().add(gst_1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 120, 30));

        gross_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        gross_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gross_txtActionPerformed(evt);
            }
        });
        getContentPane().add(gross_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 220, 30));

        date_txt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        getContentPane().add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, 30));

        print_txt_bill.setColumns(20);
        print_txt_bill.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        print_txt_bill.setRows(5);
        jScrollPane1.setViewportView(print_txt_bill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 730, 640));

        Calculate_button.setBackground(new java.awt.Color(0, 255, 51));
        Calculate_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Calculate_button.setForeground(new java.awt.Color(255, 255, 255));
        Calculate_button.setText("Calculate");
        Calculate_button.setBorder(null);
        Calculate_button.setBorderPainted(false);
        Calculate_button.setOpaque(false);
        Calculate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Calculate_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 80, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Clear All");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 70, 30));

        print_button.setBackground(new java.awt.Color(51, 255, 0));
        print_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        print_button.setText("Print");
        print_button.setBorderPainted(false);
        print_button.setOpaque(false);
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(print_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 80, 30));

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("X");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 30, 30));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("X");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 30, 30));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("X");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, 30));

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("X");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setOpaque(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 30));

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("X");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 30, 30));

        jButton12.setBackground(new java.awt.Color(255, 0, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("X");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 30, 30));

        jButton13.setBackground(new java.awt.Color(255, 0, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("X");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setOpaque(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 30, 30));

        jButton14.setBackground(new java.awt.Color(255, 0, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setText("X");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setOpaque(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 30, 30));

        jButton15.setBackground(new java.awt.Color(255, 0, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("X");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setOpaque(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("%");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total GST Amount");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 150, 30));

        total_gst_amount.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        total_gst_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_gst_amountActionPerformed(evt);
            }
        });
        getContentPane().add(total_gst_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 220, 30));

        jButton16.setBackground(new java.awt.Color(255, 0, 0));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setText("X");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setOpaque(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 30, 30));

        add_btn.setBackground(new java.awt.Color(102, 102, 102));
        add_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");
        add_btn.setBorderPainted(false);
        add_btn.setOpaque(false);
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        getContentPane().add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sagar_sir/924818.png"))); // NOI18N
        jLabel3.setText("56454");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void total_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_txtActionPerformed

    private void dlno_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlno_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlno_txtActionPerformed

    private void des_good_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_des_good_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_des_good_txtActionPerformed

    private void quant_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quant_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quant_txtActionPerformed

    private void free_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_free_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_free_txtActionPerformed

    private void rate_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_txtActionPerformed

    private void gst_1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gst_1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gst_1_txtActionPerformed

    private void gross_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gross_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gross_txtActionPerformed

    private void total_gst_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_gst_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_gst_amountActionPerformed

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
/*        // TODO add your handling code here:
        
        print_txt_bill.append("GST No: 27AXPPC6230Q1ZY"
                + "\n\t\t   \tSHREE ENTERPRISES"
                + "\n---------------------------------------------------------------------"
                + "\n\t  SHASHERI NAGAR, JAMNER, Jalgoan, MAHARASTRA, 424206"
                + "\n\t  Mob:(+91) 7507725791, email: amolchavan772@gmail.com"
                + "\n");*/
 try
        {
            boolean complete = print_txt_bill.print();
            if(complete)
            {
              JOptionPane.showMessageDialog(null, "Done Printing","information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Printing!","Printer",JOptionPane.ERROR_MESSAGE);
            }
                    
        }
       catch(HeadlessException | PrinterException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }//GEN-LAST:event_print_buttonActionPerformed

    private void Calculate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_buttonActionPerformed
        // TODO add your handling code here:
        
        String quantity=quant_txt.getText();
        String rate=rate_txt.getText();
        String gst=gst_1_txt.getText();
        if(quant_txt.getText().isEmpty() && rate_txt.getText().isEmpty() && gst_1_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Sorry Boss, Please Insert Quanity, Rate and GST field !");
        }
        else{
             
        total_gst_amount.setText("");
        gross_txt.setText("");
        total_txt.setText("");
        
        float Quantity=Float.valueOf(quantity);
        float Rate=Integer.valueOf(rate);
        float Gst=Integer.valueOf(gst);
        
       
        float One=Rate/Quantity;
        float SingleGST=(One*Gst)/100;
        float TotalGST=SingleGST*Quantity;//total gst amount
        float GrossAmount=TotalGST+Rate;//total amount and gross amount
        String TGA=Float.toString(TotalGST);
        total_gst_amount.setText(TGA);
        String GA=Float.toString(GrossAmount);
        gross_txt.setText(GA);
        total_txt.setText(GA);
        
        }
       
        //System.out.println("Single Rate "+One+"\nSignleGST "+SingleGST+"\nTotal GST "+TotalGST+"\nGrossAmount "+GrossAmount);
        
        
    }//GEN-LAST:event_Calculate_buttonActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        String getCharector=print_txt_bill.getText();//a <- Text area
        
          String DllNo=dlno_txt.getText();
          String Description_godd=des_good_txt.getText();
         
          String d=((JTextField)date_txt.getDateEditor().getUiComponent()).getText();
          String Quantity=quant_txt.getText();
          String Free=free_txt.getText();
          String Rate=rate_txt.getText();
          String GST=gst_1_txt.getText();
          String totalgstamount=total_gst_amount.getText();
          String Gross=gross_txt.getText();
          String total=total_txt.getText();
        //*DLL_No        *Desc_Good  *Exp  Quantity  *Free  *Rate  *GST  *GST_Amount  *MRP  *Total
           printing="\n "+DllNo+"     "+Description_godd+"    "+d+"     "+Quantity
                   +"     "+Free+"    "+Rate+"     "+GST+"     "+totalgstamount+"    "+Gross+"   "+total;
           
           mainPrinting=getCharector+printing;
 
      print_txt_bill.setText(mainPrinting);
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        dlno_txt.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        des_good_txt.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        ((JTextField)date_txt.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        quant_txt.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        free_txt.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        rate_txt.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        gst_1_txt.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        total_gst_amount.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        gross_txt.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        total_txt.setText("");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         dlno_txt.setText("");des_good_txt.setText(""); ((JTextField)date_txt.getDateEditor().getUiComponent()).setText("");
         quant_txt.setText(""); free_txt.setText("");rate_txt.setText("");gst_1_txt.setText("");total_gst_amount.setText("");
          gross_txt.setText("");total_txt.setText("");
          print_txt_bill.setText("");
          Update();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate_button;
    private javax.swing.JButton add_btn;
    private com.toedter.calendar.JDateChooser date_txt;
    private javax.swing.JTextField des_good_txt;
    private javax.swing.JTextField dlno_txt;
    private javax.swing.JTextField free_txt;
    private javax.swing.JTextField gross_txt;
    private javax.swing.JTextField gst_1_txt;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print_button;
    private javax.swing.JTextArea print_txt_bill;
    private javax.swing.JTextField quant_txt;
    private javax.swing.JTextField rate_txt;
    private javax.swing.JTextField total_gst_amount;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables
}
