import javax.swing.JFrame;
//окно берем паке создаем экземпляр почему создаем потому что  рамки они бывают разными
///класс экран обстрактный потому что единственный экран 
public class Ramka {
	
	
	//Frame представляет окно с рамкой и хранит ссылку на его панель содержимого.
	
	  private JFrame jframe;
	     //получить  сылку на обьект 
		public Ramka(Grafica grafica) {
		//создать обьект окно с рамкой  и у него есть методы вызвали методы класса 
			jframe = new JFrame("Cosmos");
			//метод размер рамки 
			jframe.setSize(400,600);		
			//закрыть открыть 
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Элементы добавляются и удаляются методами, унаследованными от класса Container.
			//вставляем в рамку все методы  и параметры в рамку компонента обьект 
		///	Элементы, которые содержат другие элементы, называются контейнерами.
			//Все они являются потомками класса Container и наследуют от него ряд полезных методов:
		//	add(Component component) — добавляет в контейнер элемент component;
		 	jframe.add(grafica);
			//расположение по центру 
			jframe.setLocationRelativeTo(null);
		//сделать видимым рамку 
			jframe.setVisible(true);
			jframe.addKeyListener(grafica);
		}
}
