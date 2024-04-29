import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
public class ButtonDemo extends Applet implements ActionListener {
    String msg=" "; Label l1; Button yes,no;
public void init()
{
l1=new Label("Do u know Car Driving");
yes=new Button("yes"); 
no=new Button("no"); 
add(l1);
add(yes);
add(no);
yes.addActionListener(this); 
no.addActionListener(this);
}
public void actionPerformed(ActionEvent ac)
{
String str=ac.getActionCommand(); 
if(str.equals("yes")) 
msg="Congrats";
else if (str.equals("no")) 
msg="Regrets"; 
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,18,100);
}

}
