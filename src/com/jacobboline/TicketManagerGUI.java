package com.jacobboline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by Destro on 4/12/2016.
 */
public class TicketManagerGUI extends JFrame{
    private JPanel rootPanel;
    private JTextField addDescription;

    private JLabel descriptionOfTicketLabel;
    private JLabel whoReportedTicket;
    private JTextField addWhoReportedTicket;
    private JComboBox setPriority;
    private JButton submitTicketButton;

    private final String priority1 = "Priority 1 - Least Severe";
    private final String priority2 = "Priority 2";
    private final String priority3 = "Priority 3";
    private final String priority4 = "Priority 4";
    private final String priority5 = "Priority 5 - Most Severe";

    public TicketManagerGUI() {
        super("Ticket Manager");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setPreferredSize(new Dimension(500, 200));
        configurePriority();

        submitTicketButton.addActionListener(new ActionListener() {
            String ticketInfo = addDescription.getText();
            String reported = addWhoReportedTicket.getText();
            String priority = (String)setPriority.getSelectedItem();

        }


    }




    private void configurePriority() {
        setPriority.addItem(priority1);
        setPriority.addItem(priority2);
        setPriority.addItem(priority3);
        setPriority.addItem(priority4);
        setPriority.addItem(priority5);
    }
}
