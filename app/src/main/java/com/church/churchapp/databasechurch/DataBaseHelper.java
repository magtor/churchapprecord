package com.church.churchapp.databasechurch;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.church.churchapp.R;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DataBaseHelper extends OrmLiteSqliteOpenHelper {

    //Database name
    private static final String DATABASE_NAME = "memberchurch";
    //Version of the database. Changing the version will call {@Link OrmLite.onUpgrade}
    private static final int DATABASE_VERSION = 1;

    /**
     * The data access object used to interact with the Sqlite database to do C.R.U.D operations.
     */
    private Dao<members, Long> membersDao;



    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION,

                R.raw.ormlite_config);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {

            /**
             * creates the database table
             */
            TableUtils.createTable(connectionSource, members.class);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    /*
        It is called when you construct a SQLiteOpenHelper with version newer than the version of the opened database.
     */
    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource,
                          int oldVersion, int newVersion) {
        try {
            /**
             * Recreates the database when onUpgrade is called by the framework
             */
            TableUtils.dropTable(connectionSource, members.class, false);
            onCreate(database, connectionSource);

        } catch (SQLException | java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns an instance of the data access object
     * @return
     * @throws SQLException
     */
    public Dao<members, Long> getDaoMembers() throws SQLException {
        if(membersDao == null) {
            try {
                membersDao = getDao(members.class);
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
        return membersDao;
    }

    @Override
    public void close() {
        super.close();
       membersDao = null;

    }

}






