import java.awt.*;
public class Main extends Frame{
    Main(){
        Button b = new Button("Click me");
        b.setBounds(30,180,80,30);
        add(b);
        setSize(300,300);
        setTitle("Example swing app");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        Main f=new Main();
    }
}