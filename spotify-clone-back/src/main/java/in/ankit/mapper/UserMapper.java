package in.ankit.mapper;

import in.ankit.dto.ReadUserDTO;
import in.ankit.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    ReadUserDTO readUserDTOToUser(User entity);

}
