package com.enviro.assessment.grad001.SiyabulelaBiyo.Service;

import com.enviro.assessment.grad001.SiyabulelaBiyo.Model.WasteModel;

import java.util.List;

public interface WasteServices {
    public WasteModel saveWaste(WasteModel waste);
    public List<WasteModel> getAllWaste();
    public void deleteWaste(int id);

}
