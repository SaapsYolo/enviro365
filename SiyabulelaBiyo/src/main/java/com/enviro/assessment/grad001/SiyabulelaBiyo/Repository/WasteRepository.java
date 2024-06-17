package com.enviro.assessment.grad001.SiyabulelaBiyo.Repository;

import com.enviro.assessment.grad001.SiyabulelaBiyo.Model.WasteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteRepository extends JpaRepository<WasteModel, Integer> {
}
