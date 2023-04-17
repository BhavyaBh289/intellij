
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class fir extends JFrame {
    static ArrayList<String> firRecords = new ArrayList<String>();

    // GUI components
    private JTextField firNumberField;
    private JTextField victimNameField;
    private JTextField accusedNameField;
    private JTextField crimeCommittedField;
    private JTextArea recordsArea;

    public fir() {
        // Set up the main window
        super("FIR System");

        // Create the UI components
        JLabel firNumberLabel = new JLabel("FIR Number:");
        firNumberField = new JTextField(10);
        JLabel victimNameLabel = new JLabel("Victim Name:");
        victimNameField = new JTextField(20);
        JLabel accusedNameLabel = new JLabel("Accused Name:");
        accusedNameField = new JTextField(20);
        JLabel crimeCommittedLabel = new JLabel("Crime Committed:");
        crimeCommittedField = new JTextField(20);
        JButton addButton = new JButton("Add FIR Record");
        addButton.addActionListener(new AddButtonListener());
        recordsArea = new JTextArea(10, 30);
        recordsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(recordsArea);

        // Add the components to the window
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(firNumberLabel, c);
        c.gridx = 1;
        panel.add(firNumberField, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(victimNameLabel, c);
        c.gridx = 1;
        panel.add(victimNameField, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(accusedNameLabel, c);
        c.gridx = 1;
        panel.add(accusedNameField, c);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(crimeCommittedLabel, c);
        c.gridx = 1;
        panel.add(crimeCommittedField, c);
        c.gridx = 1;
        c.gridy = 4;
        panel.add(addButton, c);
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Configure the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Set color for UI components
        Color lightBlue = new Color(173, 216, 230);
        panel.setBackground(lightBlue);
        addButton.setBackground(Color.WHITE);
        addButton.setForeground(Color.BLACK);
        recordsArea.setBackground(lightBlue);
        recordsArea.setForeground(Color.BLACK);
    }

    // Listener for the "Add FIR Record" button
    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Collect FIR details from user
            String firNumber = firNumberField.getText();
            String victimName = victimNameField.getText();
            String accusedName = accusedNameField.getText();
            String crimeCommitted = crimeCommittedField.getText();

            // Create FIR record and add it to the data structure
            String firRecord = "FIR Number: " + firNumber +
                    "\nVictim Name: " + victimName +
                    "\nAccused Name: " + accusedName +
                    "\nCrime Committed: " + crimeCommitted + "\n";
            firRecords.add(firRecord);
            // Update the records area to show the new record
            recordsArea.setText("");
            for (String record : firRecords) {
                recordsArea.append(record + "\n");
            }

            // Clear the input fields
            firNumberField.setText("");
            victimNameField.setText("");
            accusedNameField.setText("");
            crimeCommittedField.setText("");
        }
    }

    public static void main(String[] args) {
        new fir();
    }
}