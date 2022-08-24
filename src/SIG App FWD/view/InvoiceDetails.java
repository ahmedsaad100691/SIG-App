/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicet3july.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvoiceDetails extends JDialog{
    private JTextField invoiceNameTxt;
    private JTextField invoiceCountTxt;
    private JTextField invoicePriceTxt;
    private JLabel invoiceNamelbl;
    private JLabel invoiceCountlbl;
    private JLabel invoicePricelbl;
    private JButton save_btn;
    private JButton cancel_btn;
    
    public InvoiceDetails(InvoiceGeneratorFrame frame) {
        invoiceNameTxt = new JTextField(20);
        invoiceNamelbl = new JLabel("Item Name");
        
        invoiceCountTxt = new JTextField(20);
        invoiceCountlbl = new JLabel("Item Count");
        
        invoicePriceTxt = new JTextField(20);
        invoicePricelbl = new JLabel("Item Price");
        
        save_btn = new JButton("OK");
        cancel_btn = new JButton("Cancel");
        
        save_btn.setActionCommand("newLineOK");
        cancel_btn.setActionCommand("newLineCancel");
        
        save_btn.addActionListener(frame.getListener());
        cancel_btn.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(invoiceNamelbl);
        add(invoiceNameTxt);
        add(invoiceCountlbl);
        add(invoiceCountTxt);
        add(invoicePricelbl);
        add(invoicePriceTxt);
        add(save_btn);
        add(cancel_btn);
        setModal(true);
        pack();
    }

    public JTextField getinvoiceNameTxt() {
        return invoiceNameTxt;
    }

    public JTextField getinvoiceCountTxt() {
        return invoiceCountTxt;
    }

    public JTextField getinvoicePriceTxt() {
        return invoicePriceTxt;
    }
}
