package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
    private JComboBox comboBox_estadoCivil;
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
        ButtonGroup genero = new ButtonGroup();
        genero.add(rbtn_masculino);
        genero.add(rbtn_femenino);
        genero.add(rbtn_otro);
        genero.clearSelection();
        btn_enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarArchivo();
            }
        });
    }

    public void guardarArchivo() {
            String motivos = "";
            if(txt_nombre.getText() == null || txt_nombre.getText().isEmpty()){
                motivos += "Nombres vacios\n";
            }
            if(txt_apellido.getText() == null || txt_apellido.getText().isEmpty()){
                motivos += "Apellidos vacios\n";
            }
            if(txt_edad.getText() == null || txt_edad.getText().isEmpty()){
                motivos += "Edad vacia\n";
            }
            if(txt_cedula.getText() == null || txt_cedula.getText().isEmpty()){
                motivos += "Cedula vacia\n";
            }
            if(txt_experiencia.getText() == null || txt_experiencia.getText().isEmpty()){
                motivos += "Experiencia vacia\n";
            }
            if(txt_referencias.getText() == null || txt_referencias.getText().isEmpty()){
                motivos += "Referencias vacias\n";
            }
            if (!chk_programador.isSelected() && !chk_despachador.isSelected()
                    && !chk_recepcionista.isSelected() && !chk_secretario.isSelected()) {
                motivos += "Debe seleccionar al menos un cargo\n";
            }
            if(!motivos.isEmpty()){
                JOptionPane.showMessageDialog(null,"Error al guardar hoja de vida por los siguientes motivos: \n" + motivos);
                return;
            }

            try{
            FileWriter crear = new FileWriter("hoja_de_vida.txt");
            PrintWriter archivo = new PrintWriter(crear);
            archivo.println("=== HOJA DE VIDA ===");
            archivo.println("-- INFORMACION PERSONAL --");
            archivo.println("Nombre: " + txt_nombre.getText());
            archivo.println("Apellido: " + txt_apellido.getText());
            archivo.println("Edad: " + txt_edad.getText());
            archivo.println("Cedula: " + txt_cedula.getText());
            String sexo = "";
            if(rbtn_masculino.isSelected()){
                sexo = "Masculino";
            } else if (rbtn_femenino.isSelected()) {
                sexo = "Femenino";
            } else if (rbtn_otro.isSelected()){
                sexo = "Prefiero no decirlo";
            }
            archivo.println("Genero: " + sexo);
            archivo.println("Estado civil: " + comboBox_estadoCivil.getSelectedItem());
            archivo.println("Provincia: " + comboBox_provincias.getSelectedItem());
            archivo.println("-- INFORMACION LABORAL -- ");
            String cargo ="";
            if (chk_programador.isSelected()){
                cargo += "Programador/a";
            }
            if(chk_despachador.isSelected()){
                cargo += "- Despachador/a";
            }
            if (chk_secretario.isSelected()){
                cargo += "- Secreatario/a";
            }
            if(chk_recepcionista.isSelected()){
                cargo+= "- Recepcionista";
            }
            archivo.println("Cargo para postular: " + cargo);
            archivo.println("Experiencia laboral: " + txt_experiencia.getText());
            archivo.println("Referencias: " + txt_referencias.getText());
            archivo.close();
            JOptionPane.showMessageDialog(null,"Datos guardados con exito");
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_referencias.setText("");
            txt_experiencia.setText("");
            txt_cedula.setText("");
            txt_edad.setText("");
            comboBox_provincias.setSelectedIndex(0);
            comboBox_estadoCivil.setSelectedIndex(0);
            rbtn_masculino.setSelected(false);
            rbtn_femenino.setSelected(false);
            rbtn_otro.setSelected(false);
            chk_recepcionista.setSelected(false);
            chk_programador.setSelected(false);
            chk_secretario.setSelected(false);
            chk_despachador.setSelected(false);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo. \nMotivo/s:" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Frm_HojaDeVida hoja = new Frm_HojaDeVida();
        hoja.setVisible(true);
    }
}
