package mundu;

import jungle_1.*;
import shobdo.ShobdoKori;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Matha extends StateBasedGame{
	
	private static final String gameName = "BandorerKichhuEkta...!";
	private static final int shururPata = 0;
	private static final int loading = 1;
	private static final int stage_1 = 2;

	public Matha(String gameName){
		super(gameName);
		this.addState(new ShururPata(shururPata));
		this.addState(new Loading(loading));
		this.addState(new Stage_1(stage_1));
	}

	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(shururPata).init(gc, this);
		this.getState(loading).init(gc, this);
		this.getState(stage_1).init(gc, this);
		this.enterState(shururPata);
	}

	public static void main(String[] args){
		AppGameContainer kola;
		
		try{
			
			kola = new AppGameContainer(new Matha(gameName));
			kola.setDisplayMode(800, 600, false);
			kola.setTargetFrameRate(60);
			ShobdoKori.Splay();
			ShobdoKori.SAh1();
			kola.start();

		} catch(SlickException e){
			e.printStackTrace();
		}
	}
	
}