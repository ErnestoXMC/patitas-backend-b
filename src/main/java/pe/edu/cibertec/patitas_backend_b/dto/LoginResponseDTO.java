package pe.edu.cibertec.patitas_backend_b.dto;

public record LoginResponseDTO(String codigo, String mensaje, String numeroDocumento, String tipoDocumento,  String nombreUsuario, String correoUsuario) {
}
