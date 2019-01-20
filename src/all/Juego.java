package all;

import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Juego {
    
   
    
    JFrame ventana;
    JPanel panelJuego;
    JLabel fondo;
    
    ArrayList<JLabel> Sniky;
    int x;
    int y; 
    int desplazamiento = 25;
    Timer tiempo;
    int ban =0;
    Rectangle serp;
    
    //comida
    JLabel comida;
    int cx = 0;
    int cy = 0;
    Rectangle comi;
    int gameOver;
    //puntuacion
    JLabel puntuacion;
    int contador;
    Scanner in = new Scanner(System.in);
    int continuar;
    
     
    public Juego(){
        
                  
               do{
                
                   
        
        //Ventana
        ventana = new JFrame("Sniky The Snake");
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        //panel
        panelJuego= new JPanel();
        panelJuego.setSize(ventana.getSize());
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        //panelJuego.setBackground(Color.black);           //Color solido...
        
        
        //fondo
        fondo = new JLabel();
        fondo.setSize(panelJuego.getSize());
        fondo.setIcon(new ImageIcon("imagenes/fondo2.jpg"));
        fondo.setVisible(true);
        panelJuego.add(fondo,0);
        
         //Serpiente
         Sniky = new ArrayList<>();
         
         JLabel aux = new JLabel();
         aux.setLocation(290, 290);
         aux.setSize(60,60);
         aux.setIcon(new ImageIcon("imagenes/1.png"));
         aux.setVisible(true);
         Sniky.add(aux);
         panelJuego.add(Sniky.get(0),0);
        
        ventana.add(panelJuego);
        
        //comida
        comida = new JLabel();
        comida.setSize(50,50);
        comida.setIcon(new ImageIcon("imagenes/6.png"));
        Random aleatorio = new Random();
        cx = aleatorio.nextInt(480);
        cy = aleatorio.nextInt(480);
        comida.setLocation(cx , cy);
        comida.setVisible(true);
        panelJuego.add(comida,0);
        
        serp = new Rectangle(Sniky.get(0).getBounds());
        comi = new Rectangle(comida.getBounds());
        
        puntuacion = new JLabel("Puntuacion: " + contador );
        puntuacion.setBounds(10, 20, 100, 20);
        puntuacion.setVisible(true);
        puntuacion.setForeground(Color.white);
        panelJuego.add(puntuacion,0);
        
        
        
        tiempo = new Timer(200, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                comi.setBounds(comida.getBounds());
                serp.setBounds(Sniky.get(0).getBounds());
                
                if(Sniky.get(0).getX() >530){ //borde lateral derecho
                    gameOver=1;
                }
                if(Sniky.get(0).getX() <=0){ //borde lateral izquierdo
                    gameOver=1;
                }if(Sniky.get(0).getY() >500){ //borde inferior
                    gameOver=1;
                }if(Sniky.get(0).getY() <=0){ //borde superior
                    gameOver=1;
                }
                if(gameOver == 1){
                    
                    tiempo.stop();
                }
                if(gameOver == 1){
                    
                    JOptionPane.showConfirmDialog(null,"Continuar?" );
                    
            }
                
                
            
            
            if(comi.intersects(serp) ){
                cx = aleatorio.nextInt(450);
                cy = aleatorio.nextInt(450);
                comida.setLocation(cx , cy);
                comida.repaint();
                
                 System.out.println("comi");
                 JLabel aux = new JLabel();
                 aux.setLocation(200,200);
                 aux.setSize(60,60);
                 aux.setIcon(new ImageIcon("imagenes/5.png"));
                 aux.setVisible(true);
                 Sniky.add(aux);
                 panelJuego.add(Sniky.get(Sniky.size()-1),0);
                 System.out.println(""+ Sniky.size());
                 contador ++;
                 puntuacion.setText("puntuacion: " + contador);
                 puntuacion.repaint();
                 
            }
            
            
            
             //Sniky.get(0).setLocation(Sniky.get(0).getX()+x, Sniky.get(0).getY()+y);
             for (int i = Sniky.size()-1; i > 0; i--){
                 Sniky.get(i).setLocation(Sniky.get(i-1).getLocation());
                 Sniky.get(i).repaint();
            }
             Sniky.get(0).setLocation(Sniky.get(0).getX()+x, Sniky.get(0).getY()+y);
             
            }
            
        });
         
            
            
        
        
        
           
      
        
        ventana.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            
                if(e.getKeyCode()== KeyEvent.VK_UP){
                    System.out.println("Arriba");
                    if(Sniky.get(0).getY() > 0){
                        y = -desplazamiento;
                        x =0;
                        Sniky.get(0).setIcon(new ImageIcon("imagenes/2.png"));
                    }
                    if(ban ==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                if(e.getKeyCode()== KeyEvent.VK_DOWN){
                    System.out.println("Abajo");
                    if(Sniky.get(0).getY() < 600){
                        y = desplazamiento;
                        x =0;
                        Sniky.get(0).setIcon(new ImageIcon("imagenes/4.png"));
                    }
                    if(ban ==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                if(e.getKeyCode()== KeyEvent.VK_LEFT){
                    System.out.println("Izquierda");
                    if(Sniky.get(0).getX() > 0){
                        y = 0;
                        x = -desplazamiento;
                        Sniky.get(0).setIcon(new ImageIcon("imagenes/3.png"));
                    }
                    if(ban ==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                if(e.getKeyCode()== KeyEvent.VK_RIGHT){
                    System.out.println("Derecha");
                    if(Sniky.get(0).getX() < 600){
                        y = 0;
                        x = desplazamiento;
                        Sniky.get(0).setIcon(new ImageIcon("imagenes/1.png"));
                    }
                    if(ban ==0){
                        tiempo.start();
                        ban=1;
                    }
                }
            
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        ventana.setVisible(true);
        
        }while(gameOver == 1);
            
    
    } //Fin del constructor 

            

} //Fin de la clase Juego.
