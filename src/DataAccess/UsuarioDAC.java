package DataAccess;

import java.sql.ResultSet;

import Framework.AppException;

public class UsuarioDAC extends SQLiteDataHelper {

    public UsuarioDAC() throws AppException {
        super();
    }

    @Override
    public ResultSet readRegistrosActivos() throws AppException {
        consultaSQL = " SELECT IdUsuario, Nombre, Estado, FechaIng, FechaMod "
                    + " FROM " + TABLA_USUARIO
                    + " WHEN Estado = 1 ";
        return getResultSet(consultaSQL);
    }
}
