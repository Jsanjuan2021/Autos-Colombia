package com.iudigital.autoscolombia.controladores;

import com.iudigital.autoscolombia.modelo.Tercero;
import com.iudigital.autoscolombia.serviciosImple.ImpTercero;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1/tercero")
@AllArgsConstructor
public class ControladorTercero {

    private ImpTercero impTercero;

    @GetMapping
    public ResponseEntity<List<Tercero>> getTerceros(){
        return new ResponseEntity<List<Tercero>>(impTercero.getTerceros(), HttpStatus.OK);
    }

    @GetMapping("{dni}")
    public ResponseEntity<Optional<Tercero>> getTerceroDni(@PathVariable(value = "dni") Long dni) throws ClassNotFoundException{
        Optional<Tercero> t = Optional.ofNullable(impTercero.getTerceroDni(dni)
                .orElseThrow(() -> new ClassNotFoundException("El tercero no existe en la base de datos")));
        return ResponseEntity.ok().body(t);
    }

    @PostMapping
    public ResponseEntity<Tercero> saveTercero(@RequestBody Tercero t){
        return new ResponseEntity<Tercero>(impTercero.saveTercero(t), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Tercero> updateTercero(@RequestBody Tercero t){
        return new ResponseEntity<Tercero>(impTercero.updateTercero(t), HttpStatus.OK);
    }

    /*
    @GetMapping
    public List<Tercero> getTerceroList(){
        return impTercero.getTerceros();
    }*/
}
