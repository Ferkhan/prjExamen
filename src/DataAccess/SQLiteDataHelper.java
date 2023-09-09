package DataAccess;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppException;

public abstract class SQLiteDataHelper {
    private final String RUTA_DATABASE      = "jdbc:sqlite:database\\BaseDatos.db"; 
    protected final String TABLA_USUARIO    = "USUARIO";
    protected final String TABLA_CREDENCIAL = "CREDENCIAL";
    protected PreparedStatement prst;
    protected Connection conn;
    protected Statement stmt;
    protected ResultSet rst;
    protected String consultaSQL;
    

    public SQLiteDataHelper () throws AppException {
        conn = getConnection();
        stmt = null;
        rst  = null;
        prst = null;
        consultaSQL = null;
    }

    protected Connection getConnection() throws AppException {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(RUTA_DATABASE);
            }
    
        } catch (Exception e) {
            throw new AppException(e, getClass(), "getConnection()");
        }

        return conn;
    }


    protected ResultSet getResultSet (String consultaSQL) throws AppException {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rst   = stmt.executeQuery(consultaSQL);
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getResultSet()");
        }

        return rst;
    }
    
    public abstract ResultSet readRegistrosActivos() throws AppException;

    public abstract ResultSet readById(int idRegistro) throws AppException;
}
