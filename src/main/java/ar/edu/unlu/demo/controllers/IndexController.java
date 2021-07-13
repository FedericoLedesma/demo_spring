package ar.edu.unlu.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.unlu.demo.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

    //@RequestMapping(value = "/",method = RequestMethod.GET)
    //@GetMapping({"/","/home","/index"})
    // @GetMapping("/index")
    // public String index(Model model){
        
    //     model.addAttribute("titulo", "Hola spring framework");
        
    //     return "index";
    // }

    @GetMapping("/index")
    public String index(ModelMap model){
        
        model.addAttribute("titulo", "Hola spring framework");
         
        return "index";
    }
    @GetMapping("/user")
    public String user(Model model){
        Usuario user= new Usuario();
        user.setApellido("Ledesma");
        user.setNombre("Federico");
        user.setEmail("feder@gmail.com");
        model.addAttribute("user", user);
        model.addAttribute("titulo", "Usuario");
        return "user";
    }


    @GetMapping("/users")
    public String usuarios(Model model){
        List <User> usuarios = new ArrayList<>();
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    // @PostMapping(value = "/")
    // public String indexPost(){
        
        
    //     return "index";
    // }
    
}
