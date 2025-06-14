package DAO;
import java.util.List;
import Model.BonusType;

/**
 *
 * @author Gracielle Salvador
 */
public interface BonusTypeDao {
    /**
    * @param bonusTypeId The ID of the bonusType.
    * @return A List of BonusType objects, which may be empty if none are found.
    */
    
    BonusType getBonusTypeById(int bonusTypeId);
    
    List<BonusType> getAllBonusTypes();
    
    boolean addBonusType(BonusType bonusType);
    boolean updateBonusType(BonusType bonusType);
    boolean deleteBonusType(int bonusTypeId);  
}
