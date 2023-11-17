package Login;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.*;

import Main.LoggedMain;
import SignUp.SignUp;

public class Login extends JFrame implements ActionListener{
    static JFrame front=new JFrame();
    static JLabel username=new JLabel("USERNAME");
    static JLabel password=new JLabel("PASSWORD");
    static JTextField user=new JTextField();
    static JPasswordField pass=new JPasswordField();
    static JButton login=new JButton("LOGIN");
    static JButton reset=new JButton("RESET");
    static JButton signup=new JButton("signup");
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, InterruptedException {
        new Login();
    }
    public Login() throws InterruptedException{
        front.setTitle("LOGIN FORM");
        front.setSize(2000,1000);
        front.setLayout(null);
        front.getContentPane().setBackground(Color.CYAN);
        front.setDefaultCloseOperation(EXIT_ON_CLOSE);
        front.setVisible(true);
        
        front.add(user);
        user.setVisible(true);
        user.setBounds(900, 200, 250, 30);

        front.add(pass);
        pass.setVisible(true);
        pass.setBounds(900,260,250,30);
        
        front.add(username);
        username.setVisible(true);
        username.setBounds(800, 200, 250, 30);  
        
        front.add(password);
        password.setVisible(true);
        password.setBounds(800, 260, 250, 30);

        front.add(login);
        login.setVisible(true);
        login.setBounds(850, 320, 100, 30);
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                boolean result;
                    try {
                        result = LoginCheck.check(user.getText(), pass.getText());
                        if(result==true){
                            JOptionPane.showMessageDialog(front,"login Successfully");
                            user.setText("");pass.setText("");
                            new LoggedMain();
                            System.out.println("logged in Successfully");
                        }
                        else{
                            JOptionPane.showMessageDialog(front,"Incorrect username or password.\nTry Again");
                        }
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
            }
        });

        front.add(reset);
        reset.setVisible(true);
        reset.setBounds(990, 320, 100, 30);
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                user.setText("");
                pass.setText("");
            }
        });

        front.add(signup);
        signup.setVisible(true);
        signup.setBounds(920, 370, 100, 30);
        signup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new SignUp();
            }
        });

        ContentPanel contentpanel=new ContentPanel();
        front.add(contentpanel);
        contentpanel.setSize(2000,1000);
        contentpanel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
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

