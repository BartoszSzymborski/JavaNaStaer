package pl.javastart.equipy.inventory.user;

import pl.javastart.equipy.inventory.asset.Asset;
import pl.javastart.equipy.components.assigment.Assigment;

public class UserAssignmentMapper {

    public static UserAssignmentDto toDto(Assigment assigment){
        UserAssignmentDto dto = new UserAssignmentDto();
        dto.setId(assigment.getId());
        dto.setAssetId(assigment.getId());
        dto.setStart(assigment.getStart());
        dto.setEnd(assigment.getEnd());
        Asset asset = assigment.getAsset();
        dto.setAssetId(asset.getId());
        dto.setAssetName(asset.getName());
        dto.setAssetSerialNumber(asset.getSerialNumber());
        return dto;
    }
}
