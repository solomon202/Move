import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveCircle implements KeyListener {
	
	
	
	
	 @Override
     public void keyPressed(KeyEvent e) {
         System.out.println("Working on top!");
         if (e.getKeyCode() == KeyEvent.VK_LEFT) {
             System.out.println("Working on bottom!");
            
         }
     }

     @Override
     public void keyReleased(KeyEvent e) {
         // TODO Auto-generated method stub
     }

     @Override
     public void keyTyped(KeyEvent e) {
         // TODO Auto-generated method stub
     }
 }



