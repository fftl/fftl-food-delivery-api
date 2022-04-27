package fftl.fooddeliveryapi.member.controller;

import fftl.fooddeliveryapi.config.dto.Response;
import fftl.fooddeliveryapi.member.dto.SaveMemberRequest;
import fftl.fooddeliveryapi.member.entity.Member;
import fftl.fooddeliveryapi.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/member")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public Response saveMember(@RequestBody SaveMemberRequest saveMemberRequest){
        Member member = memberService.saveMember(saveMemberRequest);
        return new Response(true, null, member);
    }
}
