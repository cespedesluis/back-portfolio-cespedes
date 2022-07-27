package com.cv.luiscespedes.Interface;

import java.util.List;

import com.cv.luiscespedes.Entity.Skill;

public interface ISkillService {
    public List<Skill> getSkill();
    
    
    public Skill saveSkill(Skill skill);
    
    
    public void deleteSkill(Long id);
    
   
    public Skill findSkill (Long id);

    public Skill editSkill(Skill skill);
 
}
