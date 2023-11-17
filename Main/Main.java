package Main;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import Login.Login;
/**
 * Main
 */
public class Main implements MenuListener{
    private static JFrame frame=new JFrame();
    private static JMenuBar menubar=new JMenuBar();
    private static JMenu menu=new JMenu("File");
    private static JMenu dashboard=new JMenu("Dashboard");
    private static JMenu books=new JMenu("Books");
    private static JMenu login=new JMenu("login");
   // private static JLabel label=new JLabel();
    public static void main(String[] args) {
        frame.setVisible(true);
        frame.setBounds(0, 0, 2000, 1000);
        frame.setLayout(null);
        frame.setTitle("BOOKSTORE");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        new Main();
    }
    public Main(){
        menubar.setVisible(true);
        menubar.setSize(10, 10);

        menubar.add(menu);
        menu.setVisible(true);
        menu.setMnemonic(KeyEvent.VK_F);
        menu.addMenuListener(new MenuListener() {

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
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            }
            
        });

        menubar.add(dashboard);
        dashboard.setVisible(true);
        dashboard.setMnemonic(KeyEvent.VK_F);
        dashboard.addMenuListener(new MenuListener() {

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
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            }
            
        });

        menubar.add(books);
        books.setVisible(true);
        books.setMnemonic(KeyEvent.VK_0);
        books.addMenuListener(new MenuListener() {

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
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            }
            
        });

        
        menubar.add(Box.createHorizontalGlue());

        menubar.add(login);
        login.setVisible(true);
        login.setMnemonic(KeyEvent.VK_F);
        login.addMenuListener(new MenuListener() {

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
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            }
            
        });

    


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

