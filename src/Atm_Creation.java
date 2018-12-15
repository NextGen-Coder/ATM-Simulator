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
import javax.swing.text.NumberFormatter;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Atm_Creation extends JFrame {

	private JPanel contentPane;
	private JTextField tf_name;
	private JTextField tf_card;
	private JTextField tf_pin;
	protected static String Holder_Name = "", Card_Number = "", PIN_Number = "", S_Cash = "";
	protected static int Cash = 0;
	JComboBox cb_cash;
	static Atm_Creation frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Atm_Creation();
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
	public Atm_Creation() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel main_panel = new JPanel();
		main_panel.setBorder(new LineBorder(new Color(255, 0, 102), 2, true));
		main_panel.setBounds(18, 25, 714, 430);
		contentPane.add(main_panel);
		main_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel create_panel = new JPanel();
		create_panel.setBackground(new Color(0, 153, 153));
		create_panel.setBorder(new EmptyBorder(35, 0, 0, 0));
		main_panel.add(create_panel, BorderLayout.CENTER);
		create_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(0, 153, 153));
		p1.setBorder(new EmptyBorder(0, 60, 0, 60));
		create_panel.add(p1);
		
		JLabel l_name = new JLabel("HOLDER'S  NAME  :");
		l_name.setHorizontalAlignment(SwingConstants.CENTER);
		p1.add(l_name);
		
		tf_name = new JTextField();
		tf_name.setTransferHandler(null);
		tf_name.setSize( 20, 100);
		p1.add(tf_name);
		tf_name.setColumns(15);
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(0, 153, 153));
		p2.setBorder(new EmptyBorder(0, 60, 0, 60));
		create_panel.add(p2);
		
		JLabel l_card = new JLabel("CARD NUMBER      :");
		p2.add(l_card);
		
		tf_card = new JTextField();
		tf_card.setTransferHandler(null);
		p2.add(tf_card);
		tf_card.setColumns(15);
		
		JPanel p3 = new JPanel();
		p3.setBorder(new EmptyBorder(0, 60, 0, 60));
		p3.setBackground(new Color(0, 153, 153));
		create_panel.add(p3);
		
		JLabel l_pin = new JLabel("PIN NUMBER          :");
		p3.add(l_pin);
		
		tf_pin = new JTextField();
		tf_pin.setTransferHandler(null);
		tf_pin.setColumns(15);
		p3.add(tf_pin);
		
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(0, 153, 153));
		p4.setBorder(new EmptyBorder(0, 150, 20, 150));
		create_panel.add(p4);
		
		JLabel l_cash = new JLabel("CASH DEPOSITE     :                       ");
		p4.add(l_cash);
		
		cb_cash = new JComboBox();
		cb_cash.setModel(new DefaultComboBoxModel(new String[] {"100", "200", "500", "1000", "2000", "5000", "10000", "15000", "20000"}));
		p4.add(cb_cash);
		
		JButton to_atm = new JButton("PROCEED TO ATM");
		to_atm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create();
			}
		});
		create_panel.add(to_atm);
		
		JPanel title_panel = new JPanel();
		title_panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		main_panel.add(title_panel, BorderLayout.NORTH);
		title_panel.setBackground(new Color(0, 153, 153));
		
		JLabel title_name = new JLabel("BANK REGISTRATION");
		title_name.setHorizontalAlignment(SwingConstants.CENTER);
		title_name.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		title_name.setBorder(new EmptyBorder(7, 7, 7, 7));
		title_panel.add(title_name);
	}
	
	public void Create()
	{
		try
		{
			if(tf_name.getText().isEmpty()||tf_card.getText().isEmpty()||tf_pin.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Fill all fields");
			}
			else 
			if(tf_card.getText().length()==12)
			{
				if(tf_pin.getText().length()==4)
				{
					if(tf_name.getText().contains("1")||tf_name.getText().contains("2")||tf_name.getText().contains("3")||tf_name.getText().contains("4")||tf_name.getText().contains("5")||tf_name.getText().contains("6")||tf_name.getText().contains("7")||tf_name.getText().contains("8")||tf_name.getText().contains("9")||tf_name.getText().contains("0")||tf_name.getText().contains("@")||tf_name.getText().contains("#")||tf_name.getText().contains("%")||tf_name.getText().contains("^")
					||tf_name.getText().contains("&")||tf_name.getText().contains("*")||tf_name.getText().contains("(")||tf_name.getText().contains(")")||tf_name.getText().contains("-")||tf_name.getText().contains("_")||tf_name.getText().contains("=")||tf_name.getText().contains("+")||tf_name.getText().contains("{")||tf_name.getText().contains("}")||tf_name.getText().contains("!")||tf_name.getText().contains("/")||tf_name.getText().contains("\\")||tf_name.getText().contains("$")
					||tf_name.getText().contains("[")||tf_name.getText().contains("]")||tf_name.getText().contains(";")||tf_name.getText().contains(":")||tf_name.getText().contains("'")||tf_name.getText().contains("\"")||tf_name.getText().contains(",")||tf_name.getText().contains(".")||tf_name.getText().contains("<")||tf_name.getText().contains(">")||tf_name.getText().contains("?")||tf_name.getText().contains("|")||tf_name.getText().contains("`")||tf_name.getText().contains("~"))
					{
						JOptionPane.showMessageDialog(null, "Name should only be in chars");
					}
					else
					{
						try 
						{
							int a = Integer.parseInt(tf_pin.getText());
							
							try 
							{
								long b = Long.parseLong(tf_card.getText());
								
								Holder_Name = tf_name.getText();
								Card_Number = tf_card.getText();
								PIN_Number = tf_pin.getText();
								Cash = Integer.parseInt(cb_cash.getSelectedItem().toString());
								frame.setVisible(false);
								Main_Frame M = new Main_Frame();
								M.setVisible(true);	
							}
							catch(Exception e2)
							{
								JOptionPane.showMessageDialog(null, "Card number should only be number");
							}
						}
						catch(Exception e) 
						{
							JOptionPane.showMessageDialog(null, "Pin should only be integer");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Pin should only contain 4 numbers");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Card number should only contain 12 numbers");
			}
		}
		catch(Exception e3)
		{
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
}
	
