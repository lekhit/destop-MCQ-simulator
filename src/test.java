
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.ListModel;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.io.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lekhit borole
 */
public class test extends javax.swing.JFrame {
Connection c; ResultSet rs;Statement s;
    /**
     * Creates new form test
     */
    public test() {
        initComponents();
    }
   /* Timer t=new Timer((1000),new 
        ActionListener(){public void actionPerformed(ActionEvent e)
{//System.out.println("hello");
   
    
    int sec=Integer.parseInt(t3.getText());int min=Integer.parseInt(t2.getText()),hour=Integer.parseInt(t1.getText());
    sec++;
    if(sec==60)
    {min++;sec=0;}
if(min==60)
{hour++;min=0;}
if(hour==24)
 hour=0;     

       t1.setText(""+hour);t2.setText(""+min);t3.setText(""+sec);
        //min=179;
           min=179-min;
        sec=60-sec;
tt1.setText(hour+":"+min+":"+sec);

}
        
});*/
        Timer t=new Timer((1000),new 
        ActionListener(){public void actionPerformed(ActionEvent e)
{ int sec,min,hour;
    String[] s=(time.getText()).split(":");
    
    min=Integer.parseInt(s[1]);
        hour=Integer.parseInt(s[0]);


    sec=Integer.parseInt(s[2]);
    //sec=
    
if(min==00)
{hour--;min=60;}
if(sec==00)
    {min--;sec=60;}
if(hour==0)
{//t.stop();   // JOptionPane.showMessageDialog(rootPane, "times up....");
}
    sec--;

       //t7.setText(""+hour);t5.setText(""+min);t4.setText(""+sec);
        //min=179;
       // if(sec==00)
           //min=179-min;
        //sec=60-sec;
time.setText(hour+":"+min+":"+sec);
//if()

}});
    
//function not working properly getter
    String getter(String parameter,Object checkbox,String paper){String ss="p";
    try {String d="select    "+parameter+" from "+paper+" where question="+checkbox+";";System.out.println("getter text="+d);
        ResultSet rs=s.executeQuery(d);
        //rs.absolute(1);
        ss=rs.getString(parameter);System.out.println(ss);
    c.close();} catch (Exception e){System.out.println(e.getMessage());System.out.println("getter error"+e.getMessage());
    }
return(ss);}
    void update(String ss,String paper,Object checkbox){try {
        s.executeUpdate("update "+paper+" set ans='"+ans1+"',time1='"+tt1.getText()+"' where question="+checkbox+";");
    c.close();} catch (Exception e){System.out.println(e.getMessage());System.out.println("update problem"+e.getMessage());
    }
}
    
    ResultSet conn(String database,String command){
                    ResultSet rs1=null;String d="connection error";
 try {String result;
              Class.forName("java.sql.Driver");
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","1234");
         s=c.createStatement();
 rs1=s.executeQuery(command);
 }
catch(Exception e){} 
    return (rs1);
    }
    void insert(String database, String question,String ans){
                    ResultSet rs1=null;
                    String d="connection error";
 try {String result;
              Class.forName("java.sql.Driver");
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","1234");
         s=c.createStatement();
 s.executeQuery("insert into "+tf2.getText()+" (question,ans) values("+question+",'"+ans+"');");
 }
catch(Exception e){} 
    //return (rs1);
    }
    
  
ResultSet conn(String database,String table,String type,String what,String where){
                    ResultSet rs1=null;String d="connection error";
 try {String result;
              Class.forName("java.sql.Driver");
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","1234");
         s=c.createStatement();d="condition not checked";
         
         if(type.equals("update"))
         {            d="update "+table+" set "+what+" where "+where+";";

             s.executeUpdate("update "+table+" set "+what+" where "+where+";");
             result="worked on update";}
         if(type.equals("select")){             d="select    "+what+" from "+table+" where "+where+";";

             rs1=s.executeQuery("select    "+what+" from "+table+" where "+where+";");
         }
         d="after conditions";
         System.out.println("select    "+what+" from "+table+" where "+where);
                 System.out.println("update "+table+" set "+what+" where "+where);
//c.close();
           } catch (Exception e){System.out.println(e.getMessage()+" conn prob    "+d);
            }
            return (rs1);
}

ResultSet conn(String database,String table,String type,String what){
                    ResultSet rs1=null; String po; String d;
 try {String result;
              Class.forName("java.sql.Driver");
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","1234");
         s=c.createStatement();
 if(type.equals("update"))
         {            d="insert into "+table +" values ";}
         if(type.equals("select"))
         {d="select    "+what+" from "+table+";";
             rs1=s.executeQuery(d);po="select    "+what+" from "+table+";";}
         
        
            c.close();} catch (Exception e){System.out.println(e.getMessage()+" conn prob");
            }
            return (rs1);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        next = new javax.swing.JButton();
        save = new javax.swing.JButton();
        rans1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        time = new javax.swing.JToggleButton();
        cb2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        database = new javax.swing.JTextField();
        ura = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        tf2 = new javax.swing.JTextField();
        jtp = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jb4 = new javax.swing.JToggleButton();
        jb3 = new javax.swing.JToggleButton();
        jb2 = new javax.swing.JToggleButton();
        jb1 = new javax.swing.JToggleButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        commit = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cb3 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jb9 = new javax.swing.JToggleButton();
        jb10 = new javax.swing.JToggleButton();
        jb11 = new javax.swing.JToggleButton();
        jb12 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1580, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 109, 103));

        clear.setText("clear ");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 109, 101));

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel3.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 109, 100));

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 109, 92));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, 600));

        rans1.setText("rans");
        jPanel6.add(rans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 82, -1));

        cb1.setBackground(new java.awt.Color(0, 255, 51));
        cb1.setEditable(true);
        cb1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel6.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 86));

        time.setText("01:00:00");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        jPanel6.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "warn", "practice", "test" }));
        cb2.setSelectedIndex(2);
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel6.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 230, 170));

        database.setText("jeeadv");
        database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseActionPerformed(evt);
            }
        });
        jPanel6.add(database, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 80, -1));

        ura.setText("ur ans:-");
        ura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uraActionPerformed(evt);
            }
        });
        jPanel6.add(ura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, 30));

        jComboBox1.setMaximumRowCount(10);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1MouseEntered(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 90, -1));

        tf2.setText("crt1apaper1");
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        jPanel6.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 80, -1));

        jtp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb4.setText("d");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jPanel1.add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 500, 124, 103));

        jb3.setText("c");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jPanel1.add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 350, 124, 103));

        jb2.setText("b");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jPanel1.add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 200, 124, 103));

        jb1.setText("a");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jPanel1.add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 55, 124, 103));

        jRadioButton1.setText("matrix");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 621, -1, -1));

        commit.setText("commit");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
            }
        });
        jPanel1.add(commit, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 621, -1, -1));

        jRadioButton2.setText("single");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jtp.addTab("multiple", jPanel1);

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jLabel1.setText("ans here:-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(939, Short.MAX_VALUE))
        );

        jtp.addTab("input", jPanel2);

        jb5.setText("d");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setText("b");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setText("a");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setText("c");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        jtp.addTab("single", jPanel4);

        jPanel6.add(jtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\i1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 380, 820));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\i1.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 430, 1110));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 390, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 20, 380, 911));

        jScrollPane4.setViewportView(jLabel5);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 570, 310));

        jButton1.setText("next");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        jButton2.setText("back");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        jButton4.setText("save and next");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        cb3.setBackground(new java.awt.Color(0, 255, 51));
        cb3.setEditable(true);
        cb3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cb3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb3ItemStateChanged(evt);
            }
        });
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, 86));

        jb9.setText("d");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb10.setText("c");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });

        jb11.setText("b");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });

        jb12.setText("a");
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jb12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
//ans+="d";        // TODO add your handling code here:
if(jb4.isSelected())      ans[4]="d"; 
else if(jb4.isSelected()==false) ans[4]="";
 ans1="";for(int i=1;i<5;i++)
ans1+=(ans[i]);ura.setText("");ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2&&(jb4.isSelected()))     save.doClick();

//if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2)next.doClick();
    }//GEN-LAST:event_jb4ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
test ob=new test();String ss="";
        try {
            //ob.setSelection(ob.getter("ans",""+cb1.getSelectedItem(),tf2.getText()));
//jtp.setSelectedIndex(ob.qtype(tf2.getText(), cb1.getSelectedItem()));
//ss=ob.getter("ans", cb1.getSelectedIndex(), tf2.getText());
//if(ans[1].equals("a"))
//ob.conn();String d="select ans from "+tf2.getText()+";";

rs=ob.conn(database.getText(),tf2.getText(),"select"," ans,rans ","  question="+cb1.getSelectedItem());
//rs=s.executeQuery(d);
rs.absolute(1);
String rans=rs.getString("rans");
            try {if(rans.length()>4)
jtp.setSelectedIndex(1);
                int por=Integer.parseInt(rans);
                if(por>0)
                    jtp.setSelectedIndex(1);
            c.close();} catch (Exception e) {jtp.setSelectedIndex(0);System.out.println(" new problem forun");
            }

    String ssp=rs.getString(1);
System.out.println("cb="+ssp);
int l=ssp.length();
if(l>0)
{clear.doClick();
ura.setText(ssp);ans1=ssp;do{switch(ssp.charAt(l-1)){case 'a':jb1.setSelected(true); ans[1]="a";break;
    case 'b':jb2.setSelected(true);ans[2]="b";break;
    case 'c':jb3.setSelected(true);ans[3]="c";break;
    case 'd':jb4.setSelected(true);ans[4]="d";break;
    //default: ura.setText("");
}if(jtp.getSelectedIndex()==1)
    input.setText(ans1);
       l--;}while(l>0);

        } }catch (Exception e){System.out.println("cb po"+e.getMessage());
        }
//jtp.setSelectedIndex(ob.qtype(tf2.getText(),cb1.getSelectedItem())); 

 


// TODO add your handling code here:
    }//GEN-LAST:event_cb1ItemStateChanged

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
jb1.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        //test ob=new test();
        
           jb1.setSelected(false);
jb2.setSelected(false);
jb3.setSelected(false);
jb4.setSelected(false);
input.setText("");
//check.setText("checker");
for(int i=1;i<5;i++)
    ans[i]="";
ans1="";ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
test ob=new test();
if(clear.hasFocus())//System.out.println("clear has focus");
ob.conn(database.getText(), tf2.getText(), "update", " ans=''"," question="+cb1.getSelectedItem());
        
    }//GEN-LAST:event_clearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

    }//GEN-LAST:event_saveActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
//t.start();
    // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 // TODO add your handling code here:
//update crt1apaper1 set ans='a' where question=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       // System.out.println(jb1.isSelected());
        /*test ob=new test();
        try {
            ura.setText(ob.getSelection());
        c.close();} catch (Exception e){System.out.println(e.getMessage());
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
test ob=new test();int qni=250;//cb1.removeAllItems();
 if(jComboBox1.getSelectedItem().equals("NEW"))
        {        //tf2.setText("");
save.setText("new save");
            ob.conn(database.getText(), "create table  "+tf2.getText()+"(	   						\n" +
"question	   	int(11)					,\n" +
"rans	   	char(20)					,\n" +
"time1	   	char(20)					,\n" +
"attempt	   	int(11)					,\n" +
"ans	   	char(20)	 default	-1			,\n" +
"confidence	   	char(20)					,\n" +
"reason	   	text					,\n" +
"text1	   	text					);");   
        }         
try {//t.start();
            rans1.setVisible(false);
            //ob.conn(database.getText(),tf2.getText(),"update","ans=''","ans='00000.00'");
            rs=ob.conn(database.getText(),tf2.getText(),"select","  count(*) "," rans is not null");
            
            //if(cb2.getSelectedIndex()==2)check.setVisible(false);
            //cb1.setEditable(true);
            rs.absolute(1);
             qni=rs.getInt("count(*)");
            System.out.println(rs.getInt("count(*)"));
            
            
        c.close();} catch (Exception e){System.out.println(e.getMessage());qni=250;
        }    
        for(int i=1;i<qni;i++)
                cb1.addItem(""+i);// TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
clear.doClick();test ob=new test();
        
        cb1.setSelectedIndex(cb1.getSelectedIndex()-1);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
 String ans[]={"","","","",""};String ans1="";
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
if(jb1.isSelected())      ans[1]="a"; 
else if(jb1.isSelected()==false) ans[1]="";
 ans1="";for(int i=1;i<5;i++)
ans1+=(ans[i]);ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2&&(jb3.isSelected()))     save.doClick();

//if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2)save.doClick();

// TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
       //ans+="b"; // TODO add your handling code here:
       if(jb2.isSelected())      ans[2]="b"; 
else if(jb2.isSelected()==false) ans[2]="";
 ans1="";for(int i=1;i<5;i++)
ans1+=(ans[i]);ura.setText("");ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2&&(jb2.isSelected()))     save.doClick();

//if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2)save.doClick();

    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
//ans+="c";        // TODO add your handling code here:
if(jb3.isSelected())      ans[3]="c"; 
else if(jb3.isSelected()==false) ans[3]="";
 ans1="";for(int i=1;i<5;i++)
ans1+=(ans[i]);ura.setText("");ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2&&(jb3.isSelected()))     save.doClick();

    }//GEN-LAST:event_jb3ActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
ans1=input.getText();ura.setText(""+cb1.getSelectedItem()+":-"+ans1);   save.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if(jRadioButton1.isSelected()){
commit.setVisible(true); }
else {       // TODO add your handling code here:
commit.setVisible(false);} 

// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
String listans[]=new String[10];
listans[Integer.parseInt(jList1.getSelectedValue())]=ans1;
for(int i=1;i<5;i++)
    ans[i]="";
ans1="";ura.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_commitActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed

//        System.out.println(cb2.getSelectedIndex());        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
if(time.isSelected())t.stop();     
else t.start();// TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        ans1="d"; ura.setText(""+cb1.getSelectedItem()+":-"+ans1); if(cb2.getSelectedIndex()==1)save.doClick();// TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
ans1="b";     ura.setText(""+cb1.getSelectedItem()+":-"+ans1); if(cb2.getSelectedIndex()==1)     save.doClick();// TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
ans1="a";           ura.setText(""+cb1.getSelectedItem()+":-"+ans1);    if(cb2.getSelectedIndex()==1)save.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
ans1="c";      ura.setText(""+cb1.getSelectedItem()+":-"+ans1);  if(cb2.getSelectedIndex()==1)    save.doClick();// TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jb8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
/*test ob= new test();
        if(jComboBox1.getSelectedItem().equals("NEW"))
        {        //tf2.setText("");
save.setText("new save");
            ob.conn(database.getText(), "create table  "+tf2.getText()+"(	   						\n" +
"question	   	int(11)					,\n" +
"rans	   	char(20)					,\n" +
"time1	   	char(20)					,\n" +
"attempt	   	int(11)					,\n" +
"ans	   	char(20)	 default	-1			,\n" +
"confidence	   	char(20)					,\n" +
"reason	   	text					,\n" +
"text1	   	text					);");   
        }  //else tf2.setText(jComboBox1.getSelectedItem()+"");
            */

       // tf2.setText(""+jComboBox1.getSelectedItem());
//ob.conn(database.getText(),""+ jComboBox1.getSelectedItem(), "select", "");// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
test ob= new test();
jComboBox1.removeAllItems();
ResultSet rs=ob.conn(database.getText(),"show tables;");

        try {//rs.absolute(1);
rs.first();
            System.out.println( rs.getString(1));
            while(rs.next())
{jComboBox1.addItem(rs.getString(1));//System.out.println(rs.getString(1)+"this part");
}
//jComboBox1.addItem(ans1);
        } catch (Exception e) {System.out.println(e.getMessage());
        }     
        jComboBox1.addItem("NEW");
                // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1FocusGained

    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered
   // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseEntered

    private void databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseActionPerformed
jComboBox1.requestFocus();        // TODO add your handling code here:
        test ob= new test();
jComboBox1.removeAllItems();
ResultSet rs=ob.conn(database.getText(),"show tables;");
//jComboBox1.insertItemAt("ioioioio",0);

        try {
            System.out.println( rs.getString(1));
          do  
{
    jComboBox1.addItem(rs.getString(1));
//System.out.println(rs.getString(1)+"this part");
}while(rs.next());
//jComboBox1.addItem(ans1);
        } catch (Exception e) {System.out.println(e.getMessage());
        }     
        jComboBox1.addItem("NEW");
    }//GEN-LAST:event_databaseActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void uraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uraActionPerformed

    private void cb3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb3ItemStateChanged
        test ob=new test();String ss="";
        try {
            DefaultTableModel tm=(DefaultTableModel)tb1.getModel();
            String ssp=""+ tm.getValueAt( cb1.getSelectedIndex(), 2);ssp=ssp.toLowerCase();

            System.out.println("cb="+ssp);
            int l=ssp.length();
            if(l>0)
            {clear.doClick();
                ura.setText(ssp);ans1=ssp;do{switch(ssp.charAt(l-1)){case 'a':jb1.setSelected(true); ans[1]="a";break;
                    case 'b':jb2.setSelected(true);ans[2]="b";break;
                    case 'c':jb3.setSelected(true);ans[3]="c";break;
                    case 'd':jb4.setSelected(true);ans[4]="d";break;
                    //default: ura.setText("");
                }if(jtp.getSelectedIndex()==1)
                input.setText(ans1);
                l--;}while(l>0);

        } }catch (Exception e){System.out.println("cb po"+e.getMessage());
        }
        //jtp.setSelectedIndex(ob.qtype(tf2.getText(),cb1.getSelectedItem()));

        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ItemStateChanged

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        jb1.requestFocus();
                
             for(int i=3;i<=40;i++) 
cb3.addItem(""+i);
             
             
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        //ans+="d";        // TODO add your handling code here:
        if(jb4.isSelected())      ans[4]="d";
        else if(jb4.isSelected()==false) ans[4]="";
        ans1="";for(int i=1;i<5;i++)
        ans1+=(ans[i]);ura.setText("");ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
      //  if(single.isSelected()&&cb2.getSelectedIndex()!=2&&(jb4.isSelected())) 
            save.doClick();

        //if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2)next.doClick();
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        //ans+="c";        // TODO add your handling code here:
        if(jb3.isSelected())      ans[3]="c";
        else if(jb3.isSelected()==false) ans[3]="";
        ans1="";for(int i=1;i<5;i++)
        ans1+=(ans[i]);ura.setText("");ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
        if(single.isSelected()&&cb2.getSelectedIndex()!=2&&(jb3.isSelected()))     save.doClick();
    }//GEN-LAST:event_jb10ActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        //ans+="b"; // TODO add your handling code here:
        if(jb2.isSelected())      ans[2]="b";
        else if(jb2.isSelected()==false) ans[2]="";
        ans1="";for(int i=1;i<5;i++)
        ans1+=(ans[i]);ura.setText("");ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
        if(single.isSelected()&&cb2.getSelectedIndex()!=2&&(jb2.isSelected()))     save.doClick();

        //if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2)save.doClick();
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
        if(jb1.isSelected())      ans[1]="a";
        else if(jb1.isSelected()==false) ans[1]="";
        ans1="";for(int i=1;i<5;i++)
        ans1+=(ans[i]);ura.setText(""+cb1.getSelectedItem()+":-"+ans1);
        if(single.isSelected()&&cb2.getSelectedIndex()!=2&&(jb3.isSelected()))     save.doClick();

        //if(jRadioButton2.isSelected()&&cb2.getSelectedIndex()!=2)save.doClick();

        // TODO add your handling code here:
    }//GEN-LAST:event_jb12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton clear;
    private javax.swing.JButton commit;
    private javax.swing.JTextField database;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jb1;
    private javax.swing.JToggleButton jb10;
    private javax.swing.JToggleButton jb11;
    private javax.swing.JToggleButton jb12;
    private javax.swing.JToggleButton jb2;
    private javax.swing.JToggleButton jb3;
    private javax.swing.JToggleButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JToggleButton jb9;
    private javax.swing.JTabbedPane jtp;
    private javax.swing.JButton next;
    private javax.swing.JTextField rans1;
    private javax.swing.JButton save;
    private javax.swing.JTextField tf2;
    private javax.swing.JToggleButton time;
    private javax.swing.JTextField ura;
    // End of variables declaration//GEN-END:variables
}
