package com.mycompany.redacted_salaryloan;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class REDACTED_SalaryLoan extends javax.swing.JFrame {
    /**
     * Creates new form REDACTED_SalaryLoan
     */
    public REDACTED_SalaryLoan() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        basicMonthlySalaryText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        monthsToPayText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loanAmountText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        interestText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        takeHomeLoanText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        monthlyAmortizationText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        serviceChargeText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salary Loan System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Basic monthly salary:");

        basicMonthlySalaryText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basicMonthlySalaryText.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Number of mos. to pay (1-25):");

        monthsToPayText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        monthsToPayText.setText("1");
        monthsToPayText.setToolTipText("");
        monthsToPayText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Loan amount:");

        loanAmountText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loanAmountText.setText("0.00");
        loanAmountText.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Interest:");

        interestText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        interestText.setText("0.00");
        interestText.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Take home loan:");

        takeHomeLoanText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        takeHomeLoanText.setText("0.00");
        takeHomeLoanText.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Monthly amortization:");

        monthlyAmortizationText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        monthlyAmortizationText.setText("0.00");
        monthlyAmortizationText.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Compute");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Service charge:");

        serviceChargeText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serviceChargeText.setText("0.00");
        serviceChargeText.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loanAmountText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interestText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(takeHomeLoanText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthsToPayText, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(basicMonthlySalaryText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthlyAmortizationText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceChargeText))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(basicMonthlySalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(monthsToPayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loanAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interestText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceChargeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takeHomeLoanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(monthlyAmortizationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        JDialog.setDefaultLookAndFeelDecorated(true);
        // input
        double basicMonthlySalary;
        double monthsToPay = 0;
        // prevents the user to pass any non-numerical inputs
        try {
            Double.parseDouble(basicMonthlySalaryText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog
                (null, "Only numbers and a single decimal point (.) are accepted as inputs.",
                "Basic monthly salary value - Error", JOptionPane.ERROR_MESSAGE);
            basicMonthlySalaryText.setText("0");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occured.", "Error", JOptionPane.ERROR_MESSAGE);
            basicMonthlySalaryText.setText("0");
        }
        try {
            Double.parseDouble(monthsToPayText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog
                (null, "Only numbers and a single decimal point (.) are accepted as inputs.",
                "Months to pay value - Error", JOptionPane.ERROR_MESSAGE);
            monthsToPayText.setText("1");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occured.", "Error", JOptionPane.ERROR_MESSAGE);
            monthsToPayText.setText("1");
        }
        
        // get the basic monthly salary
        if (basicMonthlySalaryText.getText().equals("") ||
            Double.parseDouble(basicMonthlySalaryText.getText()) < 0) {
            JOptionPane.showMessageDialog
                (null, "Enter a valid monthly salary value.",
                "Error", JOptionPane.ERROR_MESSAGE);
            clearTextboxes();
        } else {
            basicMonthlySalary = Double.parseDouble(basicMonthlySalaryText.getText());
            loanAmount(basicMonthlySalary);
        }
        // compute the loan amount
        double loanAmount = Double.parseDouble(loanAmountText.getText());
        loanAmountText.setText(df.format(loanAmount));
        // get the number of months to pay
        if (monthsToPayText.getText().equals("") ||
            Double.parseDouble(monthsToPayText.getText()) <= 0 ||
            Double.parseDouble(monthsToPayText.getText()) > 25) {
            JOptionPane.showMessageDialog
                (null, "Enter a valid number of months.\n(a value between 1-25, includes both 1 and 25)",
                "Error", JOptionPane.ERROR_MESSAGE);
            monthsToPayText.setText("1");
            clearTextboxes();
        } else {
            monthsToPay = Double.parseDouble(monthsToPayText.getText());
        }
        // compute the interest
        double interest = interest(loanAmount, monthsToPay);
        interestText.setText(df.format(interest));
        // compute the service charge
        double serviceCharge = loanAmount * 0.02;
        if (Double.parseDouble(loanAmountText.getText()) <= 0) {
            serviceChargeText.setText("0.00");
        } else {
            serviceChargeText.setText(df.format(serviceCharge));
        }
        // compute the take home loan
        double takeHomeLoan = takeHomeLoan(loanAmount, serviceCharge, interest);
        takeHomeLoanText.setText(df.format(takeHomeLoan));
        // compute the monthly amortization
        double monthlyAmortization = monthlyAmortization(takeHomeLoan, monthsToPay);
        monthlyAmortizationText.setText(df.format(monthlyAmortization));
    }//GEN-LAST:event_jButton1ActionPerformed

    // user-defined methods
    public static void loanAmount(double basicMonthlySalary) {
        double result = basicMonthlySalary * 2.5;
        loanAmountText.setText(Double.toString(result));
    }
    public static double interest(double loanAmount, double numOfMonths) {
        double result = 0;
        // change interest rate depending on the number of months provided
        if (numOfMonths <= 5) {
            result = loanAmount * numOfMonths * 0.0062;
        } else if (numOfMonths <= 10) {
            result = loanAmount * numOfMonths * 0.0065;
        } else if (numOfMonths <= 15) {
            result = loanAmount * numOfMonths * 0.0068;
        } else if (numOfMonths <= 20) {
            result = loanAmount * numOfMonths * 0.0075;
        } else if (numOfMonths <= 25) {
            result = loanAmount * numOfMonths * 0.008;
        }
        return result;
    }
    public static double takeHomeLoan(double loanAmount, double serviceCharge, double interest) {
        double result = 0;
        if (Double.parseDouble(loanAmountText.getText()) <= 0 ||
            Double.parseDouble(interestText.getText()) <= 0) {
            takeHomeLoanText.setText("0.00");
        } else {
            result = loanAmount - serviceCharge - interest;
        }
        return result;
    }
    public static double monthlyAmortization(double takeHomeLoan, double numOfMonths) {
        double result;
        if (takeHomeLoan == 0 || numOfMonths == 0) {
            result = 0;
        } else {
            result = takeHomeLoan / numOfMonths;
        }   
        return result;
    }
    // clears all output textboxes if the user enters an invalid value
    public static void clearTextboxes() {
        loanAmountText.setText("0.00");
        interestText.setText("0.00");
        serviceChargeText.setText("0.00");
        takeHomeLoanText.setText("0.00");
        monthlyAmortizationText.setText("0.00");
    }
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
            java.util.logging.Logger.getLogger(REDACTED_SalaryLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REDACTED_SalaryLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REDACTED_SalaryLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REDACTED_SalaryLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REDACTED_SalaryLoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JTextField basicMonthlySalaryText;
    static javax.swing.JTextField interestText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    static javax.swing.JTextField loanAmountText;
    static javax.swing.JTextField monthlyAmortizationText;
    static javax.swing.JTextField monthsToPayText;
    static javax.swing.JTextField serviceChargeText;
    static javax.swing.JTextField takeHomeLoanText;
    // End of variables declaration//GEN-END:variables
}
