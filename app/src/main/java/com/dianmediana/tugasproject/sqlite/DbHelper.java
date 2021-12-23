package com.dianmediana.tugasproject.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.dianmediana.tugasproject.model.DataModelUsers;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {
    private static final String database_name = "db_cutlories";

    public static final String table_users = "users";
    public static final String row_id = "id";
    public static final String row_name = "name";
    public static final String row_age = "age";
    public static final String row_gender = "gender";
    public static final String row_email = "email";
    public static final String row_body = "partOfDreamBody";
    public static final String row_height = "bodyHeight";
    public static final String row_weight = "bodyWeight";


    private static SQLiteDatabase db;
    private Context context;

    public DbHelper(@Nullable Context context) {
        super(context, database_name, null, 1);
        db = getWritableDatabase();
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + table_users + "(" + row_id + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + row_name + " TEXT," + row_age + " INTEGER," + row_height + " INTEGER," + row_weight + " INTEGER," + row_gender + " TEXT," + row_email + " TEXT," + row_body + " TEXT)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_users);
    }

    public static void insertUsers(ContentValues values){
        db.insert(table_users, null, values);
    }

    public ArrayList<DataModelUsers> readAllData(){
        String sql = "select * from " + table_users;
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<DataModelUsers> users = new ArrayList<>();

        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
            do{
                users.add(new DataModelUsers(
                        Integer.parseInt(cursor.getString(0)),
                        cursor.getString(1),
                        Integer.parseInt(cursor.getString(2)),
                        Integer.parseInt(cursor.getString(3)),
                        Integer.parseInt(cursor.getString(4)),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7)
                ));
            }while (cursor.moveToNext());
        }
        cursor.close();

        return users;
    }

    public Cursor readAllData2(SQLiteDatabase sqLiteDatabase){
        String sql = "select * from " + table_users;
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(sql, null);
        }
        return cursor;
    }

    void updateData(String row_id, String quest, String role, String status){
        ContentValues cv = new ContentValues();
//        cv.put(row_quest, quest);
//        cv.put(row_role_quest, role);
//        cv.put(row_status, status);

        long result = db.update(table_users, cv, "id_quest=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Updated Successfully!", Toast.LENGTH_SHORT).show();
        }
    }
    void deleteOneRow(String row_id){
        long result = db.delete(table_users, "id_quest=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Failed to Delete.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Successfully Deleted.", Toast.LENGTH_SHORT).show();
        }
    }
    public void deleteAll() {
        SQLiteDatabase db = getWritableDatabase();
        //deleting rows
        db.delete(table_users, null, null);
    }
}
