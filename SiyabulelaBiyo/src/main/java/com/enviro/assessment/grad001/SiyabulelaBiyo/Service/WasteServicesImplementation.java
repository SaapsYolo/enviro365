package com.enviro.assessment.grad001.SiyabulelaBiyo.Service;

import com.enviro.assessment.grad001.SiyabulelaBiyo.Model.WasteModel;
import com.enviro.assessment.grad001.SiyabulelaBiyo.Repository.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
