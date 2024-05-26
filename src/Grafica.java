import java.awt.Color;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;


import javax.swing.JPanel;
//JPanel представляет область, в которой могут отображаться элементы управления и визуальные элементы


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//сам класс графика он вставляется в рамку в графике лист на котором рисуем компонент 
//Каждый компонент перед выводом на экран помещается в контейнер — подкласс класса Container.
//JPanel представляющий собой прямоугольное пространство, на котором можно размещать другие элементы используя его метод
//далее KeyListener — это интерфейс из пакета java.awt.event, который используется для обработки событий клавиатуры.
//Чтобы обработать событие от компонента ему (компоненту) надо указать объект который будет этим заниматься.
//он должен имплементировать интерфейс ActionListener. В интерфейсе всего один метод: actionPerformed(ActionEvent e), который и нужно реализовать вашему объекту - обработчику события.

public class Grafica  extends JPanel implements KeyListener , ActionListener {
	
	//extends JPanel implements KeyListener , ActionListener сдесь мы реализуем или  расширяем наследуем методы 
	// timer.start();а сдесь мы вызываем методы независимого класса и с помощью этих методов управляем временем 
	//координаты размер
	   private int x = 175, y = 480, H = 50, W = 50;
	   private int playerSpeed = 150; 
	  // Rectangle rectangle = new Rectangle(x,y,H,W);
	   
	   //нужен класс его метод который реализует данное движение 
	   //Давайте начнем с того, что анимация - это иллюзия изменений с течением времени. 
	   //* Меняем номер изображения по каждому тику таймера
	   public Grafica() {
		   Timer timer = new Timer(100,this);
		   timer.start();
		   
	    }
	   //Компонент Наследники класса Component у  него это метод JPanel- это объект, имеющий графическое представление, 
	  // который может отображаться на экране и взаимодействовать с пользователем  
	   //окрасить 
	   public void paint(Graphics g) {
		   super.paintComponent(g);
		   Graphics2D g2d = (Graphics2D) g;
		   // созданный объект Shape методу draw().
		   //Этот метод в конечном итоге рисует круг в окне, которое мы создали с использованием JFrame
		   //Ellipse2D обстрактный класс и обьект дабл с плавающей точкой 
		   //Ellipse2D.Double — это наследник абстрактного класса Ellipse2D:
		 
		   g2d.setColor(Color.BLUE);
	    //   g2d.fill(rectangle);
		 //  g2d.draw(rectangle);
		   g2d.fillRect(x, y, 50, 50); 
		   
	   }
	   
	   
	
	//обработчик событий 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	//обработчик нажатия кнопки 
	@Override
	public void keyPressed(KeyEvent e) {
		//движение происходит методом перересовки координат фигуры если координаты не ноль то плюсуем новую
		//координату к иксу 
		        int key = e.getKeyCode();
	           if (key == KeyEvent.VK_LEFT && x > 0) {
	        	   x -= playerSpeed;  // Перемещаем игрока влево
	           }
	           if (key == KeyEvent.VK_RIGHT && x < 350) {
	        	   x += playerSpeed;  // Перемещаем игрока вправо сначала приплюсовывается коорддината а движение происходит уже 
	        	   //при псваивании скорости.перескакивая на новую координату .
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

