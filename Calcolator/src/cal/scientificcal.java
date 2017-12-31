package cal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scientificcal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JRadioButton rdbtnOn;
	private JRadioButton rdbtnOff;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton btnC;
	private JButton button_17;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificcal frame = new scientificcal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double num,ans;
	int calculation;

	public void arithmetic()
	{
		
		switch(calculation)
		{
		case 1:
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 2:
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;

		case 3:
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4:
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
		
	
	
	
	}
	
	
	
	

	/**
	 * Create the frame.
	 */
	public scientificcal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 325);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(250, 500));
		contentPane.setBorder(new TitledBorder(null, "Calculator", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getRdbtnOn());
		contentPane.add(getRdbtnOff());
		contentPane.add(getBtnNewButton());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getButton_2());
		contentPane.add(getButton_3());
		contentPane.add(getButton_4());
		contentPane.add(getButton_5());
		contentPane.add(getButton_6());
		contentPane.add(getButton_7());
		contentPane.add(getButton_8());
		contentPane.add(getButton_9());
		contentPane.add(getButton_10());
		contentPane.add(getButton_12());
		contentPane.add(getButton_13());
		contentPane.add(getButton_14());
		contentPane.add(getButton_15());
		contentPane.add(getBtnC());
		contentPane.add(getButton_17());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(180, 11, 46, 14);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setBounds(10, 24, 216, 41);
			textField.setColumns(10);
		}
		return textField;
	}
	private JRadioButton getRdbtnOn() {
		if (rdbtnOn == null) {
			rdbtnOn = new JRadioButton("ON");
			rdbtnOn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					enable();
				}
			});
			buttonGroup.add(rdbtnOn);
			rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 12));
			rdbtnOn.setBounds(10, 72, 46, 23);
		}
		return rdbtnOn;
	}
	private JRadioButton getRdbtnOff() {
		if (rdbtnOff == null) {
			rdbtnOff = new JRadioButton("OFF");
			rdbtnOff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					disable();
				}
			});
			buttonGroup.add(rdbtnOff);
			rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 12));
			rdbtnOff.setBounds(10, 98, 46, 23);
		}
		return rdbtnOff;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "9");
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.setBounds(10, 128, 46, 33);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("8");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "8");
				}
			});
			button.setFont(new Font("Tahoma", Font.BOLD, 12));
			button.setBounds(62, 128, 53, 33);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("7");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "7");
				}
			});
			button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_1.setBounds(123, 129, 46, 32);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("-");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					calculation = 2;
					textField.setText("");
					lblNewLabel.setText(num +"-");
				}
			});
			button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			button_2.setBounds(173, 129, 53, 32);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("6");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "6");
				}
			});
			button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_3.setBounds(10, 165, 46, 33);
		}
		return button_3;
	}
	private JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("5");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "5");
				}
			});
			button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_4.setBounds(62, 165, 53, 33);
		}
		return button_4;
	}
	private JButton getButton_5() {
		if (button_5 == null) {
			button_5 = new JButton("4");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "4");
				}
			});
			button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_5.setBounds(123, 166, 46, 32);
		}
		return button_5;
	}
	private JButton getButton_6() {
		if (button_6 == null) {
			button_6 = new JButton("*");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					calculation = 3;
					textField.setText("");
					lblNewLabel.setText(num +"*");
				}
			});
			button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			button_6.setBounds(173, 166, 53, 32);
		}
		return button_6;
	}
	private JButton getButton_7() {
		if (button_7 == null) {
			button_7 = new JButton("3");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "3");
				}
			});
			button_7.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_7.setBounds(10, 205, 46, 33);
		}
		return button_7;
	}
	private JButton getButton_8() {
		if (button_8 == null) {
			button_8 = new JButton("2");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "2");
				}
			});
			button_8.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_8.setBounds(62, 205, 53, 33);
		}
		return button_8;
	}
	private JButton getButton_9() {
		if (button_9 == null) {
			button_9 = new JButton("1");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "1");
					
					
					
				}
			});
			button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_9.setBounds(123, 206, 46, 32);
		}
		return button_9;
	}
	private JButton getButton_10() {
		if (button_10 == null) {
			button_10 = new JButton("/");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					calculation = 3;
					textField.setText("");
					lblNewLabel.setText(num +"/");
				}
			});
			button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			button_10.setBounds(173, 206, 53, 32);
		}
		return button_10;
	}
	private JButton getButton_12() {
		if (button_12 == null) {
			button_12 = new JButton("=");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					arithmetic();
					lblNewLabel.setText("");
				}
			});
			button_12.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_12.setBounds(123, 243, 103, 32);
		}
		return button_12;
	}
	private JButton getButton_13() {
		if (button_13 == null) {
			button_13 = new JButton(".");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + ".");
				}
			});
			button_13.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_13.setBounds(62, 242, 53, 33);
		}
		return button_13;
	}
	private JButton getButton_14() {
		if (button_14 == null) {
			button_14 = new JButton("0");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "0");
				}
			});
			button_14.setFont(new Font("Tahoma", Font.BOLD, 12));
			button_14.setBounds(10, 242, 46, 33);
		}
		return button_14;
	}
	private JButton getButton_15() {
		if (button_15 == null) {
			button_15 = new JButton("<--");
			button_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int length =textField.getText().length();
					int number = textField.getText().length()-1;
					String store;
					
					if(length > 0)
					{
						StringBuilder back = new StringBuilder(textField.getText());
						back.deleteCharAt(number);
						store=back.toString();
						textField.setText(store);
						
					}
					
					
					
				}
			});
			button_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
			button_15.setBounds(62, 93, 53, 33);
		}
		return button_15;
	}
	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("c");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("");
				}
			});
			btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnC.setBounds(123, 93, 46, 33);
		}
		return btnC;
	}
	private JButton getButton_17() {
		if (button_17 == null) {
			button_17 = new JButton("+");
			button_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					calculation = 1;
					textField.setText("");
					lblNewLabel.setText(num +"+");
				}
			});
			button_17.setFont(new Font("Tahoma", Font.BOLD, 14));
			button_17.setBounds(173, 93, 53, 32);
		}
		return button_17;
	}
	
	public void disable()
	{
	textField.setEnabled(false);
	btnC.setEnabled(false);
	button_1.setEnabled(false);
	button_2.setEnabled(false);
	button_3.setEnabled(false);
	button_4.setEnabled(false);
	button_5.setEnabled(false);
	button_6.setEnabled(false);
	button_7.setEnabled(false);
	button_8.setEnabled(false);
	button_9.setEnabled(false);
	button_10.setEnabled(false);
	button_14.setEnabled(false);
	button_12.setEnabled(false);
	button_13.setEnabled(false);
	button_15.setEnabled(false);
	button_17.setEnabled(false);
	btnNewButton.setEnabled(false);
	button.setEnabled(false);
	rdbtnOff.setEnabled(false);
	rdbtnOn.setEnabled(true);
	
	}
	
	public void enable() 
	{
		
		textField.setEnabled(true);
		btnC.setEnabled(true);
		button_1.setEnabled(true);
		button_2.setEnabled(true);
		button_3.setEnabled(true);
		button_4.setEnabled(true);
		button_5.setEnabled(true);
		button_6.setEnabled(true);
		button_7.setEnabled(true);
		button_8.setEnabled(true);
		button_9.setEnabled(true);
		button_10.setEnabled(true);
		button_14.setEnabled(true);
		button_12.setEnabled(true);
		button_13.setEnabled(true);
		button_15.setEnabled(true);
		button_17.setEnabled(true);
		btnNewButton.setEnabled(true);
		button.setEnabled(true);
		rdbtnOff.setEnabled(true);
		rdbtnOn.setEnabled(false);
		button.setEnabled(true);
		
		
	}
	
	
}
