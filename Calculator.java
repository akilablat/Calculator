import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.text.DecimalFormat;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener{
  JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,mul,div,min,eql,dec,clr,set,ok;
  JPanel panel1,panel2;
  JTextField tex1,tex2,tex3;
  JFrame frame1,frame2;
  JComboBox bac,foc,kec,decs,fot;
  JLabel bacl,focl,kecl,decsl,fotl;
  String s0,s1,s2;
  Border b,a;
 

  Calculator(){
      Border b = BorderFactory.createMatteBorder(10, 10, 30, 10, Color.LIGHT_GRAY),
             a = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2);
      s0=s1=s2="";

      b1 = new JButton("1");
      b1.setBounds(30, 150, 100, 50);
      b1.setFont(new Font("Arial", Font.PLAIN, 30));
      b1.setContentAreaFilled(false);
      b1.setFocusable(false);
      
      b2 = new JButton("2");
      b2.setFont(new Font("Arial", Font.PLAIN, 30));
      b2.setBounds(145, 150, 100, 50); 
      b2.setContentAreaFilled(false);
      b2.setFocusable(false);

      b3 = new JButton("3"); 
      b3.setFont(new Font("Arial", Font.PLAIN, 30));
      b3.setBounds(260, 150, 100, 50);
      b3.setContentAreaFilled(false);
      b3.setFocusable(false);

      b4 = new JButton("4"); 
      b4.setFont(new Font("Arial", Font.PLAIN, 30));
      b4.setBounds(30, 220, 100, 50);
      b4.setContentAreaFilled(false);
      b4.setFocusable(false);

      b5 = new JButton("5"); 
      b5.setFont(new Font("Arial", Font.PLAIN, 30));
      b5.setBounds(145, 220, 100, 50);
      b5.setContentAreaFilled(false);
      b5.setFocusable(false);

      b6 = new JButton("6"); 
      b6.setBounds(260, 220, 100, 50);
      b6.setContentAreaFilled(false);
      b6.setFont(new Font("Arial", Font.PLAIN, 30));
      b6.setFocusable(false);

      b7 = new JButton("7"); 
      b7.setBounds(30, 290, 100, 50);
      b7.setContentAreaFilled(false);
      b7.setFont(new Font("Arial", Font.PLAIN, 30));
      b7.setFocusable(false);

      b8 = new JButton("8"); 
      b8.setBounds(145, 290, 100, 50);
      b8.setContentAreaFilled(false);
      b8.setFont(new Font("Arial", Font.PLAIN, 30));
      b8.setFocusable(false);

      b9 = new JButton("9"); 
      b9.setBounds(260, 290, 100, 50);
      b9.setContentAreaFilled(false);
      b9.setFont(new Font("Arial", Font.PLAIN, 30));
      b9.setFocusable(false);

      b0 = new JButton("0");
      b0.setBounds(30, 360, 100, 50);
      b0.setContentAreaFilled(false);
      b0.setFont(new Font("Arial", Font.PLAIN, 30));
      b0.setFocusable(false);

      dec = new JButton(".");
      dec.setBounds(145, 360, 100, 50);
      dec.setContentAreaFilled(false);
      dec.setFont(new Font("Arial", Font.PLAIN, 30));
      dec.setFocusable(false);

      add = new JButton("+");
      add.setBounds(260, 360, 100, 50);
      add.setContentAreaFilled(false);
      add.setFont(new Font("Arial", Font.PLAIN, 30));
      add.setFocusable(false);

      min = new JButton("-");
      min.setBounds(30, 430, 100, 50); 
      min.setContentAreaFilled(false);
      min.setFont(new Font("Arial", Font.PLAIN, 30));
      min.setFocusable(false);

      mul = new JButton("*");
      mul.setBounds(145, 430, 100, 50); 
      mul.setContentAreaFilled(false);
      mul.setFont(new Font("Arial", Font.PLAIN, 30));
      mul.setFocusable(false);

      div = new JButton("/"); 
      div.setBounds(260, 430, 100, 50);
      div.setContentAreaFilled(false);
      div.setFont(new Font("Arial", Font.PLAIN, 30));
      div.setFocusable(false);

      eql = new JButton("=");
      eql.setBounds(30, 500, 215, 50); 
      eql.setContentAreaFilled(false);
      eql.setFont(new Font("Arial", Font.PLAIN, 30));
      eql.setFocusable(false);

      clr = new JButton("c");
      clr.setBounds(260, 500, 100, 50);
      clr.setContentAreaFilled(false);
      clr.setFont(new Font("Arial", Font.PLAIN, 30));
      clr.setFocusable(false);

      set = new JButton("Settings");
      set.setBounds(30, 570, 330, 50);
      set.setContentAreaFilled(false);
      set.setFont(new Font("Arial", Font.PLAIN, 30));
      set.setFocusable(false);

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b0.addActionListener(this);
      add.addActionListener(this);
      min.addActionListener(this);
      mul.addActionListener(this);
      div.addActionListener(this);
      dec.addActionListener(this);
      eql.addActionListener(this);
      clr.addActionListener(this);
      set.addActionListener(this);

      frame1 = new JFrame("Calculator");
      frame1.setSize(400,700);
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame1.setLayout(null);
      frame1.setResizable(false);

      panel1 = new JPanel();
      panel1.setBorder(b);
      panel1.setBounds(0,0,388,670);
      panel1.setLayout(null);
      panel1.add(b0);
      panel1.add(b1);
      panel1.add(b2);
      panel1.add(b3);
      panel1.add(b4);
      panel1.add(b5);
      panel1.add(b6);
      panel1.add(b7);
      panel1.add(b8);
      panel1.add(b9);
      panel1.add(add);
      panel1.add(min);
      panel1.add(div);
      panel1.add(mul);
      panel1.add(eql);
      panel1.add(dec);
      panel1.add(clr);
      panel1.add(set);

      tex1 = new JTextField();
      tex1.setBounds(30,30,330,100);
      tex1.setEditable(false);
      tex1.setFont(new Font("Arial", Font.PLAIN, 40));
      tex1.setBorder(a);
      tex1.setText("0");
      tex1.setVisible(true);

      tex2 = new JTextField();
      tex2.setBounds(30,30,330,100);
      tex2.setEditable(false);
      tex2.setFont(new Font("Arial", Font.PLAIN, 40));
      tex2.setBorder(a);
      tex2.setText("0");
      tex2.setVisible(false);

      tex3 = new JTextField();
      tex3.setBounds(30,30,330,100);
      tex3.setEditable(false);
      tex3.setFont(new Font("Arial", Font.PLAIN, 40));
      tex3.setBorder(a);
      tex3.setText("0");
      tex3.setVisible(false);


      frame2 = new JFrame("Settings");
      frame2.setSize(400,700);
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame2.setLayout(null);
      frame2.setResizable(false);

      String[]color = {"White","Black","Grey"};
      String[]color2 = {"Black","Red","Blue"};
      String[]fonts = {"Arial Plain","AvantGarde Italic","TimesRoman Bold"};
      String[]deci = {"Max","1","2"};
      bac = new JComboBox<String>(color);
      bac.setBounds(200, 40, 150, 40);
      bac.setFont(new Font("Arial", Font.PLAIN, 20));
      bac.setFocusable(false);

      foc = new JComboBox<String>(color2);
      foc.setBounds(200, 110, 150, 40);
      foc.setFont(new Font("Arial", Font.PLAIN, 20));
      foc.setFocusable(false);

      kec = new JComboBox<String>(color2);
      kec.setBounds(200, 180, 150, 40);
      kec.setFont(new Font("Arial", Font.PLAIN, 20));
      kec.setFocusable(false);
    
      decs = new JComboBox<String>(deci);
      decs.setBounds(200, 250, 150, 40);
      decs.setFont(new Font("Arial", Font.PLAIN, 20));
      decs.setFocusable(false);

      fot = new JComboBox<String>(fonts);
      fot.setBounds(150, 320, 200, 40);
      fot.setFont(new Font("Arial", Font.PLAIN, 20));
      fot.setFocusable(false);

      bacl = new JLabel ("Background");
      bacl.setBounds(30, 40, 150, 40);
      bacl.setFont(new Font("Arial", Font.PLAIN, 20));
      bacl.setFocusable(false);

      focl = new JLabel ("Foreground");
      focl.setBounds(30, 110, 150, 40);
      focl.setFont(new Font("Arial", Font.PLAIN, 20));
      focl.setFocusable(false);

      kecl = new JLabel ("Keypad Color");
      kecl.setBounds(30, 180, 150, 40);
      kecl.setFont(new Font("Arial", Font.PLAIN, 20));
      kecl.setFocusable(false);

      decsl = new JLabel ("Decimal");
      decsl.setBounds(30, 250, 150, 40);
      decsl.setFont(new Font("Arial", Font.PLAIN, 20));
      decsl.setFocusable(false);

      fotl = new JLabel ("Font Type");
      fotl.setBounds(30, 320, 150, 40);
      fotl.setFont(new Font("Arial", Font.PLAIN, 20));
      fotl.setFocusable(false);

      ok = new JButton("OK");
      ok.setBounds(120, 500, 150, 50);
      ok.setContentAreaFilled(false);
      ok.setFont(new Font("Arial", Font.PLAIN, 30));
      ok.setFocusable(false);

      bac.addActionListener(this);
      foc.addActionListener(this);
      decs.addActionListener(this);
      fot.addActionListener(this);
      kec.addActionListener(this);
      ok.addActionListener(this);
     



      panel2 = new JPanel();
      panel2.setBorder(b);
      panel2.setBounds(0,0,388,670);
      panel2.setLayout(null);
      panel2.add(bac);
      panel2.add(foc);
      panel2.add(fot);
      panel2.add(decs);
      panel2.add(kec);
      panel2.add(bacl);
      panel2.add(focl);
      panel2.add(kecl);
      panel2.add(decsl);
      panel2.add(fotl);
      panel2.add(ok);

      frame1.add(tex3);
      frame1.add(tex2);
      frame1.add(tex1);
      frame1.add(panel1);
      frame1.setVisible(true);

      frame2.add(panel2);
      frame2.setVisible(false);
  }
  public static void main(String[] args){
      Calculator cal = new Calculator();
      
  }
  @Override
  public void actionPerformed(ActionEvent c){
    String s = c.getActionCommand();
    DecimalFormat df = new DecimalFormat("0.0");
    DecimalFormat dt = new DecimalFormat("0.00");
    DecimalFormat dz = new DecimalFormat("#.################");
    try{
    if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
        if (!s1.equals("")) 
            s2 = s2 + s; 
        else
            s0 = s0 + s; 
            tex1.setText(dz.format(Double.parseDouble(s0)) + s1 + s2);
            tex3.setText(dt.format(Double.parseDouble(s0)) + s1 + s2);
            tex2.setText(df.format(Double.parseDouble(s0)) + s1 + s2); 
         } 
    else if (s.charAt(0) == 'c') {  
        s0 = s1 = s2 = ""; 
        tex1.setText("0");
        tex3.setText("0");
        tex2.setText("0"); 
    } 
    else if (s.charAt(0) == '=') { 
        double te; 
        if (s1.equals("+")) 
            te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
        else if (s1.equals("-")) 
            te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
        else if (s1.equals("/")) 
            te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
        else
            te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
            tex1.setText(dz.format(te)); 
            tex2.setText(df.format(te));
            tex3.setText(dt.format(te));
            s0 = Double.toString(te); 
         s1 = s2 = ""; 
    } 

    else if (s.charAt(0) == 'S') {
        frame1.setVisible(false);
        frame2.setVisible(true);
    }
    else if (s.charAt(0) == 'O'){
        frame1.setVisible(true);
        frame2.setVisible(false);
    }
    
    else { 
        if (s1.equals("") || s2.equals("")) 
            s1 = s;  
        else { 
            double te;
            if (s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if (s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if (s1.equals("/")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
                s0 = Double.toString(te);  
                s1 = s; 
                s2 = ""; 
        } 
        tex1.setText(dz.format(Double.parseDouble(s0)) + s1 + s2);
        tex2.setText(df.format(Double.parseDouble(s0)) + s1 + s2); 
        tex3.setText(dt.format(Double.parseDouble(s0)) + s1 + s2);  
    }
    } catch (Exception e) {
      tex1.setText("Error");
      tex2.setText("Error");
      tex3.setText("Error");

    }
    JComboBox myCombo = (JComboBox) c.getSource();
    if(c.getSource() == bac){
    int xx = myCombo.getSelectedIndex();
        if (xx == 1){
            panel1.setBackground(Color.black);
            panel2.setBackground(Color.black);
        }
        else if (xx == 0){
            panel1.setBackground(Color.white);
            panel2.setBackground(Color.white);
        }
        else if (xx == 2){
            panel1.setBackground(Color.darkGray);
            panel2.setBackground(Color.darkGray);
        }
    }
    else if(c.getSource() == foc){
        int zz = myCombo.getSelectedIndex();
        if (zz == 0){
            tex1.setForeground(Color.black);
            tex2.setForeground(Color.black);
            tex3.setForeground(Color.black);
            bacl.setForeground(Color.black);
            focl.setForeground(Color.black);
            kecl.setForeground(Color.black);
            decsl.setForeground(Color.black);
            fotl.setForeground(Color.black);
        }
        else if (zz == 1){
            tex1.setForeground(Color.red);
            tex2.setForeground(Color.red);
            tex3.setForeground(Color.red);
            bacl.setForeground(Color.red);
            focl.setForeground(Color.red);
            kecl.setForeground(Color.red);
            decsl.setForeground(Color.red);
            fotl.setForeground(Color.red);
        }
        else if (zz == 2){
            tex1.setForeground(Color.blue);
            tex2.setForeground(Color.blue);
            tex3.setForeground(Color.blue);
            bacl.setForeground(Color.blue);
            focl.setForeground(Color.blue);
            kecl.setForeground(Color.blue);
            decsl.setForeground(Color.blue);
            fotl.setForeground(Color.blue);
        }
    }
    else if (c.getSource() == kec){
        int aa = myCombo.getSelectedIndex();
        if (aa == 1){
            b1.setForeground(Color.red);
            b2.setForeground(Color.red);
            b3.setForeground(Color.red);
            b4.setForeground(Color.red);
            b5.setForeground(Color.red);
            b6.setForeground(Color.red);
            b7.setForeground(Color.red);
            b8.setForeground(Color.red);
            b9.setForeground(Color.red);
            b0.setForeground(Color.red);
            add.setForeground(Color.red);
            mul.setForeground(Color.red);
            div.setForeground(Color.red);
            min.setForeground(Color.red);
            eql.setForeground(Color.red);
            dec.setForeground(Color.red);
            clr.setForeground(Color.red);
            set.setForeground(Color.red);
            ok.setForeground(Color.red);
        }
        else if (aa == 0){
            b1.setForeground(Color.black);
            b2.setForeground(Color.black);
            b3.setForeground(Color.black);
            b4.setForeground(Color.black);
            b5.setForeground(Color.black);
            b6.setForeground(Color.black);
            b7.setForeground(Color.black);
            b8.setForeground(Color.black);
            b9.setForeground(Color.black);
            b0.setForeground(Color.black);
            add.setForeground(Color.black);
            mul.setForeground(Color.black);
            div.setForeground(Color.black);
            min.setForeground(Color.black);
            eql.setForeground(Color.black);
            dec.setForeground(Color.black);
            clr.setForeground(Color.black);
            set.setForeground(Color.black);
            ok.setForeground(Color.black);
        }
        else if (aa == 2){
            b1.setForeground(Color.blue);
            b2.setForeground(Color.blue);
            b3.setForeground(Color.blue);
            b4.setForeground(Color.blue);
            b5.setForeground(Color.blue);
            b6.setForeground(Color.blue);
            b7.setForeground(Color.blue);
            b8.setForeground(Color.blue);
            b9.setForeground(Color.blue);
            b0.setForeground(Color.blue);
            add.setForeground(Color.blue);
            mul.setForeground(Color.blue);
            div.setForeground(Color.blue);
            min.setForeground(Color.blue);
            eql.setForeground(Color.blue);
            dec.setForeground(Color.blue);
            clr.setForeground(Color.blue);
            set.setForeground(Color.blue);
            ok.setForeground(Color.blue);
        }
    }
    else if (c.getSource() == fot){
        int gg = myCombo.getSelectedIndex();
        if (gg == 0){
            b1.setFont(new Font("Arial", Font.PLAIN, 30));
            b2.setFont(new Font("Arial", Font.PLAIN, 30));
            b3.setFont(new Font("Arial", Font.PLAIN, 30));
            b4.setFont(new Font("Arial", Font.PLAIN, 30));
            b5.setFont(new Font("Arial", Font.PLAIN, 30));
            b6.setFont(new Font("Arial", Font.PLAIN, 30));
            b7.setFont(new Font("Arial", Font.PLAIN, 30));
            b8.setFont(new Font("Arial", Font.PLAIN, 30));
            b9.setFont(new Font("Arial", Font.PLAIN, 30));
            b0.setFont(new Font("Arial", Font.PLAIN, 30));
            add.setFont(new Font("Arial", Font.PLAIN, 30));
            min.setFont(new Font("Arial", Font.PLAIN, 30));
            mul.setFont(new Font("Arial", Font.PLAIN, 30));
            div.setFont(new Font("Arial", Font.PLAIN, 30));
            eql.setFont(new Font("Arial", Font.PLAIN, 30));
            clr.setFont(new Font("Arial", Font.PLAIN, 30));
            dec.setFont(new Font("Arial", Font.PLAIN, 30));
            set.setFont(new Font("Arial", Font.PLAIN, 30));
            ok.setFont(new Font("Arial", Font.PLAIN, 30));
            tex1.setFont(new Font("Arial", Font.PLAIN, 40));
            tex2.setFont(new Font("Arial", Font.PLAIN, 40));
            tex3.setFont(new Font("Arial", Font.PLAIN, 40));
            bacl.setFont(new Font("Arial", Font.PLAIN, 20));
            focl.setFont(new Font("Arial", Font.PLAIN, 20));
            kecl.setFont(new Font("Arial", Font.PLAIN, 20));
            decsl.setFont(new Font("Arial", Font.PLAIN, 20));
            fotl.setFont(new Font("Arial", Font.PLAIN, 20));
            bac.setFont(new Font("Arial", Font.PLAIN, 20));
            foc.setFont(new Font("Arial", Font.PLAIN, 20));
            kec.setFont(new Font("Arial", Font.PLAIN, 20));
            decs.setFont(new Font("Arial", Font.PLAIN, 20));
            fot.setFont(new Font("Arial", Font.PLAIN, 20));
        }
        else if (gg == 1){
            b1.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b2.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b3.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b4.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b5.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b6.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b7.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b8.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b9.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            b0.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            add.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            min.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            mul.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            div.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            eql.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            clr.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            dec.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            set.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            ok.setFont(new Font("AvantGarde", Font.ITALIC, 30));
            tex1.setFont(new Font("AvantGarde", Font.ITALIC, 40));
            tex2.setFont(new Font("AvantGarde", Font.ITALIC, 40));
            tex3.setFont(new Font("AvantGarde", Font.ITALIC, 40));
            bacl.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            focl.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            kecl.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            decsl.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            fotl.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            bac.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            foc.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            kec.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            decs.setFont(new Font("AvantGarde", Font.ITALIC, 20));
            fot.setFont(new Font("AvantGarde", Font.ITALIC, 20));
        }
        else if (gg == 2){
            b1.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b2.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b3.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b4.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b5.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b6.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b7.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b8.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b9.setFont(new Font("TimesRoman", Font.BOLD, 30));
            b0.setFont(new Font("TimesRoman", Font.BOLD, 30));
            add.setFont(new Font("TimesRoman", Font.BOLD, 30));
            min.setFont(new Font("TimesRoman", Font.BOLD, 30));
            mul.setFont(new Font("TimesRoman", Font.BOLD, 30));
            div.setFont(new Font("TimesRoman", Font.BOLD, 30));
            eql.setFont(new Font("TimesRoman", Font.BOLD, 30));
            clr.setFont(new Font("TimesRoman", Font.BOLD, 30));
            dec.setFont(new Font("TimesRoman", Font.BOLD, 30));
            set.setFont(new Font("TimesRoman", Font.BOLD, 30));
            ok.setFont(new Font("TimesRoman", Font.BOLD, 30));
            tex1.setFont(new Font("TimesRoman", Font.BOLD, 40));
            tex2.setFont(new Font("TimesRoman", Font.BOLD, 40));
            tex3.setFont(new Font("TimesRoman", Font.BOLD, 40));
            bacl.setFont(new Font("TimesRoman", Font.BOLD, 20));
            focl.setFont(new Font("TimesRoman", Font.BOLD, 20));
            kecl.setFont(new Font("TimesRoman", Font.BOLD, 20));
            decsl.setFont(new Font("TimesRoman", Font.BOLD, 20));
            fotl.setFont(new Font("TimesRoman", Font.BOLD, 20));
            bac.setFont(new Font("TimesRoman", Font.BOLD, 20));
            foc.setFont(new Font("TimesRoman", Font.BOLD, 20));
            kec.setFont(new Font("TimesRoman", Font.BOLD, 20));
            decs.setFont(new Font("TimesRoman", Font.BOLD, 20));
            fot.setFont(new Font("TimesRoman", Font.BOLD, 20));
        }
    }
    
    else if (c.getSource() == decs){
        int ll = myCombo.getSelectedIndex();
        if (ll == 1){
            tex1.setVisible(false);
            tex2.setVisible(true);
            tex3.setVisible(false); 
        }
        else if (ll == 0){
            tex1.setVisible(true);
            tex2.setVisible(false);
            tex3.setVisible(false);
        }
        else if (ll == 2){
            tex1.setVisible(false);
            tex2.setVisible(false);
            tex3.setVisible(true);
        }
    }


  }
}