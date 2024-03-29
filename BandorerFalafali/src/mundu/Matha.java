package mundu;

import jungle_1.*;
import shobdo.ShobdoKori;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import Over.AtkanoPata;
import Over.Morsi;
import Over.SesherPata;
import coin.Coin;

public class Matha extends StateBasedGame{
	
	private static final String gameName = "BandorerKichhuEkta...!";
	private static final int shururPata = 0;
	private static final int loading = 1;
	private static final int stage_1 = 2;
	private static final int stage_2 = 3;
	private static final int stage_3 = 4;
	private static final int stage_4 = 5;
	private static final int shesherPata = 6;
	private static final int atkanoPata = 7;
	private static final int morsi = 8;

	public Matha(String gameName){
		super(gameName);
		this.addState(new ShururPata(shururPata));
		this.addState(new Loading(loading));
		this.addState(new Stage_1(stage_1));
		this.addState(new Stage_2(stage_2));
		this.addState(new Stage_3(stage_3));
		this.addState(new Stage_4(stage_4));
		this.addState(new SesherPata(shesherPata));
		this.addState(new AtkanoPata(atkanoPata));
		this.addState(new Morsi(morsi));
	}

	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(shururPata).init(gc, this);
		this.getState(loading).init(gc, this);
		this.getState(stage_1).init(gc, this);
		this.getState(stage_2).init(gc, this);
		this.getState(stage_3).init(gc, this);
		this.getState(stage_4).init(gc, this);
		this.getState(shesherPata).init(gc, this);
		this.getState(atkanoPata).init(gc, this);
		this.getState(morsi).init(gc, this);
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
			Coin.init();
			Coin.points = 0;
			JaDorkar.clearKormu = false;
			kola.start();

		} catch(SlickException e){
			e.printStackTrace();
		}
	}
	
}