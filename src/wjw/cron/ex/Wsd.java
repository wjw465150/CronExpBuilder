package wjw.cron.ex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class Wsd extends JFrame {

  private JPanel contentPane;
  private JTextField textField;
  private final JButton btnNewButton_1 = new JButton("New button");

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Wsd frame = new Wsd();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Wsd() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 754, 538);
    contentPane = new JPanel();
    contentPane.setBorder(new TitledBorder(null, "www", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    setContentPane(contentPane);
    GridBagLayout gbl_contentPane = new GridBagLayout();
    gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
    gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
    gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
    contentPane.setLayout(gbl_contentPane);
    
    JLabel lblNewLabel = new JLabel("New label");
    GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
    gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
    gbc_lblNewLabel.gridx = 0;
    gbc_lblNewLabel.gridy = 0;
    contentPane.add(lblNewLabel, gbc_lblNewLabel);
    
    textField = new JTextField();
    GridBagConstraints gbc_textField = new GridBagConstraints();
    gbc_textField.gridwidth = 2;
    gbc_textField.insets = new Insets(0, 0, 5, 5);
    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField.gridx = 2;
    gbc_textField.gridy = 0;
    contentPane.add(textField, gbc_textField);
    textField.setColumns(10);
    
    JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
    GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
    gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
    gbc_chckbxNewCheckBox.gridx = 1;
    gbc_chckbxNewCheckBox.gridy = 2;
    contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
    
    JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
    GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
    gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
    gbc_chckbxNewCheckBox_1.gridx = 1;
    gbc_chckbxNewCheckBox_1.gridy = 3;
    contentPane.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
    
    JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
    GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
    gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
    gbc_chckbxNewCheckBox_2.gridx = 1;
    gbc_chckbxNewCheckBox_2.gridy = 4;
    contentPane.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
    
    JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
    GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
    gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.EAST;
    gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 10);
    gbc_rdbtnNewRadioButton.gridx = 3;
    gbc_rdbtnNewRadioButton.gridy = 6;
    contentPane.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
    
    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
    GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
    gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.EAST;
    gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 10);
    gbc_rdbtnNewRadioButton_1.gridx = 3;
    gbc_rdbtnNewRadioButton_1.gridy = 7;
    contentPane.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
    
    JRadioButton radioButton = new JRadioButton("New radio button");
    GridBagConstraints gbc_radioButton = new GridBagConstraints();
    gbc_radioButton.insets = new Insets(0, 0, 5, 10);
    gbc_radioButton.anchor = GridBagConstraints.EAST;
    gbc_radioButton.gridx = 3;
    gbc_radioButton.gridy = 8;
    contentPane.add(radioButton, gbc_radioButton);
    GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
    gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
    gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
    gbc_btnNewButton_1.gridx = 2;
    gbc_btnNewButton_1.gridy = 16;
    contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
    
    JButton btnNewButton = new JButton("New button");
    GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
    gbc_btnNewButton.anchor = GridBagConstraints.EAST;
    gbc_btnNewButton.gridx = 3;
    gbc_btnNewButton.gridy = 16;
    contentPane.add(btnNewButton, gbc_btnNewButton);
  }

}
