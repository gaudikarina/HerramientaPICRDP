import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JScrollBar;
import javax.swing.text.JTextComponent;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.io.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;






import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

public class redesdepetri extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenu jMenu1 = null;
	private JMenu jMenu2 = null;
	private JMenuItem jMenuItem = null;
	private JMenuItem jMenuItem1 = null;
	private JMenuItem jMenuItem2 = null;
	private JMenuItem jMenuItem3 = null;
	private JToolBar jJToolBarBar = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton3 = null;
	private JToolBar jJToolBarBar1 = null;
	private JButton jButton4 = null;
	private JToolBar jJToolBarBar2 = null;
	private JButton jButton5 = null;
	private JButton jButton6 = null;
	private JPanel jPanel = null;
	private int x1,y1,x2,y2,i=0,j=0,cl=0;
	private int shape,form;
	public final static int gris=1,negro=2,circulo=3,rectangulo=4,flecha=5,rojo=6,cuadrado=7;
	private double dist,alpha,x3,x4,y3,y4;
	private boolean vf=false,fr=false;
	ArrayList v=new ArrayList();  //  @jve:decl-index=0:
	ArrayList c=new ArrayList();
	final int maxp=100;
	Vector ti2=new Vector();  //  @jve:decl-index=0:
	Point punto1= new Point();  //  @jve:decl-index=0:
	Point punto2= new Point();	//  @jve:decl-index=0:
	Point puntos[]=new Point[maxp];  //  @jve:decl-index=0:
	Point puntosr[]=new Point[maxp];  //  @jve:decl-index=0:
	Point puntosc[]=new Point[maxp];//  @jve:decl-index=0:
	Point puntosf[]=new Point[maxp];//  @jve:decl-index=0:
	private Vector coor=new Vector();  //  @jve:decl-index=0:
	int np=0,nc=0,nr=0,m,inf=0,caux=0,cetq=0,ctrans=0;
	Vector lugares=new Vector();  //  @jve:decl-index=0:
	Vector transiciones=new Vector();  //  @jve:decl-index=0:
	Vector arcos=new Vector();  //  @jve:decl-index=0:
	Vector li= new Vector();  //  @jve:decl-index=0:
	Vector lo= new Vector();  //  @jve:decl-index=0:
	Vector to= new Vector();  //  @jve:decl-index=0:
	Vector taux= new Vector();  //  @jve:decl-index=0:
	Vector to2= new Vector(); //  @jve:decl-index=0:
	Vector pi= new Vector();  //  @jve:decl-index=0:
	Vector ti=new Vector();//  @jve:decl-index=0:
	Vector aux=new Vector();  //  @jve:decl-index=0:
	String CL[]=new String[50];  //  @jve:decl-index=0:
	String CT[]=new String[50];  //  @jve:decl-index=0:
	Vector INI=new Vector();  //  @jve:decl-index=0:
	Vector FIN=new Vector();//  @jve:decl-index=0:
	String NA[]={"Inicio"};
	String TA[]={"Fin"};
	String NL[]={"Lugar"};
	String NT[]={"Transicion"};
	//String Salida[]={"Salida"};
	String[] Canal={"Canal","-","RA0","RA1","RA2","RA3","RA4","RA5","RA6","RE0","RE1","RE2"};
	String[] EstadoI={"Estado","1","0"};
	String[] Salida={"Salida","RB0","RB1","RB2","RB3","RB4","RB5","RB6","RB7","RD0","RD1","RD2","RD3","RD4","RD5","RD6","RD7"};
	String[] tiempo={"Tiempo_(ms)","10","100","250","500"};
	String[] EstadoT={"Valor","1","0"};
	String nu,ini,fin,pL,pT,eI,cP,t,eT,MT,TN,esti,port,tiem,sal,val;
	private JInternalFrame jInternalFrame = null;
	private JPanel jContentPane1 = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox1 = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JComboBox jComboBox2 = null;
	private JButton jButton2 = null;
	private JInternalFrame jInternalFrame1 = null;
	private JPanel jContentPane2 = null;
	private JLabel jLabel3 = null;
	private JComboBox jComboBox3 = null;
	private JComboBox jComboBox4 = null;
	private JComboBox jComboBox5 = null;
	private JComboBox jComboBox6 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel51 = null;
	private JButton jButton7 = null;
	private JInternalFrame jInternalFrame2 = null;
	private JPanel jContentPane3 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel61 = null;
	private JComboBox jComboBox7 = null;
	private JComboBox jComboBox8 = null;
	private JButton jButton8 = null;
	
	private JPanel jContentPane4 = null;
	private JInternalFrame jInternalFrame3 = null;
	private JPanel jContentPane5 = null;
	private JScrollPane jScrollPane = null;
	private JTextArea jTextArea = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel71 = null;
	private JLabel jLabel72 = null;
	private JLabel jLabel721 = null;
	private JLabel jLabel722 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JButton jButton9 = null;
	private JInternalFrame jInternalFrame4 = null;
	private JPanel jContentPane7 = null;
	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.setPreferredSize(new Dimension(0, 25));
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Archivo");
			jMenu.add(getJMenuItem());
			jMenu.add(getJMenuItem1());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenu1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Ejecutar");
			jMenu1.add(getJMenuItem2());
		
		}
		return jMenu1;
	}

	/**
	 * This method initializes jMenu2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Ayuda");
			jMenu2.add(getJMenuItem3());
		}
		return jMenu2;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("Guardar");
			jMenuItem.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e){
					guardar_archivo();
				}
			});
		}
		return jMenuItem;
	}

	/**
	 * This method initializes jMenuItem1	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Salir");
			jMenuItem1.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e){
					System.exit(0);
;
				}
			});
		}
		return jMenuItem1;
	}

	/**
	 * This method initializes jMenuItem2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem();
			jMenuItem2.setText("Generar");
			jMenuItem2.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e){
					repaint();
					encabezado();
					salidas();
					configuración();
				    casos_iniciales();
					casos_secuenciales();
					retardos_ms();
					jTextArea.append("FIN\r\n");
					jTextArea.append("\tEND\r\n");
					jInternalFrame.setVisible(false);
					jInternalFrame1.setVisible(false);
					jInternalFrame2.setVisible(false);
					jInternalFrame3.setVisible(true);	
				}
			});
		}
		return jMenuItem2;
	}

	/**
	 * This method initializes jMenuItem3	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Acerca de...");
			jMenuItem3.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e){
					jInternalFrame4.setVisible(true);
				}
			});
		}
		return jMenuItem3;
	}

	/**
	 * This method initializes jJToolBarBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJJToolBarBar() {
		if (jJToolBarBar == null) {
			jJToolBarBar = new JToolBar();
			jJToolBarBar.setBounds(new Rectangle(-1, 0, 121, 33));
			jJToolBarBar.add(getJButton());
			jJToolBarBar.add(getJButton1());
			jJToolBarBar.add(getJButton3());
		}
		return jJToolBarBar;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("");
			jButton.setIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/lugar_2.gif"));
			jButton.setName("Lugar");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint();
					cursor_mostrar_cir(e); // TODO Auto-generated Event stub mousePressed()
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
					repaint();
					cursor_guardar_cir(e);
					jInternalFrame.setVisible(true);
					jButton.setEnabled(false);
					jButton1.setEnabled(false);
					jButton3.setEnabled(false); 
					jComboBox.setEnabled(true);
					jComboBox1.setEnabled(true);
					jComboBox2.setEnabled(true);
					jButton2.setEnabled(true);// TODO Auto-generated Event stub mouseReleased()
				}
			});
			jButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseDragged(java.awt.event.MouseEvent e) {
					repaint();
					cursor_dibujar_cir(e); // TODO Auto-generated Event stub mouseDragged()
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setName("transiciones");
			jButton1.setEnabled(false);
			jButton1.setIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/transicion_1.gif"));
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					cursor_mostrar_rec(e);
					repaint();// TODO Auto-generated Event stub mousePressed()
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
					jInternalFrame1.setEnabled(true);
					cursor_guardar_rec(e);	
					jButton.setEnabled(false);
					jButton1.setEnabled(false);
					jButton3.setEnabled(false);
					jComboBox6.setEnabled(true);
					jComboBox5.setEnabled(true);
					jComboBox4.setEnabled(true);
					jComboBox3.setEnabled(true);
					jButton7.setEnabled(true);
					
					
					repaint(); // TODO Auto-generated Event stub mouseReleased()
				}
			});
			jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseDragged(java.awt.event.MouseEvent e) {
					cursor_dibujar_rec(e);
					repaint();// TODO Auto-generated Event stub mouseDragged()
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	
	/**
	 * This method initializes jButton3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setEnabled(false);
			jButton3.setIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/arco_1.gif"));
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jButton.setEnabled(false);
					jButton1.setEnabled(false);
					jButton3.setEnabled(true);
					jInternalFrame2.setEnabled(true);
					jComboBox7.setEnabled(true);
					jComboBox8.setEnabled(true);
					jButton8.setEnabled(true);
					repaint(); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jJToolBarBar1	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJJToolBarBar1() {
		if (jJToolBarBar1 == null) {
			jJToolBarBar1 = new JToolBar();
			jJToolBarBar1.setBounds(new Rectangle(120, -1, 58, 33));
			jJToolBarBar1.add(getJButton4());
		}
		return jJToolBarBar1;
	}

	/**
	 * This method initializes jButton4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setEnabled(false);
			jButton4.setIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/application_windows_edit.png"));
			jButton4.setName("Generar");
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					repaint();
					jButton5.setEnabled(true);
					jButton3.setEnabled(false);
					encabezado();
					salidas();
					configuración();
				    casos_iniciales();
					casos_secuenciales();
					retardos_ms();
					jTextArea.append("FIN\r\n");
					jTextArea.append("\tEND\r\n");
					jInternalFrame.setVisible(false);
					jInternalFrame1.setVisible(false);
					jInternalFrame2.setVisible(false);
					jInternalFrame3.setVisible(true); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButton4;
	}

	/**
	 * This method initializes jJToolBarBar2	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJJToolBarBar2() {
		if (jJToolBarBar2 == null) {
			jJToolBarBar2 = new JToolBar();
			jJToolBarBar2.setBounds(new Rectangle(178, -1, 2806, 33));
			jJToolBarBar2.add(getJButton5());
			jJToolBarBar2.add(getJButton6());
		}
		return jJToolBarBar2;
	}

	/**
	 * This method initializes jButton5	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton(); 
			jButton5.setEnabled(false);
			jButton5.setName("Guardar");
			jButton5.setIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/action_save.gif"));
			jButton5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					guardar_archivo(); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButton5;
	}

	/**
	 * This method initializes jButton6	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setName("Acerca de");
			jButton6.setIcon(new ImageIcon("C:/Users/Gau/Pictures/rdpicsmini2.png"));
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jInternalFrame4.setVisible(true);
					
; // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButton6;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(-6, 35, 800, 675));
			jPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Editor", TitledBorder.LEFT, TitledBorder.TOP, new Font("Euphemia", Font.BOLD, 18), null));
			jPanel.setBackground(Color.white);
			jPanel.add(getJInternalFrame4(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	

	/**
	 * This method initializes jInternalFrame	
	 * 	
	 * @return javax.swing.JInternalFrame	
	 */
	private JInternalFrame getJInternalFrame() {
		if (jInternalFrame == null) {
			jInternalFrame = new JInternalFrame();
			jInternalFrame.setBounds(new Rectangle(825, 42, 444, 192));
			jInternalFrame.setBackground(new Color(153, 204, 255));
			jInternalFrame.setTitle("Lugares Atributos");
			jInternalFrame.setFrameIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/lugar_2.gif"));
			jInternalFrame.setContentPane(getJContentPane1());
			jInternalFrame.setVisible(true);
		}
		return jInternalFrame;
	}

	/**
	 * This method initializes jContentPane1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane1() {
		if (jContentPane1 == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(202, 102, 110, 21));
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel2.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel2.setToolTipText("Estado Inicial");
			jLabel2.setText("Estado Inicial");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(108, 48, 111, 21));
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel1.setText("Canal");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(15, 3, 112, 16));
			jLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jLabel.setVerticalAlignment(SwingConstants.TOP);
			jLabel.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel.setText("N° Lugar");
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(null);
			jContentPane1.setBackground(SystemColor.inactiveCaptionBorder);
			jContentPane1.add(getJComboBox(), null);
			jContentPane1.add(jLabel, null);
			jContentPane1.add(getJComboBox1(), null);
			jContentPane1.add(jLabel1, null);
			jContentPane1.add(jLabel2, null);
			jContentPane1.add(getJComboBox2(), null);
			jContentPane1.add(getJButton2(), null);
		}
		return jContentPane1;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox(NL);
			jComboBox.setBounds(new Rectangle(14, 19, 112, 28));
			jComboBox.setEnabled(false);
			jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint(); 
					if(e.getStateChange()==ItemEvent.SELECTED){
						repaint();
						MT=(String)(jComboBox.getSelectedItem());
						}// TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			
		}
		return jComboBox;
	}

	/**
	 * This method initializes jComboBox1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox(Canal);
			jComboBox1.setBounds(new Rectangle(108, 69, 112, 32));
			jComboBox1.setEnabled(false);
			jComboBox1.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						repaint();
						port=(String)(jComboBox1.getSelectedItem()); // TODO Auto-generated Event stub itemStateChanged()
					}  // TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jComboBox1;
	}

	/**
	 * This method initializes jComboBox2	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox2() {
		if (jComboBox2 == null) {
			jComboBox2 = new JComboBox(EstadoI);
			jComboBox2.setBounds(new Rectangle(203, 123, 112, 32));
			jComboBox2.setEnabled(false);
			jComboBox2.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						repaint();
						esti=(String)(jComboBox2.getSelectedItem()); // TODO Auto-generated Event stub itemStateChanged()
					}  // TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jComboBox2;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBounds(new Rectangle(316, 55, 106, 33));
			jButton2.setText("OK");
			jButton2.setEnabled(false);
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					repaint();
					jInternalFrame.setEnabled(false);
					jComboBox.setEnabled(false);
					jComboBox1.setEnabled(false);
					jComboBox2.setEnabled(false);
					jButton2.setEnabled(false);
					jButton.setEnabled(true);
					if (nc>1)	jButton1.setEnabled(true);
					if (nr>0 && nc>1)	jButton3.setEnabled(true);
					lugares.addElement(MT);
					lugares.addElement(esti);
					lugares.addElement(port);
					lugares.addElement("*");
					cirblack cirnegro = new cirblack(x2,y2,20,20,(nc-1),esti,port);
					v.add(cirnegro);// TODO Auto-generated Event stub actionPerformed()
				}
			});
			
		}
		return jButton2;
	}

	/**
	 * This method initializes jInternalFrame1	
	 * 	
	 * @return javax.swing.JInternalFrame	
	 */
	private JInternalFrame getJInternalFrame1() {
		if (jInternalFrame1 == null) {
			jInternalFrame1 = new JInternalFrame();
			jInternalFrame1.setBounds(new Rectangle(829, 266, 445, 198));
			jInternalFrame1.setFrameIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/transicion_1.gif"));
			jInternalFrame1.setTitle("Transiciones Atributos");
			jInternalFrame1.setBackground(SystemColor.inactiveCaptionBorder);
			jInternalFrame1.setContentPane(getJContentPane2());
			jInternalFrame1.setVisible(true);
			jInternalFrame1.setEnabled(false);
		}
		return jInternalFrame1;
	}

	/**
	 * This method initializes jContentPane2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane2() {
		if (jContentPane2 == null) {
			jLabel51 = new JLabel();
			jLabel51.setBounds(new Rectangle(227, 4, 112, 18));
			jLabel51.setHorizontalTextPosition(SwingConstants.LEFT);
			jLabel51.setText("Valor");
			jLabel51.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(270, 59, 110, 18));
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5.setHorizontalTextPosition(SwingConstants.LEFT);
			jLabel5.setText("Tiempo");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(98, 52, 113, 22));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel4.setText("Canal Salida");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(15, -1, 111, 20));
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel3.setText("N° Transicion");
			jContentPane2 = new JPanel();
			jContentPane2.setLayout(null);
			jContentPane2.setBackground(SystemColor.inactiveCaptionBorder);
			jContentPane2.add(jLabel3, null);
			jContentPane2.add(getJComboBox3(), null);
			jContentPane2.add(getJComboBox4(), null);
			jContentPane2.add(getJComboBox5(), null);
			jContentPane2.add(getJComboBox6(), null);
			jContentPane2.add(jLabel4, null);
			jContentPane2.add(jLabel5, null);
			jContentPane2.add(jLabel51, null);
			jContentPane2.add(getJButton7(), null);
		}
		return jContentPane2;
	}

	/**
	 * This method initializes jComboBox3	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox3() {
		if (jComboBox3 == null) {
			jComboBox3 = new JComboBox(tiempo);
			jComboBox3.setBounds(new Rectangle(284, 80, 112, 32));
			jComboBox3.setEnabled(false);
			jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint();// TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			jComboBox3.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						tiem=(String) jComboBox3.getSelectedItem();
						repaint();// TODO Auto-generated Event stub itemStateChanged()
					} // TODO Auto-generated Event stub itemStateChanged()
				}
			});
		}
		return jComboBox3;
	}

	/**
	 * This method initializes jComboBox4	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox4() {
		if (jComboBox4 == null) {
			jComboBox4 = new JComboBox(Salida);
			jComboBox4.setBounds(new Rectangle(98, 75, 112, 32));
			jComboBox4.setEnabled(false);
			jComboBox4.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						sal=(String) jComboBox4.getSelectedItem();
						repaint();// TODO Auto-generated Event stub itemStateChanged()
					} // TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jComboBox4;
	}

	/**
	 * This method initializes jComboBox5	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox5() {
		if (jComboBox5 == null) {
			jComboBox5 = new JComboBox(EstadoT);
			jComboBox5.setBounds(new Rectangle(230, 24, 112, 32));
			jComboBox5.setEnabled(false);
			jComboBox5.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						val=(String) jComboBox5.getSelectedItem();
						repaint();// TODO Auto-generated Event stub itemStateChanged()
					} ; // TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox5.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jComboBox5;
	}

	/**
	 * This method initializes jComboBox6	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox6() {
		if (jComboBox6 == null) {
			jComboBox6 = new JComboBox(NT);
			jComboBox6.setBounds(new Rectangle(14, 18, 112, 32));
			jComboBox6.setEnabled(false);
			jComboBox6.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						TN=(String) jComboBox6.getSelectedItem();
						repaint();// TODO Auto-generated Evnt stub itemStateChanged()
					} // TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox6.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseClicked(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mousePressed()
				}
			});
		}
		return jComboBox6;
	}

	/**
	 * This method initializes jButton7	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBounds(new Rectangle(322, 125, 94, 35));
			jButton7.setText("OK");
			jButton7.setEnabled(false);
			jButton7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					repaint();
					jInternalFrame1.setEnabled(false);
					jButton.setEnabled(true);
					if (nc>1)	jButton1.setEnabled(true);
					if (nr>0 && nc>1)	jButton3.setEnabled(true);
					jComboBox6.setEnabled(false);
					jComboBox5.setEnabled(false);
					jComboBox4.setEnabled(false);
					jComboBox3.setEnabled(false);
					jButton7.setEnabled(false);
					transiciones.addElement(TN);
					transiciones.addElement(sal);
					transiciones.addElement(tiem);
					transiciones.addElement(val);
					rectblack rectnegro = new rectblack(x2,y2,20,10,(nr-1),tiem,val,sal);
					v.add(rectnegro);; // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButton7;
	}

	/**
	 * This method initializes jInternalFrame2	
	 * 	
	 * @return javax.swing.JInternalFrame	
	 */
	private JInternalFrame getJInternalFrame2() {
		if (jInternalFrame2 == null) {
			jInternalFrame2 = new JInternalFrame();
			jInternalFrame2.setBounds(new Rectangle(906, 495, 307, 194));
			jInternalFrame2.setTitle("Arcos");
			jInternalFrame2.setFrameIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/arco_1.gif"));
			jInternalFrame2.setContentPane(getJContentPane3());
			jInternalFrame2.setVisible(true);
			jInternalFrame2.setEnabled(false);
		}
		return jInternalFrame2;
	}

	/**
	 * This method initializes jContentPane3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane3() {
		if (jContentPane3 == null) {
			jLabel61 = new JLabel();
			jLabel61.setBounds(new Rectangle(178, 39, 74, 16));
			jLabel61.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel61.setText("Fin de Arco");
			jLabel61.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(20, 39, 85, 18));
			jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel6.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel6.setText("Inicio de Arco");
			jContentPane3 = new JPanel();
			jContentPane3.setLayout(null);
			jContentPane3.setBackground(SystemColor.inactiveCaptionBorder);
			jContentPane3.add(jLabel6, null);
			jContentPane3.add(jLabel61, null);
			jContentPane3.add(getJComboBox7(), null);
			jContentPane3.add(getJComboBox8(), null);
			jContentPane3.add(getJButton8(), null);
			
		}
		return jContentPane3;
	}

	/**
	 * This method initializes jComboBox7	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox7() {
		if (jComboBox7 == null) {
			jComboBox7 = new JComboBox(NA);
			jComboBox7.setBounds(new Rectangle(14, 56, 112, 32));
			jComboBox7.setEnabled(false);
			jComboBox7.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						ini=(String) jComboBox7.getSelectedItem();
						repaint();// TODO Auto-generated Event stub itemStateChanged()
					} // TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox7.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint(); // TODO Auto-generated EButton8.vent stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jComboBox7;
	}

	/**
	 * This method initializes jComboBox8	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox8() {
		if (jComboBox8 == null) {
			jComboBox8 = new JComboBox(TA);
			jComboBox8.setBounds(new Rectangle(165, 56, 112, 32));
			jComboBox8.setEnabled(false);
			jComboBox8.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					repaint();
					if(e.getStateChange()==ItemEvent.SELECTED){
						repaint();
						fin=(String) jComboBox8.getSelectedItem(); // TODO Auto-generated Event stub itemStateChanged()
					}// TODO Auto-generated Event stub itemStateChanged()
				}
			});
			jComboBox8.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					repaint();// TODO Auto-generated Event stub mousePressed()
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
					repaint(); // TODO Auto-generated Event stub mouseClicked()
				}
			});
			jComboBox7.setEnabled(false);
		}
		return jComboBox8;
	}

	/**
	 * This method initializes jButton8	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setBounds(new Rectangle(114, 108, 92, 31));
			jButton8.setText("Dibujar");
			jButton8.setEnabled(false);
			jButton8.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					repaint();
					jInternalFrame.setEnabled(false);
					jButton4.setEnabled(true);
					jComboBox7.setEnabled(false);
					jComboBox8.setEnabled(false);
					jButton8.setEnabled(false);
					INI.addElement(ini);
					FIN.addElement(fin);
					if (nr>0 && nc>1)	jButton3.setEnabled(true);
					char ia,ina,fa,faa;
					int	z,y;
						ia=ini.charAt(0);
						ina=ini.charAt(1);
						y=Integer.valueOf(ina)-0x30;
						fa=fin.charAt(0);
						faa=fin.charAt(1);
						z=Integer.valueOf(faa)-0x30;
						if(ia=='L'){
							punto1.x=puntosc[y].x+35;
							punto1.y=puntosc[y].y+45;
							
						}else 
							{punto1.x=puntosr[y].x+35;
							punto1.y=puntosr[y].y+35;
							}
						if(fa=='T'){
							punto2.x=puntosr[z].x+35;
							punto2.y=puntosr[z].y+25;
						}else 
						{
							punto2.x=puntosc[z].x+35;
							punto2.y=puntosc[z].y+25;
						}
						if(punto2.y<punto1.y){
							if(ia=='L'){
								punto1.x=puntosc[y].x+35;
								punto1.y=puntosc[y].y+25;
								
							}else 
								{punto1.x=puntosr[y].x+35;
								punto1.y=puntosr[y].y+25;
								}
							if(fa=='T'){
								punto2.x=puntosr[z].x+35;
								punto2.y=puntosr[z].y+35;
							}else 
							{
								punto2.x=puntosc[z].x+35;
								punto2.y=puntosc[z].y+45;
							}	
						}
						puntofinal_flecha();
				} // TODO Auto-generated Event stub actionPerformed()
				});
			
		}
		return jButton8;
	}
	
		public interface Dibujable{
			
		public void dibujar (Graphics dw);
	}
	

	class cirblack implements Dibujable{
		protected int x1,y1,w,h,nc1;
		protected String ei,po;
		public cirblack(int cx1,int cy1,int cw,int ch,int cc,String ei1,String po1){
			x1=cx1;
			y1=cy1;
			w=cw;
			h=ch;
			nc1=cc;
			ei=ei1;
			po=po1;
			
		}
		public void dibujar(Graphics dw){
			dw.setColor(Color.BLACK);
			dw.drawOval(x1, y1, w, h);
			dw.setFont(new Font("Serif",Font.PLAIN,10));
			dw.drawString("L"+String.valueOf(nc1), x1-10, y1);
			dw.drawString("["+ei+","+po+"]", x1+20, y1);
			if(ei=="1") dw.fillOval((x1+5),(y1+5),10,10);
		}
		
	}
	class flecblack implements Dibujable{
		protected double x4,y4,x5,y5;
		protected int x3,y3,w2,h2;
		
		public flecblack(int cx1,int cy1,int cw,int ch){
			x3=cx1;
			y3=cy1;
			w2=cw;
			h2=ch;
		}
		public void dibujar(Graphics dw){
			dist=10;
			alpha=Math.atan(-1.0*(h2-y3)/(w2-x3));
			if ((w2-x3)<0){
				alpha+=Math.PI;
			}
			x4=w2+dist*Math.cos(alpha-Math.toRadians(145));
			y4=h2-dist*Math.sin(alpha-Math.toRadians(145));	
			x5=w2+dist*Math.cos(alpha+Math.toRadians(145));
			y5=h2-dist*Math.sin(alpha+Math.toRadians(145));	
			dw.setColor(Color.BLACK);
			dw.drawLine((int)x3,(int) y3,(int) w2,(int) h2);
			dw.drawLine((int)x4,(int) y4,(int) w2,(int) h2);
			dw.drawLine((int)x5,(int) y5,(int) w2,(int) h2);
		}
			
	}
	
		class rectblack implements Dibujable{
			protected int x2,y2,w1,h1,nr1;
			protected String t,v,s;
			public rectblack(int cx1,int cy1,int cw,int ch,int nrr, String t1,String v1,String s1){
				x2=cx1;
				y2=cy1;
				w1=cw;
				h1=ch;
				nr1=nrr;
				t=t1;
				v=v1;
				s=s1;
						}
		public void dibujar(Graphics dw){
			dw.setColor(Color.BLACK);
			dw.fillRect(x2, y2, w1, h1);
			dw.setFont(new Font("Serif",Font.PLAIN,10));
			dw.drawString("T"+String.valueOf(nr1), x2-15, y2);
			dw.drawString("("+t+","+v+","+s+")", x2+20, y2);
			}
	}	
		void cursor_guardar_cir(MouseEvent ev){
			x2=ev.getX()+25;
			y2=ev.getY()+25;
			if ((x2-25)>-1 && (x2-25)<800 && (y2-25)>33 && (y2-25)<675){
				draw(negro,circulo);
				if(np<maxp){
					puntos[np]=ev.getPoint();
					puntosc[nc]=ev.getPoint();
					CL[nc+1]="L"+String.valueOf(nc);
					jComboBox.addItem("L"+String.valueOf(nc));
					jComboBox7.addItem("L"+String.valueOf(nc));
					jComboBox8.addItem("L"+String.valueOf(nc));
					np++;
					nc++;
					
				}	
			}	
		}
		void cursor_mostrar_cir(MouseEvent ev){
			x1=ev.getX()+25;
			y1=ev.getY()+25;
			draw(gris,circulo);
		}
		void cursor_dibujar_cir(MouseEvent ev){
			x1=ev.getX()+25;
			y1=ev.getY()+25;
			
			if ((x1-25)>-1 && (x1-25)<800 && (y1-25)>33 && (y1-25)<675){
				draw(gris,circulo);// TODO Auto-generated Event stub mouseDragged()
			}
		}
		public void paint(Graphics g){
			super.paint(g);
			if (shape==gris){
				if (form==circulo){
				g.setColor(Color.lightGray);
				g.drawOval(x1,y1,20,20);
				}
				else{
					if (form==rectangulo){
					g.setColor(Color.lightGray);
					g.fillRect(x1,y1,20,10);
				}
					}
			}
			else{
				if (shape==negro){
					if (form==circulo){
					g.setColor(Color.black);
					g.drawOval(x2,y2,20,20);
					g.setFont(new Font("Serif",Font.PLAIN,10));
					g.drawString("L"+String.valueOf(nc-1), x2-10, y2);
					g.drawString("["+esti+","+port+"]", x2+20, y2);
					if(esti=="1") g.fillOval((x1+5),(y1+5),10,10);
					}
					else{
						if(form==rectangulo){
						g.setColor(Color.black);
						g.fillRect(x2,y2,20,10);
						g.setFont(new Font("Serif",Font.PLAIN,10));
						g.drawString("T"+String.valueOf(nr-1), x2-15, y2);
						g.drawString("("+tiem+","+val+","+sal+")", x2+20, y2);
					}
						else{
							dist=10;
							alpha=Math.atan(-1.0*(punto2.y-punto1.y)/(punto2.x-punto1.x));
							if ((punto2.x-punto1.x)<0){
								alpha+=Math.PI;
							}
							x3=punto2.x+dist*Math.cos(alpha-Math.toRadians(145));
							y3=punto2.y-dist*Math.sin(alpha-Math.toRadians(145));	
							x4=punto2.x+dist*Math.cos(alpha+Math.toRadians(145));
							y4=punto2.y-dist*Math.sin(alpha+Math.toRadians(145));	
							g.setColor(Color.BLACK);
							g.drawLine(punto1.x,punto1.y,punto2.x,punto2.y);
							g.drawLine((int)x3,(int) y3,punto2.x,punto2.y);
							g.drawLine((int)x4,(int) y4,punto2.x,punto2.y);
					}
					}
				}	
				
			}	
			
			Iterator it;
			it=v.iterator();
			Dibujable black;
			while (it.hasNext()){
				black= (Dibujable) it.next();
				black.dibujar(g);
			}
	}
		public void draw (int shapetodraw,int formtodraw){
			shape=shapetodraw;
			form=formtodraw;
			repaint();
		}
		void cursor_guardar_rec(MouseEvent ev){
			x2=ev.getX()+25;
			y2=ev.getY()+25;
			if ((x2-25)>-1 && (x2-25)<800 && (y2-25)>33 && (y2-25)<675){
				
				draw(negro,rectangulo);
				if(np<maxp){
					puntos[np]=ev.getPoint();
					puntosr[nr]=ev.getPoint();
					CT[nr+1]="T"+String.valueOf(nr);
					jComboBox7.addItem("T"+String.valueOf(nr));
					jComboBox8.addItem("T"+String.valueOf(nr));
					jComboBox6.addItem("T"+String.valueOf(nr));
					np++;
					nr++;
				}
			}
		}
		void cursor_mostrar_rec(MouseEvent ev){
			x1=ev.getX()+25;
			y1=ev.getY()+25;
			
			draw(gris,rectangulo);
		}
		void cursor_dibujar_rec(MouseEvent ev){
			x1=ev.getX()+25;
			y1=ev.getY()+25;
			
			if ((x1-25)>-1 && (x1-25)<800 && (y1-25)>33 && (y1-25)<675){
				draw(gris,rectangulo); 
		}
		}
		void puntofinal_flecha(){
			
			draw(negro,flecha);
					flecblack flecnegro = new flecblack(punto1.x,punto1.y,punto2.x,punto2.y);
					v.add(flecnegro);
		}
	
		/**
		 * This method initializes jInternalFrame3	
		 * 	
		 * @return javax.swing.JInternalFrame	
		 */
		

		/**
		 * This method initializes jContentPane4	
		 * 	
		 * @return javax.swing.JPanel	
		 */
		private JPanel getJContentPane4() {
			if (jContentPane4 == null) {
				jContentPane4 = new JPanel();
				jContentPane4.setLayout(new BorderLayout());
			}
			return jContentPane4;
		}

		
		private JInternalFrame getJInternalFrame3() {
			if (jInternalFrame3 == null) {
				jInternalFrame3 = new JInternalFrame();
				jInternalFrame3.setBounds(new Rectangle(807, 33, 463, 666));
				jInternalFrame3.setTitle("Generar Assembler");
				jInternalFrame3.setFrameIcon(new ImageIcon("C:/Users/Gau/Documents/dis_01 - copia (6)/MAESTRIA/tesis_maestria/programa/application_windows_edit.png"));
				jInternalFrame3.setContentPane(getJContentPane5());
				jInternalFrame3.setVisible(false);
			}
			return jInternalFrame3;
		}

		/**
		 * This method initializes jContentPane5	
		 * 	
		 * @return javax.swing.JPanel	
		 */
		private JPanel getJContentPane5() {
			if (jContentPane5 == null) {
				jContentPane5 = new JPanel();
				jContentPane5.setLayout(null);
				jContentPane5.add(getJScrollPane(), null);
			}
			return jContentPane5;
		}

		private JScrollPane getJScrollPane() {
			if (jScrollPane == null) {
				jScrollPane = new JScrollPane();
				jScrollPane.setBounds(new Rectangle(-1, 3, 452, 629));
				jScrollPane.setViewportView(getJTextArea());
			}
			return jScrollPane;
		}

		private JTextArea getJTextArea() {
			if (jTextArea == null) {
				jTextArea = new JTextArea();
				
			}
			return jTextArea;
		}
		
		void encabezado(){
			jTextArea.append("\t"+"INCLUDE<P16F877.INC>"+"\r\n");
			jTextArea.append("\t"+"LIST P=16F877.INC"+"\r\n");
			
		}
		
		void salidas(){
			int j=32;
			for(int i=0;i<nr;i++){
			jTextArea.append("AUX"+String.valueOf(i)+"\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
				j++;
			}
			jTextArea.append("A1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("B1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("C1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("D1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("E1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("F1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("G1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("H1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("J1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
			jTextArea.append("I1\t"+"EQU"+"\t."+String.valueOf(j)+"\r\n");
			j++;
		}
		
		void configuración(){
			jTextArea.append("CONFIGURACION\r\n");
			jTextArea.append("\t"+"BCF"+"\t"+"STATUS,RP1;"+"\r\n");
			jTextArea.append("\t"+"BSF"+"\t"+"STATUS,RP0;"+"\r\n");
			jTextArea.append("\t"+"CLRF"+"\t"+"TRISB;"+"\r\n");
			jTextArea.append("\t"+"CLRF"+"\t"+"TRISC;"+"\r\n");
			jTextArea.append("\t"+"CLRF"+"\t"+"TRISD;"+"\r\n");
			jTextArea.append("\t"+"MOVLW"+"\t"+"0X3F;"+"\r\n");
			jTextArea.append("\t"+"MOVWF"+"\t"+"TRISA;"+"\r\n");
			jTextArea.append("\t"+"MOVLW"+"\t"+"0X07;"+"\r\n");
			jTextArea.append("\t"+"MOVWF"+"\t"+"TRISE;"+"\r\n");
			jTextArea.append("\t"+"MOVWF"+"\t"+"ADCON1;"+"\r\n");
			jTextArea.append("\t"+"BCF"+"\t"+"STATUS,RP0;"+"\r\n");
			jTextArea.append("\t"+"CLRF\tPORTB"+"\r\n");
			jTextArea.append("\t"+"CLRF\tPORTD"+"\r\n");
			for(int i=0;i<nr;i++){
				jTextArea.append("\t"+"CLRF"+"\t"+"AUX"+String.valueOf(i)+";"+"\r\n");
			}
		}
		
		void casos_iniciales(){
			for (int i=0;i<lugares.size()/4;i++){
				if(lugares.elementAt(4*i+1)=="1"){
					li.addElement((String) lugares.elementAt(4*i));
					pi.addElement((String) lugares.elementAt(4*i+2));
					}
			}
			
			for(j=0;j<INI.size();j++){
					if(li.contains(INI.elementAt(j))) {
						ti.addElement(FIN.elementAt(j));
						}
				}
			
			Set aux = new HashSet();
			aux.addAll(ti);
			ti.clear();
			ti.addAll(aux);
			ti2.addAll(aux);
			for(j=0;j<INI.size();j++){
				if(ti.contains(INI.elementAt(j))) {
					lo.addElement(FIN.elementAt(j));
				}
					
			}
			
			Set aux1 = new HashSet();
			aux1.addAll(lo);
			lo.clear();
			lo.addAll(aux1);
			
			
			
			for(j=0;j<INI.size();j++){
				if(lo.contains(INI.elementAt(j))) {
					to.addElement(FIN.elementAt(j));
					to2.addElement(FIN.elementAt(j));
				}
			}
			
			if (ti.size()==1&&li.size()>1&&lo.size()==1)	operacionAND();
			if (ti.size()==1&&lo.size()>1)					operacionCONCU();
			if (ti.size()==1&&li.size()==1&&lo.size()==1)	operacionRETAR();
			if (ti.size()>1&&li.size()>1&&lo.size()==1)		operacionOR();
			if (ti.size()>1&&li.size()>1&&lo.size()>1)		operacionSINC();
		}
		
		void casos_secuenciales(){
			Vector lo1=new Vector();
			for (int i=0;i<lugares.size()/4;i++){
				if(lugares.elementAt(4*i+1)=="0"){
					lo1.addElement((String) lugares.elementAt(4*i));
					}
			}
			int g;
			Vector pun=new Vector();
			int r;
			int ct;
			ct=ti.size();
			for(int k=0;k<(transiciones.size()/4-ct);k++){
				for(int i=0;i<INI.size();i++){
					if(taux.contains(INI.elementAt(i))){
						g=taux.indexOf(INI.elementAt(i));
						//jTextArea.append("g:"+g+" taux:"+taux.elementAt(g)+"\r\n");
						pun.addElement(FIN.elementAt(i));
						pun.addElement(taux.elementAt(g+1));
					}
					}
				for(int i=0;i<lugares.size()/4;i++){
					if(pun.contains(lugares.elementAt(4*i))){
						r=pun.indexOf(lugares.elementAt(4*i));
						lugares.removeElementAt(4*i+3);
						lugares.add(4*i+3, pun.elementAt(r+1));
						if(lugares.elementAt(4*i+2)=="-") {
							lugares.removeElementAt(4*i+2);
							lugares.add(4*i+2, pun.elementAt(r+1));
						}
					}
					//jTextArea.append("des: "+lugares.elementAt(3*i+2)+"\r\n");
				}
			
				if(lo1.size()>1){
					li.removeAllElements();
					ti.removeAllElements();
					ti2.removeAllElements();
					for(int j=0;j<FIN.size();j++){
						if(to.contains(FIN.elementAt(j))) {
							li.addElement(INI.elementAt(j));
					//		jTextArea.append("li="+INI.elementAt(j)+"\r\n");
						}
					}
					lo.removeAllElements();
					to.removeAllElements();
					for(int j=0;j<INI.size();j++){
							if(li.contains(INI.elementAt(j))) {
								ti.addElement(FIN.elementAt(j));
								ti2.addElement(FIN.elementAt(j));
								}
							}
					Set aux = new HashSet();
					aux.addAll(ti);
					ti.clear();
					ti.addAll(aux);
					ti2.addAll(aux);
					for(int j=0;j<INI.size();j++){
						if(ti.contains(INI.elementAt(j))) {
							lo.addElement(FIN.elementAt(j));
						}
					}
					Set aux1 = new HashSet();
					aux1.addAll(lo);
					lo.clear();
					lo.addAll(aux1);
					
					for(j=0;j<INI.size();j++){
						if(lo.contains(INI.elementAt(j))) {
							to.addElement(FIN.elementAt(j));
							to2.addElement(FIN.elementAt(j));
						}
					}
					//jTextArea.append("li:"+li.size()+"lo:"+lo.size()+"ti:"+ti.size()+"\r\n");
					if (ti.size()==1&&li.size()>1&&lo.size()==1)	operacionAND_S();
					if (ti.size()==1&&lo.size()>1)					operacionCONCU_S();
					if (ti.size()==1&&li.size()==1&&lo.size()==1)	operacionRETAR_S();
					if (ti.size()>1&&li.size()>1&&lo.size()==1)		operacionOR_S();
					if (ti.size()>1&&li.size()>1&&lo.size()>1)		operacionSINC_S();
				}
			}
		
		}
		void retardos_ms(){
			int t;
			Vector retardo=new Vector();
			for(int i=0;i<transiciones.size()/4;i++){
				t=Integer.valueOf((String) transiciones.elementAt(4*i+2)).intValue();
				retardo.addElement(t);
			}
			Set aux = new HashSet();
			aux.addAll(retardo);
			retardo.clear();
			retardo.addAll(aux);
			jTextArea.append("\tGOTO\tCONFIGURACION\r\n");
			for(int j=0;j<retardo.size();j++){
				int m;
				m=(Integer) retardo.elementAt(j);
				switch(m){
				case 10:
					jTextArea.append("RETARDO_10\r\n");
					jTextArea.append("\tMOVLW\t.100;\r\n");
					jTextArea.append("\tMOVWF\tB1;\r\n");
					jTextArea.append("DOS\r\n");
					jTextArea.append("\tMOVLW\t.32;\r\n");
					jTextArea.append("\tMOVWF\tA1;\r\n");
					jTextArea.append("UNO\r\n");
					jTextArea.append("\tDECFSZ\tA1,F;\r\n");
					jTextArea.append("\tGOTO\tUNO;\r\n");
					jTextArea.append("\tDECFSZ\tB1,F;\r\n");
					jTextArea.append("\tGOTO\tDOS;\r\n");
					jTextArea.append("\tRETURN;\r\n");
					break;
				case 100: 
					jTextArea.append("RETARDO_100\r\n");
					jTextArea.append("\tMOVLW\t.200;\r\n");
					jTextArea.append("\tMOVWF\tD1;\r\n");
					jTextArea.append("CUATRO\r\n");
					jTextArea.append("\tMOVLW\t.165;\r\n");
					jTextArea.append("\tMOVWF\tC1;\r\n");
					jTextArea.append("TRES\r\n");
					jTextArea.append("\tDECFSZ\tC1,F;\r\n");
					jTextArea.append("\tGOTO\tTRES;\r\n");
					jTextArea.append("\tDECFSZ\tD1,F;\r\n");
					jTextArea.append("\tGOTO\tCUATRO;\r\n");
					jTextArea.append("\tRETURN;\r\n");
					break;
				case 250:
					jTextArea.append("RETARDO_250\r\n");
					jTextArea.append("\tMOVLW\t.100;\r\n");
					jTextArea.append("\tMOVWF\tG1;\r\n");
					jTextArea.append("SIETE\r\n");
					jTextArea.append("\tMOVLW\t.100;\r\n");
					jTextArea.append("\tMOVWF\tF1;\r\n");
					jTextArea.append("SEIS\r\n");
					jTextArea.append("\tMOVLW\t.7;\r\n");
					jTextArea.append("\tMOVWF\tE1;\r\n");
					jTextArea.append("CINCO\r\n");
					jTextArea.append("\tDECFSZ\tE1,F;\r\n");
					jTextArea.append("\tGOTO\tCINCO;\r\n");
					jTextArea.append("\tDECFSZ\tF1,F;\r\n");
					jTextArea.append("\tGOTO\tSEIS;\r\n");
					jTextArea.append("\tDECFSZ\tG1,F;\r\n");
					jTextArea.append("\tGOTO\tSIETE;\r\n");
					jTextArea.append("\tRETURN;\r\n");
					break;
				
				case 500: 
				jTextArea.append("RETARDO_500\r\n");
				jTextArea.append("\tMOVLW\t.100;\r\n");
				jTextArea.append("\tMOVWF\tJ1;\r\n");
				jTextArea.append("DIEZ\r\n");
				jTextArea.append("\tMOVLW\t.100;\r\n");
				jTextArea.append("\tMOVWF\tI1;\r\n");
				jTextArea.append("NUEVE\r\n");
				jTextArea.append("\tMOVLW\t.15;\r\n");
				jTextArea.append("\tMOVWF\tH1;\r\n");
				jTextArea.append("OCHO\r\n");
				jTextArea.append("\tDECFSZ\tH1,F;\r\n");
				jTextArea.append("\tGOTO\tOCHO;\r\n");
				jTextArea.append("\tDECFSZ\tI1,F;\r\n");
				jTextArea.append("\tGOTO\tNUEVE;\r\n");
				jTextArea.append("\tDECFSZ\tJ1,F;\r\n");
				jTextArea.append("\tGOTO\tDIEZ;\r\n");
				jTextArea.append("\tRETURN;\r\n");break;
				}
				
			}
			
		}
		
		void operacionAND(){
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
													
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
				}
			}
			cetq++;
	}

		void operacionAND_S(){
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					valor=(String) lugares.elementAt(4*i+3);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if(puerto==valor){
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"){
						if(valor=="1"){						
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
						}
					}
					if(puerto=="RD6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
						}
					}
					if(puerto=="RD7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
				}
				
			
			}
			cetq++;
		//	jTextArea.append("etiqueta"+cetq+"\r\n");
			
			int g;
			Vector pun=new Vector();
			for(int i=0;i<INI.size();i++){
			if(taux.contains(INI.elementAt(i))){
				g=taux.indexOf(INI.elementAt(i));
				pun.addElement(FIN.elementAt(i));
				pun.addElement(taux.elementAt(g+1));
			}
			}
			
			int r;
			return;
		}
		
		void operacionCONCU(){
			//jTextArea.append("CONCURRENCIA\r\n");
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto.substring(0,2).equals("RB")){
						switch(lo.size()){
						case 2:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XFC;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						case 3:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XF8;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						
					case 4:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tMOVLW\t0XF0;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 5:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XE0;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 6:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XC0;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 7:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0X80;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 8:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					}
					}
					if(puerto.substring(0,2).equals("RD")){
						switch(lo.size()){
						case 2:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XFC;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						case 3:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XF8;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						
					case 4:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XF0;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 5:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XE0;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 6:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XC0;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 7:
						if(valor=="1"){
							
							aux.add(caux,"1");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
						
							aux.add(caux,"1");
							jTextArea.append("\tMOVLW\t0X80;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 8:
						if(valor=="1"){
							
							aux.add(caux,"1");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					}
					}
					}
			
		
			}
			cetq++;
			
		}
		
		void operacionCONCU_S(){
			//jTextArea.append("concurreciasec\r\n");
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					valor=(String) lugares.elementAt(4*i+3);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tBTFSS\t"+puerto+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto==valor){
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}	
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto.substring(0,2).equals("RB")){
						switch(lo.size()){
						case 2:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
								
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XFC;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						case 3:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XF8;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTB;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						
					case 4:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XF0;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 5:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XE0;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 6:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XC0;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 7:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0X80;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
					}break;
					case 8:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCLRF\tPORTB;\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTB;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					}
					}
					if(puerto.substring(0,2).equals("RD")){
						switch(lo.size()){
						case 2:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XFC;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X03;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						case 3:
							if(valor=="1"){
								
								
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tCLRF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
							}else
							{
								
								
								jTextArea.append("\tMOVLW\t0XF8;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
								jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
								jTextArea.append("\tMOVLW\t0X07;\r\n");
								jTextArea.append("\tMOVWF\tPORTD;\r\n");
								taux.addElement(transiciones.elementAt(4*i));
								taux.addElement("AUX"+caux);
								caux++;
						}break;
						
					case 4:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XF0;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X0F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 5:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							jTextArea.append("\tMOVLW\t0XE0;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X1F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 6:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tMOVLW\t0XC0;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X3F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 7:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
						
							
							jTextArea.append("\tMOVLW\t0X80;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0X7F;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					case 8:
						if(valor=="1"){
							
							
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCLRF\tPORTD;\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tAUX"+caux+";\r\n");
							jTextArea.append("\tCALL\tRETARDO_"+transiciones.elementAt(4*i+2)+";\r\n");
							jTextArea.append("\tMOVLW\t0XFF;\r\n");
							jTextArea.append("\tMOVWF\tPORTD;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
					}break;
					}
					}
					}
					}
			cetq++;
			int g;
			Vector pun=new Vector();
			for(int i=0;i<INI.size();i++){
			if(taux.contains(INI.elementAt(i))){
				g=taux.indexOf(INI.elementAt(i));
				//jTextArea.append("g:"+g+" taux:"+taux.elementAt(g)+"\r\n");
				pun.addElement(FIN.elementAt(i));
				pun.addElement(taux.elementAt(g+1));
			}
			}
			
			
			return;
		}
		
		void operacionOR(){
			//jTextArea.append("OR\r\n");
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSC\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSC\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSC\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSC\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSC\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSC\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSC\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSC\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSC\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			boolean band=true;
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"&&band){
						if(valor=="1"){
							
						
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							band=false;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							band=false;
						}
					}
					if(puerto=="RB3"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"&&band){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
							
						}
					}
					if(puerto=="RD6"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					
				}
				
			
			}
			cetq++;
			
		}
		void operacionOR_S(){
			//jTextArea.append("orsecuencial\r\n");	
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					valor=(String) lugares.elementAt(4*i+3);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSC\tPORTA,0;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSC\tPORTA,1;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSC\tPORTA,2;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSC\tPORTA,3;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSC\tPORTA,4;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSC\tPORTA,5;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSC\tPORTE,0;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSC\tPORTE,1;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSC\tPORTE,2;\r\n");
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto==valor){
						jTextArea.append("\tBTFSC\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			boolean band=true;
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
						
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							band=false;
						}
					}
					if(puerto=="RB5"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							band=false;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"&&band){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
							
						}else
						{
							
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"&&band){
						if(valor=="1"){
							
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD6"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"&&band){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							band=false;
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					
				}
			}
			cetq++;
			
			
		}
		
		void operacionRETAR(){
			//jTextArea.append("RETARDO\r\n");
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
							
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"){
						if(valor=="1"){
							
						
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
						
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					
				}
				
			}
			cetq++;
			
			
		}
		
		void operacionRETAR_S(){
			//jTextArea.append("retarsecuencial\r\n");
			String puerto,valor;
			jTextArea.append("etiqueta"+cetq+"\r\n");
			cetq++;
			for (int i=0;i<lugares.size()/4;i++){
				if(li.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					valor=(String) lugares.elementAt(4*i+3);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if(puerto==valor){
						jTextArea.append("\tBTFSS\t"+valor+",0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			cetq++;
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			jTextArea.append("etiqueta"+cetq+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
				}
				
			}
			cetq++;
			int g;
			Vector pun=new Vector();
			for(int i=0;i<INI.size();i++){
			if(taux.contains(INI.elementAt(i))){
				g=taux.indexOf(INI.elementAt(i));
				//jTextArea.append("g:"+g+" taux:"+taux.elementAt(g)+"\r\n");
				pun.addElement(FIN.elementAt(i));
				pun.addElement(taux.elementAt(g+1));
			}
			}
			
			
			return;
		}
		
		void operacionSINC(){
			jTextArea.append("SINCRONIZACION\r\n");
			String puerto,valor;
			Vector li1=new Vector();
			Vector ti1=new Vector();
			for(int k=0;k<ti.size();k++){
				jTextArea.append("etiqueta"+cetq+"\r\n");
				cetq++;
				if(cetq==2) cetq=0;
				for (int l=0;l<FIN.size();l++){
				if(ti2.firstElement()==FIN.elementAt(l)){
					li1.addElement(INI.elementAt(l));
				}
			}
			ti1.addElement(ti.elementAt(k));	
			for (int i=0;i<lugares.size()/4;i++){
				if(li1.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			if(cetq==0)	cetq=2;
			jTextArea.append("\tGOTO\tetiqueta"+(cetq+1)+"\r\n");
			jTextArea.append("etiqueta"+(cetq+1)+"\r\n");
			if(cetq==2)	cetq=0;
			//jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			//jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti1.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"){
						if(valor=="1"){
						
							
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"){
						if(valor=="1"){
						
							
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							aux.removeElementAt(caux);
							
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
						
					}
					
				}
			}
			int cau;
			if(caux==2)	cau=0;
			else	cau=caux;
			jTextArea.append("\tBTFSS\tAUX"+(cau)+",0;\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			if(cetq==0)	cetq=1;
			jTextArea.append("\tGOTO\tetiqueta"+(cetq+3)+"\r\n");
			li1.removeAllElements();
			ti1.removeAllElements();
			ti2.removeElement(ti2.firstElement());
		}
		cetq=4;
		}
		
		void operacionSINC_S(){
			//jTextArea.append("sinc_secuencial\r\n");	
			String puerto,valor;
			int cet,ca;
			Vector li1=new Vector();
			Vector ti1=new Vector();
			cet=cetq;
			ca=caux;
			for(int k=0;k<ti.size();k++){
				jTextArea.append("etiqueta"+cetq+"\r\n");
				cetq++;
				if(cetq==cet+2) cetq=cet;
				for (int l=0;l<FIN.size();l++){
				if(ti2.firstElement()==FIN.elementAt(l)){
					li1.addElement(INI.elementAt(l));
					}
				}
			ti1.addElement(ti.elementAt(k));	
			for (int i=0;i<lugares.size()/4;i++){
				if(li1.contains(lugares.elementAt(4*i))){
					puerto=(String) lugares.elementAt(4*i+2);
					valor=(String)lugares.elementAt(4*i+3);
					if (puerto=="RA0") {
						jTextArea.append("\tBTFSS\tPORTA,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						
						
					}
					if (puerto=="RA1"){
						jTextArea.append("\tBTFSS\tPORTA,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA2") {
						jTextArea.append("\tBTFSS\tPORTA,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA3") {
						jTextArea.append("\tBTFSS\tPORTA,3;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA4"){
						jTextArea.append("\tBTFSS\tPORTA,4;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RA5") {
						jTextArea.append("\tBTFSS\tPORTA,5;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE0"){
						jTextArea.append("\tBTFSS\tPORTE,0;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE1") {
						jTextArea.append("\tBTFSS\tPORTE,1;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if (puerto=="RE2"){
						jTextArea.append("\tBTFSS\tPORTE,2;\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					if(puerto==valor){
						jTextArea.append("\tBTFSS\t"+valor+",0"+"\r\n");
						jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
					}
					}
			}
			if(cetq==cet)	cetq=cet+2;
			jTextArea.append("\tGOTO\tetiqueta"+(cetq+1)+"\r\n");
			jTextArea.append("etiqueta"+(cetq+1)+"\r\n");
			if(cetq==cet+2)	cetq=cet;
			//jTextArea.append("\tGOTO\tetiqueta"+(cetq-2)+"\r\n");
			//jTextArea.append("etiqueta"+(cetq-1)+"\r\n");
			for (int i=0;i<transiciones.size()/4;i++){
				if(ti1.contains(transiciones.elementAt(4*i))){
					puerto=(String) transiciones.elementAt(4*i+1);
					valor=(String) transiciones.elementAt(4*i+3);
					if(puerto=="RB0"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,3;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB5"){
						if(valor=="1"){
						
							
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RB7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTB,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTB,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD0"){
						if(valor=="1"){
						
							
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,0;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,0;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD1"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,1;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,1;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD2"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
												
							jTextArea.append("\tBCF\tPORTD,2;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,2;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD3"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,3;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,3;\r\n");
						}
					}
					if(puerto=="RD4"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,4;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,4;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD5"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,5;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,5;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD6"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,6;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,6;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
					}
					if(puerto=="RD7"){
						if(valor=="1"){
							
							
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}else
						{
							
							
							jTextArea.append("\tBCF\tPORTD,7;\r\n");
							jTextArea.append("\tBSF\tAUX"+caux+",0;\r\n");
							jTextArea.append("\tCALL RETARDO_"+transiciones.elementAt(4*i+2)+"\r\n");
							jTextArea.append("\tBSF\tPORTD,7;\r\n");
							taux.addElement(transiciones.elementAt(4*i));
							taux.addElement("AUX"+caux);
							caux++;
						}
						
					}
				}
			}
			int cau;
			if(caux==ca+2)	cau=ca;
			else	cau=caux;
			jTextArea.append("\tBTFSS\tAUX"+(cau)+",0;\r\n");
			jTextArea.append("\tGOTO\tetiqueta"+cetq+"\r\n");
			if(cetq==cet)	cetq=cet+1;
			jTextArea.append("\tGOTO\tetiqueta"+(cetq+3)+"\r\n");
			li1.removeAllElements();
			ti1.removeAllElements();
			ti2.removeElement(ti2.firstElement());
		}
		cetq=cetq+3;
		}
		private void guardar_archivo(){
			 String Texto =jTextArea.getText();
			 try{
			 //System.getProperty("user.dir") Abre el JFileChooser donde esta el ejecutable
			    JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
			   fc.showSaveDialog(this); //Muestra el diálogo
			   File Guardar =fc.getSelectedFile();
			   if(Guardar !=null){
			     FileWriter  Guardx=new FileWriter(Guardar);
			     Guardx.write(Texto);
			     Guardx.close(); //Cierra el fichero
			    }
			  }
			  catch(IOException ioe){
			  System.out.println(ioe); //Muestra por consola los errores
			 } 
		 }
		
		/**
		 * This method initializes jContentPane6	
		 * 	
		 * @return javax.swing.JPanel	
		 */
		

		/**
		 * This method initializes jButton9	
		 * 	
		 * @return javax.swing.JButton	
		 */
		private JButton getJButton9() {
			if (jButton9 == null) {
				jButton9 = new JButton();
				jButton9.setText("Aceptar");
				jButton9.setBounds(new Rectangle(366, 134, 86, 29));
				jButton9.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						jInternalFrame4.setVisible(false); // TODO Auto-generated Event stub actionPerformed()
					}
				});
			}
			return jButton9;
		}

		/**
		 * This method initializes jInternalFrame4	
		 * 	
		 * @return javax.swing.JInternalFrame	
		 */
		private JInternalFrame getJInternalFrame4() {
			if (jInternalFrame4 == null) {
				jInternalFrame4 = new JInternalFrame();
				jInternalFrame4.setBounds(new Rectangle(287, 64, 495, 205));
				jInternalFrame4.setTitle("Acerca de...");
				jInternalFrame4.setContentPane(getJContentPane7());
				jInternalFrame4.setVisible(false);
			}
			return jInternalFrame4;
		}

		/**
		 * This method initializes jContentPane7	
		 * 	
		 * @return javax.swing.JPanel	
		 */
		private JPanel getJContentPane7() {
			if (jContentPane7 == null) {
				
					jLabel9 = new JLabel();
					jLabel9.setIcon(new ImageIcon("C:/Users/Gau/Pictures/unet1.jpg"));
					jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
					jLabel9.setHorizontalTextPosition(SwingConstants.CENTER);
					jLabel9.setBounds(new Rectangle(396, 44, 65, 66));
					jLabel9.setText("");
					jLabel8 = new JLabel();
					jLabel8.setIcon(new ImageIcon("C:/Users/Gau/Pictures/redepicmini.png"));
					jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
					jLabel8.setHorizontalTextPosition(SwingConstants.CENTER);
					jLabel8.setBounds(new Rectangle(4, 16, 82, 120));
					jLabel8.setText("");
					jLabel722 = new JLabel();
					jLabel722.setText("Autor: Ing. Gaudi Karina Morantes Quintana");
					jLabel722.setBounds(new Rectangle(112, 101, 259, 28));
					jLabel721 = new JLabel();
					jLabel721.setText("Unet. Tesis de Maestria Ingenieria Electrónica");
					jLabel721.setBounds(new Rectangle(112, 78, 262, 28));
					jLabel72 = new JLabel();
					jLabel72.setText("(c) Copyright 2011");
					jLabel72.setBounds(new Rectangle(112, 54, 175, 26));
					jLabel71 = new JLabel();
					jLabel71.setText("Version 1.0");
					jLabel71.setBounds(new Rectangle(112, 27, 173, 27));
					jLabel7 = new JLabel();
					jLabel7.setText("Herramienta de Programacion de uC PIC con  Redes de Petri");
					jLabel7.setBounds(new Rectangle(82, 3, 356, 26));
					jContentPane7 = new JPanel();
					jContentPane7.setLayout(null);
					jContentPane7.add(jLabel8, null);
					jContentPane7.add(jLabel9, null);
					jContentPane7.add(getJButton9(), null);
					jContentPane7.add(jLabel7, null);
					jContentPane7.add(jLabel71, null);
					jContentPane7.add(jLabel72, null);
					jContentPane7.add(jLabel721, null);
					jContentPane7.add(jLabel722, null);
			}
			return jContentPane7;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					redesdepetri thisClass = new redesdepetri();
					thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					thisClass.setVisible(true);
				}
			});
		}
		public redesdepetri() {
			super();
			initialize();
		}

		/**
		 * This method initializes this
		 * 
		 * @return void
		 */
		private void initialize() {
			this.setFont(new Font("DokChampa", Font.BOLD | Font.ITALIC, 24));
			this.setSize(new Dimension(1244, 745));
			this.setLocation(new Point(0, 0));
			this.setJMenuBar(getJJMenuBar());
			this.setMinimumSize(new Dimension(50, 100));
			this.setBackground(new Color(238, 238, 238));
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/Gau/Pictures/redepicmini.png"));
			this.setForeground(Color.white);
			this.setPreferredSize(new Dimension(2147483647, 2147483647));
			this.setContentPane(getJContentPane());
			this.setTitle("Herramienta de Programacion de RdPTN");
		}

		/**
		 * This method initializes jContentPane
		 * 
		 * @return javax.swing.JPanel
		 */
		private JPanel getJContentPane() {
			if (jContentPane == null) {
				jContentPane = new JPanel();
				jContentPane.setLayout(null);
				jContentPane.add(getJJToolBarBar(), null);
				jContentPane.add(getJJToolBarBar1(), null);
				jContentPane.add(getJJToolBarBar2(), null);
				jContentPane.add(getJPanel(), null);
				jContentPane.add(getJInternalFrame(), null);
				jContentPane.add(getJInternalFrame1(), null);
				jContentPane.add(getJInternalFrame2(), null);
				jContentPane.add(getJInternalFrame3(), null);
			}
			return jContentPane;
		}



}  //  @jve:decl-index=0:visual-constraint="10,10"
