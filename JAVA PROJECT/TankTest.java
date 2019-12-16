import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class TankTest extends JFrame implements ActionListener{
	private JTextField txtAID,txtarea,txthouseadd;
	private JButton btnAdd,btnClose;
	private DefaultTableModel model;
	private JTable tb;
	private JScrollPane jsp;
	public TankTest(){
		GUI();
		setSize(500,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void GUI(){
		JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("New Water Connections Indira Nagar"));

		Tank tankob= Tank.getInstance();
		String a=tankob.toString();

		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(4,2));
		p2.add(new JLabel("Address ID of Water Tank"));
		p2.add(txtAID=new JTextField(12));
		txtAID.setText(a);
		txtAID.setEditable(false);

		p2.add(new JLabel("Area "));
		p2.add(txtarea =new JTextField(20));
		txtarea.setText("Indira Nagar");
		txtarea.setEditable(false);


		p2.add(new JLabel("Address of New Connection "));
		p2.add(txthouseadd=new JTextField(50));



		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(btnAdd=new JButton("Add"));
		p3.add(btnClose=new JButton("Close"));

		JPanel pAll=new JPanel();
		pAll.setLayout(new BorderLayout());
		pAll.add(p1,"North");
		pAll.add(p2,"Center");
		pAll.add(p3,"South");

		//Jtable
		model=new DefaultTableModel();
		model.addColumn("AddressId");
		model.addColumn("Area");
		model.addColumn("House Address");
		tb=new JTable(model);
		jsp=new JScrollPane(tb);

		getContentPane().add(pAll,"North");
		getContentPane().add(jsp,"Center");

		btnAdd.addActionListener(this);
		btnClose.addActionListener(this);

		tb.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ex){
				displayData();
			}
		});
	}//end intGUI
	public void actionPerformed(ActionEvent ex){
		if(ex.getSource()==btnAdd) addNewProduct();
		if(ex.getSource()==btnClose) System.exit(0);
	}//end btnClick


	void addNewProduct(){


		//String b="Indira Nagar";
		String aid=txtAID.getText();
		String area=txtarea.getText();
		String hadd=txthouseadd.getText();
		Object[] r={aid,area,hadd};
		model.addRow(r);

		clearData();
	}//end Add


	public Insets getInsets(){
		return new Insets(30,20,30,20);
	}//


	public static void main(String arsg[]){
		new TankTest();
	}//end

	public void clearData(){
	txthouseadd.setText(null);
//		txtPID.requestFocus();
	}//end
	public void displayData(){
		int inx=tb.getSelectedRow();
		txtAID.setText(tb.getValueAt(inx, 0).toString());
		txtarea.setText(tb.getValueAt(inx,1).toString());
		txthouseadd.setText(tb.getValueAt(inx, 2).toString());
	}//end

}
