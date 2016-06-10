package lma.marvelsuperheroes.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import lma.marvelsuperheroes.R;


public class BDCore extends SQLiteOpenHelper {

	private static final String NOME_BD = "marvelsuperheros";
	private static final int VERSAO_BD = 27;
	private static final int DATABASE_ACESS = 0;

	protected SQLiteDatabase database;

	private static final String SQL_CREATE_TABLES_HEROES = "CREATE TABLE if not exists heroes (" +
			"nome TEXT not null, foto INTEGER, descricao TEXT)";


	public static final String SQL_POPULATE_HEROES = "INSERT INTO heroes " +
			"VALUES "+
			"('Bucky Barnes'," + R.drawable.buckybarnes + ",'" + R.string.bucky_descrição + "')," +

			"('Capitão América'," + R.drawable.capitaoamerica_ + ", '" + R.string.capitao_descricao + "'),"+

			"('Ciclope'," + R.drawable.ciclope + ", '" + R.string.capitao_descricao + "'),"+

			"('Coisa'," + R.drawable.coisa + ", '" + R.string.capitao_descricao + "'),"+

			"('Daredevil'," + R.drawable.daredevil + ", '" + R.string.capitao_descricao + "'),"+

			"('Doutor Estranho'," + R.drawable.doutorestranho + ", '" + R.string.capitao_descricao + "'),"+

			"('Fera'," + R.drawable.fera + ", '" + R.string.capitao_descricao + "'),"+

			"('Gambit'," + R.drawable.gambit + ", '" + R.string.capitao_descricao + "'),"+

			"('Homem-Aranha'," + R.drawable.homemaranha + ", '" + R.string.capitao_descricao + "'),"+

			"('Homem de Ferro'," + R.drawable.homemdeferro + ", '" + R.string.capitao_descricao + "'),"+

			"('Homem-Formiga'," + R.drawable.homemformiga + ", '" + R.string.capitao_descricao + "'),"+

			"('Hulk'," + R.drawable.hulk + ", '" + R.string.capitao_descricao + "'),"+

			"('Magneto'," + R.drawable.magneto + ", '" + R.string.capitao_descricao + "'),"+

			"('Mulher Invisível'," + R.drawable.mulherinvisivel + ", '" + R.string.capitao_descricao + "'),"+

			"('Noturno'," + R.drawable.noturno + ", '" + R.string.capitao_descricao + "'),"+

			"('Thor'," + R.drawable.thor + ", '" + R.string.capitao_descricao + "'),"+

			"('Tocha Humana'," + R.drawable.tochahumana + ", '" + R.string.capitao_descricao + "'),"+

			"('Wolverine'," + R.drawable.wolverine + ", '" + R.string.capitao_descricao + "'),"+

			"('Lince Negra'," + R.drawable.lincenegra + ", '" + R.string.capitao_descricao + "'),"+

			"('Mercúrio'," + R.drawable.mercurio + ", '" + R.string.capitao_descricao + "')";


		private static final String SQL_DELETE_TABLES_HEROES = "DROP TABLE IF EXISTS heroes";

		public BDCore(Context context) {
			super(context, NOME_BD, null, VERSAO_BD);

		}


		@Override
		public void onCreate(SQLiteDatabase bd) {

			bd.execSQL(SQL_CREATE_TABLES_HEROES);
			bd.execSQL(SQL_POPULATE_HEROES);
		}

		@Override
		public void onUpgrade(SQLiteDatabase bd, int arg1, int arg2) {

		bd.execSQL(SQL_DELETE_TABLES_HEROES);

		onCreate(bd);
	}


}
