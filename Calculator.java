import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener{
 

boolean isOperatedClicked=false;

public JFrame jFrame;
JLabel displayLabel;

JButton sevenButton;
JButton eightButton;
JButton nightButton;
 JButton nineButton;
 public JButton fourButton;
 String oldvalue,newvalue;
JButton fiveButton;
JButton sixButton;
 JButton threeButton;
 JButton twoButton;
JButton oneButton;
 JButton dotButton;
JButton zeroButton;
JButton equalButton;
JButton divButton;
JButton multiButton;
 JButton subButton;
 JButton addButton,clearbutton;

boolean isOperatorClicked;



public Calculator() {
	
	JFrame jFrame = new JFrame("Calculator");
	jFrame.setLayout(null);
	jFrame.setSize(800, 800);
	jFrame.setLocation(300, 100);
	this.jFrame=jFrame;
    displayLabel=new JLabel();
	displayLabel.setBounds(50, 50, 700, 30);
	displayLabel.setBackground(Color.red);
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displayLabel.setForeground(Color.GREEN);
    jFrame.add(displayLabel);
    
    sevenButton=new JButton("7");
    sevenButton.setBounds(30,130, 70, 70);
    sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
    sevenButton.addActionListener(this);
    jFrame.add(sevenButton);
    eightButton=new JButton("8");
    eightButton.setBounds(120,130, 70, 70);
    eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
    eightButton.addActionListener(this);
    jFrame.add(eightButton);
    nineButton = new JButton("9");
    nineButton.setBounds(210,130, 70, 70);
    nineButton. setFont(new Font("Arial", Font.PLAIN, 40));
     nineButton .addActionListener(this);
    jFrame.add(nineButton);
    fourButton = new JButton("4");
    fourButton.setBounds(30,220, 70, 70);
    fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
    fourButton.addActionListener(this);
    jFrame.add(fourButton);
    fiveButton = new JButton("5");
    fiveButton.setBounds(120,220, 70, 70);
    fiveButton. setFont(new Font("Arial", Font.PLAIN, 40));
    fiveButton .addActionListener(this);
    jFrame.add(fiveButton);
    sixButton=new JButton("6");
    sixButton.setBounds(210,220, 70, 70);
    sixButton. setFont(new Font("Arial", Font.PLAIN, 40));
    sixButton .addActionListener(this);
    jFrame.add(sixButton);
    threeButton=new JButton("3");
    threeButton.setBounds(30,310, 70, 70);
    threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
    threeButton .addActionListener(this);
    jFrame.add(threeButton);
    twoButton=new JButton("2");
    twoButton.setBounds(120,310, 70, 70);
    twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
    twoButton .addActionListener(this);
    jFrame.add(twoButton);
    oneButton=new JButton("1");
    oneButton.setBounds(210,310, 70, 70);
    oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
     oneButton .addActionListener(this);
    jFrame.add(oneButton);
    dotButton=new JButton(".");
    dotButton.setBounds(30,400, 70, 70);
    dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
    dotButton .addActionListener(this);
    jFrame.add(dotButton);
    zeroButton=new JButton("0");
    zeroButton.setBounds(120,400, 70, 70);
    zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
    zeroButton .addActionListener(this);
    jFrame.add(zeroButton);
    
    equalButton=new JButton("=");
    equalButton.setBounds(210,400, 70, 70);
    equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
    equalButton .addActionListener(this);
    jFrame.add(equalButton);
    
    divButton=new JButton("/");
    divButton.setBounds(310,130, 70, 70);
    divButton.setFont(new Font("Arial", Font.PLAIN, 40));
    divButton .addActionListener(this);
    jFrame.add(divButton);
    multiButton=new JButton("x");
    multiButton.setBounds(310,220, 70, 70);
    multiButton.setFont(new Font("Arial", Font.PLAIN, 40));
    multiButton .addActionListener(this);
    jFrame.add(multiButton);
    subButton=new JButton("-");
    subButton.setBounds(310,310, 70, 70);
    subButton.setFont(new Font("Arial", Font.PLAIN, 40));
    subButton .addActionListener(this);
    jFrame.add(subButton);
    addButton=new JButton("+");
    addButton.setBounds(310,400, 70, 70);
    addButton.setFont(new Font("Arial", Font.PLAIN, 40));
    addButton .addActionListener(this);
    jFrame.add(addButton);
    
    clearbutton=new JButton("<");
    clearbutton.setBounds(400,400, 70, 70);
    clearbutton.setFont(new Font("Arial", Font.PLAIN, 40));
    clearbutton .addActionListener(this);
    jFrame.add(clearbutton);
    jFrame.setVisible(true);
	jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	Calculator ts = new Calculator();
	
}
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == sevenButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("7");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"7");
	}else if (e.getSource()== eightButton) {
		if(isOperatedClicked==true) {
  			displayLabel.setText("8");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"8");
	}else if(e.getSource() == nineButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("9");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"9");
	}else if (e.getSource() == fourButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("4");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"4");
		
	}else if (e.getSource()==fiveButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("5");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"5");
	}else if(e.getSource() == sixButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("6");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"6");
	}else if (e.getSource() == threeButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("3");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"3");
	}else if (e.getSource() == fourButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("4");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"4");
		
	}else if (e.getSource()==twoButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("2");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"2");
		
	}else if(e.getSource() == oneButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("1");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"1");
	}else if (e.getSource() == zeroButton) {
		if(isOperatedClicked==true) {
			displayLabel.setText("7");
			isOperatedClicked=false;
		}else
		displayLabel.setText(displayLabel.getText()+"0");
	}else if (e.getSource() == dotButton) {
		displayLabel.setText(displayLabel.getText()+".");
	
	}else if (e.getSource() == equalButton) {
		
		String newvalue=displayLabel.getText();
		float oldvalueF=Float.parseFloat(oldvalue);
		float newvalueF=Float.parseFloat(newvalue);
		float Result= oldvalueF+newvalueF;
		displayLabel.setText(Result+"");
		
	
	}else if (e.getSource() == subButton) {
		displayLabel.setText(displayLabel.getText()+"-");
	}else if (e.getSource() == multiButton) {
		displayLabel.setText(displayLabel.getText()+"x");
	}else if (e.getSource() == addButton) {
		displayLabel.setText(displayLabel.getText()+"+");
		isOperatorClicked = true;
		oldvalue=displayLabel.getText();
	}else if (e.getSource() == divButton) {
		displayLabel.setText(displayLabel.getText()+"/");
	}else if (e.getSource() == clearbutton) {
		displayLabel.setText("");
}
}

}
			
			
			
			
			
		
		
