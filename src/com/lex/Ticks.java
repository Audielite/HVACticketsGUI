package com.lex;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexishennings on 4/29/17.
 */

    public class Ticks extends JFrame {
    private JPanel rootPanel;
    //private JList<Issues> tickets;

    //private JPanel panel1;
    private JLabel SupportTickets;
    private JComboBox priorityLevelComboBox;
    private JTextField ticketTextField;
    private JButton submitButton;
    private JList<Issues> TicketJList;

    private DefaultListModel<Issues> ticketListModel;

    protected Ticks() {

        super("List of tickets");
        setContentPane(rootPanel);
        pack();
        //configureSubmitButton();
        configureIssues();
        setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ticketListModel = new DefaultListModel<>();
        TicketJList.setModel(ticketListModel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String issues = ticketTextField.getText();
                String rating = (String) priorityLevelComboBox.getSelectedItem();
                String result = "Ticket created.";
                JOptionPane.showMessageDialog(Ticks.this, result);

                Issues newIssues = new Issues(issues, rating);
                ticketListModel.addElement(newIssues);

            }
        });
    }

    private void configureIssues() {
        for (int x = 1; x <= 5; x++) {
            if (x == 1) {
                priorityLevelComboBox.addItem(x + " ");
            } else {
                priorityLevelComboBox.addItem(x + " ");
            }
        }
    }
}

            //addListeners();

           /* TicketJList.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    //String newTicket = ticketTextField.getText();

                }
            });
        }

        private void configureIssues() {
            for (int x = 1; x <= 5; x++) {
                if (x == 1) {
                    priorityLevelComboBox.addItem(x + " ");
                } else {
                    priorityLevelComboBox.addItem(x + " ");
                }
            }
        }

        //private void addListeners() {

        private void configureSubmitButton() {

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String issues = ticketTextField.getText();
                    String rating = (String) priorityLevelComboBox.getSelectedItem();
                    String result = "Ticket created.";
                    JOptionPane.showMessageDialog(Ticks.this, result);

                    Issues newIssues = new Issues(issues);
                    ticketListModel.addElement(newIssues);

                }
            });
        }
    }*/