package com.example.demo.models.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Acta;
import com.example.demo.repositories.ActaRepository;
import com.example.demo.models.CartillaVacunacion;
import com.example.demo.repositories.CartillaVacunacionRepository;
import com.example.demo.models.ComprobanteEstudios;
import com.example.demo.repositories.ComprobanteEstudiosRepository;
import com.example.demo.models.Domicilio;
import com.example.demo.repositories.DomicilioRepository;
import com.example.demo.models.Estudiante;
import com.example.demo.repositories.EstudianteRepository;
import com.example.demo.models.FechaIngreso;
import com.example.demo.repositories.FechaDeIngresoRepository;
import com.example.demo.models.Identificacion;
import com.example.demo.repositories.IdentificacionRepository;
import com.example.demo.models.Padre;
import com.example.demo.repositories.PadreRepository;
import com.example.demo.models.ServicioMedico;
import com.example.demo.repositories.ServicioMedicoRepository;
import com.example.demo.models.Solicitud;
import com.example.demo.repositories.SolicitudRepository;
import com.example.demo.models.TipoSangre;
import com.example.demo.repositories.TipoSangreRepository;

@org.springframework.stereotype.Controller
public class MyController {

    @Autowired
    private ActaRepository actasRepository;
    
    @Autowired
    private CartillaVacunacionRepository cartillaVacunacionRepository;
    
    @Autowired
    private ComprobanteEstudiosRepository comprobanteEstudiosRepository;
    
    @Autowired
    private DomicilioRepository domicilioRepository;
    
    @Autowired
    private EstudianteRepository estudiantesRepository;
    
    @Autowired
    private FechaDeIngresoRepository fechaDeIngresoRepository;
    
    @Autowired
    private IdentificacionRepository identificacionRepository;
    
    @Autowired
    private PadreRepository padreRepository;
    
    @Autowired
    private ServicioMedicoRepository servicioMedicoRepository;
    
    @Autowired
    private SolicitudRepository solicitudRepository;
    
    @Autowired
    private TipoSangreRepository tipoDeSangreRepository;

    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    
    @RequestMapping("/actas")
    public String actas(){
        return "actas";
    }

    @PostMapping("/postActas")
    public ResponseEntity<String> Actas(@RequestBody Acta acta) {
    try {
        actasRepository.save(acta);
        return new ResponseEntity<>("Acta guardada correctamente", HttpStatus.CREATED);
    } catch (Exception e) {
        return new ResponseEntity<>("Error al guardar el acta", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
    
    @PostMapping("/postCartillaVacunacion")
    public ResponseEntity<String> CartillaVacunacion(@RequestBody CartillaVacunacion cartilla) {
        try {
            cartillaVacunacionRepository.save(cartilla);
            return new ResponseEntity<>("Cartilla de vacunación guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la cartilla de vacunación", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postComprobanteEstudios")
    public ResponseEntity<String> ComprobanteEstudios(@RequestBody ComprobanteEstudios comprobante) {
        try {
            comprobanteEstudiosRepository.save(comprobante);
            return new ResponseEntity<>("Comprobante de estudios guardado correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar el comprobante de estudios", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postDomicilio")
    public ResponseEntity<String> Domicilio(@RequestBody Domicilio domicilio) {
        try {
            domicilioRepository.save(domicilio);
            return new ResponseEntity<>("Domicilio guardado correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar el domicilio", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postEstudiantes")
    public ResponseEntity<String> Estudiantes(@RequestBody Estudiante estudiante) {
        try {
            estudiantesRepository.save(estudiante);
            return new ResponseEntity<>("Estudiante guardado correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar el estudiante", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postFechaDeIngreso")
    public ResponseEntity<String> FechaDeIngreso(@RequestBody FechaIngreso fecha) {
        try {
            fechaDeIngresoRepository.save(fecha);
            return new ResponseEntity<>("Fecha de ingreso guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la fecha de ingreso", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postIdentificacion")
    public ResponseEntity<String> Identificacion(@RequestBody Identificacion identificacion) {
        try {
            identificacionRepository.save(identificacion);
            return new ResponseEntity<>("Identificación guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la identificación", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postPadre")
    public ResponseEntity<String> Padre(@RequestBody Padre padre) {
        try {
            padreRepository.save(padre);
            return new ResponseEntity<>("Padre guardado correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar el padre", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postServicioMedico")
    public ResponseEntity<String> ServicioMedico(@RequestBody ServicioMedico servicioMedico) {
        try {
            servicioMedicoRepository.save(servicioMedico);
            return new ResponseEntity<>("Servicio médico guardado correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar el servicio médico", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postSolicitud")
    public ResponseEntity<String> Solicitud(@RequestBody Solicitud solicitud) {
        try {
            solicitudRepository.save(solicitud);
            return new ResponseEntity<>("Solicitud guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la solicitud", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postTipoDeSangre")
    public ResponseEntity<String> TipoDeSangre(@RequestBody TipoSangre tipoDeSangre) {
        try {
            tipoDeSangreRepository.save(tipoDeSangre);
            return new ResponseEntity<>("Tipo de sangre guardado correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar el tipo de sangre", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


