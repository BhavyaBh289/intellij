package firsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame {
    private JButton FIRButton, recordButton, mapButton, criminalData, entry, exitButton;

    public Dashboard() {
        super("Dashboard Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Add a panel for the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        buttonPanel.setBackground(Color.BLACK);

        // Create and add the buttons with icons
        ImageIcon donateIcon = new ImageIcon("C:\Users\muaz\eclipse-workspace\firsystem\list.jpg");
        FIRButton = new JButton(donateIcon);
        FIRButton.setToolTipText("Donate");
        FIRButton.setPreferredSize(new Dimension(150, 149));
        FIRButton.setBackground(Color.WHITE);
        
        buttonPanel.add(FIRButton);
        FIRButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == FIRButton) {
                    Main main = new Main();
                    dispose(); // close the current window
                }
            }
        });

        

        ImageIcon receiveIcon = new ImageIcon("C:\Users\muaz\eclipse-workspace\firsystem\decrypt.jpg");
        recordButton = new JButton(receiveIcon);
        recordButton.setToolTipText("Receive Food");
        recordButton.setPreferredSize(new Dimension(150, 150));
        recordButton.setBackground(Color.WHITE);
        buttonPanel.add(recordButton);
        recordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == recordButton) {
                	DecryptorGUI decryptorGUI = new DecryptorGUI();
                    dispose(); // close the current window
                }
            }
        });

        ImageIcon mapIcon = new ImageIcon("C:\Users\muaz\eclipse-workspace\firsystem\map.jpg");
        mapButton = new JButton(mapIcon);
        mapButton.setToolTipText("Map");
       mapButton.setPreferredSize(new Dimension(150, 150));
        mapButton.setBackground(Color.WHITE);
        buttonPanel.add(mapButton);
        mapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == recordButton) {
                	Map gui = new Map();
                	gui.setVisible(true);
                    dispose(); // close the current window
                }
            }
        });

        ImageIcon criminalIcon = new ImageIcon("C:\Users\muaz\eclipse-workspace\firsystem\data.jpg");
        criminalData = new JButton(criminalIcon);
        criminalData.setToolTipText("About Us");
        criminalData.setPreferredSize(new Dimension(150, 153));
       criminalData.setBackground(Color.WHITE);
        buttonPanel.add(criminalData);
        criminalData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == criminalData) {
                	CriminalDataEntry criminalDataEntry = new CriminalDataEntry();
                    criminalDataEntry.setVisible(true);
                   dispose(); // close the current window
                }
            }
        });
        

        

        ImageIcon entryIcon = new ImageIcon("C:\Users\muaz\eclipse-workspace\firsystem\record.jpg");
        entry = new JButton(entryIcon);
        entry.setToolTipText("History");
        entry.setPreferredSize(new Dimension(150, 149));
        entry.setBackground(Color.WHITE);
        buttonPanel.add(entry);
        entry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == criminalData) {
                	CriminalDetailsGUI frame = new CriminalDetailsGUI();
                    frame.setVisible(true);
                    dispose(); // close the current window
                }
            }
        });

        ImageIcon exitIcon = new ImageIcon("C:\\Users\\muaz\\eclipse-workspace\\firsystem\\exit.png");
        exitButton = new JButton(exitIcon);
        exitButton.setToolTipText("Exit");
        exitButton.setPreferredSize(new Dimension(150, 150));
        exitButton.setBackground(Color.WHITE);
        buttonPanel.add(exitButton);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    
   

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Dashboard Dashboard = new Dashboard();
        Dashboard.setVisible(true); // Show the dashboard page
    }
}