package za.ac.cput.grp3_adp372s_assignment1;
// author Lance Kruger 218159501
public class Anime {
    private String characterName;
    private int powerLevel;
    private boolean isPowerful = false;

    public Anime(String characterName, int powerLevel) {
        this.characterName = characterName;
        this.powerLevel = powerLevel;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public boolean isPowerful() {
        return isPowerful;
    }

    public void Powerful() {
        isPowerful = true;
    }
}
