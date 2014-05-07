package Banco.de.dados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlLite extends SQLiteOpenHelper {
	
	public static  String TABLE_NAME = "Aluno";
	public static  String cod_aluno = "cod_aluno";
	public static  String nome_aluno = "nome_aluno";
	public static  String CPF = "CPF";
	public static  String data_nascimento = "data_nascimento";
	public static  String endereco = "endereco";
	public static  String email = "email";
	public static  String cod_curso = "cod_curso";
	public static  String login = "login";
	public static  String senha = "senha";
	
	private static  String DATABASE_NAME = "academico.db";
	private static  int DATABASE_VERSION = 1;
	 

	 
	public SqlLite(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	 public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	 db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
	 onCreate(db);
	 }
	 
	 @Override
	 public void onCreate(SQLiteDatabase db) {
	 db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + cod_aluno
	 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + nome_aluno + " TEXT NOT NULL, "
	 + CPF + " INTEGER"
	 + data_nascimento + " DATE, "
	 + endereco		+ ""
	 		+ ");");
	 }	
}
