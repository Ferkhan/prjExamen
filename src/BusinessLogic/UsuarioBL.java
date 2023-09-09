package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.Usuario;
import DataAccess.UsuarioDAC;
import Framework.AppException;

public class UsuarioBL {
    private UsuarioDAC usuarioDAC;

    public UsuarioBL() throws AppException {
        usuarioDAC = new UsuarioDAC();
    }

    public List<Usuario> getRegistrosActivos() throws AppException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Usuario usuario;
        ResultSet rs;

        try {
            rs = usuarioDAC.readRegistrosActivos();
            
            if (rs.first()) {
                while (rs.next()) {
                    usuario = new Usuario();
                    usuario.setId(rs.getInt(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setEstado(rs.getInt(3));
                    usuario.setFechaIng(rs.getString(4));
                    usuario.setFechaMod(rs.getString(5));

                    listaUsuarios.add(usuario);
                }

                return listaUsuarios;
            }

            return null;
            
        } catch (SQLException error) {
             throw new AppException(error, getClass(), "getRegistrosActivos()");
        }
    }
}
