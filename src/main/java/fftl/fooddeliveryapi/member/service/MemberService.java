package fftl.fooddeliveryapi.member.service;

import fftl.fooddeliveryapi.member.dto.LoginMemberRequest;
import fftl.fooddeliveryapi.member.dto.SaveMemberRequest;
import fftl.fooddeliveryapi.member.entity.Member;
import fftl.fooddeliveryapi.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public Member saveMember(SaveMemberRequest saveMemberRequest){
        Member member = memberRepository.save(saveMemberRequest.toEntity());
        return member;
    }

    public Member loginMember(LoginMemberRequest loginMemberRequest){
        Member member = memberRepository.getByUsername(loginMemberRequest.getUsername();
        if(member == null){
            throw new RuntimeException("올바르지 않은 아이디나 비밀번호 입니다.");
        }
        return null;
    }

    public Member findOneMemberById(Long memberId){
        return null;
    }

    public Member findAllMember(){
        return null;
    }

    public Member updateMember(){
        return null;
    }
}
