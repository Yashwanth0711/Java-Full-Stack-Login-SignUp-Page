package Books;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import Cart.Cart;
import Dashboard.Dashboard;
import Login.Login;
import Main.Main;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Books implements MenuListener {
    static JFrame frame=new JFrame();
    static JMenuBar menubar=new JMenuBar();
    static JMenu file=new JMenu("File");
    static JMenu books=new JMenu("Books");
    static JMenu cart=new JMenu("Cart");
    static JMenu logged_in=new JMenu("Log in/Sign Up");
    static JMenuItem dashboard=new JMenuItem("Dashboard",new ImageIcon("Images/profile.png"));
    static JMenuItem logout=new JMenuItem("Log out");
    public static void main(String[] args){
        frame.setVisible(true);
        frame.setBounds(0, 0, 2000, 1000);
        frame.setLayout(null);
        frame.setTitle("BOOKS");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        new Books();
    }
    Books(){
        menubar.setSize(10, 10);
        menubar.add(file);
        file.setVisible(true);
        file.setMnemonic(KeyEvent.VK_0);
        file.addMenuListener(new MenuListener(){

            @Override
            public void menuCanceled(MenuEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void menuSelected(MenuEvent e) {
                try {
                    new Login();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                
            }
            
        });
        

        menubar.add(books);
        books.setVisible(true);
        books.setMnemonic(KeyEvent.VK_0);
        books.addMenuListener(new MenuListener(){

            @Override
            public void menuCanceled(MenuEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void menuSelected(MenuEvent e) {
                new Books();
            }
            
        });


        menubar.add(cart);
        cart.setVisible(true);
        cart.setMnemonic(KeyEvent.VK_F);
        cart.addMenuListener(new MenuListener(){

            @Override
            public void menuCanceled(MenuEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void menuSelected(MenuEvent e) {
                new Cart();
                
            }
            
        });

        MenuItemListener menuItemListener=new MenuItemListener();

        logged_in.add(dashboard);
        dashboard.setVisible(true);
        dashboard.setMnemonic(KeyEvent.VK_F);
        dashboard.addActionListener(menuItemListener);


        logged_in.add(logout);
        logout.setVisible(true);
        logout.setMnemonic(KeyEvent.VK_F);
        logout.addActionListener(menuItemListener);

        menubar.add(Box.createHorizontalGlue());
        menubar.add(logged_in);
        logged_in.setVisible(true);
        logged_in.setMnemonic(KeyEvent.VK_F);


        frame.setJMenuBar(menubar);
        menubar.setLayout(new BoxLayout(menubar,5));

        
    }
    @Override
    public void menuCanceled(MenuEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void menuDeselected(MenuEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void menuSelected(MenuEvent e) {
        // TODO Auto-generated method stub
        
    }
}

class MenuItemListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()=="dashboard"){
            JOptionPane.showMessageDialog(Books.frame,"dashboard");
            new Dashboard();
        }

        if(e.getSource()=="logout"){
            new Main();
        }
    }
    
}