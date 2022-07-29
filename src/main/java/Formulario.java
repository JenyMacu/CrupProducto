
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Formulario {

    JFrame f = new JFrame();
    JPanel jp = new JPanel();
    
    public void form(){
    f.setTitle("Registro de productos");
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setBounds(50, 175, 400, 600);
    f.setVisible(true);
    jp.setBackground(Color.cyan);
    jp.setLayout(null);
    f.add(jp);
    
        JLabel l1 = new JLabel("Código");
        l1.setBounds(50, 50, 300, 25);
        jp.add(l1);
        
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 25);
        jp.add(t1);
        
        JLabel l2 = new JLabel("Nombre");
        l2.setBounds(50, 125, 100, 25);
        jp.add(l2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(150, 125, 150, 25);
        jp.add(t2);
        
        JLabel l3 = new JLabel("Cantidad");
        l3.setBounds(50, 160, 100, 100);
        jp.add(l3);
        
        JTextField t3 = new JTextField();
        t3.setBounds(150, 200, 150, 25);
        jp.add(t3);
        
        JLabel l4 = new JLabel("Lugar");
        l4.setBounds(50, 225, 100, 100);
        jp.add(l4);
        
        JTextField t4 = new JTextField();
        t4.setBounds(150, 275, 150, 25);
        jp.add(t4);
        
        JLabel l5 = new JLabel("fecha");
        l5.setBounds(50, 300, 100, 100);
        jp.add(l5);
        
        JTextField t5 = new JTextField();
        t5.setBounds(150, 350, 150, 25);
        jp.add(t5);
               
        JButton b1 = new JButton("Guardar");
        b1.setBounds(150, 425, 100, 25);
        jp.add(b1);
        
        ActionListener guardar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
            Producto prod = new Producto();
                prod.crear(Integer.parseInt(t1.getText()), t2.getText(), Integer.parseInt(t3.getText()), t4.getText(), t5.getText());
            }
        };
        
      b1.addActionListener(guardar);
     
}
     
    public static void main(String[] args) {
       Formulario frm = new Formulario();
       frm.form();        
    }
    
}
