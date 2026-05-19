package pekan7_2511532028;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511532028 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array;
	private JLabel[] labelArray_2028;
	private JButton stepButton_2028, resetButton_2028, setButton_2028;
	private JTextField inputField_2028;
	private JPanel panelArray_2028;
	private JTextArea stepArea_2028;
	
	private int i = 1, j;
	private boolean sorting_2028 = false;
	private int stepCount_2028 = 1;
	/**
	 * Launch the application.
	 */
	private void setArrayFromInput_2028() {
		String text_2028 = inputField_2028.getText().trim();
		if (text_2028.isEmpty()) return;
		String[] parts_2028 = text_2028.split(",");
		array = new int[parts_2028.length];
		try {
			for (int k = 0; k < parts_2028.length; k++)  {
				array[k] = Integer.parseInt(parts_2028[k].trim()); }
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, " Masukkan hanyan angka yang dipisahkan "
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i = 1;
		stepCount_2028 = 1;
		sorting_2028 = true;
		stepButton_2028.setEnabled(true);
		stepArea_2028.setText("");
		panelArray_2028.removeAll();
		labelArray_2028 = new JLabel[array.length];
		for ( int k = 0; k < array.length; k++) {
			labelArray_2028[k] = new JLabel(String.valueOf(array[k]));
			labelArray_2028[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_2028[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2028[k].setPreferredSize(new Dimension(50, 50));
			labelArray_2028[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2028.add(labelArray_2028[k]);
		}
		panelArray_2028.revalidate();
		panelArray_2028.repaint();
	}
	
	private void performStep_2028() {
		if (i < array.length && sorting_2028) {
			int key_2028 = array[i];
			j = i - 1;
			
			StringBuilder stepLog_2028 = new StringBuilder();
			stepLog_2028.append("Langkah ").append(stepCount_2028).append(": Memasukkan ").append(key_2028).append("\n");
			
			while (j >= 0 && array[j] > key_2028) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key_2028;
			
			updateLabels();
			stepLog_2028.append("Hasil : ").append(arrayToString(array)).append("\n\n");
			stepArea_2028.append(stepLog_2028.toString());
			
			i++;
			stepCount_2028++;
			
			if (i == array.length) {
				sorting_2028 = false;
				stepButton_2028.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}
	
	private void updateLabels() {
		for (int k = 0; k < array.length; k++) {
			labelArray_2028[k].setText(String.valueOf(array[k]));
		}
	}
	
	private void reset_2028() {
		inputField_2028.setText("");
		panelArray_2028.removeAll();
		panelArray_2028.revalidate();
		panelArray_2028.repaint();
		stepArea_2028.setText("");
		stepButton_2028.setEnabled(false);
		sorting_2028 = false;
		i = 1;
		stepCount_2028 = 1;
	}
	
	private String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < array.length; k++) {
			sb.append(array[k]);
			if (k < array.length - 1) sb.append(", ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionGUI_2511532028 gui = new InsertionGUI_2511532028();
			gui.setVisible(true);
		});
	}
	
	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511532028() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// panel input
		JPanel inputPanel_2028 = new JPanel(new FlowLayout());
		inputField_2028 = new JTextField(30);
		setButton_2028 = new JButton("Set Array");
		inputPanel_2028.add(new JLabel("Masukkan angka (pisahkan dengan koma) : "));
		inputPanel_2028.add(inputField_2028);
		inputPanel_2028.add(setButton_2028);
		
		// Panel array visual
		panelArray_2028 = new JPanel();
		panelArray_2028.setLayout(new FlowLayout());
		
		// pamel kontrol
		JPanel controlPanel_2028 = new JPanel();
		stepButton_2028 = new JButton("Langkah Selanjutnya");
		resetButton_2028 = new JButton("Reset");
		stepButton_2028.setEnabled(false);
		controlPanel_2028.add(stepButton_2028);
		controlPanel_2028.add(resetButton_2028);
		
		// Area teks untuk log langkah-langkah
		stepArea_2028 = new JTextArea(8, 60);
		stepArea_2028.setEditable(false);
		stepArea_2028.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane ScrollPane_2028 = new JScrollPane(stepArea_2028);
		
		// Tambahkan panel ke frame
		add(inputPanel_2028, BorderLayout.NORTH);
		add(panelArray_2028, BorderLayout.CENTER);
		add(controlPanel_2028, BorderLayout.SOUTH);
		add(ScrollPane_2028, BorderLayout.EAST);
		
		// event set Array
		setButton_2028.addActionListener(e -> setArrayFromInput_2028());
		
		// event langkah selanjutnya
		stepButton_2028.addActionListener(e -> performStep_2028());
		
		// event reset
		resetButton_2028.addActionListener(e -> reset_2028());
	}

}


