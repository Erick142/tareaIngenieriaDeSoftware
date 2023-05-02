package ingenieria.tarea.Controller;
import ingenieria.tarea.Model.Coso;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @PostMapping("/ola")
    public @ResponseBody String hola(){
        return Coso.xd();
    }
}
