import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	String oldValue,operator,result;
	
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton threebutton;
	JButton twobutton;
	JButton onebutton;
	JButton dotbutton;
	JButton equalbutton;
	JButton zerobutton;
	JButton addbutton;
	JButton subbutton;
	JButton mulbutton;
	JButton divbutton;
	JButton clrbutton;
	
	Boolean isOperatorClicked=false;
	
	public Calculator() {
		
		JFrame jf=new JFrame("calculator");
			jf.setLayout(null);
			jf.setSize(360,620);
			jf.setLocationRelativeTo(null);
			jf.getContentPane().setBackground(new Color(220,220,220));
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			displaylabel=new JLabel();
			displaylabel.setBounds(30,20,230,40);
			displaylabel.setBackground(Color.WHITE);
			displaylabel.setOpaque(true);
			displaylabel.setHorizontalAlignment(SwingConstants.CENTER);
			displaylabel.setForeground(Color.BLACK);
			jf.add(displaylabel);
			
			
			sevenbutton=new JButton("7");
			sevenbutton.setBounds(30,130, 70, 70);
			sevenbutton.addActionListener(this);
			jf.add(sevenbutton);
			
			eightbutton=new JButton("8");
		    eightbutton.setBounds(130,130, 70, 70);
		    eightbutton.addActionListener(this);
			jf.add(eightbutton);
			
			ninebutton=new JButton("9");
			ninebutton.setBounds(230,130, 70, 70);
			ninebutton.addActionListener(this);	
			jf.add(ninebutton);
			
			fourbutton=new JButton("4");
		    fourbutton.setBounds(30,230, 70, 70);
		    fourbutton.addActionListener(this);
		    jf.add(fourbutton);
			
			fivebutton=new JButton("5");
			fivebutton.setBounds(130,230, 70, 70);
			fivebutton.addActionListener(this);
			jf.add(fivebutton);
			
			sixbutton=new JButton("6");
			sixbutton.setBounds(230,230, 70, 70);
			sixbutton.addActionListener(this);
			jf.add(sixbutton);
			
			threebutton=new JButton("3");
			threebutton.setBounds(30,330, 70, 70);
			threebutton.addActionListener(this);
			jf.add(threebutton);
			
			twobutton=new JButton("2");
			twobutton.setBounds(130,330, 70, 70);
			twobutton.addActionListener(this);
			jf.add(twobutton);
			
			onebutton=new JButton("1");
			onebutton.setBounds(230,330, 70, 70);
			onebutton.addActionListener(this);
			jf.add(onebutton);
			
			dotbutton=new JButton(".");
			dotbutton.setBounds(30,430, 70, 70);
			dotbutton.addActionListener(this);
			jf.add(dotbutton);
			
			zerobutton=new JButton("0");
			zerobutton.setBounds(130,430, 70, 70);
			zerobutton.addActionListener(this);
			jf.add(zerobutton);
			
			equalbutton=new JButton("=");
			equalbutton.setBounds(230,430, 70, 70);
			equalbutton.addActionListener(this);
			jf.add(equalbutton);
			
			addbutton=new JButton("+");
			addbutton.setBounds(330,130, 70, 70);
			addbutton.addActionListener(this);
			jf.add(addbutton);
			
			subbutton=new JButton("-");
			subbutton.setBounds(330,230, 70, 70);
			subbutton.addActionListener(this);
			jf.add(subbutton);
			
			divbutton=new JButton("/");
			divbutton.setBounds(330,330, 70, 70);
			divbutton.addActionListener(this);
			jf.add(divbutton);
			
			mulbutton=new JButton("*");
			mulbutton.setBounds(330,430, 70, 70);
			mulbutton.addActionListener(this);
			jf.add(mulbutton);
			
			clrbutton=new JButton("clear");
			clrbutton.setBounds(270,20,140,40);
			clrbutton.addActionListener(this);
			jf.add(clrbutton);
			
	}
	
	public static void main(String[] args) {
		 new Calculator();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			if(isOperatorClicked){
				displaylabel.setText("7");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightbutton) {	
				if(isOperatorClicked){
					displaylabel.setText("8");
					isOperatorClicked=false;
				}else {
			displaylabel.setText(displaylabel.getText()+"8");
				}
		}
			
        else if(e.getSource()==ninebutton) {	
				if(isOperatorClicked){
					displaylabel.setText("9");
					isOperatorClicked=false;
				}else {
			displaylabel.setText(displaylabel.getText()+"9"); 
				}
        }
		else if(e.getSource()==sixbutton) {	
				if(isOperatorClicked){
					displaylabel.setText("6");
					isOperatorClicked=false;
				}else {
				displaylabel.setText(displaylabel.getText()+"6");
				}
		}
				
		else if(e.getSource()==fivebutton) {
				if(isOperatorClicked){
					displaylabel.setText("5");
					isOperatorClicked=false;
				}else {
					displaylabel.setText(displaylabel.getText()+"5");
				}
		}
					
		else if(e.getSource()==fourbutton) {	
				if(isOperatorClicked){
					displaylabel.setText("4");
					isOperatorClicked=false;
				}else {
						displaylabel.setText(displaylabel.getText()+"4");
				}
		}
		else if(e.getSource()==threebutton) {	
				if(isOperatorClicked){
					displaylabel.setText("3");
					isOperatorClicked=false;
				}else {
							displaylabel.setText(displaylabel.getText()+"3");
				}
		}
		
		else if(e.getSource()==twobutton) {	
				if(isOperatorClicked){
					displaylabel.setText("2");
					isOperatorClicked=false;
				}else {
							displaylabel.setText(displaylabel.getText()+"2");
				}
		}
		
		else if(e.getSource()==onebutton) {	
				if(isOperatorClicked){
					displaylabel.setText("1");
					isOperatorClicked=false;
				}else {
					
	          displaylabel.setText(displaylabel.getText()+"1");
				}
				
		}
				
		  else if(e.getSource()==dotbutton) {
               displaylabel.setText(displaylabel.getText()+".");
				
		  }							
										
		  else if(e.getSource()==equalbutton) {
			String newvalue=displaylabel.getText();
		    float oldValueF=Float.parseFloat(oldValue);
			float newvalueF=Float.parseFloat(newvalue);
			float result=0;
			
			if (operator.equals("+")) {
				result = oldValueF + newvalueF;
			} else if (operator.equals("-")) {
				result = oldValueF - newvalueF;
			} else if (operator.equals("*")) {
				result = oldValueF * newvalueF;
			} else if (operator.equals("/")) {
				if (newvalueF != 0) {
					result = oldValueF / newvalueF;
				} else {
					displaylabel.setText("Error");
					return;
				}
			}
			
			displaylabel.setText(result+" ");
		  }
			
		else if(e.getSource()==zerobutton) {
				displaylabel.setText(displaylabel.getText()+"0");
		}
				
			
        else if(e.getSource()==addbutton) {
 				isOperatorClicked=true;
 					oldValue=displaylabel.getText();
 					operator="+";
        }
				
        else if(e.getSource()==subbutton) {
        	isOperatorClicked=true;
				oldValue=displaylabel.getText();
				operator="-";
}
        else if(e.getSource()==divbutton) {
     	   isOperatorClicked=true;
 			oldValue=displaylabel.getText();
 			operator="/";	
        }   	 
       else if(e.getSource()==mulbutton) {
    	   isOperatorClicked=true;
			oldValue=displaylabel.getText();
			operator="*";
}
        	
       else if(e.getSource()==clrbutton) {
    	   displaylabel.setText("");
    	   oldValue="";
    	   isOperatorClicked=false;
           
             
        	


	}
	
	}

}
		

