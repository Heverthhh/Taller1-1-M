package thread;

import java.util.Random;
import javax.swing.ImageIcon;

public class Imagen2 extends Thread{
boolean activo=true;
Random img = new Random();
Random tiem = new Random();
int i=0;
int tiempo=0;
int c=0;

@Override
public void run(){
while(activo==true){
i=img.nextInt(4);
tiempo=tiem.nextInt(100);
if(i==1){
Interfaz.dos.setIcon(new ImageIcon(Interfaz.img1));
c=1;
}
if(i==2){
Interfaz.dos.setIcon(new ImageIcon(Interfaz.img2));
c=2;
}
if(i==3){
Interfaz.dos.setIcon(new ImageIcon(Interfaz.img3));
c=3;
}
try{
sleep(tiempo);
}catch(InterruptedException e){}
}
}
}