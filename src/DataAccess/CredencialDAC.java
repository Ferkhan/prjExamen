package DataAccess;

import java.sql.ResultSet;

import Framework.AppException;

public class CredencialDAC extends SQLiteDataHelper{

    public CredencialDAC() throws AppException {
        super();
    }

    @Override
    public ResultSet readRegistrosActivos() throws AppException {
        consultaSQL = " SELECT IdCredencial, IdUsuario, Clave, Estado, FechaIng, FechaMod "
                    + " FROM   " + TABLA_CREDENCIAL
                    + " WHEN   Estado = 1 ";
        return getResultSet(consultaSQL);
    }
    
}
