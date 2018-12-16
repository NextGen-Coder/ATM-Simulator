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

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField atmTextOne;
	private JTextField atmTextThree;
	private JTextField atmTextFour;
	private JTextField atmTextTwo;
	private static int temp = 0;
	private String temp2 = "", temp3 = "";
	private static JTextArea textReciept;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		// Below Code Sets Properties of Frame 
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
		
		JPanel atmScreen = new JPanel();
		atmScreen.setBackground(new Color(153, 255, 153));
		atmScreen.setBounds(75, 92, 285, 210);
		contentPane.add(atmScreen);
		atmScreen.setLayout(null);
		
		atmTextOne = new JTextField();
		atmTextOne.setEditable(false);
		atmTextOne.setBackground(new Color(153, 255, 153));
		atmTextOne.setBounds(73, 50, 142, 26);
		atmTextOne.setHorizontalAlignment(SwingConstants.CENTER);
		atmTextOne.setText("WELCOME");
		atmScreen.add(atmTextOne);
		atmTextOne.setColumns(10);
		
		atmTextTwo = new JTextField();
		atmTextTwo.setEditable(false);
		atmTextTwo.setBackground(new Color(153, 255, 153));
		atmTextTwo.setHorizontalAlignment(SwingConstants.CENTER);
		atmTextTwo.setText("TO");
		atmTextTwo.setBounds(73, 77, 142, 26);
		atmScreen.add(atmTextTwo);
		atmTextTwo.setColumns(10);
		
		atmTextThree = new JTextField();
		atmTextThree.setEditable(false);
		atmTextThree.setBackground(new Color(153, 255, 153));
		atmTextThree.setHorizontalAlignment(SwingConstants.CENTER);
		atmTextThree.setBounds(73, 104, 142, 26);
		atmTextThree.setText("ATM SIMULATOR");
		atmScreen.add(atmTextThree);
		atmTextThree.setColumns(10);
		
		atmTextFour = new JTextField();
		atmTextFour.setEditable(false);
		atmTextFour.setBackground(new Color(153, 255, 153));
		atmTextFour.setHorizontalAlignment(SwingConstants.CENTER);
		atmTextFour.setBounds(73, 132, 142, 26);
		atmTextFour.setText("INSERT YOUR CARD");
		atmScreen.add(atmTextFour);
		atmTextFour.setColumns(10);
		
		JPanel panel2 = new JPanel();
		panel2.setForeground(Color.WHITE);
		panel2.setBackground(new Color(70, 130, 180));
		panel2.setBounds(0, 708, 1018, 20);
		contentPane.add(panel2);
		
		JPanel atmButtons = new JPanel();
		atmButtons.setBackground(new Color(51, 102, 153));
		atmButtons.setBounds(21, 375, 400, 310);
		contentPane.add(atmButtons);
		atmButtons.setLayout(new GridLayout(4, 4, 10, 10));
		
		JPanel button1 = new JPanel();
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				One();
			}
		});
		button1.setBackground(Color.LIGHT_GRAY);
		button1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button1);
		
		JLabel num1 = new JLabel("1");
		button1.add(num1);
		
		JPanel button2 = new JPanel();
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Two();
			}
		});
		button2.setBackground(Color.LIGHT_GRAY);
		button2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button2);
		
		JLabel num2 = new JLabel("2");
		button2.add(num2);
		
		JPanel button3 = new JPanel();
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Three();
			}
		});
		button3.setBackground(Color.LIGHT_GRAY);
		button3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button3);
		
		JLabel num3 = new JLabel("3");
		button3.add(num3);
		
		JPanel buttoncancel = new JPanel();
		buttoncancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cancel();
				}
		});
		buttoncancel.setBackground(new Color(204, 0, 0));
		buttoncancel.setForeground(new Color(255, 255, 255));
		buttoncancel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttoncancel);
		
		JLabel cancel = new JLabel("CANCEL");
		buttoncancel.add(cancel);
		
		JPanel button4 = new JPanel();
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Four();
			}
		});
		button4.setBackground(Color.LIGHT_GRAY);
		button4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button4);
		
		JLabel num4 = new JLabel("4");
		button4.add(num4);
		
		JPanel button5 = new JPanel();
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Five();
			}
		});
		button5.setBackground(Color.LIGHT_GRAY);
		button5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button5);
		
		JLabel num5 = new JLabel("5");
		button5.add(num5);
		
		JPanel button6 = new JPanel();
		button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Six();
			}
		});
		button6.setBackground(Color.LIGHT_GRAY);
		button6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button6);
		
		JLabel num6 = new JLabel("6");
		button6.add(num6);
		
		JPanel buttonclear = new JPanel();
		buttonclear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clear();
			}
		});
		buttonclear.setBackground(new Color(255, 204, 51));
		buttonclear.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonclear);
		
		JLabel clear = new JLabel("CLEAR");
		buttonclear.add(clear);
		
		JPanel button7 = new JPanel();
		button7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Seven();
			}
		});
		button7.setBackground(Color.LIGHT_GRAY);
		button7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button7);
		
		JLabel num7 = new JLabel("7");
		button7.add(num7);
		
		JPanel button8 = new JPanel();
		button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Eight();
			}
		});
		button8.setBackground(Color.LIGHT_GRAY);
		button8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button8);
		
		JLabel num8 = new JLabel("8");
		button8.add(num8);
		
		JPanel button9 = new JPanel();
		button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Nine();
			}
		});
		button9.setBackground(Color.LIGHT_GRAY);
		button9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button9);
		
		JLabel num9 = new JLabel("9");
		button9.add(num9);
		
		JPanel buttonenter = new JPanel();
		buttonenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Enter();
			}
		});
		buttonenter.setBackground(new Color(51, 153, 51));
		buttonenter.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonenter);
		
		JLabel enter = new JLabel("ENTER");
		buttonenter.add(enter);
		
		JPanel b1 = new JPanel();
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(b1);
		
		JPanel button0 = new JPanel();
		button0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Zero();
			}
		});
		button0.setBackground(Color.LIGHT_GRAY);
		button0.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(button0);
		
		JLabel num0 = new JLabel("0");
		button0.add(num0);
		
		JPanel b2 = new JPanel();
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(b2);
		
		JPanel b3 = new JPanel();
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(b3);
		
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
				AtmCreation a = new AtmCreation();
				a.cash -= temp;
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
				AtmCreation a = new AtmCreation();
				a.cash -= temp;
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
				if(atmTextTwo.getText().equals("WITHDRAW CASH"))
				{
					Withdraw();
				}
			}
		});
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow4.jpg")));
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
		label_11.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow4.jpg")));
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
		label_12.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow3.jpg")));
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
		label_13.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow3.jpg")));
		p4.add(label_13);
	}
	
	public void Inserted() throws InterruptedException {
		if(atmTextFour.getText().equals("INSERT YOUR CARD")) {
			atmTextOne.setText("");
			atmTextTwo.setText("ENTER YOUR PIN");
			atmTextThree.setText("");
			atmTextFour.setText("");
		} else { System.out.println("error"); }
	}
	
	public void RecieptCheck() {
		if(atmTextOne.getText().equals("CHECK BALANCE")) {
			atmTextOne.setBounds(73, 50, 142, 26);
			atmTextOne.setText("TO CHECK YOUR");
			atmTextTwo.setText("BALANCE TAKE");
			atmTextTwo.setBounds(73, 77, 142, 26);
			atmTextThree.setBounds(73, 104, 142, 26);
			atmTextThree.setText("YOUR RECIEPT");
			atmTextFour.setBounds(73, 132, 142, 26);
			atmTextFour.setText("THANK YOU");
		}
		
		if(atmTextTwo.getText().equals("TAKE YOUR")) {
			atmTextOne.setBounds(73, 50, 142, 26);
			atmTextOne.setText("YOUR BALANCE");
			atmTextTwo.setText("IS UPDATED");
			atmTextTwo.setBounds(73, 77, 142, 26);
			atmTextThree.setBounds(73, 104, 142, 26);
			atmTextThree.setText("CHECK RECIEPT");
			atmTextFour.setBounds(73, 132, 142, 26);
			atmTextFour.setText("THANK YOU");
		}
	}
	
	public void Enter() {
		AtmCreation a = new AtmCreation();
		
		if(atmTextTwo.getText().equals("ENTER NEW PIN")) {
			temp3 = atmTextThree.getText();
			if(a.pinNumber.equals(temp3)) {
				atmTextOne.setText("YOU HAVE");
				atmTextTwo.setText("ENTERED OLD PIN");
				atmTextThree.setText("RETURNING TO ");
				atmTextFour.setText("ATM HOME");
			} 
			else if(temp3.length()==4) {	
				a.pinNumber = temp3;
				atmTextOne.setText("YOUR PIN");
				atmTextTwo.setText("IS CHANGED");
				atmTextThree.setText("SUCCESSFULLY");
				atmTextFour.setText("THANK YOU");
			} 
			else { System.out.println("Error"); }
		}
		
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")) 
		{	
			temp2 = atmTextThree.getText();
			if(a.pinNumber.equals(temp2)) {
				CorrectPin();
			} else {
				atmTextOne.setText("YOU'VE ENTERED");
				atmTextTwo.setText("INCORRECT");
				atmTextThree.setText("PIN RETURNING");
				atmTextFour.setText("TO ATM HOME");
			}
		}
		
		if(atmTextTwo.getText().equals("ENTER AMOUNT")) {
			temp = Integer.parseInt(atmTextThree.getText());
			if(Integer.parseInt(atmTextThree.getText()) > 99) {
				if(Integer.parseInt(atmTextThree.getText()) <= a.cash) {
					if(Integer.parseInt(atmTextThree.getText()) % 100 == 0) {	
						atmTextOne.setText("THANK YOU");
						atmTextOne.setBounds(73, 50, 142, 26);
						atmTextTwo.setText("TAKE YOUR");
						atmTextThree.setText("CASH FROM");
						atmTextTwo.setBounds(73, 77, 142, 26);
						atmTextThree.setBounds(73, 104, 142, 26);
						atmTextFour.setText("BELOW");
						atmTextFour.setBounds(73, 132, 142, 26);
					} else {
						atmTextOne.setText("THIS ATM");
						atmTextTwo.setText("ONLY SUPPORTS");
						atmTextThree.setText("AMMOUNT MULTIPLE");
						atmTextFour.setText("OF 100S"); 
					}
				} else {
					atmTextOne.setText("AMOUNT ENTERED");
					atmTextTwo.setText("IS GREATER");
					atmTextThree.setText("THAN AMOUNT");
					atmTextFour.setText("IN ACCOUNT");
				}
			} else {
				atmTextOne.setText("YOU HAVE ENTERED"); 
				atmTextTwo.setText("WRONG AMOUNT");
				atmTextThree.setText("RETURNING"); 
				atmTextFour.setText("ATM HOME");
			}
		}
	}
	
	public void CorrectPin()
	{
		atmTextOne.setBounds(0, 45, 142, 26);
		atmTextOne.setText("CHECK BALANCE");
		
		atmTextTwo.setBounds(143, 44, 142, 26);
		atmTextTwo.setText("WITHDRAW CASH");
		
		atmTextThree.setText("CHANGE PIN");
		atmTextThree.setBounds(0, 138, 142, 26);
		atmTextThree.setEditable(false);
		
		atmTextFour.setText("LOG OUT");
		atmTextFour.setBounds(143, 138, 142, 26);
	}
			
	public void One() {
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
			atmTextThree.setText(atmTextThree.getText()+"1");
		}
	}
	
	public void Two() {
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
			atmTextThree.setText(atmTextThree.getText()+"2");
		}
	}
	
	public void Three() {
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
			atmTextThree.setText(atmTextThree.getText()+"3");
		}
	}
	
	public void Four() {
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
			atmTextThree.setText(atmTextThree.getText()+"4");
		}	
	}
	
	public void Five() {
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
			atmTextThree.setText(atmTextThree.getText()+"5");
		}	
	}
	
	public void Six() {
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
			atmTextThree.setText(atmTextThree.getText()+"6");
		}
	}
	
	public void Seven() 
	{
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN"))
		{
			atmTextThree.setText(atmTextThree.getText()+"7");
		}
	}
	
	public void Eight() 
	{
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN"))
		{
			atmTextThree.setText(atmTextThree.getText()+"8");
		}
	}
	
	public void Nine() 
	{
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN"))
		{
			atmTextThree.setText(atmTextThree.getText()+"9");
		}
	}
	
	public void Zero() 
	{
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN"))
		{
			atmTextThree.setText(atmTextThree.getText()+"0");
		}
	}
	
	public void Clear() 
	{
		
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN"))
		{
			atmTextThree.setText(atmTextThree.getText().substring(0, atmTextThree.getText().length()-1));
		}
	}
	
	public void Withdraw() {
		AtmCreation a = new AtmCreation();
		if(a.cash > 99) {
			atmTextOne.setText("");
			atmTextOne.setBounds(73, 50, 142, 26);
			atmTextTwo.setText("ENTER AMOUNT");
			atmTextThree.setText("");
			atmTextTwo.setBounds(73, 77, 142, 26);
			atmTextThree.setBounds(73, 104, 142, 26);
			atmTextFour.setText("");
			atmTextFour.setBounds(73, 132, 142, 26);
		} 
		else { System.out.println("ERROR");}
	}
	
	//Below Code Resets ATM To Initialize
	public void Cancel() {
		atmTextOne.setBounds(73, 50, 142, 26);
		atmTextOne.setText("WELCOME");
		atmTextTwo.setText("TO");
		atmTextTwo.setBounds(73, 77, 142, 26);
		atmTextThree.setBounds(73, 104, 142, 26);
		atmTextThree.setText("ATM SIMULATOR");
		atmTextFour.setBounds(73, 132, 142, 26);
		atmTextFour.setText("INSERT YOUR CARD");
		textReciept.setText("\n -------------------- RECIEPT ---------------------- "
				+ "\n -------------------------------------------------");
	}
	
	//	Below Code Generates Reciept
	public void TakeReciept() {
		AtmCreation a = new AtmCreation();
		
		//	Code to Generate Reciept for Checking Balance
		if(atmTextTwo.getText().equals("BALANCE TAKE")) {
			String prino = a.cardNumber.substring(0 , a.cardNumber.length()-9); 
			
			textReciept.setText("\n"
				+ " -------------------- RECIEPT ---------------------- \n"
				+ " ------------------------------------------------- \n"
				+ " \n"
				+ " THANKS FOR USING THIS SERVICE \n"
				+ " "+ a.accHolderName.toUpperCase() +"\n"
				+ " BALANCE OF ACC NO. "+prino+"X XXXX XXXX XXXX \n"
				+ " IS "+a.cash+"");
		}
		
		//	Code to Generate Reciept for Checking Debited Money
		if(atmTextTwo.getText().equals("IS UPDATED")) {
			String prino = a.cardNumber.substring(0 , a.cardNumber.length()-9); 
			
			textReciept.setText("\n"
				+ " -------------------- RECIEPT ---------------------- \n"
				+ " ------------------------------------------------- \n"
				+ " \n"
				+ " THANKS FOR USING THIS SERVICE \n"
				+ " "+ a.accHolderName.toUpperCase() +"\n"
				+ " "+ temp +" HAS BEEN DEBITED FROM YOUR ACCOUNT \n"
				+ " BALANCE OF ACC NO. "+prino+"X XXXX XXXX XXXX \n"
				+ " IS "+a.cash+"");
		}
	}
	 
	//	Below Code to Changes Pin
	public void ChangePin() {
		if(atmTextThree.getText().equals("CHANGE PIN")) {
			atmTextOne.setText("");
			atmTextOne.setBounds(73, 50, 142, 26);
			atmTextTwo.setText("ENTER NEW PIN");
			atmTextThree.setText("");
			atmTextTwo.setBounds(73, 77, 142, 26);
			atmTextThree.setBounds(73, 104, 142, 26);
			atmTextFour.setText("");
			atmTextFour.setBounds(73, 132, 142, 26);
		}
	}
}
