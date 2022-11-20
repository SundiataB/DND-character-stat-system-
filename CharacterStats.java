//filename : FinalProject
// Description : CharacterStats D&D
// Author : Sundiata Bondojia
// Date Modified : 12/7/2019

// Missing abstract classes!

public class CharacterStats
{
    public static void main(String arg[]) 
    {
      System.out.println("Welcome to CharacterStats for D&D");
      
      
      System.out.println("FIGHTERTYPES HERE");
      PaladinStats myTypesA = new  PaladinStats();
      WarriorStats myTypesB = new  WarriorStats();
      BarbarianStats myTypesC = new  BarbarianStats();
      
      System.out.println("MAGICTYPES HERE");
      WarlockStats myTypesD = new  WarlockStats();
      WizardStats myTypesE = new  WizardStats();
      DriudStats myTypesF = new  DriudStats();
     
      
      System.out.println("BARBARIAN_STATS_HERE =" + myTypesC.BarbarianStats);
      System.out.println("Strength =" + myTypesC.BarbarianStrength);
      System.out.println("DEX =" + myTypesC.BarbarianDEX);
      System.out.println("constitution =" + myTypesC.BarbarianConstitution);
      System.out.println("Intelligence =" + myTypesC.BarbarianConstitution);
      System.out.println("Charisma =" + myTypesC.BarbarianCharisma);
      
      System.out.println("WARRIOR_STATS_HERE = "+ myTypesB.WarriorStats);
      System.out.println("Strength=" + myTypesB.WarriorStrength);
      System.out.println("DEX =" + myTypesB.WarriorDEX);
      System.out.println("constitution =" + myTypesB.WarriorConstitution);
      System.out.println("Intelligence =" + myTypesB.WarriorIntelligence);
      System.out.println("Charisma =" + myTypesB.WarriorCharisma);
      
      System.out.println("PALADIN_STATS_HERE = "+ myTypesA.PaladinStats);
      System.out.println("Strength =" + myTypesA.WarriorStrength);
      System.out.println("DEX =" + myTypesA.WarriorDEX);
      System.out.println("constitution =" + myTypesA.WarriorConstitution);
      System.out.println("Intelligence =" + myTypesA.WarriorIntelligence);
      System.out.println("Charisma =" + myTypesA.WarriorCharisma);

      System.out.println("WIZARD_STATS_HERE = "+ myTypesE.WizardStats);
      System.out.println("Strength =" + myTypesE.WizardStrength);
      System.out.println("DEX =" + myTypesE.WizardDEX);
      System.out.println("constitution =" + myTypesE.WizardConstitution);
      System.out.println("Intelligence =" + myTypesE.WizardIntelligence);
      System.out.println("Charisma =" + myTypesE.WizardCharisma);


      System.out.println("WARLOCK_STATS_HERE = "+ myTypesD.WarlockStats);
      System.out.println("Strength=" + myTypesD.WarlockStrength);
      System.out.println("DEX=" + myTypesD.WarlockDEX);
      System.out.println("constitution=" + myTypesD.WarlockConstitution);
      System.out.println("Intelligence=" + myTypesD.WarlockIntelligence);
      System.out.println("Charisma =" + myTypesD.WarlockCharisma);

      System.out.println("DRUID_STATS_HERE = "+ myTypesF.DriudStats);
      System.out.println("Strength=" + myTypesF.DriudStrength);
      System.out.println("DEX=" + myTypesF.DriudDEX);
      System.out.println("constitution=" + myTypesF.DriudConstitution);
      System.out.println("Intelligence=" + myTypesF.DriudIntelligence);
      System.out.println("Charisma =" + myTypesF.DriudCharisma);
      
     
    }

}