package by.tms.trelloclonec30.dto;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ProjectResponseDto {

    private Long projectId;
    private String projectName;
    private String projectDescription;
    private Long workspaceId;
    private List<TeamDto> teams;
}