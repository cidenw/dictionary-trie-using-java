package Dictionary;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class KeyInput {

	private JFrame frame;
	ArrayList<Integer> input;
	String input_string;
	JLabel lblNewLabel;
	String wordsMatched;
	Dictionary d;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	/**/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyInput window = new KeyInput();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**/
	/**
	 * Create the application.
	 */
	public KeyInput() {
		input = new ArrayList<Integer>();
		input_string = " ";
		d = new Dictionary();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Dictionary by TeamFilipinoAndJere");
		frame.getContentPane().setForeground(Color.GREEN);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 652, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnPQR = new JButton("p q r s");
		btnPQR.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnPQR.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPQR.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPQR.setBackground(Color.DARK_GRAY);
		btnPQR.setForeground(Color.GREEN);
		btnPQR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(5);
			}
		});
		btnPQR.setBounds(10, 280, 89, 68);
		frame.getContentPane().add(btnPQR);

		JButton btnTUV = new JButton("t u v");
		btnTUV.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnTUV.setHorizontalAlignment(SwingConstants.RIGHT);
		btnTUV.setVerticalAlignment(SwingConstants.BOTTOM);
		btnTUV.setBackground(Color.DARK_GRAY);
		btnTUV.setForeground(Color.GREEN);
		btnTUV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(6);
			}
		});
		btnTUV.setBounds(105, 280, 89, 68);
		frame.getContentPane().add(btnTUV);

		JButton btnWXY = new JButton("w x y z");
		btnWXY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnWXY.setHorizontalAlignment(SwingConstants.RIGHT);
		btnWXY.setVerticalAlignment(SwingConstants.BOTTOM);
		btnWXY.setBackground(Color.DARK_GRAY);
		btnWXY.setForeground(Color.GREEN);
		btnWXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(7);
			}
		});
		btnWXY.setBounds(199, 280, 89, 68);
		frame.getContentPane().add(btnWXY);

		JButton button_1 = new JButton("1");
		button_1.setForeground(Color.GREEN);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(10, 122, 89, 68);
		frame.getContentPane().add(button_1);

		JButton btnAB = new JButton("a b c");
		btnAB.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAB.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAB.setBackground(Color.DARK_GRAY);
		btnAB.setForeground(Color.GREEN);
		btnAB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(0);
			}
		});
		btnAB.setBounds(105, 122, 89, 68);
		frame.getContentPane().add(btnAB);

		JButton btnDEF = new JButton("d e f");
		btnDEF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDEF.setHorizontalAlignment(SwingConstants.RIGHT);
		btnDEF.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDEF.setForeground(Color.GREEN);
		btnDEF.setBackground(Color.DARK_GRAY);
		btnDEF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(1);
			}
		});
		btnDEF.setBounds(199, 122, 89, 68);
		frame.getContentPane().add(btnDEF);

		JButton btnGHI = new JButton("g h i");
		btnGHI.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnGHI.setHorizontalAlignment(SwingConstants.RIGHT);
		btnGHI.setVerticalAlignment(SwingConstants.BOTTOM);
		btnGHI.setForeground(Color.GREEN);
		btnGHI.setBackground(Color.DARK_GRAY);
		btnGHI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(2);
			}
		});
		btnGHI.setBounds(10, 201, 89, 68);
		frame.getContentPane().add(btnGHI);

		JButton btnJkl = new JButton("j k l");
		btnJkl.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnJkl.setHorizontalAlignment(SwingConstants.RIGHT);
		btnJkl.setVerticalAlignment(SwingConstants.BOTTOM);
		btnJkl.setForeground(Color.GREEN);
		btnJkl.setBackground(Color.DARK_GRAY);
		btnJkl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(3);
			}
		});
		btnJkl.setBounds(105, 201, 89, 68);
		frame.getContentPane().add(btnJkl);

		JButton btnMno = new JButton("m n o");
		btnMno.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnMno.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMno.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMno.setForeground(Color.GREEN);
		btnMno.setBackground(Color.DARK_GRAY);
		btnMno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(4);
			}
		});
		btnMno.setBounds(199, 201, 89, 68);
		frame.getContentPane().add(btnMno);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.GREEN);
		btnDelete.setBackground(Color.DARK_GRAY);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.isEmpty()) {
					return;
				}
				input.remove(input.size() - 1);
				input_string = input_string.substring(0, input_string.length() - 1);
				updateWindow();
			}
		});
		btnDelete.setBounds(10, 90, 89, 23);
		frame.getContentPane().add(btnDelete);

		JButton btnReset = new JButton("Clear");
		btnReset.setForeground(Color.GREEN);
		btnReset.setBackground(Color.DARK_GRAY);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.clear();
				input_string = "";
				updateWindow();
			}
		});
		btnReset.setBounds(200, 90, 89, 23);
		frame.getContentPane().add(btnReset);

		JPanel panel = new JPanel();
		panel.setForeground(Color.GREEN);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 278, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		lblNewLabel = new JLabel(input_string);
		lblNewLabel.setBounds(10, 5, 258, 52);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.BLACK);
		
		
		
		
		textArea = new JTextArea();
		textArea.setBounds(279, 7, 342, 313);
		frame.getContentPane().add(textArea);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.green);
		textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		textArea.setFont(new Font("Arial", Font.PLAIN, 15));
		// textArea.setSize(400,400);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setVisible(true);

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setSize(326, 341);
		scroll.setLocation(299, 12);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scroll);
	}

	private void updateWindow() {
		wordsMatched = d.getAllWords(input);
		lblNewLabel.setText(input_string);
		textArea.setText(wordsMatched);
		frame.getContentPane().repaint();
	}

	private void addInput(int num) {
		input.add(num);
		input_string += Integer.toString(num+2);
		updateWindow();
	}
}
