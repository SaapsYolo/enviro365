package com.enviro.assessment.grad001.SiyabulelaBiyo.Controller;

import com.enviro.assessment.grad001.SiyabulelaBiyo.Model.WasteModel;
import com.enviro.assessment.grad001.SiyabulelaBiyo.Repository.WasteRepository;
import com.enviro.assessment.grad001.SiyabulelaBiyo.Service.WasteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/waste")
public class WasteController {
    WasteRepository wasteRepository;
    @Autowired
    private WasteServices wasteServices;

    @PostMapping("/add")
    public String add(@RequestBody WasteModel waste){
        wasteServices.saveWaste(waste);
        return "New waste added";
    }
    @GetMapping("/getAll")
    public List<WasteModel> getAllWaste(){
        return wasteServices.getAllWaste();
    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteWaste(@PathVariable int id){
//        return wasteRepository.findById(id).map(wasteModel -> {
//            wasteRepository.deleteById(id);
//            return ResponseEntity.ok("Waste " + id+" deleted");
//        }).orElse(ResponseEntity.notFound().build());
//    }
//
    @DeleteMapping("/delete")
    public void deleteWasteById(int id){
        Optional<WasteModel> wasteToDelete = wasteRepository.findById(id);

        if(wasteToDelete.isPresent()){
            wasteRepository.deleteById(id);
        }else{
            System.out.println("No record found by Id: " + id);
        }
    }


}
