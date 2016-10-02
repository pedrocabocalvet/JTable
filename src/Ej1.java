import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	private JTable dades;
	
	/**
	 * Launch the application.
	 */
	//Color color = (Color.blue);	
	
	
	String dadesTaula[][]={{"Manel","Viel","PROGRAMACIÓ","1","DAM"},
		{"Paco","Gomez","Entornos","1","DAM"},
		{"Juanmi","Benavent","LLenguatge de marques","1","DAM"},
		{"Toni","Ruiz","BBDD","1","DAM"}};
		
	String nomsColumnes[]={"Nom","Cognoms","Modul","Curs","Cicle"};
	

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 frame = new Ej1();
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
	public Ej1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		dades = new JTable(dadesTaula,nomsColumnes);
		
		JScrollPane scrollPane = new JScrollPane(dades);
		
		
		
		contentPane.add(scrollPane,BorderLayout.CENTER);
		
		Integer tolotenria;
		tolotenria = dades.getRowCount();
	
		
		Label prueba = new Label("SUR");
		Label prueba2 = new Label(tolotenria.toString());
		contentPane.add(prueba,BorderLayout.SOUTH);
		contentPane.add(prueba2,BorderLayout.NORTH);
		
		
	}

}
