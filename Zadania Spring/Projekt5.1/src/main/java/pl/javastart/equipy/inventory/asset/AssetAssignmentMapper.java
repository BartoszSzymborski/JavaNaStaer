package pl.javastart.equipy.inventory.asset;

import pl.javastart.equipy.components.assigment.Assigment;
import pl.javastart.equipy.inventory.user.User;

public class AssetAssignmentMapper {

    public static AssetAssignmentDto toDto(Assigment assigment){
        AssetAssignmentDto dto = new AssetAssignmentDto();
        dto.setId(assigment.getId());
        dto.setStart(assigment.getStart());
        dto.setEnd(assigment.getEnd());

        User user = assigment.getUser();
        dto.setUserId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setPesel(user.getPesel());
        return dto;
    }
}
