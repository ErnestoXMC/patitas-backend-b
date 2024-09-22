package pe.edu.cibertec.patitas_backend_b.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.patitas_backend_b.dto.LoginRequestDTO;
import pe.edu.cibertec.patitas_backend_b.dto.LoginResponseDTO;

@RestController
@RequestMapping("/autenticacion")
public class AutenticacionController {
//request es lo que recibo
//Response es lo que mando, respondo

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO loginRequestDTO){//DTO => datos

        return new LoginResponseDTO("00", "", "Julio Chavez", "juliochavez@gmail.com");
    }

}
