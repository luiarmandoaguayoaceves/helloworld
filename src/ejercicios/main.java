package ejercicios;

import javax.swing.*;
import java.util.Scanner;


public class main {
public static int opcion = 0;

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        do{
            Menu.menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:{
                    HolaMundo.hola();
                }
                break;
                case 2:{
                    ValorMayor.mayorValor();
                }
                break;
                case 3 :{
                    Ordenamiento.MetodoDeOrdenamiento();

                }
                break;
                case 4 :{
                    Cadena.cadena();

                }
                break;
                case 5 :{
                    IPHex.shieldsquare_IP2Hex();

                }
                break;
                case 6 :{
                    JFrame.ventana();

                }break;
                case 7 :{
                    new Espiral.ventana();
                }break;
                case 8 :{
                    Diagrama.Pieza panel = new Diagrama.Pieza();
                    JFrame windows = new JFrame();
                    windows.setTitle("Pastel");
                    windows.add(panel);
                    windows.setBounds(500, 350, 300, 300);
                    windows.setVisible(true);
                    windows.setResizable(false);
                    new Diagrama.Pieza();
                }break;
            case 9 :{
                new monito();
            }break;
            case 10 :{
                if(args.length == 1) {
                    String image = args[0];
                    imagen.Windows(image);
                }
            }break;
            case 11 :{
                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                frame.add(panel);
                frame.setVisible(true);
                frame.setBounds(400,400,400,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }break;
//            case 12 :{

//            }break;
                default:{
                    System.out.println("Ingresa un valor del menu");
                }
            }
        }while (opcion < 12);
    }
}
