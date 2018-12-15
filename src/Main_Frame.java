import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf2;
	private static int temp = 0;
	private String temp2 = "", temp3 = "";
	private static double cash; 
	private static JTextArea textReciept;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame frame = new Main_Frame();
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
	public Main_Frame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 870, 20);
		contentPane.add(panel);
		
		JPanel Screen = new JPanel();
		Screen.setBackground(new Color(153, 255, 153));
		Screen.setBounds(75, 92, 285, 210);
		contentPane.add(Screen);
		Screen.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setBackground(new Color(153, 255, 153));
		tf1.setBounds(73, 50, 142, 26);
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setText("WELCOME");
		Screen.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setBackground(new Color(153, 255, 153));
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setText("TO");
		tf2.setBounds(73, 77, 142, 26);
		Screen.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setBackground(new Color(153, 255, 153));
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setBounds(73, 104, 142, 26);
		tf3.setText("ATM SIMULATOR");
		Screen.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setBackground(new Color(153, 255, 153));
		tf4.setHorizontalAlignment(SwingConstants.CENTER);
		tf4.setBounds(73, 132, 142, 26);
		tf4.setText("INSERT YOUR CARD");
		Screen.add(tf4);
		tf4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(0, 708, 1018, 20);
		contentPane.add(panel_2);
		
		JPanel keys = new JPanel();
		keys.setBackground(new Color(51, 102, 153));
		keys.setBounds(21, 375, 400, 310);
		contentPane.add(keys);
		keys.setLayout(new GridLayout(4, 4, 10, 10));
		
		JPanel k_1 = new JPanel();
		k_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				One();
			}
		});
		k_1.setBackground(Color.LIGHT_GRAY);
		k_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_1);
		
		JLabel n_1 = new JLabel("1");
		k_1.add(n_1);
		
		JPanel k_2 = new JPanel();
		k_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Two();
			}
		});
		k_2.setBackground(Color.LIGHT_GRAY);
		k_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_2);
		
		JLabel n_2 = new JLabel("2");
		k_2.add(n_2);
		
		JPanel k_3 = new JPanel();
		k_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Three();
			}
		});
		k_3.setBackground(Color.LIGHT_GRAY);
		k_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_3);
		
		JLabel n_3 = new JLabel("3");
		k_3.add(n_3);
		
		JPanel k_cancel = new JPanel();
		k_cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cancel();
				}
		});
		k_cancel.setBackground(new Color(204, 0, 0));
		k_cancel.setForeground(new Color(255, 255, 255));
		k_cancel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_cancel);
		
		JLabel cancel = new JLabel("CANCEL");
		k_cancel.add(cancel);
		
		JPanel k_4 = new JPanel();
		k_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Four();
			}
		});
		k_4.setBackground(Color.LIGHT_GRAY);
		k_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_4);
		
		JLabel n_4 = new JLabel("4");
		k_4.add(n_4);
		
		JPanel k_5 = new JPanel();
		k_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Five();
			}
		});
		k_5.setBackground(Color.LIGHT_GRAY);
		k_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_5);
		
		JLabel n_5 = new JLabel("5");
		k_5.add(n_5);
		
		JPanel k_6 = new JPanel();
		k_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Six();
			}
		});
		k_6.setBackground(Color.LIGHT_GRAY);
		k_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_6);
		
		JLabel n_6 = new JLabel("6");
		k_6.add(n_6);
		
		JPanel k_clear = new JPanel();
		k_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clear();
			}
		});
		k_clear.setBackground(new Color(255, 204, 51));
		k_clear.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_clear);
		
		JLabel clear = new JLabel("CLEAR");
		k_clear.add(clear);
		
		JPanel k_7 = new JPanel();
		k_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Seven();
			}
		});
		k_7.setBackground(Color.LIGHT_GRAY);
		k_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_7);
		
		JLabel n_7 = new JLabel("7");
		k_7.add(n_7);
		
		JPanel k_8 = new JPanel();
		k_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Eight();
			}
		});
		k_8.setBackground(Color.LIGHT_GRAY);
		k_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_8);
		
		JLabel n_8 = new JLabel("8");
		k_8.add(n_8);
		
		JPanel k_9 = new JPanel();
		k_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Nine();
			}
		});
		k_9.setBackground(Color.LIGHT_GRAY);
		k_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_9);
		
		JLabel n_9 = new JLabel("9");
		k_9.add(n_9);
		
		JPanel k_enter = new JPanel();
		k_enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Enter();
			}
		});
		k_enter.setBackground(new Color(51, 153, 51));
		k_enter.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_enter);
		
		JLabel enter = new JLabel("ENTER");
		k_enter.add(enter);
		
		JPanel b1 = new JPanel();
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(b1);
		
		JPanel k_0 = new JPanel();
		k_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Zero();
			}
		});
		k_0.setBackground(Color.LIGHT_GRAY);
		k_0.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(k_0);
		
		JLabel n_0 = new JLabel("0");
		k_0.add(n_0);
		
		JPanel b2 = new JPanel();
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(b2);
		
		JPanel b3 = new JPanel();
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		keys.add(b3);
		
		JPanel p_reciept = new JPanel();
		p_reciept.setBounds(444, 42, 400, 310);
		contentPane.add(p_reciept);
		p_reciept.setLayout(null);
		
		textReciept = new JTextArea("\n -------------------- RECIEPT ---------------------- \n -------------------------------------------------");
		textReciept.setEditable(false);
		textReciept.setBounds(0, 0, 400, 310);
		p_reciept.add(textReciept);
		
		JPanel hardware = new JPanel();
		hardware.setBackground(new Color(51, 153, 204));
		hardware.setBounds(444, 375, 400, 310);
		contentPane.add(hardware);
		hardware.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Inserted();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_1.setBackground(new Color(51, 153, 204));
		panel_1.setBounds(88, 97, 90, 32);
		hardware.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel card_slot = new JPanel();
		card_slot.setBounds(12, 0, 60, 4);
		panel_1.add(card_slot);
		card_slot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), null, null));
		card_slot.setBackground(new Color(105, 105, 105));
		
		JLabel card = new JLabel("INSERT CARD");
		card.setBounds(0, 16, 90, 16);
		panel_1.add(card);
		card.setHorizontalAlignment(SwingConstants.CENTER);
		card.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 153, 204));
		panel_4.setBounds(150, 190, 100, 48);
		hardware.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel cash_panel = new JPanel();
		cash_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Atm_Creation a = new Atm_Creation();
				a.Cash -= temp;
				RecieptCheck();
			}
		});
		cash_panel.setBounds(0, 0, 100, 20);
		panel_4.add(cash_panel);
		cash_panel.setBackground(new Color(105, 105, 105));
		cash_panel.setLayout(null);
		
		JPanel cash_slot = new JPanel();
		cash_slot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Atm_Creation a = new Atm_Creation();
				a.Cash -= temp;
				RecieptCheck();
			}
		});
		cash_slot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 250, 250), null, null));
		cash_slot.setBackground(new Color(105, 105, 105));
		cash_slot.setBounds(6, 5, 88, 9);
		cash_panel.add(cash_slot);
		
		JLabel cash = new JLabel("TAKE CASH");
		cash.setBackground(new Color(51, 153, 204));
		cash.setBounds(0, 32, 100, 16);
		panel_4.add(cash);
		cash.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TakeReciept();
			}
		});
		panel_3.setBackground(new Color(51, 153, 204));
		panel_3.setBounds(218, 97, 86, 32);
		hardware.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel reciept_slot = new JPanel();
		reciept_slot.setBounds(19, 0, 50, 4);
		panel_3.add(reciept_slot);
		reciept_slot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), null, null));
		reciept_slot.setBackground(new Color(105, 105, 105));
		
		JLabel reciept = new JLabel("TAKE RECIEPT");
		reciept.setBounds(0, 16, 86, 16);
		panel_3.add(reciept);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(0, 102, 153));
		p1.setBounds(358, 125, 45, 45);
		contentPane.add(p1);
		
		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(tf2.getText().equals("WITHDRAW CASH"))
				{
					Withdraw();
				}
			}
		});
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setIcon(new ImageIcon(Main_Frame.class.getResource("/img/arrow4.jpg")));
		p1.add(label_10);
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(0, 102, 153));
		p2.setBounds(358, 219, 45, 45);
		contentPane.add(p2);
		
		JLabel label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cancel();
			}
		});
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setIcon(new ImageIcon(Main_Frame.class.getResource("/img/arrow4.jpg")));
		p2.add(label_11);
		
		JPanel p3 = new JPanel();
		p3.setBackground(new Color(0, 102, 153));
		p3.setBounds(32, 125, 45, 45);
		contentPane.add(p3);
		
		JLabel label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RecieptCheck();
			}
		});
		label_12.setIcon(new ImageIcon(Main_Frame.class.getResource("/img/arrow3.jpg")));
		p3.add(label_12);
		
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(0, 102, 153));
		p4.setBounds(32, 219, 45, 45);
		contentPane.add(p4);
		
		JLabel label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePin();
			}
		});
		label_13.setBackground(new Color(0, 102, 153));
		label_13.setIcon(new ImageIcon(Main_Frame.class.getResource("/img/arrow3.jpg")));
		p4.add(label_13);
	}
	
	public void Inserted() throws InterruptedException {
		if(tf4.getText().equals("INSERT YOUR CARD")) {
			tf1.setText("");
			tf2.setText("ENTER YOUR PIN");
			tf3.setText("");
			tf4.setText("");
		} else { System.out.println("error"); }
	}
	
	public void RecieptCheck() {
		if(tf1.getText().equals("CHECK BALANCE")) {
			tf1.setBounds(73, 50, 142, 26);
			tf1.setText("TO CHECK YOUR");
			tf2.setText("BALANCE TAKE");
			tf2.setBounds(73, 77, 142, 26);
			tf3.setBounds(73, 104, 142, 26);
			tf3.setText("YOUR RECIEPT");
			tf4.setBounds(73, 132, 142, 26);
			tf4.setText("THANK YOU");
		}
		
		if(tf2.getText().equals("TAKE YOUR")) {
			tf1.setBounds(73, 50, 142, 26);
			tf1.setText("YOUR BALANCE");
			tf2.setText("IS UPDATED");
			tf2.setBounds(73, 77, 142, 26);
			tf3.setBounds(73, 104, 142, 26);
			tf3.setText("CHECK RECIEPT");
			tf4.setBounds(73, 132, 142, 26);
			tf4.setText("THANK YOU");
		}
	}
	
	public void Enter() {
		Atm_Creation a = new Atm_Creation();
		
		if(tf2.getText().equals("ENTER NEW PIN")) {
			temp3 = tf3.getText();
			if(a.PIN_Number.equals(temp3)) {
				tf1.setText("YOU HAVE");
				tf2.setText("ENTERED OLD PIN");
				tf3.setText("RETURNING TO ");
				tf4.setText("ATM HOME");
			} 
			else if(temp3.length()==4) {	
				a.PIN_Number = temp3;
				tf1.setText("YOUR PIN");
				tf2.setText("IS CHANGED");
				tf3.setText("SUCCESSFULLY");
				tf4.setText("THANK YOU");
			} 
			else { System.out.println("Error"); }
		}
		
		if(tf2.getText().equals("ENTER YOUR PIN")) 
		{	
			temp2 = tf3.getText();
			if(a.PIN_Number.equals(temp2)) {
				CorrectPin();
			} else {
				tf1.setText("YOU'VE ENTERED");
				tf2.setText("INCORRECT");
				tf3.setText("PIN RETURNING");
				tf4.setText("TO ATM HOME");
			}
		}
		
		if(tf2.getText().equals("ENTER AMOUNT")) {
			temp = Integer.parseInt(tf3.getText());
			if(Integer.parseInt(tf3.getText()) > 99) {
				if(Integer.parseInt(tf3.getText()) <= a.Cash) {
					if(Integer.parseInt(tf3.getText()) % 100 == 0) {	
						tf1.setText("THANK YOU");
						tf1.setBounds(73, 50, 142, 26);
						tf2.setText("TAKE YOUR");
						tf3.setText("CASH FROM");
						tf2.setBounds(73, 77, 142, 26);
						tf3.setBounds(73, 104, 142, 26);
						tf4.setText("BELOW");
						tf4.setBounds(73, 132, 142, 26);
					} else {
						tf1.setText("THIS ATM");
						tf2.setText("ONLY SUPPORTS");
						tf3.setText("AMMOUNT MULTIPLE");
						tf4.setText("OF 100S"); 
					}
				} else {
					tf1.setText("AMOUNT ENTERED");
					tf2.setText("IS GREATER");
					tf3.setText("THAN AMOUNT");
					tf4.setText("IN ACCOUNT");
				}
			} else {
				tf1.setText("YOU HAVE ENTERED"); 
				tf2.setText("WRONG AMOUNT");
				tf3.setText("RETURNING"); 
				tf4.setText("ATM HOME");
			}
		}
	}
	
	public void CorrectPin()
	{
		tf1.setBounds(0, 45, 142, 26);
		tf1.setText("CHECK BALANCE");
		
		tf2.setBounds(143, 44, 142, 26);
		tf2.setText("WITHDRAW CASH");
		
		tf3.setText("CHANGE PIN");
		tf3.setBounds(0, 138, 142, 26);
		tf3.setEditable(false);
		
		tf4.setText("LOG OUT");
		tf4.setBounds(143, 138, 142, 26);
	}
			
	public void One() {
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN")) {
			tf3.setText(tf3.getText()+"1");
		}
	}
	
	public void Two() {
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN")) {
			tf3.setText(tf3.getText()+"2");
		}
	}
	
	public void Three() {
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN")) {
			tf3.setText(tf3.getText()+"3");
		}
	}
	
	public void Four() {
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN")) {
			tf3.setText(tf3.getText()+"4");
		}	
	}
	
	public void Five() {
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN")) {
			tf3.setText(tf3.getText()+"5");
		}	
	}
	
	public void Six() {
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN")) {
			tf3.setText(tf3.getText()+"6");
		}
	}
	
	public void Seven() 
	{
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN"))
		{
			tf3.setText(tf3.getText()+"7");
		}
	}
	
	public void Eight() 
	{
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN"))
		{
			tf3.setText(tf3.getText()+"8");
		}
	}
	
	public void Nine() 
	{
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN"))
		{
			tf3.setText(tf3.getText()+"9");
		}
	}
	
	public void Zero() 
	{
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN"))
		{
			tf3.setText(tf3.getText()+"0");
		}
	}
	
	public void Clear() 
	{
		
		if(tf2.getText().equals("ENTER YOUR PIN")||tf2.getText().equals("ENTER AMOUNT")||tf2.getText().equals("ENTER NEW PIN"))
		{
			tf3.setText(tf3.getText().substring(0, tf3.getText().length()-1));
		}
	}
	
	public void Withdraw() {
		Atm_Creation a = new Atm_Creation();
		if(a.Cash > 99) {
			tf1.setText("");
			tf1.setBounds(73, 50, 142, 26);
			tf2.setText("ENTER AMOUNT");
			tf3.setText("");
			tf2.setBounds(73, 77, 142, 26);
			tf3.setBounds(73, 104, 142, 26);
			tf4.setText("");
			tf4.setBounds(73, 132, 142, 26);
		} 
		else { System.out.println("ERROR");}
	}
	
	public void Cancel() {
		tf1.setBounds(73, 50, 142, 26);
		tf1.setText("WELCOME");
		tf2.setText("TO");
		tf2.setBounds(73, 77, 142, 26);
		tf3.setBounds(73, 104, 142, 26);
		tf3.setText("ATM SIMULATOR");
		tf4.setBounds(73, 132, 142, 26);
		tf4.setText("INSERT YOUR CARD");
		textReciept.setText("\n -------------------- RECIEPT ---------------------- "
				+ "\n -------------------------------------------------");
	}
	
	public void TakeReciept() {
		Atm_Creation a = new Atm_Creation();
		if(tf2.getText().equals("BALANCE TAKE")) {
			String prino = a.Card_Number.substring(0 , a.Card_Number.length()-9); 
			
			textReciept.setText("\n"
				+ " -------------------- RECIEPT ---------------------- \n"
				+ " ------------------------------------------------- \n"
				+ " \n"
				+ " THANKS FOR USING THIS SERVICE \n"
				+ " "+ a.Holder_Name.toUpperCase() +"\n"
				+ " BALANCE OF ACC NO. "+prino+"X XXXX XXXX XXXX \n"
				+ " IS "+a.Cash+"");
		}
		
		if(tf2.getText().equals("IS UPDATED")) {
			String prino = a.Card_Number.substring(0 , a.Card_Number.length()-9); 
			textReciept.setText("\n"
				+ " -------------------- RECIEPT ---------------------- \n"
				+ " ------------------------------------------------- \n"
				+ " \n"
				+ " THANKS FOR USING THIS SERVICE \n"
				+ " "+ a.Holder_Name.toUpperCase() +"\n"
				+ " "+ temp +" HAS BEEN DEBITED FROM YOUR ACCOUNT \n"
				+ " BALANCE OF ACC NO. "+prino+"X XXXX XXXX XXXX \n"
				+ " IS "+a.Cash+"");
		}
	}
	
	public void ChangePin() {
		if(tf3.getText().equals("CHANGE PIN")) 
		{
			tf1.setText("");
			tf1.setBounds(73, 50, 142, 26);
			tf2.setText("ENTER NEW PIN");
			tf3.setText("");
			tf2.setBounds(73, 77, 142, 26);
			tf3.setBounds(73, 104, 142, 26);
			tf4.setText("");
			tf4.setBounds(73, 132, 142, 26);
		}
	}
}
