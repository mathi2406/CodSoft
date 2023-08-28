import java.awt.event.*;
import javax.swing.*;
class word_counter1 extends JFrame implements ActionListener {
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;
    word_counter1()
    {
    }
    public static void main(String[] args)
    {
        f = new JFrame("textfield");
       l = new JLabel(" ");
        b = new JButton("submit");
        word_counter1 te = new word_counter1();
        b.addActionListener(te);
        t = new JTextField(16);
        JPanel p = new JPanel();
        p.add(t);
        p.add(b);
       p.add(l);
        f.add(p);
        f.setSize(400, 400);
        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            String str=t.getText();
            int wc = 0;  
       for(int i = 0; i < str.length()-1; i++) {  
           if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {  
               wc++;  
           }  
       }   
       wc++;  
       System.out.println("Total number of words in given string " + wc);  
            t.setText("  ");
           l.setText("Total number of words in given string "+Integer.toString(wc));
        }
    }
}