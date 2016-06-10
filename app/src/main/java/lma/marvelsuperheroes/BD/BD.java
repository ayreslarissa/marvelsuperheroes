package lma.marvelsuperheroes.BD;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import lma.marvelsuperheroes.HeroesData;


public class BD extends BDCore {

	private SQLiteDatabase bd ;
	private static final String TABLE_NAME = "heroes";
	private Cursor cursor;

	private int indexNome;
	private int indexFoto;
	private BDCore bdCore;
	private BD banco;
	private static final String SQL_SELECT_ALL = "SELECT nome, foto FROM heroes ORDER BY nome";

	public BD(Context context) {
		super(context);
		bdCore = new BDCore(context);
 		bd = bdCore.getWritableDatabase();
	}

	public ArrayList<HeroesData> getAllHeroes() {
		ArrayList<HeroesData> heroes = new ArrayList<>();
		HeroesData heroesData;

		this.cursor = this.bd.rawQuery(SQL_SELECT_ALL, null);

		while(this.cursor.moveToNext()) {

				heroesData = new HeroesData(this.cursor.getString(cursor.getColumnIndex("nome")),
						this.cursor.getInt(cursor.getColumnIndex("foto")));
			//this.cursor.getString(cursor.getColumnIndex("descricao")));
				heroes.add(heroesData);

		}
		return heroes;
	}



}
