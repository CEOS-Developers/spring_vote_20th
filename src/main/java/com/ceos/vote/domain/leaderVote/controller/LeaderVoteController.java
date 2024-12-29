package com.ceos.vote.domain.leaderVote.controller;

import com.ceos.vote.domain.leaderVote.dto.request.LeaderVoteCreateRequestDto;
import com.ceos.vote.domain.leaderVote.dto.response.LeaderVoteByUserResponseDto;
import com.ceos.vote.domain.leaderVote.service.LeaderVoteService;
import com.ceos.vote.global.common.response.CommonResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Leader Vote", description = "leader vote api")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/leader")
public class LeaderVoteController {
    private final LeaderVoteService leaderVoteService;

    public CommonResponse<Void> createLeaderVote(@RequestBody LeaderVoteCreateRequestDto requestDto){
        leaderVoteService.createLeaderVote(requestDto);
        return new CommonResponse<>("new leader vote를 생성하였습니다.");
    }

    public CommonResponse<LeaderVoteByUserResponseDto> getLeaderVoteByUser(@PathVariable Long userId){
        final LeaderVoteByUserResponseDto leaderVoteByUser = leaderVoteService.getLeaderVoteByUser(userId);
        return new CommonResponse<>(leaderVoteByUser, "해당 user의 투표 결과 조회에 성공하였습니다.");
    }

}
