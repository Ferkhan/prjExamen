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
    private ResultSet rs;

    public UsuarioBL() throws AppException {
        usuarioDAC = new UsuarioDAC();
        rs         = null;
    }

    public List<Usuario> getRegistrosActivos() throws AppException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Usuario usuario;

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

                rs.close();
                return listaUsuarios;
            }

            rs.close();
            return null;
            
        } catch (SQLException error) {
            throw new AppException(error, getClass(), "getRegistrosActivos()");
        }
    }

    public Usuario getById(int idUsuario) throws AppException {
        Usuario usuario;

        try {
            rs = usuarioDAC.readById(idUsuario);
            
            if (rs.first()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setEstado(rs.getInt(3));
                usuario.setFechaIng(rs.getString(4));
                usuario.setFechaMod(rs.getString(5));

                rs.close();
                return usuario;
            }

            rs.close();
            return null;
            
        } catch (SQLException error) {
            throw new AppException(error, getClass(), "getRegistrosActivos()");
        }
    }

}
