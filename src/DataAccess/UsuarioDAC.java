package DataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppException;

public class UsuarioDAC extends SQLiteDataHelper {

    public UsuarioDAC() throws AppException {
        super();
    }

    @Override
    public ResultSet readRegistrosActivos() throws AppException {
        consultaSQL = " SELECT  IdUsuario, Nombre, Estado, FechaIng, FechaMod "
                    + " FROM    " + TABLA_USUARIO
                    + " WHEN    Estado = 1 ";
        return getResultSet(consultaSQL);
    }

    @Override
    public ResultSet readById(int idUsuario) throws AppException {
        consultaSQL = " SELECT  IdUsuario, Nombre, Estado, FechaIng, FechaMod "
                    + " FROM    " + TABLA_USUARIO
                    + " WHEN    Estado = 1 "
                    + " AND     IdUsuario = ?";
                    
        try {
            prst = conn.prepareStatement(consultaSQL);
            prst.setInt(1, idUsuario);
            
            return prst.executeQuery();

        } catch (SQLException error) {
            throw new AppException(error, getClass(), "readById()");
        }
        
    }


}
