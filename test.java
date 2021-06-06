import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class test{
 public static void main(String [ ] args){
myFrame   obj=new myFrame();

       }
}

class myFrame implements KeyListener,ActionListener,FocusListener{
JFrame frame=new JFrame("STACK");
JButton  bt1=new JButton("PUSH");
JButton  bt2=new JButton("POP");
JLabel arr=new JLabel("TOP =>");
JLabel  stack=new JLabel("STACK",JLabel.CENTER);
Font font=new Font("Ink Free",Font.BOLD,20);
int x=140,y=425;
JTextField tf=new JTextField("Enter Number");

JLabel l1=new JLabel("",JLabel.CENTER); JLabel l2=new JLabel("",JLabel.CENTER); JLabel l3=new JLabel("",JLabel.CENTER);
JLabel l4=new JLabel("",JLabel.CENTER); JLabel l5=new JLabel("",JLabel.CENTER); JLabel l6=new JLabel("",JLabel.CENTER);
JLabel l7=new JLabel("",JLabel.CENTER); JLabel l8=new JLabel("",JLabel.CENTER); JLabel l9=new JLabel("",JLabel.CENTER);
JLabel l10=new JLabel("",JLabel.CENTER); JLabel l11=new JLabel("",JLabel.CENTER); JLabel l12=new JLabel("",JLabel.CENTER);
JLabel l13=new JLabel("",JLabel.CENTER); JLabel l14=new JLabel("",JLabel.CENTER); JLabel l15=new JLabel("",JLabel.CENTER);
int top=-1;
int pos=0;
String s1;
Container c1;
myFrame(){
    arr.setVisible(false);
c1=frame.getContentPane();
c1.setLayout(null);
c1.setBackground(Color.black);
frame.setBounds(20,20,300,530);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
tf.setBounds(40,20,81,20);
tf.addKeyListener(this);
tf.addFocusListener(this);
arr.setSize(50,25);
arr.setLocation(x,y);
arr.setForeground(Color.green);
bt1.setBounds(40,120,90,90);
bt2.setBounds(40,220,90,90);
bt1.setFont(font);
bt2.setFont(font);
bt2.setEnabled(false);
stack.setBounds(190,455,81,25);
stack.setForeground(Color.yellow);
bt1.addActionListener(this);
bt2.addActionListener(this);
c1.add(bt1);
c1.add(bt2);
c1.add(tf);
c1.add(arr);
c1.add(stack);
make();
     } 
     
public void make(){
l1.setBounds(190,5,81,25);l2.setBounds(190,35,81,25);l3.setBounds(190,65,81,25);l4.setBounds(190,95,81,25);l5.setBounds(190,125,81,25);    
 l6.setBounds(190,155,81,25);l7.setBounds(190,185,81,25);l8.setBounds(190,215,81,25);l9.setBounds(190,245,81,25);l10.setBounds(190,275,81,25);
 l11.setBounds(190,305,81,25);l12.setBounds(190,335,81,25);l13.setBounds(190,365,81,25);l14.setBounds(190,395,81,25);l15.setBounds(190,425,81,25);

l1.setOpaque(true);l2.setOpaque(true);l3.setOpaque(true);l4.setOpaque(true);l5.setOpaque(true);
l6.setOpaque(true);l7.setOpaque(true);l8.setOpaque(true);l9.setOpaque(true);l10.setOpaque(true);
l11.setOpaque(true);l12.setOpaque(true);l13.setOpaque(true);l14.setOpaque(true);l15.setOpaque(true);
c1.add(l1);c1.add(l2);c1.add(l3);c1.add(l4);c1.add(l5);
c1.add(l6);c1.add(l7);c1.add(l8);c1.add(l9);c1.add(l10);    
c1.add(l11);c1.add(l12);c1.add(l13);c1.add(l14);c1.add(l15);

}
   public void actionPerformed(ActionEvent ev){
       s1=tf.getText();
     arr.setVisible(true);
   if(ev.getSource()==bt1){ 
       tf.setText("");
    bt2.setEnabled(false);   
    top++;  
    printLocation(top,s1);
    if(pos>0){
    y=y-30;
    arr.setLocation(x,y);
         }
    pos++;  
    bt1.setEnabled(false);
    }
    if(ev.getSource()==bt2){
    printLocation(top,"");
    top--;
    pos--;
    if(pos>0){
    y=y+30;
    arr.setLocation(x,y);
      }    
     bt1.setEnabled(false); 
    }
   if(top>=14)
   bt1.setEnabled(false);
   else
   bt1.setEnabled(true);
   if(top<=-1){
   bt2.setEnabled(false);
   arr.setVisible(false);
     }
   else
   bt2.setEnabled(true);
  }
    public void printLocation(int  x,String s2){
         
    if(x==0) l15.setText(s2);
    if(x==1) l14.setText(s2);
    if(x==2) l13.setText(s2);
    if(x==3) l12.setText(s2);
    if(x==4) l11.setText(s2);
    if(x==5) l10.setText(s2);
    if(x==6) l9.setText(s2);
    if(x==7) l8.setText(s2);
    if(x==8) l7.setText(s2);
    if(x==9) l6.setText(s2);
    if(x==10) l5.setText(s2);
    if(x==11) l4.setText(s2);
    if(x==12) l3.setText(s2);
    if(x==13) l2.setText(s2);
    if(x==14) l1.setText(s2);
    }
    
   public void keyPressed(KeyEvent key){
       String value=tf.getText();     
      if(Character.isDigit(key.getKeyChar()) || key.getKeyCode()==KeyEvent.VK_BACK_SPACE || 
      key.getKeyCode()==KeyEvent.VK_PERIOD  || key.getKeyCode()==KeyEvent.VK_DECIMAL)
      tf.setEditable(true);
      else
       tf.setEditable(false);
       
       if(value.length()>10)
        tf.setEditable(false);
        
       if(key.getKeyCode()==KeyEvent.VK_BACK_SPACE)
        tf.setEditable(true);
       }
   public void keyReleased(KeyEvent key){}
   public void keyTyped(KeyEvent key){}
   
   public void focusGained(FocusEvent f){ 
       bt1.setEnabled(true);
    if(f.getSource()==tf)
    tf.setText("");
      }
   public void focusLost(FocusEvent f){
    String value=tf.getText();
    if(value.length()<=0)
    bt1.setEnabled(false);
    }
}