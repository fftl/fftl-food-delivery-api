package fftl.fooddeliveryapi.member.controller;

import fftl.fooddeliveryapi.config.dto.Response;
import fftl.fooddeliveryapi.member.dto.LoginMemberRequest;
import fftl.fooddeliveryapi.member.dto.SaveMemberRequest;
import fftl.fooddeliveryapi.member.entity.Member;
import fftl.fooddeliveryapi.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/login")
    public Response loginMember(@RequestBody LoginMemberRequest loginMemberRequest){
        Member member = memberService.loginMember(loginMemberRequest);
        return new Response(true, null, member);
    }

    @GetMapping("/{memberId}")
    public Response findOneMemberById(@PathVariable Long memberId){
        Member member = memberService.findOneMemberById(memberId);
        return new Response(true, null, member);
    }

    @GetMapping
    public Response findAllMember(){
        List<Member> allMember = memberService.findAllMember();
        return new Response(true, null, allMember);
    }

    @PatchMapping("/update/{memberId}")
    public Response updateMember(@PathVariable Long memberId, SaveMemberRequest saveMemberRequest){
        Member member = memberService.updateMember(memberId, saveMemberRequest);
        return new Response(true, null, member);
    }
}
