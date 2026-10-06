import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Kalkulator extends JFrame {
    private JTextField layar = new JTextField("0");
    private double angka1 = 0;
    private String op = "";
    private boolean baru = true;

    public Kalkulator() {
        setTitle("Kalkulator");
        setSize(340, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Tampilan Layar
        layar.setFont(new Font("Segoe UI", Font.BOLD, 32));
        layar.setHorizontalAlignment(JTextField.RIGHT);
        layar.setEditable(false);
        layar.setBackground(Color.WHITE);
        layar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            new EmptyBorder(10, 10, 10, 10)));
        add(layar, BorderLayout.NORTH);

        // Panel Tombol 5x4
        JPanel panel = new JPanel(new GridLayout(5, 4, 8, 8));
        String[] tombol = {
            "AC", "⌫", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ",", "="
        };

        for (String t : tombol) {
            JButton btn = new JButton(t);
            btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
            btn.setFocusPainted(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            if (t.equals("=")) { btn.setBackground(new Color(46, 204, 113)); btn.setForeground(Color.WHITE); }
            else if ("÷×-+".contains(t)) { btn.setBackground(new Color(52, 152, 219)); btn.setForeground(Color.WHITE); }
            else if (t.equals("AC") || t.equals("⌫") || t.equals("%")) { btn.setBackground(new Color(235, 77, 75)); btn.setForeground(Color.WHITE); }
            else { btn.setBackground(Color.WHITE); }

            btn.addActionListener(e -> tekan(t));
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);
    }

    private void tekan(String t) {
        if ("0123456789".contains(t)) {
            layar.setText(baru || layar.getText().equals("0") ? t : layar.getText() + t);
            baru = false;
        } else if (t.equals(",")) {
            if (baru) { layar.setText("0."); baru = false; }
            else if (!layar.getText().contains(".")) { layar.setText(layar.getText() + "."); }
        } else if (t.equals("AC")) { // Reset Total
            layar.setText("0"); angka1 = 0; op = ""; baru = true;
        } else if (t.equals("⌫")) { // Hapus 1 Karakter
            String txt = layar.getText();
            layar.setText(txt.length() > 1 ? txt.substring(0, txt.length() - 1) : "0");
            if (layar.getText().equals("0")) baru = true;
        } else if (t.equals("+/-")) {
            double v = -Double.parseDouble(layar.getText());
            layar.setText(v % 1 == 0 ? String.format("%.0f", v) : String.valueOf(v));
        } else if (t.equals("%")) {
            layar.setText(String.valueOf(Double.parseDouble(layar.getText()) / 100));
            baru = true;
        } else if (t.equals("=")) {
            if (!op.isEmpty()) {
                double a2 = Double.parseDouble(layar.getText());
                double h = op.equals("+")?angka1+a2 : op.equals("-")?angka1-a2 : op.equals("×")?angka1*a2 : (a2!=0?angka1/a2:0);
                layar.setText(h % 1 == 0 ? String.format("%.0f", h) : String.valueOf(h));
                op = ""; baru = true;
            }
        } else {
            angka1 = Double.parseDouble(layar.getText()); op = t; baru = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Kalkulator().setVisible(true));
    }
}