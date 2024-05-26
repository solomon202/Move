
public class Game {
	

	private Ramka ramka; //содержит класс рамку с методами 
	private Grafica grafica;
	
	public Game() {
			 grafica = new Grafica();
			 ramka = new Ramka(grafica);//передается ссылка на грфику 
		
	
		}

}
