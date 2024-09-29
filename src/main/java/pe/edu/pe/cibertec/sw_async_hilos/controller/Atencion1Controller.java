package pe.edu.pe.cibertec.sw_async_hilos.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.pe.cibertec.sw_async_hilos.service.AtencionService;
import pe.edu.pe.cibertec.sw_async_hilos.service.AtencionService1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
public class Atencion1Controller {

    private final AtencionService1 atencionService;


    @GetMapping("/finalizar-venta1")
    public String atencionVenta() {
        String resultado = atencionService.ejecutarTareas();
        return resultado;
    }
}
