package pl.javastart.equipy.components.assigment;

import pl.javastart.equipy.inventory.asset.Asset;
import pl.javastart.equipy.inventory.user.User;

public class AssignmentMapper {

    static AssignmentDto toDto(Assigment assigment){
        AssignmentDto dto = new AssignmentDto();
        User user = assigment.getUser();
        dto.setId(assigment.getId());
        dto.setStart(assigment.getStart());
        dto.setEnd(assigment.getEnd());
        dto.setUserId(user.getId());
        Asset asset = assigment.getAsset();
        dto.setAssetId(asset.getId());
        return dto;
    }
}
