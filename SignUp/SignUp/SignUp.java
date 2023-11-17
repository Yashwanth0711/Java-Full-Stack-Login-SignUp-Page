package SignUp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.*;
import Login.Login;


public class SignUp {
    static JFrame frame=new JFrame();
    static JLabel username=new JLabel("USERNAME :");
    static JLabel mailID=new JLabel("EMAIL ID :");
    static JLabel password=new JLabel("PASSWORD :");
    static JTextField user=new JTextField();
    static JTextField pass=new JTextField();
    static JTextField mailid=new JTextField();
    static JButton save=new JButton("SAVE");
    
    public static void main(String[] args) {
        new SignUp();
    }
    public SignUp(){
        frame.setVisible(true);
        frame.setBounds(0, 0, 2000, 1000);
        frame.setLayout(null);
        frame.setTitle("SIGNUP PAGE");
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.add(username);
        username.setVisible(true);
        username.setBounds(800, 200, 250, 30);  

        frame.add(mailID);
        mailID.setVisible(true);
        mailID.setBounds(800,260,250,30);
        
        frame.add(password);
        password.setVisible(true);
        password.setBounds(800, 320, 250, 30);

        frame.add(user);
        user.setVisible(true);
        user.setBounds(900, 200, 250, 30);

        frame.add(mailid);
        mailid.setVisible(true);
        mailid.setBounds(900, 260, 250, 30);

        frame.add(pass);
        pass.setVisible(true);
        pass.setBounds(900,320,250,30);


        frame.add(save);
        save.setVisible(true);
        save.setBounds(930,380, 100,30);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        String u=user.getText();
                        String m=mailid.getText();
                        String p=pass.getText();
                        String pattern="[a-zA-Z0-9]+@gmail.com";
                        if(u.trim().length()==0 && m.trim().length()==0 && p.trim().length()==0){
                            JOptionPane.showMessageDialog(frame, "Please fill all the fields.");
                            reset();
                        }else if(u.trim().length()==0){
                            JOptionPane.showMessageDialog(frame,"Enter username");
                            reset();
                        }else if(!Pattern.matches(pattern,m)){
                            JOptionPane.showMessageDialog(frame, "Enter Valid Mail-Id");
                            reset();
                        }else if(m.trim().length()==0){
                            JOptionPane.showMessageDialog(frame,"Enter mail-Id");
                            reset();                        
                        }else if(p.trim().length()==0){
                            JOptionPane.showMessageDialog(frame,"Enter password");
                            reset();
                        }else{
                        Addusers.add(u,m,p);
                        JOptionPane.showMessageDialog(frame,"Go to Login Page");
                        new Login();
                        }
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                
            }
        });
        ContentPanel contentpanel;
        try {
            contentpanel = new ContentPanel();
            frame.add(contentpanel);
            contentpanel.setSize(2000,1000);
            contentpanel.setVisible(true);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
    public static void reset(){
        user.setText("");
        pass.setText("");
        mailid.setText("");
    }
}
class ContentPanel extends JPanel{
    Image img=null;

    ContentPanel() throws InterruptedException{
        MediaTracker mt=new MediaTracker(this);
        img=Toolkit.getDefaultToolkit().getImage("Images/download.png");
        mt.addImage(img,0);
        mt.waitForAll();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,850,0,null);
    }
}

