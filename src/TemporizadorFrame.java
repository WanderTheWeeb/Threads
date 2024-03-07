import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemporizadorFrame extends JFrame {

    private Timer timer;
    private int[] contadores = new int[3];
    private JLabel[] labels = new JLabel[3];
    private JButton[] buttons = new JButton[3];
    private boolean[] isCounting = new boolean[3];

    public TemporizadorFrame() {
        for (int i = 0; i < 3; i++) {
            contadores[i] = 0;
            isCounting[i] = false;

            JLabel label = new JLabel("Contador: 0");
            label.setBounds(100 + i * 250, 50, 200, 50);
            this.add(label);
            labels[i] = label;

            JButton button = new JButton("Iniciar/Detener");
            button.setBounds(100 + i * 250, 100, 200, 50);
            this.add(button);
            buttons[i] = button;

            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!isCounting[finalI]) {
                        isCounting[finalI] = true;
                        if (timer == null) {
                            timer = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    for (int j = 0; j < 3; j++) {
                                        if (isCounting[j]) {
                                            contadores[j]++;
                                            labels[j].setText("Contador: " + contadores[j]);
                                        }
                                    }
                                }
                            });
                            timer.start();
                        }
                    } else {
                        isCounting[finalI] = false;
                    }
                }
            });
        }
    }
}
