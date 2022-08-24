/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinvoicet3july.model;

import java.util.Date;
import java.util.ArrayList;
import salesinvoicet3july.view.InvoiceGeneratorFrame;

/**
 *
 * @author DELL
 */
public class Invoice {
    private int num;
    private String customer;
    private Date date;
    private ArrayList<Line> lines;

    public Invoice(int num, String customer, Date date) {
        this.num = num;
        this.customer = customer;
        this.date = date;
    }
    
    public String toCSV() {
        return num + "," + InvoiceGeneratorFrame.sdf.format(date) + "," + customer;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Line> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (Line line : getLines()) {
            total += line.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", customer=" + customer + ", date=" + date + '}';
    }
    
    
    
}
