package br.com.rcc.appdb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafael Carvalho on 04/09/2016.
 */
public class DBHelper {

    private static final String database_name = "bancodedados.db";
    private static final int database_version = 1;
    private static final String tabela_name = "contato";


    private Context context;
    private SQLiteDatabase db;

    private SQLiteStatement insertStrt;
    private static final String INSERT = "insert into " + tabela_name + "(nome, endereco, empresa) values (?,?,?)";

    public DBHelper(Context context) {
        this.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);
        this.db = openHelper.getWritableDatabase();
        this.insertStrt = this.db.compileStatement(INSERT);

    }


    public long insert(String nome, String endereco, String empresa) {
        this.insertStrt.bindString(1, nome);
        this.insertStrt.bindString(2, endereco);
        this.insertStrt.bindString(3, empresa);

        return this.insertStrt.executeInsert();
    }

    public void deletAll() {
        this.db.delete(tabela_name, null, null);
    }

    public List<Contato> queryAll() {

        List<Contato> list = new ArrayList<Contato>();

        try {

            Cursor cursor = this.db.query(tabela_name, new String[]{"nome", "endereco", "empresa"},
                    null, null, null, null, null, null);
            int nregistros = cursor.getCount();

            if (nregistros != 0) {
                cursor.moveToFirst();
                do {
                    Contato contato = new Contato(cursor.getString(0), cursor.getString(1), cursor.getString(2));
                    list.add(contato);
                } while (cursor.moveToNext());

                if (cursor != null && !cursor.isClosed())
                    cursor.close();
                return list;
            } else

                return null;

            }catch(Exception err){
            return null;

             }
        }

       private static class OpenHelper extends SQLiteOpenHelper {
            OpenHelper(Context context) {
                super(context, database_name, null, database_version);

            }

        public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE IF NOT  EXISTS "+tabela_name+" (id INTERGER PRIMERY KEY, nome TEXT, endereco TEXT, empresa TEXT);";
        db.execSQL(sql);

        }
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            db.execSQL("DROP TABLE IF EXISTS "+tabela_name);
            onCreate(db);

        }


          }
}

