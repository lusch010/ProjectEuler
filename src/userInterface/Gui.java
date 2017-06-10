/**
 * 
 */
package userInterface;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import appLogicAccess.Access;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

/**
 * @author Juri, Luke
 *
 */
public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFieldMax;

	/**
	 * 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public Gui() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		setSize(640, 480);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSolution = new JLabel("Solution: 0");
		lblSolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSolution.setBounds(10, 11, 414, 40);
		panel.add(lblSolution);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				txtFieldMax.setText("" + Access.getMax(list.getSelectedIndex()));
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Problem 1: Multiples of 3 and 5", "Problem 2: Even Fibonacci numbers", "Problem 3: Largest prime factor", "Problem 4: ...", "Problem 5: ...", "Problem 6: ...", "Problem 7: ..."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list.setBounds(260, 62, 335, 239);
		panel.add(list);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSolution.setText("Solution: " + Access.getSolution(list.getSelectedIndex(), Double.parseDouble(txtFieldMax.getText())));
			}
		});
		btnSolve.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSolve.setBounds(10, 62, 240, 34);
		panel.add(btnSolve);
		
		txtFieldMax = new JTextField();
		txtFieldMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFieldMax.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldMax.setText("4000");
		txtFieldMax.setBounds(10, 107, 240, 28);
		panel.add(txtFieldMax);
		txtFieldMax.setColumns(10);
		
	}

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Access.loadMaxValues();

		System.out.println(Access.getSolution(0, 999.0));
		System.out.println(Access.getSolution(1, 4000000.0));
		System.out.println(Access.getSolution(2, 600851475143.0));
		
		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
	}
}
