package Model;
/**
 *
 * @author Gracielle Salvador
 */
public class BonusType {
    private static int bonusTypeId;
    private static String name;
    private static String description;
    
    /**
     * @param bonusTypeId The ID for the Bonus Type.
     * @param name The name of the Bonus Type.
     * @param description The description for the Bonus Type.
     */
    
    public void BonusType(String name, 
                          String description){
                        return;
    }

    public static int getBonusTypeId() {
        return bonusTypeId;
    }

    public static void setBonusTypeId(int bonusTypeId) {
        BonusType.bonusTypeId = bonusTypeId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        BonusType.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        BonusType.description = description;
    }
    
    @Override
    public String toString() {
        return "BonusType{" + "bonusTypeId=" + bonusTypeId + 
                              ", name=" + name + 
                              ", description=" + description + '}';
    }
    
}



