package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.Credencial;
import DataAccess.CredencialDAC;
import Framework.AppException;

public class CredencialBL {
    private CredencialDAC credencialDAC;
    
    public CredencialBL() throws AppException {
        credencialDAC = new CredencialDAC();
    }

    public List<Credencial> getRegistrosActivos() throws AppException {
        List<Credencial> listaCredenciales = new ArrayList<>();
        Credencial credencial;
        ResultSet rs;

        try {
            rs = credencialDAC.readRegistrosActivos();
            
            if (rs.first()) {
                while (rs.next()) {
                    credencial = new Credencial();
                    credencial.setId(rs.getInt(1));
                    credencial.setIdUsuario(rs.getInt(2));
                    credencial.setClave(rs.getString(3));
                    credencial.setEstado(rs.getInt(4));
                    credencial.setFechaIng(rs.getString(5));
                    credencial.setFechaMod(rs.getString(6));

                    listaCredenciales.add(credencial);
                }

                return listaCredenciales;
            }

            return null;
            
        } catch (SQLException error) {
            throw new AppException(error, getClass(), "getRegistrosActivos()");
        }
    }
}
