import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter extends JFrame{
    private JButton clickToConvertButton;
    private JTextField TF_Temp;
    private JTextField Temp_C;
    private JPanel Converter;

    private double F;
private double C;

    public Converter() {
        clickToConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F = Double.valueOf(TF_Temp.getText());
                C = (F-32) * (5/9f);
                Temp_C.setText(String.valueOf(C));

            }
        });

        this.setContentPane(Converter);
        this. setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this. setSize (300, 360);
        this.setVisible(true);

    }
}
