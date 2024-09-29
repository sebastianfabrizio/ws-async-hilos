package pe.edu.pe.cibertec.sw_async_hilos.remote.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j //mandar mensajes en consola
@Service
public class AsyncTaskService {

    @Async //le digo al método que es asincrono
    public CompletableFuture<String> operacionPagoOnline(){
        try {
            log.info("iniciando proceso de pago.");
            TimeUnit.SECONDS.sleep(4);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Pago exitoso");
    }

    @Async
    public CompletableFuture<String> operacionRegistrosVenta(){
        try {
            log.info("iniciando registro de ventas");
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Registro de venta exitosa");
    }

    @Async
    public CompletableFuture<String> operacionActualizaciomCompras(){
        try {
            log.info("iniciando actualización de compras");
            TimeUnit.SECONDS.sleep(7);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Actualización de compra exitosa");
    }
}
