import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtmCreation extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField cardText;
	private JTextField pinText; 
	protected static String accHolderName = "", cardNumber = "", pinNumber = "";
	protected static int cash = 0;
	JComboBox cashComboBox;
	static AtmCreation frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AtmCreation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AtmCreation() {
		// Below Code Sets Properties of Frame 
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("ATM SIMULATOR");
		
		// Below Code is of Main Panel 
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(255, 0, 102), 2, true));
		mainPanel.setBounds(18, 25, 714, 430);
		contentPane.add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		// Below Code is of Create Panel
		JPanel createPanel = new JPanel();
		createPanel.setBackground(new Color(0, 153, 153));
		createPanel.setBorder(new EmptyBorder(35, 0, 0, 0));
		mainPanel.add(createPanel, BorderLayout.CENTER);
		createPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		// Below Code creates p1 panel and adds it to create panel
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(0, 153, 153));
		p1.setBorder(new EmptyBorder(0, 60, 0, 60));
		createPanel.add(p1);
		
		/* 	Below Code creates label = HOLDER'S NAME 
			and textfield and adds it to p1 panel */	
		JLabel nameLabel = new JLabel("HOLDER'S  NAME  :");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		p1.add(nameLabel);
		
		nameText = new JTextField();
		nameText.setTransferHandler(null);
		nameText.setSize( 20, 100);
		p1.add(nameText);
		nameText.setColumns(15);
		
		// Below Code creates p2 panel and adds it to create panel
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(0, 153, 153));
		p2.setBorder(new EmptyBorder(0, 60, 0, 60));
		createPanel.add(p2);
		
		/* 	Below Code creates label = CARD NUMBER
		and textfield and adds it to p1 panel */	
		JLabel cardLabel = new JLabel("CARD NUMBER      :");
		p2.add(cardLabel);
		
		cardText = new JTextField();
		cardText.setTransferHandler(null);
		p2.add(cardText);
		cardText.setColumns(15);
		
		// Below Code creates p3 panel and adds it to create panel
		JPanel p3 = new JPanel();
		p3.setBorder(new EmptyBorder(0, 60, 0, 60));
		p3.setBackground(new Color(0, 153, 153));
		createPanel.add(p3);
		
		/* 	Below Code creates label = PIN NUMBER
		and textfield and adds it to p1 panel */	
		JLabel pinLabel = new JLabel("PIN NUMBER          :");
		p3.add(pinLabel);
		
		pinText = new JTextField();
		pinText.setTransferHandler(null);
		pinText.setColumns(15);
		p3.add(pinText);
		
		// Below Code creates p4 panel and adds it to create panel
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(0, 153, 153));
		p4.setBorder(new EmptyBorder(0, 150, 20, 150));
		createPanel.add(p4);
		
		/* 	Below Code creates label = CASH DEPOSITE
		and comboBox and adds it to p1 panel */	
		JLabel cashLabel = new JLabel("CASH DEPOSITE     :                       ");
		p4.add(cashLabel);
		
		cashComboBox = new JComboBox();
		cashComboBox.setModel(new DefaultComboBoxModel(new String[] {"100", "200", "500", "1000", "2000", "5000", "10000", "15000", "20000"}));
		p4.add(cashComboBox);
		
		// Below code executes Create() function on pressing toAtmButton
		JButton toAtmButton = new JButton("PROCEED TO ATM");
		toAtmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create();
			}
		});
		createPanel.add(toAtmButton);
		
		/* 	Below Code creates label titleName = BANK REGISTRATION
		and adds it to titlePanel panel  */	
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new EmptyBorder(15, 15, 15, 15));
		mainPanel.add(titlePanel, BorderLayout.NORTH);
		titlePanel.setBackground(new Color(0, 153, 153));
		
		JLabel titleName = new JLabel("BANK REGISTRATION");
		titleName.setHorizontalAlignment(SwingConstants.CENTER);
		titleName.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		titleName.setBorder(new EmptyBorder(7, 7, 7, 7));
		titlePanel.add(titleName);
	}
	
	public void Create() {
		// Below Condition checks whether name, card or pin textfields are empty
		if(nameText.getText().isEmpty()||cardText.getText().isEmpty()||pinText.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Fill all fields");
		} 
		// Below Condition checks whether card Number is of length 12  
		else if(cardText.getText().length()==12) {
			// Below Condition checks whether pin is of length 4
			if(pinText.getText().length()==4) {
				// Below Condition checks whether name contains only alphabets if yes then else part is executed
				if(nameText.getText().contains("1")||nameText.getText().contains("2")||nameText.getText().contains("3")||nameText.getText().contains("4")||nameText.getText().contains("5")||nameText.getText().contains("6")||nameText.getText().contains("7")||nameText.getText().contains("8")||nameText.getText().contains("9")||nameText.getText().contains("0")||nameText.getText().contains("@")||nameText.getText().contains("#")||nameText.getText().contains("%")||nameText.getText().contains("^")
				||nameText.getText().contains("&")||nameText.getText().contains("*")||nameText.getText().contains("(")||nameText.getText().contains(")")||nameText.getText().contains("-")||nameText.getText().contains("_")||nameText.getText().contains("=")||nameText.getText().contains("+")||nameText.getText().contains("{")||nameText.getText().contains("}")||nameText.getText().contains("!")||nameText.getText().contains("/")||nameText.getText().contains("\\")||nameText.getText().contains("$")
				||nameText.getText().contains("[")||nameText.getText().contains("]")||nameText.getText().contains(";")||nameText.getText().contains(":")||nameText.getText().contains("'")||nameText.getText().contains("\"")||nameText.getText().contains(",")||nameText.getText().contains(".")||nameText.getText().contains("<")||nameText.getText().contains(">")||nameText.getText().contains("?")||nameText.getText().contains("|")||nameText.getText().contains("`")||nameText.getText().contains("~")) {
					JOptionPane.showMessageDialog(null, "Name should only be in chars");
				}
				else 
				{
					// Below Code checks whether pin is numbered value or not
					try {
						int a = Integer.parseInt(pinText.getText());

						// Below Code checks whether card number is numbered value or not
						try {
							long b = Long.parseLong(cardText.getText());
							
							/* 	Below Code stores every inputs into
							 * 	its appropriete variables.
							 * 	And closes the Registration window
							 * 	and opens ATM window.
							 */ 
							accHolderName = nameText.getText();
							cardNumber = cardText.getText();
							pinNumber = pinText.getText();
							cash = Integer.parseInt(cashComboBox.getSelectedItem().toString());
							frame.setVisible(false);
							MainFrame M = new MainFrame();
							M.setVisible(true);	
						}
						catch(Exception e2) {
							JOptionPane.showMessageDialog(null, "Card number should only be number");
						}
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Pin should only be integer");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Pin should only contain 4 numbers");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Card number should only contain 12 numbers");
		}
	}
}