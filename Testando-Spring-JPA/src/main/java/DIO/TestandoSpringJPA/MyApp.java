package DIO.TestandoSpringJPA;

import DIO.TestandoSpringJPA.model.Usuario;
import DIO.TestandoSpringJPA.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    UsuarioRepository usuario;
    @Override
    public void run(String... args) throws Exception {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Pedrinho");
        usuario1.setLogin("outronome@gmail.com");
        usuario1.setSenha("dio321");

        usuario.save(usuario1);

        for (Usuario u: usuario.findAll()) {
            System.out.println(u);
        }
    }
}
