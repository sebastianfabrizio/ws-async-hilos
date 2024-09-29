package pe.edu.pe.cibertec.sw_async_hilos.remote.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class TaskService {



        public String operacionPagoOnline(){
        try {
            log.info("iniciando proceso de pago.");
            TimeUnit.SECONDS.sleep(4);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "Pago exitoso";
    }


    public String operacionRegistrosVenta(){
        try {
            log.info("iniciando registro de ventas");
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "Registro de venta exitosa";
    }


    public String operacionActualizaciomCompras(){
        try {
            log.info("iniciando actualización de compras");
            TimeUnit.SECONDS.sleep(7);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "Actualización de compra exitosa";
    }
}
