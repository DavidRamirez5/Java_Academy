package semana3.tareas.VideoJunit;

import java.util.HashMap;

public class UsuarioServicio {
    private final HashMap< Long, UsuarioDto> usuarios = new HashMap<>();
    private  UsuarioDto ejemplo = new UsuarioDto(1L, "Prueba");
    public UsuarioDto crearUsuario(Long id, String nombre){
        usuarios.put(id, new UsuarioDto(id,nombre)) ;
        return usuarios.get(id);
    }

    public UsuarioDto obetenerUsuario(Long id){
        return usuarios.get(id);
    }

    public UsuarioDto actualizarUsuario(Long id, String nombre){
        return usuarios.put(id, new UsuarioDto(id,nombre));
    }


}
