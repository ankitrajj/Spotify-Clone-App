package in.ankit.mapper;

import in.ankit.dto.SaveSongDTO;
import in.ankit.dto.SongContentDTO;
import in.ankit.entity.SongContent;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SongContentMapper {

    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}
