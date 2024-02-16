package semana3.tareas.VideoJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setUp(){
        usuarioServicio = new UsuarioServicio();
    }
    @DisplayName("Test 1: Dado un Usuario que queremos Testear")
    @Test
    public void test1(){
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");


        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Prueba");
        Assertions.assertEquals(esperado,resultado);
        Assertions.assertEquals(esperado.nombre,resultado.nombre);
        Assertions.assertEquals(esperado.id,resultado.id);
    }
    @Test
    public void test2(){
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");


        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Prueba");
        Assertions.assertNotEquals(esperado,resultado);
        Assertions.assertNotEquals(esperado.nombre,resultado.nombre,"No son iguales");
        Assertions.assertEquals(esperado.id,resultado.id);
    }

    @Test
    public void test3(){

        UsuarioServicio usuarioServicio = new UsuarioServicio();

        final UsuarioDto resultado = usuarioServicio.obetenerUsuario(1L);
        Assertions.assertEquals(null,resultado);
    }

    @Test
    public void test4(){
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
        
        usuarioServicio.crearUsuario(1L,"Nombre");
        final UsuarioDto resultado = usuarioServicio.obetenerUsuario(1L);
        Assertions.assertEquals(esperado,resultado);
    }



}