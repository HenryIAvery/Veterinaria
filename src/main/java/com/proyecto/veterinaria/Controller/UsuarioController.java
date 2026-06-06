package com.proyecto.veterinaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.veterinaria.Model.Roles;
import com.proyecto.veterinaria.Model.Usuarios;
import com.proyecto.veterinaria.Repository.RolesRepository;
import com.proyecto.veterinaria.Repository.UsuariosRepository;

@Controller
public class UsuarioController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private RolesRepository rolesRepository;

    // Muestra la pantalla de login del veterinario
    @GetMapping("/login-vet")
    public String mostrarLoginVet() {
        return "login_vet";
    }

    // Procesa el formulario de inicio de sesión del veterinario
    @PostMapping("/autenticar-vet")
    public String autenticarVeterinario(@RequestParam String correo,
            @RequestParam String password,
            @RequestParam String codigoAcceso,
            Model model) {

        // 1. Buscamos al usuario por su correo
        Usuarios usuario = usuariosRepository.findByCorreo(correo);

        if (usuario != null) {
            // 2. Validamos contraseña, código secreto y que realmente sea un Veterinario (Rol 2)
            if (usuario.getPassword().equals(password)
                    && codigoAcceso.equals(usuario.getCodigoAcceso())
                    && usuario.getRoles().getIdRol() == 2) {

                // ¡Éxito! Lo redirigimos a su futuro panel de control
                return "redirect:/dashboard";
            }
        }

        // Si algo falla, volvemos al login mandando un mensaje de error
        model.addAttribute("error", "Credenciales incorrectas o código de autorización inválido.");
        return "login_vet";
    }

    // Muestra el formulario para que el veterinario registre a un cliente
    @GetMapping("/registrar-cliente")
    public String mostrarRegistroCliente() {
        return "registrarCliente";
    }

// Procesa y guarda al cliente en la base de datos
    @PostMapping("/guardar-cliente")
    public String guardarCliente(@RequestParam String username,
            @RequestParam String correo,
            @RequestParam String password) {

        Usuarios nuevoCliente = new Usuarios();
        nuevoCliente.setUsername(username);
        nuevoCliente.setCorreo(correo); // Asegúrate de que coincida con tu atributo (correo o email)
        nuevoCliente.setPassword(password);
        nuevoCliente.setCodigoAcceso(null); // Los clientes no tienen código secreto

        // Vinculamos el Rol de Cliente (ID 3L)
        Roles rolCliente = rolesRepository.findById(3L).orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        nuevoCliente.setRoles(rolCliente);

        // Guardamos en la tabla usuarios
        usuariosRepository.save(nuevoCliente);

        // Redirigimos al directorio de clientes (puedes cambiar esta ruta por la de tu vista de clientes)
        return "redirect:/duenios";
    }
}
