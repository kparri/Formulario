import com.sun.org.apache.xpath.internal.operations.Variable;
import sun.security.mscapi.CPublicKey;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* La clase JFrame encapsula el concepto de una ventana, para implementar una aplicación que muestre una ventana debemos plantear una clase que herede de la clase JFrame e implemente a a ActionListener para el evento del botón*/
public class Ventana extends JFrame implements ChangeListener, ActionListener {

    /* Definimos variables. */
    private JTextField textfield1, textfield2,textField3, textfield4, textfield5, textfield6, textfield7, textfield8, textfield9, textfield10;
    private JLabel nombre, apellidos, sexo, direccion, telefono, NIF, codigopost, email, contraseña, pais, provincia, poblacion, descripcion, carta;
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JTextArea textarea1;
    private JButton generar;
    JTextPane text = new JTextPane();
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3, menu4, menu5;
    private JMenuItem menuItem21, menuItem22, menuItem31, menuItem32, menuItem33,menuItem34,menuItem35,menuItem51, menuItem52, getMenuItem23,getMenuItem24,getMenuItem25;
    private  String textoJEditPane;



    /*private String Es;*/


    /* En el constructor de la clase llamamos al método heredado de la clase JFrame llamado setLayout y le pasamos como parámetro un valor null, con esto estamos informándole a la clase JFrame que utilizaremos posicionamiento absoluto para los controles visuales dentro del JFrame*/
    public Ventana() {

        /* Configuración del JFrame */
        setLayout(null);
        setBounds(0,0,750,1000);
        setTitle("Formulario");
        this.getContentPane().setBackground(Color.gray);
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

        descripcion=new JLabel("Resultado:");
        descripcion.setBounds(400,45,100,30);
        add(descripcion);

        carta=new JLabel("Carta de presentación:");
        carta.setBounds(10,630,150,30);
        setVisible(false);
        add(carta);





        /* Campos de texto */
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,30);
        add(textfield1);

        textfield2=new JTextField();
        textfield2.setBounds(120,60,150,30);
        add(textfield2);

        textField3=new JTextField();
        textField3.setBounds(120,560,150,30);
        add(textField3);

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

        textfield10=new JTextField();
        textfield10.setBounds(450,600,75,30);
        textfield10.setVisible(false);
        add(textfield10);





        //Añado el ComboBox con sus items y su ItemListener, así como la etiqueta
        combo1=new JComboBox();
        combo1.setBounds(120,460,150,30);
        add(combo1);

        combo1.addItem("País");
        combo1.addItem("Francia");
        combo1.addItem("España");
        combo1.addItem("Rusia");
        combo1.addItem("China");
        combo1.addItem("Italia");
        combo1.addItem("Turquía");
        combo1.addItem("México");
        combo1.addItem("Estados Unidos");
        combo1.addItem("Alemania");
        combo1.addItem("Reino Unido");



        combo2=new JComboBox();
        combo2.setBounds(120,510,150,30);
        add(combo2);




        combo1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                combo2.removeAllItems();
                if (e.getItem() == "Francia"){
                    combo2.addItem("Provincias");
                    combo2.addItem("Isla de Francia");
                    combo2.addItem("Berry");
                    combo2.addItem("Orleanesado");
                    combo2.addItem("Normandía");
                    combo2.addItem("Languedoc");
                    combo2.addItem("Lyonnais");
                    combo2.addItem("Delfinado");
                    combo2.addItem("Champaña");
                    combo2.addItem("Aunis");
                    combo2.addItem("Saintonge");

                }else if (e.getItem() == "España"){
                    combo2.addItem("Provincias");
                    combo2.addItem("La Rioja");
                    combo2.addItem("Madrid");
                    combo2.addItem("Barcelona");
                    combo2.addItem("Valencia");
                    combo2.addItem("Sevilla");
                    combo2.addItem("Alicante");
                    combo2.addItem("Malaga");
                    combo2.addItem("Murcia");
                    combo2.addItem("Cádiz");
                    combo2.addItem("La Coruña");

                }else if (e.getItem() == "Rusia"){
                    combo2.addItem("Estados");
                    combo2.addItem("Adigueya");
                    combo2.addItem("Altái");
                    combo2.addItem("Baskortostán");
                    combo2.addItem("Buriatia");
                    combo2.addItem("Daguestán");
                    combo2.addItem("Ingusetia");
                    combo2.addItem("Kabardia-Balkaria");
                    combo2.addItem("Kalmukia");
                    combo2.addItem("Karacháyevo-Cherkesia");
                    combo2.addItem("Carelia");

                }else if (e.getItem() == "China"){
                    combo2.addItem("Provincias");
                    combo2.addItem("Heilongjiang");
                    combo2.addItem("Jilin");
                    combo2.addItem("Liaoning");
                    combo2.addItem("Qinghai");
                    combo2.addItem("Gansu");
                    combo2.addItem("Shaanxi");
                    combo2.addItem("Hebei");
                    combo2.addItem("Sichuan");
                    combo2.addItem("Hubei");
                    combo2.addItem("Henan");

                }else if (e.getItem() == "Italia"){
                    combo2.addItem("Regiones");
                    combo2.addItem("Piamonte");
                    combo2.addItem("Lombardia");
                    combo2.addItem("Liguria");
                    combo2.addItem("Valle de Aosta");
                    combo2.addItem("Véneto");
                    combo2.addItem("Emilia Romaña");
                    combo2.addItem("Toscana");
                    combo2.addItem("Umbría");
                    combo2.addItem("Molise");
                    combo2.addItem("Abruzo");

                }else if (e.getItem() == "Turquia"){
                    combo2.addItem("Provincias");
                    combo2.addItem("Estambul");
                    combo2.addItem("Ankara");
                    combo2.addItem("Esmirna");
                    combo2.addItem("Bursa");
                    combo2.addItem("Adana");
                    combo2.addItem("Gaziantep");
                    combo2.addItem("Konya");
                    combo2.addItem("Antalya");
                    combo2.addItem("Kayseri");
                    combo2.addItem("Mersin");

                }else if (e.getItem() == "Mexico"){
                    combo2.addItem("Estados");
                    combo2.addItem("Aguascalientes");
                    combo2.addItem("Baja California");
                    combo2.addItem("Baja California Sur");
                    combo2.addItem("Campeche");
                    combo2.addItem("Chiapas");
                    combo2.addItem("Chihuahua");
                    combo2.addItem("Ciudad de México");
                    combo2.addItem("Coahuila de Zaragoza");
                    combo2.addItem("Colima");
                    combo2.addItem("Durango");

                }else if (e.getItem() == "Estados Unidos"){
                    combo2.addItem("Estados");
                    combo2.addItem("Misisipi");
                    combo2.addItem("Utah");
                    combo2.addItem("Vermont");
                    combo2.addItem("Pensilvania");
                    combo2.addItem("Nebraska");
                    combo2.addItem("Washington D. C.");
                    combo2.addItem("Arizona");
                    combo2.addItem("Rhode Island");
                    combo2.addItem("Misuri");
                    combo2.addItem("Nueva York");

                }else if (e.getItem() == "Alemania"){
                    combo2.addItem("Provincias");
                    combo2.addItem("Baden-Wurtemberg");
                    combo2.addItem("Baviera");
                    combo2.addItem("Berlín");
                    combo2.addItem("Brandeburgo");
                    combo2.addItem("Bremen");
                    combo2.addItem("Hamburgo");
                    combo2.addItem("Hesse");
                    combo2.addItem("Baja Sajonia");
                    combo2.addItem("Baja Sajonia");
                    combo2.addItem("Sajonia");

                }else if (e.getItem() == "Reino Unido"){
                    combo2.addItem("Regiones");
                    combo2.addItem("Sudeste de Inglaterra");
                    combo2.addItem("Gran Londres");
                    combo2.addItem("Noroeste de Inglaterra");
                    combo2.addItem("Este de Inglaterra");
                    combo2.addItem("Midlands del Oeste");
                    combo2.addItem("Sudoeste de Inglaterra");
                    combo2.addItem("Yorkshire y Humber");
                    combo2.addItem("Midlands del Este");
                    combo2.addItem("Nordeste de Inglaterra");
                    combo2.addItem("Inglaterra");

                }
                System.out.println(e.getItem());

            }
        });






        combo3=new JComboBox();
        combo3.setBounds(120,110,150,30);
        add(combo3);

        combo3.addItem("Sexo");
        combo3.addItem("Hombre");
        combo3.addItem("Mujer");
        combo3.addItem("Otro");
        combo3.addItem("Prefiero no decirlo");






        //Añado los 3 checkbox con su ChangeListener y la etiqueta
        checkBox1 = new JCheckBox("Español");
        checkBox1.setBounds(10,600,75,30);
        checkBox1.setBackground(Color.gray);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        checkBox2 = new JCheckBox("Inglés");
        checkBox2.setBounds(100,600,75,30);
        checkBox2.setBackground(Color.gray);
        checkBox2.addChangeListener(this);
        add(checkBox2);

        checkBox3 = new JCheckBox("Alemán");
        checkBox3.setBounds(190,600,75,30);
        checkBox3.setBackground(Color.gray);
        checkBox3.addChangeListener(this);
        add(checkBox3);

        checkBox4 = new JCheckBox("Italiano");
        checkBox4.setBounds(280,600,75,30);
        checkBox4.setBackground(Color.gray);
        checkBox4.addChangeListener(this);
        add(checkBox4);

        checkBox5 = new JCheckBox("Otros");
        checkBox5.setBounds(370,600,75,30);
        checkBox5.setBackground(Color.gray);
        checkBox5.addChangeListener(this);
        add(checkBox5);

        //if (checkBox5 = true){

        //}




        //Aññado el JTextArea para la descripción
        textarea1=new JTextArea();
        textarea1.setBounds(10,660,300,180);
        JScrollPane scroll = new JScrollPane(textarea1);
        scroll.setBounds(10,660,300,180);
        add(scroll);

        //Creación del boton
        generar=new JButton("Generar");
        generar.setBounds(10,860,90,35);
        add(generar);


        JTextPane text = new JTextPane(); //Incializamos el textPane
        setLayout(null); //Layout absoluto

        //Incializamos el scrollPane y le añadimos el editor
        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setBounds(400,80,300,300);
        add(scrollPane);


		/*Instanciamos una clase SimpleAttributeSet, que guardará los atributos
		 para un determinado texto: si es negrita, cursiva, fuente, etc.
		*/
        SimpleAttributeSet attrs = new SimpleAttributeSet();


        generar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
textoJEditPane = "Nombre: " + textfield1.getText() + "\nApellidos: " + textfield2.getText() + "\nSexo: " + combo3.getSelectedItem() + "\nDirección: " + textfield4.getText() +"\nTeléfono: " + textfield5.getText() +"\nNIF: " + textfield6.getText() +"\nCódigo Postal: " + textfield7.getText() +"\nEmail: " + textfield8.getText() +"\nContraseña: " + textfield9.getText() + "\nPaís: " + combo1.getSelectedItem() + "\nProvincia: " + combo2.getSelectedItem()  + "\nPoblación: " + textField3.getText() + "\nIdiomas: " + checkBox1.getText() + " " + checkBox2.getText() + " " + checkBox3.getText() + " " + checkBox4.getText() + " " + checkBox5.getText() + ": " + textfield10.getText() + "\nCarta de presentacion: " + "\n" + textarea1.getText();
                text.setText(textoJEditPane);




                System.out.println("A");
            }


        });



        /* Creamos el JMenuBar y lo asociamos con el JFrame */
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        /* Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el método add */
        menu1=new JMenu("Menu");
        menuBar.add(menu1);

        /* Creamos el segundo y tercer objetos de la clase JMenu y los asociamos con el primer JMenu creado */
        menu2=new JMenu("Formato");
        menu1.add(menu2);
        menu3=new JMenu("Acciones");
        menu1.add(menu3);

        menu4=new JMenu("Color");
        menu2.add(menu4);
        menu5=new JMenu("Formato");
        menu2.add(menu5);



        /* Creamos los dos primeros objetos de la clase JMenuItem y los asociamos con el segundo JMenu */
        menuItem21=new JMenuItem("20");
        menu5.add(menuItem21);
        menuItem21.addActionListener(this);
        menuItem22=new JMenuItem("15");
        menu5.add(menuItem22);
        menuItem22.addActionListener(this);
        getMenuItem24=new JMenuItem("8");
        menu5.add(getMenuItem24);
        getMenuItem24.addActionListener(this);
        getMenuItem23=new JMenuItem("10");
        menu5.add(getMenuItem23);
        getMenuItem23.addActionListener(this);
        getMenuItem25=new JMenuItem("12");
        menu5.add(getMenuItem25);
        getMenuItem25.addActionListener(this);


        menuItem52=new JMenuItem("Limpiar");
        menu3.add(menuItem52);
        menuItem52.addActionListener(this);

        menuItem51=new JMenuItem("Salir");
        menu3.add(menuItem51);
        menuItem51.addActionListener(this);



        /* Creamos los otros dos objetos de la clase JMenuItem y los  asociamos con el tercer JMenu */
        menuItem31=new JMenuItem("Rojo");
        menu4.add(menuItem31);
        menuItem31.addActionListener(this);
        menuItem32=new JMenuItem("Verde");
        menu4.add(menuItem32);
        menuItem32.addActionListener(this);
        menuItem33=new JMenuItem("Blanco");
        menu4.add(menuItem33);
        menuItem33.addActionListener(this);
        menuItem34=new JMenuItem("Azul");
        menu4.add(menuItem34);
        menuItem34.addActionListener(this);
        menuItem35=new JMenuItem("Morado");
        menu4.add(menuItem35);
        menuItem35.addActionListener(this);




        /* Muestro el JFrame */
        setVisible(true);






    }

    /* Método que implementa las acciones de cada ítem de menú */
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==menuItem21) {
            textfield1.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield2.setFont(new Font("Roboto", Font.PLAIN,20));
            textField3.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield4.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield5.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield6.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield7.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield8.setFont(new Font("Roboto", Font.PLAIN,20));
            textfield9.setFont(new Font("Roboto", Font.PLAIN,20));
            textarea1.setFont(new Font("Roboto", Font.PLAIN,20));
            combo1.setFont(new Font("Roboto", Font.PLAIN,20));
            combo2.setFont(new Font("Roboto", Font.PLAIN,20));;
            combo3.setFont(new Font("Roboto", Font.PLAIN,20));;
            checkBox1.setFont(new Font("Roboto", Font.PLAIN,20));
            checkBox2.setFont(new Font("Roboto", Font.PLAIN,20));
            checkBox3.setFont(new Font("Roboto", Font.PLAIN,20));
            checkBox4.setFont(new Font("Roboto", Font.PLAIN,20));
            checkBox5.setFont(new Font("Roboto", Font.PLAIN,20));



        }
        if (e.getSource()==menuItem22) {

            textfield1.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield2.setFont(new Font("Roboto", Font.PLAIN,15));
            textField3.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield4.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield5.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield6.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield7.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield8.setFont(new Font("Roboto", Font.PLAIN,15));
            textfield9.setFont(new Font("Roboto", Font.PLAIN,15));
            textarea1.setFont(new Font("Roboto", Font.PLAIN,15));
            combo1.setFont(new Font("Roboto", Font.PLAIN,15));
            combo2.setFont(new Font("Roboto", Font.PLAIN,15));;
            combo3.setFont(new Font("Roboto", Font.PLAIN,15));;
            checkBox1.setFont(new Font("Roboto", Font.PLAIN,15));
            checkBox2.setFont(new Font("Roboto", Font.PLAIN,15));
            checkBox3.setFont(new Font("Roboto", Font.PLAIN,15));
            checkBox4.setFont(new Font("Roboto", Font.PLAIN,15));
            checkBox5.setFont(new Font("Roboto", Font.PLAIN,15));
        }

        if (e.getSource()==getMenuItem23) {

            textfield1.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield2.setFont(new Font("Roboto", Font.PLAIN,10));
            textField3.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield4.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield5.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield6.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield7.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield8.setFont(new Font("Roboto", Font.PLAIN,10));
            textfield9.setFont(new Font("Roboto", Font.PLAIN,10));
            textarea1.setFont(new Font("Roboto", Font.PLAIN,10));
            combo1.setFont(new Font("Roboto", Font.PLAIN,10));
            combo2.setFont(new Font("Roboto", Font.PLAIN,10));;
            combo3.setFont(new Font("Roboto", Font.PLAIN,10));;
            checkBox1.setFont(new Font("Roboto", Font.PLAIN,10));
            checkBox2.setFont(new Font("Roboto", Font.PLAIN,10));
            checkBox3.setFont(new Font("Roboto", Font.PLAIN,10));
            checkBox4.setFont(new Font("Roboto", Font.PLAIN,10));
            checkBox5.setFont(new Font("Roboto", Font.PLAIN,10));
        }
        if (e.getSource()==getMenuItem24) {

            textfield1.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield2.setFont(new Font("Roboto", Font.PLAIN,8));
            textField3.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield4.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield5.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield6.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield7.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield8.setFont(new Font("Roboto", Font.PLAIN,8));
            textfield9.setFont(new Font("Roboto", Font.PLAIN,8));
            textarea1.setFont(new Font("Roboto", Font.PLAIN,8));
            combo1.setFont(new Font("Roboto", Font.PLAIN,8));
            combo2.setFont(new Font("Roboto", Font.PLAIN,8));;
            combo3.setFont(new Font("Roboto", Font.PLAIN,8));;
            checkBox1.setFont(new Font("Roboto", Font.PLAIN,8));
            checkBox2.setFont(new Font("Roboto", Font.PLAIN,8));
            checkBox3.setFont(new Font("Roboto", Font.PLAIN,8));
            checkBox4.setFont(new Font("Roboto", Font.PLAIN,8));
            checkBox5.setFont(new Font("Roboto", Font.PLAIN,8));
        }
        if (e.getSource()==menuItem22) {

            textfield1.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield2.setFont(new Font("Roboto", Font.PLAIN,12));
            textField3.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield4.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield5.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield6.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield7.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield8.setFont(new Font("Roboto", Font.PLAIN,12));
            textfield9.setFont(new Font("Roboto", Font.PLAIN,12));
            textarea1.setFont(new Font("Roboto", Font.PLAIN,12));
            combo1.setFont(new Font("Roboto", Font.PLAIN,12));
            combo2.setFont(new Font("Roboto", Font.PLAIN,12));;
            combo3.setFont(new Font("Roboto", Font.PLAIN,12));;
            checkBox1.setFont(new Font("Roboto", Font.PLAIN,12));
            checkBox2.setFont(new Font("Roboto", Font.PLAIN,12));
            checkBox3.setFont(new Font("Roboto", Font.PLAIN,12));
            checkBox4.setFont(new Font("Roboto", Font.PLAIN,12));
            checkBox5.setFont(new Font("Roboto", Font.PLAIN,12));
        }
        if (e.getSource()==menuItem31) {
            textfield1.setForeground(new Color(255,0,0));
            textfield2.setForeground(new Color(255,0,0));
            textField3.setForeground(new Color(255,0,0));
            textfield4.setForeground(new Color(255,0,0));
            textfield5.setForeground(new Color(255,0,0));
            textfield6.setForeground(new Color(255,0,0));
            textfield7.setForeground(new Color(255,0,0));
            textfield8.setForeground(new Color(255,0,0));
            textfield9.setForeground(new Color(255,0,0));
            textarea1.setForeground(new Color(255,0,0));
            combo1.setForeground(new Color(255,0,0));
            combo2.setForeground(new Color(255,0,0));
            combo3.setForeground(new Color(255,0,0));
            checkBox1.setForeground(new Color(255,0,0));
            checkBox2.setForeground(new Color(255,0,0));
            checkBox3.setForeground(new Color(255,0,0));
            checkBox4.setForeground(new Color(255,0,0));
            checkBox5.setForeground(new Color(255,0,0));

        }
        if (e.getSource()==menuItem32) {
            textfield1.setForeground(new Color(0,255,0));
            textfield2.setForeground(new Color(0,255,0));
            textField3.setForeground(new Color(0,255,0));
            textfield4.setForeground(new Color(0,255,0));
            textfield5.setForeground(new Color(0,255,0));
            textfield6.setForeground(new Color(0,255,0));
            textfield7.setForeground(new Color(0,255,0));
            textfield8.setForeground(new Color(0,255,0));
            textfield9.setForeground(new Color(0,255,0));
            textarea1.setForeground(new Color(0,255,0));
            combo1.setForeground(new Color(0,255,0));
            combo2.setForeground(new Color(0,255,0));
            combo3.setForeground(new Color(0,255,0));
            checkBox1.setForeground(new Color(0,255,0));
            checkBox2.setForeground(new Color(0,255,0));
            checkBox3.setForeground(new Color(0,255,0));
            checkBox4.setForeground(new Color(0,255,0));
            checkBox5.setForeground(new Color(0,255,0));
        }
        if (e.getSource()==menuItem33) {
            textfield1.setForeground(new Color(255, 255, 255));
            textfield2.setForeground(new Color(255, 255, 255));
            textField3.setForeground(new Color(255, 255, 255));
            textfield4.setForeground(new Color(255, 255, 255));
            textfield5.setForeground(new Color(255, 255, 255));
            textfield6.setForeground(new Color(255, 255, 255));
            textfield7.setForeground(new Color(255, 255, 255));
            textfield8.setForeground(new Color(255, 255, 255));
            textfield9.setForeground(new Color(255, 255, 255));
            textarea1.setForeground(new Color(255, 255, 255));
            combo1.setForeground(new Color(255, 255, 255));
            combo2.setForeground(new Color(255, 255, 255));
            combo3.setForeground(new Color(255, 255, 255));
            checkBox1.setForeground(new Color(255,255, 255));
            checkBox2.setForeground(new Color(255,255, 255));
            checkBox3.setForeground(new Color(255,255, 255));
            checkBox4.setForeground(new Color(255,255, 255));
            checkBox5.setForeground(new Color(255,255, 255));
        }
        if (e.getSource()==menuItem34) {
            textfield1.setForeground(new Color(0, 42, 255));
            textfield2.setForeground(new Color(0, 42, 255));
            textField3.setForeground(new Color(0, 42, 255));
            textfield4.setForeground(new Color(0, 42, 255));
            textfield5.setForeground(new Color(0, 42, 255));
            textfield6.setForeground(new Color(0, 42, 255));
            textfield7.setForeground(new Color(0, 42, 255));
            textfield8.setForeground(new Color(0, 42, 255));
            textfield9.setForeground(new Color(0, 42, 255));
            textarea1.setForeground(new Color(0, 42, 255));
            combo1.setForeground(new Color(0, 42, 255));
            combo2.setForeground(new Color(0, 42, 255));
            combo3.setForeground(new Color(0, 42, 255));
            checkBox1.setForeground(new Color(0, 42, 255));
            checkBox2.setForeground(new Color(0, 42, 255));
            checkBox3.setForeground(new Color(0, 42, 255));
            checkBox4.setForeground(new Color(0, 42, 255));
            checkBox5.setForeground(new Color(0, 42, 255));
        }
        if (e.getSource()==menuItem35) {
            textfield1.setForeground(new Color(183, 0, 255));
            textfield2.setForeground(new Color(183, 0, 255));
            textField3.setForeground(new Color(183, 0, 255));
            textfield4.setForeground(new Color(183, 0, 255));
            textfield5.setForeground(new Color(183, 0, 255));
            textfield6.setForeground(new Color(183, 0, 255));
            textfield7.setForeground(new Color(183, 0, 255));
            textfield8.setForeground(new Color(183, 0, 255));
            textfield9.setForeground(new Color(183, 0, 255));
            textarea1.setForeground(new Color(183, 0, 255));
            combo1.setForeground(new Color(183, 0, 255));
            combo2.setForeground(new Color(183, 0, 255));
            combo3.setForeground(new Color(183, 0, 255));
            checkBox1.setForeground(new Color(183, 0, 255));
            checkBox2.setForeground(new Color(183, 0, 255));
            checkBox3.setForeground(new Color(183, 0, 255));
            checkBox4.setForeground(new Color(183, 0, 255));
            checkBox5.setForeground(new Color(183, 0, 255));
        }
        if (e.getSource()==menuItem51) {
            System.exit(0);
        }
        if (e.getSource()==menuItem52) {
            textfield1.setText(null);
            textfield2.setText(null);
            textfield4.setText(null);
            textfield5.setText(null);
            textfield6.setText(null);
            textfield7.setText(null);
            textfield8.setText(null);
            textfield9.setText(null);
            combo1.setSelectedIndex(0);
            combo2.setSelectedIndex(0);
            combo3.setSelectedIndex(0);
            textarea1.setText(null);




        }
    }






    /* En el método main creamos un objeto de la clase Ejemplo6 */
    public static void main(String[] args) {

        new Ventana();

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (checkBox5.isSelected()){
            textfield10.setVisible(true);
        }else if (checkBox5.isSelected() == Boolean.parseBoolean(null)){
            textfield10.setVisible(false);
        }
    }


}