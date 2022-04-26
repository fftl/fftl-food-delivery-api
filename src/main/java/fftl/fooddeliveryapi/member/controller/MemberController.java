package fftl.fooddeliveryapi.member.controller;

import fftl.fooddeliveryapi.member.dto.SaveMemberRequest;
import fftl.fooddeliveryapi.member.entity.Member;
import fftl.fooddeliveryapi.member.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Member> saveMember(@RequestBody SaveMemberRequest saveMemberRequest){
        Member member = memberService.saveMember(saveMemberRequest);
        return new ResponseEntity<Member>(member, HttpStatus.CREATED);
    }
}
