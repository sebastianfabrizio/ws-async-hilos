package pe.edu.pe.cibertec.sw_async_hilos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.pe.cibertec.sw_async_hilos.remote.service.TaskService;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor //inyecta solo a los que tiene final
@Service
public class AtencionService1 {

    private final TaskService taskService;




        public String ejecutarTareas() {
            try {
                // Ejecución secuencial de las tareas
                String tarea1 = taskService.operacionPagoOnline();
                String tarea2 = taskService.operacionRegistrosVenta();
                String tarea3 = taskService.operacionActualizaciomCompras();

                // Combinar los resultados
                return "Resultado final = " + tarea1 + "-" + tarea2 + "-" + tarea3;
            } catch (Exception ex) {
                // Manejo de excepciones
                return "Error al ejecutar las tareas: " + ex.getMessage();
            }
        }
    }

