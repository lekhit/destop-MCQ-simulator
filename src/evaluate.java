/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lekhit borole
 */import java.sql.*;
 import java.lang.*;
 import javax.swing.table.*;
public class evaluate extends javax.swing.JFrame {
Connection c;Statement s;ResultSet rs;
    /**
     * Creates new form evaluate
     */
    public evaluate() {
        initComponents();
    }
int ev(String paper,String database){int result=0;
String rans,ans,q;  int r,w,p,qtype;int qtot=0,tot=0;  char a;
try {
        Class.forName("java.sql.Driver");
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,"root","1234");
         s=c.createStatement();
         
         rs=s.executeQuery("select count(*) from "+paper);rs.absolute(1);int tq=rs.getInt(1);
        
         for(int i=1;i<=tq;i++)
         {q="select rans,ans,partial,right,wrong from "+paper+" where question="+i+";";
         rs=s.executeQuery(q);
         rs.absolute(1);
         ans=rs.getString("ans");
         rans=rs.getString("rans");
         r=rs.getInt("right");
                 w=rs.getInt("wrong");         p=rs.getInt("partial");qtype=rs.getInt("qtype");
if(ans.length()==rans.length())
{
         if(ans.equals(rans))
         {qtot+=r;}//else negative
         else 
         {qtot+=w;}
             }
if(ans.length()<rans.length())
    for(int j=0;j<ans.length();j++)
    {if(ans.charAt(j)==rans.charAt(j))
            qtot+=p;
    else 
    {qtot+=w; break;}
    
    }
result=qtot;
    tot+=qtot;//totL DONE NOT USED
         }
    } catch (Exception e) {
    }
return(result);}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        database = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        paper1R = new javax.swing.JTextField();
        paper2 = new javax.swing.JTextField();
        paper1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("evaluate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        database.setText("jeeadv");

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "rans", "ans", "question total", "right", "wrong", "partial", "question"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb2);

        jTabbedPane1.addTab("tab2", jScrollPane2);

        paper1R.setText("paper1");

        paper2.setText("paper2");

        paper1.setText("crt1apaper1");
        paper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper1ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("chapter");

        jCheckBox2.setText("test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(database, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paper1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paper1R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paper2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(database, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paper1R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result=0;char  ans1;
        DefaultTableModel tm=(DefaultTableModel)tb1.getModel();       
        DefaultTableModel tm1=(DefaultTableModel)tb2.getModel();
tm.setRowCount(0);tm1.setRowCount(0);
String rans,ans,q=null;  int r=4,w=-2,p=1,qtype;int qtot=0,tot=0;String paper=paper1.getText();
        for(int pp=0;pp<2;pp++)
try {
           Class.forName("java.sql.Driver");
         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database.getText(),"root","1234");
         s=c.createStatement(); 
         s.executeUpdate("update "+paper+" set ans='00000.00' where ans='';");
         rs=s.executeQuery("select count(*) from "+paper);rs.absolute(1);int tq=rs.getInt(1);
        
         for(int i=1;i<=tq;i++)
         {qtot=0;
         if (jCheckBox2.isSelected())
         {q="select rans,ans,wrong1,right1,partial1  from "+paper+" where question="+i+" ;";
         r=rs.getInt("right1");
                 w=rs.getInt("wrong1");        
                 p=rs.getInt("partial1");}
         if (jCheckBox1.isSelected())
         {q="select rans,ans  from "+paper+" where question="+i+" ;";
         r=4;w=0;p=0;}
         rs=s.executeQuery(q);
         rs.absolute(1);
         ans=rs.getString("ans");
         rans=rs.getString("rans");
        rans=rans.toLowerCase();ans=ans.toLowerCase();
         
if(ans.length()==rans.length())
{
         if(ans.equals(rans))
         {qtot+=r;}//else negative
         else if(ans.equals("00000.00"))
             qtot=0;
         else
         {qtot+=w;
         }
             }
else if(ans.length()<rans.length())
    for(int j=0;j<ans.length();j++)
        //CharSequence cp;
    {//String p2[]=new String[5]; //ans.contains(q)
    {ans1=ans.charAt(j);
        //if(ans.charAt(j)==rans.charAt(j))
        if(rans.indexOf(ans1)>=0)
            qtot+=p;
        else if(rans.indexOf(ans1)==-1)
        {qtot+=w;break;}
    
    
    }}
else if(ans.equals("00000.00"))
             qtot=0;
else
   qtot+=w;
String s[]={rans,ans,""+qtot,""+r,""+w,""+p,""+i};
if(pp==0)
    tm.addRow(s);
           if(pp==1){

tm1.addRow(s);}
result=qtot;

    tot+=qtot;
//totL DONE NOT USED
         }       if(pp==0)
  paper1R.setText(""+tot);
         if(pp==1)
jTextField2.setText(""+tot);
         paper=paper2.getText(); 

    } catch (Exception e) {System.out.println(" ev "+e.getMessage());
    }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void paper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
CharSequence cp="abcd";
String sp[]=new String[6];
for(int k=0;k<cp.length();k++)
    sp[k]=""+cp.charAt(k);
String s1p="abd";
char a[]=new char[5];
//for(int k=0;k<cp.length();k++)
           // System.out.println(a[k]);
    char ap1='a';
switch(ap1){
    case 'a':a[1]=ap1;break;
    case 'b':a[2]=ap1;break;
        case 'c':a[3]=ap1;break;
            case 'd':a[4]=ap1;break;


}
        System.out.println(s1p.indexOf("c"));
//System.out.println(s1p.toCharArray(cp));
        cp.charAt(1);//System.out.println(cp.equals("abc"));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evaluate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField database;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField paper1;
    private javax.swing.JTextField paper1R;
    private javax.swing.JTextField paper2;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
