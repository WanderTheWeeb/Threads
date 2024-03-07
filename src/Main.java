import javax.swing.*;

class Main{
    public static void main(String[] args) {
        TemporizadorFrame ventana = new TemporizadorFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1000, 300);
        ventana.setLayout(null); // Establecer el diseño en nulo para colocar componentes manualmente
        ventana.setVisible(true);
    }
}
