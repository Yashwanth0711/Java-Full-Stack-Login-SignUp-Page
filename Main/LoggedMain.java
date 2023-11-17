package Main;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import Login.Login;

/**
 * Main
 */
public class LoggedMain implements MenuListener , ActionListener {
    private static JFrame frame=new JFrame();
    private static JMenuBar menubar=new JMenuBar();
    private static JMenu menu=new JMenu("File");
    private static JMenu dashboard=new JMenu("Dashboard");
    private static JMenu books=new JMenu("Books");
    private static JMenu logged_in=new JMenu("logged in");
    private static JMenuItem Dashboard=new JMenuItem("Dashboard", new ImageIcon("Images/profile.png"));
    private static JMenuItem logout=new JMenuItem("Log out");
    public static void main(String[] args) {
        frame.setVisible(true);
        frame.setBounds(0,0,2000,1000);
        frame.setLayout(null);
        frame.setTitle("BOOKSTORE");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        new LoggedMain();
    }
    public LoggedMain(){
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


        logged_in.setVisible(true);
        logged_in.setMnemonic(KeyEvent.VK_F);


        logged_in.add(Dashboard);
        Dashboard.setVisible(true);
        Dashboard.setMnemonic(KeyEvent.VK_F);
        Dashboard.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Main();
            }
        });


        logged_in.add(logout);
        logout.setVisible(true);
        logout.setMnemonic(KeyEvent.VK_F);
        logout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Main();
                System.out.println("logged out");
            }
        });

        menubar.add(Box.createHorizontalGlue());
        menubar.add(logged_in);

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
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}

