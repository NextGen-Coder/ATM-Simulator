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
		setTitle("ATM SIMULATOR");
		
		// Below Code is used to create designPanel1 panel which is only used for design purpose
		JPanel designPanel1 = new JPanel();
		designPanel1.setBackground(new Color(70, 130, 180));
		designPanel1.setForeground(new Color(255, 255, 255));
		designPanel1.setBounds(0, 0, 870, 20);
		contentPane.add(designPanel1);
		
		// Below Code is used to create atmScreen panel which is basic output screen of atm
		JPanel atmScreen = new JPanel();
		atmScreen.setBackground(new Color(153, 255, 153));
		atmScreen.setBounds(75, 92, 285, 210);
		contentPane.add(atmScreen);
		atmScreen.setLayout(null);
		
		/* 	Below Code creates four textfields 
		 * 	atmTextOne, atmTextTwo, atmTextThree and atmTextFour
		 * 	and adds them to center of the atmScreen panel
		 * 	which shows of most of the atm functionalities
		 */	
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
		
		// Below Code is used to create designPanel2 panel which is only used for design purpose
		JPanel designPanel2 = new JPanel();
		designPanel2.setForeground(Color.WHITE);
		designPanel2.setBackground(new Color(70, 130, 180));
		designPanel2.setBounds(0, 708, 1018, 20);
		contentPane.add(designPanel2);
		
		/* Below Code is used to create atmButtons panel which 
		 * contains Numeric, Cancel, Clear and Enter buttons of atm
		 */
		JPanel atmButtons = new JPanel();
		atmButtons.setBackground(new Color(51, 102, 153));
		atmButtons.setBounds(21, 375, 400, 310);
		contentPane.add(atmButtons);
		atmButtons.setLayout(new GridLayout(4, 4, 10, 10));
		
		/* 	Below Code creates ButtonOne which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonOne = new JPanel();
		buttonOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
					atmTextThree.setText(atmTextThree.getText()+"1");
				}
			}
		});
		buttonOne.setBackground(Color.LIGHT_GRAY);
		buttonOne.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonOne);
		
		JLabel num1 = new JLabel("1");
		buttonOne.add(num1);
		
		/* 	Below Code creates ButtonTwo which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonTwo = new JPanel();
		buttonTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
					atmTextThree.setText(atmTextThree.getText()+"2");
				}
			}
		});
		buttonTwo.setBackground(Color.LIGHT_GRAY);
		buttonTwo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonTwo);
		
		JLabel num2 = new JLabel("2");
		buttonTwo.add(num2);
		
		/* 	Below Code creates ButtonThree which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonThree = new JPanel();
		buttonThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
					atmTextThree.setText(atmTextThree.getText()+"3");
				}
			}
		});
		buttonThree.setBackground(Color.LIGHT_GRAY);
		buttonThree.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonThree);

		JLabel num3 = new JLabel("3");
		buttonThree.add(num3);
		
		//	Below Code Resets Atm Screen to default 
		JPanel buttonCancel = new JPanel();
		buttonCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		});
		buttonCancel.setBackground(new Color(204, 0, 0));
		buttonCancel.setForeground(new Color(255, 255, 255));
		buttonCancel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonCancel);
		
		JLabel cancel = new JLabel("CANCEL");
		buttonCancel.add(cancel);
		
		/* 	Below Code creates ButtonFour which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonFour = new JPanel();
		buttonFour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
					atmTextThree.setText(atmTextThree.getText()+"4");
				}
			}
		});
		buttonFour.setBackground(Color.LIGHT_GRAY);
		buttonFour.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonFour);
		
		JLabel num4 = new JLabel("4");
		buttonFour.add(num4);
		
		/* 	Below Code creates ButtonFive which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonFive = new JPanel();
		buttonFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
					atmTextThree.setText(atmTextThree.getText()+"5");
				}
			}
		});
		buttonFive.setBackground(Color.LIGHT_GRAY);
		buttonFive.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonFive);
		
		JLabel num5 = new JLabel("5");
		buttonFive.add(num5);
		
		/* 	Below Code creates ButtonSix which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonSix = new JPanel();
		buttonSix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")) {
					atmTextThree.setText(atmTextThree.getText()+"6");
				}
			}
		});
		buttonSix.setBackground(Color.LIGHT_GRAY);
		buttonSix.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonSix);
		
		JLabel num6 = new JLabel("6");
		buttonSix.add(num6);
		
		/* 	Below Code creates ButtonClear which clears
		 *  one character in atm screen when mouse Clicks it.
		 */
		JPanel buttonClear = new JPanel();
		buttonClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")){
					atmTextThree.setText(atmTextThree.getText().substring(0, atmTextThree.getText().length()-1));
				}
			}
		});
		buttonClear.setBackground(new Color(255, 204, 51));
		buttonClear.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonClear);
		
		JLabel clear = new JLabel("CLEAR");
		buttonClear.add(clear);
		
		/* 	Below Code creates ButtonSeven which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonSeven = new JPanel();
		buttonSeven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")){
					atmTextThree.setText(atmTextThree.getText()+"7");
				}
			}
		});
		buttonSeven.setBackground(Color.LIGHT_GRAY);
		buttonSeven.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonSeven);
		
		JLabel num7 = new JLabel("7");
		buttonSeven.add(num7);
		
		/* 	Below Code creates ButtonEight which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonEight = new JPanel();
		buttonEight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")){
					atmTextThree.setText(atmTextThree.getText()+"8");
				}
			}
		});
		buttonEight.setBackground(Color.LIGHT_GRAY);
		buttonEight.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonEight);
		
		JLabel num8 = new JLabel("8");
		buttonEight.add(num8);
		
		/* 	Below Code creates ButtonNine which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonNine = new JPanel();
		buttonNine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")){
					atmTextThree.setText(atmTextThree.getText()+"9");
				}
			}
		});
		buttonNine.setBackground(Color.LIGHT_GRAY);
		buttonNine.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonNine);
		
		JLabel num9 = new JLabel("9");
		buttonNine.add(num9);
		
		/* 	Below Code creates ButtonEnter which is
		 *  which performs Enter() function when mouse clicks it.
		 */
		JPanel buttonEnter = new JPanel();
		buttonEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enter();
			}
		});
		buttonEnter.setBackground(new Color(51, 153, 51));
		buttonEnter.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonEnter);
		
		JLabel enter = new JLabel("ENTER");
		buttonEnter.add(enter);
		
		/* 	Below Code creates ButtonTempOne which
		 *  does nothing and used for Design Purpose.
		 */
		JPanel buttonTempOne = new JPanel();
		buttonTempOne.setBackground(Color.LIGHT_GRAY);
		buttonTempOne.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonTempOne);
		
		/* 	Below Code creates ButtonZero which performs
		 *  functionalites when mouse Clicks it.
		 */
		JPanel buttonZero = new JPanel();
		buttonZero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("ENTER YOUR PIN")||atmTextTwo.getText().equals("ENTER AMOUNT")||atmTextTwo.getText().equals("ENTER NEW PIN")){
					atmTextThree.setText(atmTextThree.getText()+"0");
				}
			}
		});
		buttonZero.setBackground(Color.LIGHT_GRAY);
		buttonZero.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonZero);
		
		JLabel num0 = new JLabel("0");
		buttonZero.add(num0);
		
		/* 	Below Code creates ButtonTempTwo which
		 *  does nothing and used for Design Purpose.
		 */
		JPanel buttonTempTwo = new JPanel();
		buttonTempTwo.setBackground(Color.LIGHT_GRAY);
		buttonTempTwo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonTempTwo);
		
		/* 	Below Code creates ButtonTempThree which
		 *  does nothing and used for Design Purpose.
		 */
		JPanel buttonTempThree = new JPanel();
		buttonTempThree.setBackground(Color.LIGHT_GRAY);
		buttonTempThree.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.LIGHT_GRAY));
		atmButtons.add(buttonTempThree);
		
		/* 	Below Code creates recieptPanel which
		 *  contains TextArea and shows Reciept  
		 *  Whenever Action is Done by user on ATM.
		 */
		JPanel recieptPanel = new JPanel();
		recieptPanel.setBounds(444, 42, 400, 310);
		contentPane.add(recieptPanel);
		recieptPanel.setLayout(null);
		
		textReciept = new JTextArea("\n -------------------- RECIEPT ---------------------- \n -------------------------------------------------");
		textReciept.setEditable(false);
		textReciept.setBounds(0, 0, 400, 310);
		recieptPanel.add(textReciept);
		
		/* 	Below Code creates hardware panel which
		 * 	is a combinition of insertCardPanel,
		 *  takeRecieptPanel and takeCashPanel
		 */
		JPanel hardware = new JPanel();
		hardware.setBackground(new Color(51, 153, 204));
		hardware.setBounds(444, 375, 400, 310);
		contentPane.add(hardware);
		hardware.setLayout(null);
		
		/* 	Below Code creates insertCardPanel which
		 * 	contains label showing text "INSERT CARD"
		 *  and cardSlot where card is Inserted.
		 */
		JPanel insertCardPanel = new JPanel();
		insertCardPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Inserted();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		insertCardPanel.setBackground(new Color(51, 153, 204));
		insertCardPanel.setBounds(88, 97, 90, 32);
		hardware.add(insertCardPanel);
		insertCardPanel.setLayout(null);
		
		JPanel cardSlot = new JPanel();
		cardSlot.setBounds(12, 0, 60, 4);
		insertCardPanel.add(cardSlot);
		cardSlot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), null, null));
		cardSlot.setBackground(new Color(105, 105, 105));
		
		JLabel card = new JLabel("INSERT CARD");
		card.setBounds(0, 16, 90, 16);
		insertCardPanel.add(card);
		card.setHorizontalAlignment(SwingConstants.CENTER);
		card.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		
		/* 	Below Code creates takeCashPanel which
		 * 	contains label showing text "TAKE CASH"
		 *  and cashSlot and cashPanel from where cash gets collected.
		 */
		JPanel takeCashPanel = new JPanel();
		takeCashPanel.setBackground(new Color(51, 153, 204));
		takeCashPanel.setBounds(150, 190, 100, 48);
		hardware.add(takeCashPanel);
		takeCashPanel.setLayout(null);
		
		JPanel cashPanel = new JPanel();
		cashPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AtmCreation a = new AtmCreation();
				a.cash -= temp;
				RecieptCheck();
			}
		});
		cashPanel.setBounds(0, 0, 100, 20);
		takeCashPanel.add(cashPanel);
		cashPanel.setBackground(new Color(105, 105, 105));
		cashPanel.setLayout(null);
		
		JPanel cashSlot = new JPanel();
		cashSlot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AtmCreation a = new AtmCreation();
				a.cash -= temp;
				RecieptCheck();
			}
		});
		cashSlot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 250, 250), null, null));
		cashSlot.setBackground(new Color(105, 105, 105));
		cashSlot.setBounds(6, 5, 88, 9);
		cashPanel.add(cashSlot);
		
		JLabel cash = new JLabel("TAKE CASH");
		cash.setBackground(new Color(51, 153, 204));
		cash.setBounds(0, 32, 100, 16);
		takeCashPanel.add(cash);
		cash.setHorizontalAlignment(SwingConstants.CENTER);
		
		/* 	Below Code creates takRecieptPanel which
		 * 	contains label showing text "TAKE RECIEPT"
		 *  and recieptSlot from where reciept is shown.
		 */
		JPanel takeRecieptPanel = new JPanel();
		takeRecieptPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				takeReciept();
			}
		});
		takeRecieptPanel.setBackground(new Color(51, 153, 204));
		takeRecieptPanel.setBounds(218, 97, 86, 32);
		hardware.add(takeRecieptPanel);
		takeRecieptPanel.setLayout(null);
		
		JPanel recieptSlot = new JPanel();
		recieptSlot.setBounds(19, 0, 50, 4);
		takeRecieptPanel.add(recieptSlot);
		recieptSlot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), null, null));
		recieptSlot.setBackground(new Color(105, 105, 105));
		
		JLabel reciept = new JLabel("TAKE RECIEPT");
		reciept.setBounds(0, 16, 86, 16);
		takeRecieptPanel.add(reciept);
		
		/* 	Below Code creates functionKeyOne which is 
		 * 	used near and performs functionalities for 
		 * 	atm screen as per screen shows input options.
		 */
		JPanel functionKeyOne = new JPanel();
		functionKeyOne.setBackground(new Color(0, 102, 153));
		functionKeyOne.setBounds(358, 125, 45, 45);
		contentPane.add(functionKeyOne);
		
		JLabel functionKeyOneText = new JLabel("");
		functionKeyOneText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextTwo.getText().equals("WITHDRAW CASH")) {
					withdrawMoney();
				}
			}
		});
		functionKeyOneText.setHorizontalAlignment(SwingConstants.LEFT);
		functionKeyOneText.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow4.jpg")));
		functionKeyOne.add(functionKeyOneText);
		
		/* 	Below Code creates functionKeyTwo which is 
		 * 	used near and performs functionalities for 
		 * 	atm screen as per screen shows input options.
		 */
		JPanel functionKeyTwo = new JPanel();
		functionKeyTwo.setBackground(new Color(0, 102, 153));
		functionKeyTwo.setBounds(358, 219, 45, 45);
		contentPane.add(functionKeyTwo);
		
		/* 	Below Code creates functionKeyTwo which is 
		 * 	used near and performs functionalities for 
		 * 	atm screen as per screen shows input options.
		 */
		JLabel functionKeyTwoText = new JLabel("");
		functionKeyTwoText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atmTextFour.getText().equals("LOG OUT")) {
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
			}
		});
		functionKeyTwoText.setHorizontalAlignment(SwingConstants.LEFT);
		functionKeyTwoText.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow4.jpg")));
		functionKeyTwo.add(functionKeyTwoText);
		
		/* 	Below Code creates functionKeyThree which is 
		 * 	used near and performs functionalities for 
		 * 	atm screen as per screen shows input options.
		 */
		JPanel functionKeyThree = new JPanel();
		functionKeyThree.setBackground(new Color(0, 102, 153));
		functionKeyThree.setBounds(32, 125, 45, 45);
		contentPane.add(functionKeyThree);
		
		JLabel functionKeyThreeText = new JLabel("");
		functionKeyThreeText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RecieptCheck();
			}
		});
		functionKeyThreeText.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow3.jpg")));
		functionKeyThree.add(functionKeyThreeText);
		
		/* 	Below Code creates functionKeyFour which is 
		 * 	used near and performs functionalities for 
		 * 	atm screen as per screen shows input options.
		 */
		JPanel functionKeyFour = new JPanel();
		functionKeyFour.setBackground(new Color(0, 102, 153));
		functionKeyFour.setBounds(32, 219, 45, 45);
		contentPane.add(functionKeyFour);
		
		JLabel functionKeyFourText = new JLabel("");
		functionKeyFourText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePin();
			}
			
		});
		functionKeyFourText.setBackground(new Color(0, 102, 153));
		functionKeyFourText.setIcon(new ImageIcon(MainFrame.class.getResource("/img/arrow3.jpg")));
		functionKeyFour.add(functionKeyFourText);
	}
	
	// Below Code sets atm screen text after card is inserted
	public void Inserted() throws InterruptedException {
		if(atmTextFour.getText().equals("INSERT YOUR CARD")) {
			atmTextOne.setText("");
			atmTextTwo.setText("ENTER YOUR PIN");
			atmTextThree.setText("");
			atmTextFour.setText("");
		} else { System.out.println("error"); }
	}
	
	/* 	Below Code checks atm screen and gives output
	 *  on atm reciept as per need of user.
	 */
	public void RecieptCheck() {
		if(atmTextOne.getText().equals("CHECK BALANCE")) {
			atmTextOne.setBounds(73, 50, 142, 26);
			atmTextOne.setText("TO CHECK YOUR");
			atmTextTwo.setBounds(73, 77, 142, 26);
			atmTextTwo.setText("BALANCE TAKE");
			atmTextThree.setBounds(73, 104, 142, 26);
			atmTextThree.setText("YOUR RECIEPT");
			atmTextFour.setBounds(73, 132, 142, 26);
			atmTextFour.setText("THANK YOU");
		}
		
		if(atmTextTwo.getText().equals("TAKE YOUR")) {
			atmTextOne.setBounds(73, 50, 142, 26);
			atmTextOne.setText("YOUR BALANCE");
			atmTextTwo.setBounds(73, 77, 142, 26);
			atmTextTwo.setText("IS UPDATED");
			atmTextThree.setBounds(73, 104, 142, 26);
			atmTextThree.setText("CHECK RECIEPT");
			atmTextFour.setBounds(73, 132, 142, 26);
			atmTextFour.setText("THANK YOU");
		}
	}
	
	/*	Below Code is triggered When enterButton
	 * 	is pressed and it performs functions based
	 * 	on current state of the program
	 */
	public void enter() {
		AtmCreation a = new AtmCreation();
		/*	Below Code is triggered When enterButton
		 * 	is pressed and it replaces old pin with 
		 * 	new pin of the card.
		 */
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
		}
		
		/*	Below Code is triggered When enterButton
		 * 	is pressed and it checks entered pin with 
		 * 	pin of the card and gives access to atm.
		 */
		if(atmTextTwo.getText().equals("ENTER YOUR PIN")) {	
			temp2 = atmTextThree.getText();
			if(a.pinNumber.equals(temp2)) {
				correctPin();
			} 
			else {
				atmTextOne.setText("YOU'VE ENTERED");
				atmTextTwo.setText("INCORRECT");
				atmTextThree.setText("PIN RETURNING");
				atmTextFour.setText("TO ATM HOME");
			}
		}
		
		/*	Below Code is triggered When enterButton
		 * 	is pressed and it is used to Withdraw Money
		 *  from atm as per user Input amount.
		 */
		if(atmTextTwo.getText().equals("ENTER AMOUNT")) {
			temp = Integer.parseInt(atmTextThree.getText());
			//	Below Code checks whether Entered amount is less than 100
			if(Integer.parseInt(atmTextThree.getText()) > 99) {
				//	Below Code checks whether Entered amount is less than user's balance
				if(Integer.parseInt(atmTextThree.getText()) <= a.cash) {
					//	Below Code checks whether Entered amount is in times of 100
					if(Integer.parseInt(atmTextThree.getText()) % 100 == 0) {	
						
						atmTextOne.setText("THANK YOU");
						atmTextOne.setBounds(73, 50, 142, 26);
						atmTextTwo.setText("TAKE YOUR");
						atmTextThree.setText("CASH FROM");
						atmTextTwo.setBounds(73, 77, 142, 26);
						atmTextThree.setBounds(73, 104, 142, 26);
						atmTextFour.setText("BELOW");
						atmTextFour.setBounds(73, 132, 142, 26);
					} 
					else {
						atmTextOne.setText("THIS ATM");
						atmTextTwo.setText("ONLY SUPPORTS");
						atmTextThree.setText("AMMOUNT MULTIPLE");
						atmTextFour.setText("OF 100S"); 
					}
				} 
				else {
					atmTextOne.setText("AMOUNT ENTERED");
					atmTextTwo.setText("IS GREATER");
					atmTextThree.setText("THAN AMOUNT");
					atmTextFour.setText("IN ACCOUNT");
				}
			} 
			else {
				atmTextOne.setText("YOU HAVE ENTERED"); 
				atmTextTwo.setText("WRONG AMOUNT");
				atmTextThree.setText("RETURNING"); 
				atmTextFour.setText("ATM HOME");
			}
		}
	}
	
	public void correctPin() {
		/*	Below Code is triggered When enterButton
		 * 	is pressed and Entered pin gets matched
		 * 	with pin of the card.
		 */
		atmTextOne.setBounds(0, 45, 142, 26);
		atmTextOne.setText("CHECK BALANCE");
		
		atmTextTwo.setBounds(143, 44, 142, 26);
		atmTextTwo.setText("WITHDRAW CASH");
		
		atmTextThree.setBounds(0, 138, 142, 26);
		atmTextThree.setText("CHANGE PIN");
		atmTextThree.setEditable(false);
		
		atmTextFour.setBounds(143, 138, 142, 26);
		atmTextFour.setText("LOG OUT");
	}

	
	public void withdrawMoney() {
		/*	Below Code is triggered When functionKey
		 * 	is pressed and it checks whether balance 
		 * 	of the card holder is greater than 100 or not.
		 */
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
	
	
	//	Below Code Generates Reciept
	public void takeReciept() {
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
	 
	//	Below Code to make atmScreen UI changed for Pin Change Environment
	public void changePin() {
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
