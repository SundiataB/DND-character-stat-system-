//filename : FinalProject
// Description : Molecules 3D
// Author : Sundiata Bondojia
// Date Modified : 11/30/2019

public abstract class SkillTypes
{
    public double BarbarianSkill;
    public double Armor;
    public double Weapons;
    public double SavingThrows;
    public double WarriorSkill;
    public double WarlockSkill;
    public double WizardSkill;
    public double Driudskill;
    public double PaladinSkills;

    public  SkillTypes()
    {
        BarbarianSkill  = 60.0;
        Armor = 0.0;
        Weapons = 0.0;
        SavingThrows = 5.0;

        WarriorSkill = 70.0;
        Armor = 0.0;
        Weapons = 0.0;
        SavingThrows = 0.3;

        PaladinSkills = 2.0;
        Armor = 0.0;
        Weapons = 0.0 ;
        SavingThrows = 0.3;
        
        WarlockSkill = 90.0;
        Armor = 0.0;
        Weapons = 0.0;
        SavingThrows = 0.0;

        WizardSkill = 40.0;
        Armor = 0.0;
        Weapons = 0.0 ;
        SavingThrows = 10.0 ;
        Driudskill = 20.0;
        
        Armor = 0.0;
        Weapons = 0.0;
        SavingThrows = 5.0;

        System.out.println("SkillTypes Here ");
    }

}