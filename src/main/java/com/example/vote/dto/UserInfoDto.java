package com.example.vote.dto;

import com.example.vote.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {
    private String username;
    private Member.Part part;
    private Member.Team team;

}
