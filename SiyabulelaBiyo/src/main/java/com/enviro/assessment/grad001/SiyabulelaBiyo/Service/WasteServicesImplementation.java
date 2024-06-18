package com.enviro.assessment.grad001.SiyabulelaBiyo.Service;

import com.enviro.assessment.grad001.SiyabulelaBiyo.Model.WasteModel;
import com.enviro.assessment.grad001.SiyabulelaBiyo.Repository.WasteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteServicesImplementation implements WasteServices{
    @Autowired
    private WasteRepository wasteRepository;

    @Override
    public WasteModel saveWaste(WasteModel waste) {
        return wasteRepository.save(waste);
    }

    @Override
    public List<WasteModel> getAllWaste() {
        return wasteRepository.findAll();
    }

    @Override
    public void deleteWaste(int id) {
        wasteRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void updateWaste(int id, String wasteCategory, String disposalGuideline, String recyclingTips) {
        Optional<WasteModel> wasteModel = wasteRepository.findById(id);
        if(wasteCategory != null){
            wasteModel.get().setWasteCategory(wasteCategory);
        }
        if(disposalGuideline != null){
            wasteModel.get().setDisposalGuideline(disposalGuideline);
        }
        if(recyclingTips != null){
            wasteModel.get().setRecyclingTips(recyclingTips);
        }



    }
}
