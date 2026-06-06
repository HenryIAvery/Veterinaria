package com.proyecto.veterinaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.veterinaria.Repository.AnimalRepository;

@Controller
public class IndexController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/")
    public String listarAnimales(Model model) {
        model.addAttribute("animales", animalRepository.findAll());
        return "index";
    }

    @GetMapping("/inventario")
    public String inventario(Model model) {
        return "inventario";
    }

    @GetMapping("/dashboard")
    public String mostrarDashboard(Model model) {
        // Simulamos datos que luego vendrán de tu base de datos
        model.addAttribute("consultasHoy", 8);
        model.addAttribute("salidasCampo", 3);
        model.addAttribute("productosStockBajo", 5);
        
        return "dashboard"; // Llama a dashboard.html
    }

    @GetMapping("/animales/nuevo")
    public String mostrarFormularioAnimal() {
        return "nuevo_animal"; // Esto buscará el archivo nuevo-animal.html en tu carpeta templates
    }

    @GetMapping("/consultas/nueva")
    public String mostrarFormularioConsulta() {
        return "nueva_consulta"; // Busca el archivo nueva-consulta.html
    }

    @GetMapping("/duenios")
    public String mostrarDuenosYAnimales(Model model) {
        // En el futuro, esto vendrá de tu base de datos con: duenoRepository.findAll()
        // Por ahora simulamos la estructura para ver el diseño visual en el navegador
        
        // Esto representa visualmente lo que JPA/Hibernate traerá automáticamente
        // gracias a la relación @OneToMany entre Dueño y Animal.
        
        return "duenios"; // Buscará duenos.html en templates
    }

    // Ruta para ver el perfil/ficha detallada de un dueño específico (Nivel 2)
    @GetMapping("/duenioDetalle")
    public String mostrarDetalleDueno(Model model) {
        // En el futuro aquí harás: Dueno d = duenoRepository.findById(id);
        // Por ahora pasamos datos estáticos para renderizar el diseño visual
        model.addAttribute("nombreDueno", "María Gómez");
        model.addAttribute("telefonoDueno", "+506 7777-7777");
        model.addAttribute("comunidadDueno", "Finca Los Pinos (Sector Campo)");
        
        return "duenioDetalle"; // Llama a dueno-detalle.html
    }

    // Ruta para el Directorio General de Pacientes (Nivel 2 - General)
    @GetMapping("/animales")
    public String mostrarDirectorioAnimales(Model model) {
        // En el futuro: model.addAttribute("animales", animalRepository.findAll());
        return "animales"; // Llama a animales.html
    }

    // Ruta para la Ficha Clínica Individual (Nivel 3)
    @GetMapping("/animalDetalle")
    public String mostrarHistorialAnimal() {
        return "animalDetalle"; // Llama a animal-detalle.html
    }
}
