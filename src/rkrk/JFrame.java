package rkrk;

public class JFrame {
    
        public static void main(String agrs[]){
    
        String title = "Пробник";
        
        JFrame frame = new JFrame();
        Fon object = new fon();
 
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        object.add(new fon());
        
        
    }
    
 
}