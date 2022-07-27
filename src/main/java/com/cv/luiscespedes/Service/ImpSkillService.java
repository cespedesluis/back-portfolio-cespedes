package com.cv.luiscespedes.Service;

import java.util.List;


import com.cv.luiscespedes.Entity.Skill;
import com.cv.luiscespedes.Interface.ISkillService;
import com.cv.luiscespedes.Repository.ISkillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImpSkillService implements ISkillService {
    @Autowired ISkillRepository iskillRepository;

   
    @Transactional

    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iskillRepository.findAll();
        return skill;   
    }

    @Transactional

    @Override
    public Skill saveSkill(Skill skill) {
        return iskillRepository.save(skill);
        
        
    }
    @Transactional

    @Override
    public void deleteSkill(Long id) {
        iskillRepository.deleteById(id);
        
    }

    @Override

    public Skill editSkill(Skill skill){
        return iskillRepository.save(skill);
    };
    
    @Transactional

    @Override
    public Skill findSkill(Long id) {
        Skill skill=iskillRepository.findById(id).orElse(null);
        return skill;
    }
    
    
}
