package View;

import javax.swing.*;
import java.awt.*;

public class Frm_HojaDeVida extends JFrame{
    private JLabel lbl_titulo;
    private JPanel Panel_1;
    private JTextField txt_nombre;
    private JTextField txt_apellido;
    private JTextField txt_edad;
    private JTextField txt_cedula;
    private JLabel lbl_nombre;
    private JLabel lbl_apellido;
    private JLabel lbl_edad;
    private JLabel lbl_Cedula;
    private JLabel lbl_estadocivil;
    private JComboBox comboBox_genero;
    private JLabel lbl_genero;
    private JRadioButton rbtn_masculino;
    private JRadioButton rbtn_femenino;
    private JRadioButton rbtn_otro;
    private JLabel lbl_provincia;
    private JComboBox comboBox_provincias;
    private JLabel lbl_informacionPersonal;
    private JLabel lbl_cargo;
    private JCheckBox chk_programador;
    private JCheckBox chk_despachador;
    private JCheckBox chk_recepcionista;
    private JCheckBox chk_secretario;
    private JLabel lbl_informacionLaboral;
    private JTextField txt_experiencia;
    private JLabel lbl_referencias;
    private JLabel lbl_experiencia;
    private JTextField txt_referencias;
    private JButton btn_enviar;

    public Frm_HojaDeVida() throws HeadlessException {
        setContentPane(Panel_1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,800);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Frm_HojaDeVida hoja = new Frm_HojaDeVida();
        hoja.setVisible(true);
    }
}
