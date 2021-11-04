import javax.swing.*;
import java.awt.event.*;

/* La clase JFrame encapsula el concepto de una ventana, para implementar una aplicación que muestre una ventana debemos plantear una clase que herede de la clase JFrame e implemente a a ActionListener para el evento del botón*/
public class Ventana extends JFrame {

    /* Definimos variables. */
    private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7, textfield8, textfield9;
    private JLabel nombre, apellidos, sexo, direccion, telefono, NIF, codigopost, email, contraseña, pais, provincia, poblacion;
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;
    /*private String Es;*/


    /* En el constructor de la clase llamamos al método heredado de la clase JFrame llamado setLayout y le pasamos como parámetro un valor null, con esto estamos informándole a la clase JFrame que utilizaremos posicionamiento absoluto para los controles visuales dentro del JFrame*/
    public Ventana() {

        /* Configuración del JFrame */
        setLayout(null);
        setBounds(0,0,650,800);
        setTitle("Formulario");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Etiquetas */
        nombre=new JLabel("Nombre:");
        nombre.setBounds(10,10,100,30);
        add(nombre);

        apellidos=new JLabel("Apellidos:");
        apellidos.setBounds(10,60,100,30);
        add(apellidos);

        sexo=new JLabel("Sexo:");
        sexo.setBounds(10,110,100,30);
        add(sexo);

        direccion=new JLabel("Dirección:");
        direccion.setBounds(10,160,100,30);
        add(direccion);

        telefono=new JLabel("Teléfono:");
        telefono.setBounds(10,210,100,30);
        add(telefono);

        NIF=new JLabel("NIF:");
        NIF.setBounds(10,260,100,30);
        add(NIF);

        codigopost=new JLabel("Código Postal:");
        codigopost.setBounds(10,310,100,30);
        add(codigopost);

        email=new JLabel("Email:");
        email.setBounds(10,360,100,30);
        add(email);

        contraseña=new JLabel("Contraseña:");
        contraseña.setBounds(10,410,100,30);
        add(contraseña);

        pais=new JLabel("País:");
        pais.setBounds(10,460,100,30);
        add(pais);

        provincia=new JLabel("Provincia:");
        provincia.setBounds(10,510,100,30);
        add(provincia);

        poblacion=new JLabel("Población:");
        poblacion.setBounds(10,560,100,30);
        add(poblacion);



        /* Campos de texto */
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,30);
        add(textfield1);

        textfield2=new JTextField();
        textfield2.setBounds(120,60,150,30);
        add(textfield2);

        textfield3=new JTextField();
        textfield3.setBounds(120,110,150,30);
        add(textfield3);

        textfield4=new JTextField();
        textfield4.setBounds(120,160,150,30);
        add(textfield4);

        textfield5=new JTextField();
        textfield5.setBounds(120,210,150,30);
        add(textfield5);

        textfield6=new JTextField();
        textfield6.setBounds(120,260,150,30);
        add(textfield6);

        textfield7=new JTextField();
        textfield7.setBounds(120,310,150,30);
        add(textfield7);

        textfield8=new JTextField();
        textfield8.setBounds(120,360,150,30);
        add(textfield8);

        textfield9=new JTextField();
        textfield9.setBounds(120,410,150,30);
        add(textfield9);



        //Añado el ComboBox con sus items y su ItemListener, así como la etiqueta
        combo1=new JComboBox();
        combo1.setBounds(120,460,150,30);
        add(combo1);

        combo1.addItem("País");
        combo1.addItem("Francia");
        combo1.addItem("España");
        combo1.addItem("Estados Unidos");
        combo1.addItem("China");
        combo1.addItem("Italia");
        combo1.addItem("Turquía");
        combo1.addItem("México");
        combo1.addItem("Tailandia");
        combo1.addItem("Alemania");
        combo1.addItem("Reino Unido");



        combo2=new JComboBox();
        combo2.setBounds(120,510,150,30);
        add(combo2);

        /*if (combo1 = "España"){

            combo2.addItem("País");
            combo2.addItem("Francia");
            combo2.addItem("España");
            combo2.addItem("Estados Unidos");
            combo2.addItem("China");
            combo2.addItem("Italia");
            combo2.addItem("Turquía");
            combo2.addItem("México");
            combo2.addItem("Tailandia");
            combo2.addItem("Alemania");
            combo2.addItem("Reino Unido");

        }
        */


        /* Muestro el JFrame */
        setVisible(true);

    }



    /* En el método main creamos un objeto de la clase Ejemplo6 */
    public static void main(String[] args) {

        new Ventana();

    }

}