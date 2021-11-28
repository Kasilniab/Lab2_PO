import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonwerterApp extends JFrame{
    private JPanel panel1;
    private JTextField celcjusz;
    private JTextField farenheit;
    private JButton konwertuj;
    private JButton wyczysc;
    private JRadioButton czcionkaMalaRadioButton;
    private JRadioButton czcionkaSredniaRadioButton;
    private JRadioButton czcionkaDuzaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetujButton;
    private JButton wyjscieButton;


    public KonwerterApp(){
        super("Konwertowanie stopni C -> F");
        this.setContentPane(panel1);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object object = e.getSource();

                if(object == konwertuj){
                    double tempCelcjusz = Double.parseDouble(celcjusz.getText());
                    farenheit.setText(String.valueOf(32.0 + (9.0/5.0) * tempCelcjusz));
                } else if(object == wyczysc){
                    celcjusz.setText("");
                    farenheit.setText("");
                    if(wielkieLiteryCheckBox.isSelected()) wielkieLiteryCheckBox.setSelected(false);
                    if(czcionkaMalaRadioButton.isSelected()) czcionkaMalaRadioButton.setSelected(false);
                    if(czcionkaSredniaRadioButton.isSelected()) czcionkaSredniaRadioButton.setSelected(false);
                    if(czcionkaDuzaRadioButton.isSelected()) czcionkaDuzaRadioButton.setSelected(false);
                } else if(object == wyjscieButton){
                    dispose();
                } else if(object == wielkieLiteryCheckBox){
                    if(wielkieLiteryCheckBox.isSelected()) {
                        farenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
                        celcjusz.setFont(new Font("SansSerif", Font.BOLD, 18));
                    }
                    else {
                        farenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
                        celcjusz.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    }
                } else if(object == czcionkaDuzaRadioButton){
                    farenheit.setFont(new Font("SansSerif", Font.PLAIN, 20));
                    celcjusz.setFont(new Font("SansSerif", Font.PLAIN, 20));
                } else if(object == czcionkaSredniaRadioButton){
                    farenheit.setFont(new Font("SansSerif", Font.PLAIN, 18));
                    celcjusz.setFont(new Font("SansSerif", Font.PLAIN, 18));
                } else if(object == czcionkaMalaRadioButton){
                    farenheit.setFont(new Font("SansSerif", Font.PLAIN, 10));
                    celcjusz.setFont(new Font("SansSerif", Font.PLAIN, 10));
                } else if(object == resetujButton) {
                    farenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    celcjusz.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
        };
        konwertuj.addActionListener(actionListener);
        wyczysc.addActionListener(actionListener);
        wyjscieButton.addActionListener(actionListener);
        resetujButton.addActionListener(actionListener);
        wielkieLiteryCheckBox.addActionListener(actionListener);
        czcionkaSredniaRadioButton.addActionListener(actionListener);
        czcionkaMalaRadioButton.addActionListener(actionListener);
        czcionkaDuzaRadioButton.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        KonwerterApp app = new KonwerterApp();
        app.setVisible(true);
        app.setSize(500,250);
    }
}
