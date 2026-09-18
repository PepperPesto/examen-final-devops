package cl.iplacex.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@SpringBootApplication
@RestController
public class CalculadoraApiApplication {

    @GetMapping("/sumar")
    public String sumar(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        Calculadora c = new Calculadora();
        String version = System.getenv().getOrDefault("APP_VERSION", "v1");
        return "Resultado: " + c.sumar(a, b) + " | Versión: " + version;
    }

    @GetMapping("/health")
    public String health() {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Fallo simulado");
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraApiApplication.class, args);
    }
}
