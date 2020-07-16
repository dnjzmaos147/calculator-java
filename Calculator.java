import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {
	Prefix fix = new Prefix();
	PreOpt opt = new PreOpt();

	public JFrame frame;

	
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel display = new JLabel("0");
		display.setOpaque(true);
		display.setForeground(Color.DARK_GRAY);
		display.setBackground(SystemColor.scrollbar);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("±¼¸²", Font.BOLD, 15));
		display.setBounds(12, 10, 410, 74);
		frame.getContentPane().add(display);
		
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.GRAY);
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn9.setBounds(179, 94, 80, 80);
		frame.getContentPane().add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.GRAY);
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn7.setBounds(12, 94, 80, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.GRAY);
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn8.setBounds(95, 94, 80, 80);
		frame.getContentPane().add(btn8);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setBackground(Color.DARK_GRAY);
		btnPlus.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnPlus.setBounds(260, 94, 80, 80);
		frame.getContentPane().add(btnPlus);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.GRAY);
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn4.setBounds(12, 176, 80, 80);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.GRAY);
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn5.setBounds(95, 176, 80, 80);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.GRAY);
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn6.setBounds(179, 176, 80, 80);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setForeground(Color.WHITE);
		btnMinus.setBackground(Color.DARK_GRAY);
		btnMinus.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnMinus.setBounds(342, 94, 80, 80);
		frame.getContentPane().add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.GRAY);
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn1.setBounds(12, 258, 80, 80);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.GRAY);
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn2.setBounds(95, 258, 80, 80);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.GRAY);
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn3.setBounds(179, 258, 80, 80);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.setForeground(Color.WHITE);
		btnMul.setBackground(Color.DARK_GRAY);
		btnMul.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnMul.setBounds(260, 176, 80, 80);
		frame.getContentPane().add(btnMul);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.GRAY);
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn0.setBounds(95, 339, 80, 80);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.WHITE);
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnDot.setBounds(179, 339, 80, 80);
		frame.getContentPane().add(btnDot);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setBackground(Color.DARK_GRAY);
		btnDiv.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnDiv.setBounds(342, 176, 80, 80);
		frame.getContentPane().add(btnDiv);
		
		JButton btnOpen = new JButton("(");
		btnOpen.setForeground(Color.WHITE);
		btnOpen.setBackground(Color.DARK_GRAY);
		btnOpen.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnOpen.setBounds(260, 258, 80, 80);
		frame.getContentPane().add(btnOpen);
		
		JButton btnClose = new JButton(")");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.DARK_GRAY);
		btnClose.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnClose.setBounds(342, 258, 80, 80);
		frame.getContentPane().add(btnClose);
		
		JButton btnResult = new JButton("\uC804\uD658/\uACC4\uC0B0");
		btnResult.setForeground(Color.WHITE);
		btnResult.setBackground(Color.DARK_GRAY);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String preStr = fix.deleteK(fix.prefix(display.getText()));
				String result = opt.preOpt(display.getText());
				display.setForeground(Color.BLUE);
				display.setText("ÀüÀ§½Ä : "+preStr+"   °è»ê°ª : "+result);
			}
		});
		btnResult.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnResult.setBounds(260, 339, 160, 80);
		frame.getContentPane().add(btnResult);
		
		btn0.addActionListener(new ButtonAction(display, "0"));
		btn1.addActionListener(new ButtonAction(display, "1"));
		btn2.addActionListener(new ButtonAction(display, "2"));
		btn3.addActionListener(new ButtonAction(display, "3"));
		btn4.addActionListener(new ButtonAction(display, "4"));
		btn5.addActionListener(new ButtonAction(display, "5"));
		btn6.addActionListener(new ButtonAction(display, "6"));
		btn7.addActionListener(new ButtonAction(display, "7"));
		btn8.addActionListener(new ButtonAction(display, "8"));
		btn9.addActionListener(new ButtonAction(display, "9"));
		btnPlus.addActionListener(new ButtonAction(display, "+"));
		btnMinus.addActionListener(new ButtonAction(display, "-"));
		btnMul.addActionListener(new ButtonAction(display, "*"));
		btnDiv.addActionListener(new ButtonAction(display, "/"));
		btnOpen.addActionListener(new ButtonAction(display, "("));
		btnClose.addActionListener(new ButtonAction(display, ")"));
		btnDot.addActionListener(new ButtonAction(display, "."));
		
		JButton btnReset = new JButton("C");
		btnReset.setForeground(Color.RED);
		btnReset.setBackground(Color.DARK_GRAY);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setForeground(Color.DARK_GRAY);
				display.setText("0");
			}
		});
		btnReset.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnReset.setBounds(12, 339, 80, 80);
		frame.getContentPane().add(btnReset);
	}
}

class ButtonAction implements ActionListener {
	private JLabel label;
	private String txt;
	
	public ButtonAction(JLabel label, String txt) {
		this.label = label;
		this.txt = txt;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String curr = label.getText();
		if(curr.equals("0")) {
			label.setText(txt);
		}
		else {
			label.setText(label.getText()+txt);
		}
	}
	
}
