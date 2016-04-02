
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.awt.*; not done to avoid unnecessary imports


	class Myframe1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	final TextField textfield;
	double total, number;
	boolean flag, cflag,clr=true;//flag to keep track of number(true)/op(false);cflag to keep track of =(true if pressed last);clr(true) when clear pressed last
	String operation;//to keep track of what operation was pressed last
	JButton zero, one, two, three, four, five, six, seven, eight, nine, dot, add, subtract, multiply, divide, clear, ans, sin, cos, tan, log, sqrt, cbrt, exp; 
	
	public Myframe1() {
		setVisible(true);
		setLocation(100,100); //in order to implement these functions we extend JFrame class
		setSize(540,420);
		setLayout(null);
		setTitle("Calculator");
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		total = 0;
		number = 0;
		flag = true;
		cflag = false;
		operation = "";
		
		textfield = new TextField();
		textfield.setVisible(true);
		textfield.setEnabled(false);
		textfield.setLocation(10,10);
		textfield.setSize(520,50);
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		textfield.setFont(font1);
		add(textfield);
		
		seven = new JButton("7");
		seven.setBounds(10, 70, 70, 70);
		seven.setVisible(true);
		add(seven);
		seven.addActionListener(this);
		
		eight = new JButton("8");
		eight.setBounds(100,70,70,70);
		eight.setVisible(true);
		add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setBounds(190,70,70,70);
		nine.setVisible(true);
		add(nine); 
		nine.addActionListener(this);
		
		add = new JButton("+");
		add.setBounds(280,70,70,70);
		add.setVisible(true);
		add(add); 
		add.addActionListener(this);
		
		four = new JButton("4");
		four.setBounds(10, 160, 70, 70);
		four.setVisible(true);
		add(four);
		four.addActionListener(this);
		
		five = new JButton("5");
		five.setBounds(100,160,70,70);
		five.setVisible(true);
		add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setBounds(190,160,70,70);
		six.setVisible(true);
		add(six); 
		six.addActionListener(this);
		
		subtract = new JButton("-");
		subtract.setBounds(280,160,70,70);
		subtract.setVisible(true);
		add(subtract); 
		subtract.addActionListener(this);
		
		one = new JButton("1");
		one.setBounds(10,250,70,70);
		one.setVisible(true);
		add(one); 
		one.addActionListener(this);
		
		two = new JButton("2");
		two.setBounds(100,250,70,70);
		two.setVisible(true);
		add(two); 
		two.addActionListener(this);
		
		three = new JButton("3");
		three.setBounds(190,250,70,70);
		three.setVisible(true);
		add(three); 
		three.addActionListener(this);
		
		multiply = new JButton("*");
		multiply.setBounds(280,250,70,70);
		multiply.setVisible(true);
		add(multiply); 
		multiply.addActionListener(this);
		
		ans = new JButton("=");
		ans.setBounds(190,340,70,70);
		ans.setVisible(true);
		add(ans); 
		ans.addActionListener(this);
		
		zero = new JButton("0");
		zero.setBounds(100,340,70,70);
		zero.setVisible(true);
		add(zero);
		zero.addActionListener(this);
		
		clear = new JButton("Cl");
		clear.setBounds(370,70,70,70);
		clear.setVisible(true);
		add(clear); 
		clear.addActionListener(this);
		
		divide = new JButton("/");
		divide.setBounds(280,340,70,70);
		divide.setVisible(true);
		add(divide); 
		divide.addActionListener(this);
		
		sin=new JButton("sin");
		sin.setBounds(460,160,70,70);
		sin.setVisible(true);
		add(sin);
		sin.addActionListener(this);

		cos=new JButton("cos");
		cos.setBounds(460,250,70,70);
		cos.setVisible(true);
		add(cos);
		cos.addActionListener(this);
		
		tan=new JButton("tan");
		tan.setBounds(460,340,70,70);
		tan.setVisible(true);
		add(tan);
		tan.addActionListener(this);
		
		dot=new JButton(".");
		dot.setBounds(10,340,70,70);
		dot.setVisible(true);
		add(dot);
		dot.addActionListener(this);
		
		log=new JButton("ln");
		log.setBounds(460,70,70,70);
		log.setVisible(true);
		add(log);
		log.addActionListener(this);
		
		sqrt=new JButton("sqrt");
		sqrt.setBounds(370,160,70,70);
		sqrt.setVisible(true);
		add(sqrt);
		sqrt.addActionListener(this);
		
		cbrt=new JButton("cbrt");
		cbrt.setBounds(370,250,70,70);
		cbrt.setVisible(true);
		add(cbrt);
		cbrt.addActionListener(this);
		
		exp=new JButton("exp");
		exp.setBounds(370,340,70,70);
		exp.setVisible(true);
		add(exp);
		exp.addActionListener(this);
	}

	class Numbutton implements ActionListener{	
		public void actionPerformed(ActionEvent event) {
		
		/* The logic is, if cflag is true, equal to was pressed last. So a number 
		 being pressed means that a new operation has to start*/
		if( event.getSource() == one ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}//if flag is false, means an opn was pressed last, and a new no begins
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"1");
			number=Double.parseDouble(textfield.getText());//whatever is there, becomes the value of number then
		}
		
		else if( event.getSource() == two ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"2");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == three ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"3");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == four ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"4");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == five ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"5");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == six ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"6");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == seven ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"7");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == eight ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"8");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == nine ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"9");
			number=Double.parseDouble(textfield.getText());
		}
		
		else if( event.getSource() == zero ) {
			if( cflag ) {
				cflag = false;
				textfield.setText("");
			}
			if(!flag){
				textfield.setText("");
				flag = true;
			}
			String t = textfield.getText();
			textfield.setText(t+"0");
			number=Double.parseDouble(textfield.getText());
		}
	}
    }
	 class Arthbutton implements ActionListener {
		public void actionperformed(ActionEvent event){
		
		 if(event.getSource()== dot){
			if(cflag){  //in case the new no starts with a decimal
				textfield.setText("");
				cflag=false;
			}
			if(flag){ //when entered in between a number
				String t= textfield.getText();
				textfield.setText(t+".");
			}
			else{ //when entered after an operator, a no starting with a decimal
				textfield.setText("");
				textfield.setText("0.");
				flag=true;//for the number entered next
			}
		}
		
		/*The logic is, that if cflag is true, means the = button was pressed last,
		 and the ans of the prev opn has to used in the new operation.*/
		else if( event.getSource() == add ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else
				total += number;
			flag = false;
			operation = "add"; 
			textfield.setText("+");
		}
		
		else if( event.getSource() == subtract ) {
			if(flag){
				if( cflag ) {
					cflag = false;
					total = Double.parseDouble(textfield.getText());
				}
				else {
					if( total == 0 )
						total = number;
					else
						total -= number;
				}
				flag = false;
				operation = "subtract";
				textfield.setText("-");
				}
			//for negative numbers
			else if(!flag && clr){
				textfield.setText("-");
				flag=true;//flag made true because the negative sign now is a part of the no
				if(cflag)
					cflag=false;//necessary because the new no started with - sign in this case
			}
		}
		
		else if( event.getSource() == multiply ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else {
				if( total == 0 )
					total = 1;
				total *= number;
				}
			flag = false;
			textfield.setText("*");
			operation = "multiply";
		}
		
		else if( event.getSource() == divide ) {
			if( cflag ) {
				cflag = false;
				total = Double.parseDouble(textfield.getText());
			}
			else {
				if( total == 0 )
					total = number;
				else
					total /= number;
			}
			flag = false;
			operation = "divide";
			if( Double.isNaN(total) ) {
				textfield.setText("Math error");
				number = 0;
				total = 0;
				textfield.setText("");
			}
			else {
				textfield.setText("/");
			}
		}
		
		else if( event.getSource() == ans ) {
	
			cflag = true;
			switch(operation) {
			case "add" 		:	total += number;
								break;
			case "subtract" :	total -= number;
								break;
			case "multiply" :	total *= number;
								break;
			case "divide" 	:	total /= number;
								break;
			}
			if( Double.isNaN(total) ) {
				textfield.setText("Math error");
				number = 0;
				total = 0;
				textfield.setText("");
			}
			else {
				textfield.setText(""+total);
				total = 0;
				number=0;
			}
		}
		
		else if( event.getSource() == clear ) {
			textfield.setText("");
			number = 0;
			total = 0;
			flag=false;//made false in case a negative no has to be entered next
			clr=true;
		}
	}
}
		
		/*In the following, cflag has been made true, so in case a new no is
		 entered it will start a new opn, but flag is made true, for the subtraction 
		 opn*/
	class Trigbutton implements ActionListener {
	    public void actionperformed(ActionEvent event) {	
		else if( event.getSource() == sin ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}
			total = Math.sin(number);
			textfield.setText(""+total);
			operation = "sin";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
		
		else if( event.getSource() == cos ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}			total = Math.cos(number);
			textfield.setText(""+total);
			operation = "cos";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
		
		else if( event.getSource() == tan ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}
			total = Math.tan(number);
			textfield.setText(""+total);
			operation = "tan";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
		

		else if( event.getSource() == log ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}
			total = Math.log(number);
			textfield.setText(""+total);
			operation = "log";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
	
		else if( event.getSource() == sqrt ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}
			total = Math.sqrt(number);
			textfield.setText(""+total);
			operation = "log";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
		
		else if( event.getSource() == cbrt ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}
			total = Math.cbrt(number);
			textfield.setText(""+total);
			operation = "log";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
		
		else if( event.getSource() == exp ) {
			if( cflag ) {
				number = Double.parseDouble(textfield.getText());
			}
			total = Math.exp(number);
			textfield.setText(""+total);
			operation = "log";
			cflag=true;
			flag=true;
			number=0;
			total=0;
		}
	}
    }

}
