package controller;

import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PatientService;

import java.util.Optional;

@RequestMapping
@RestController
public class PatientController {
    @Autowired
    
    private PatientService patientService;
    
    
    @PostMapping(value = "/createpatient")
    public void createPatient(@RequestBody Patient patient) {patientService.createPatient(patient);}

    @GetMapping("/readpatient={id}")
    public Optional<Patient> readPatient(@PathVariable Long id) {
        return patientService.readPatient(id);
    }


    @DeleteMapping("/deletepatient={id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient(patientService.readPatient(id).get());
    }

    @PutMapping("/updatepatient")
    public void updatePatient(@RequestBody Patient patient){
        patientService.updatePatient(patient);
    }

}
