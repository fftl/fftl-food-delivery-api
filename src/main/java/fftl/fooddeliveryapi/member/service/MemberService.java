package fftl.fooddeliveryapi.member.service;

import fftl.fooddeliveryapi.member.dto.LoginMemberRequest;
import fftl.fooddeliveryapi.member.dto.SaveMemberRequest;
import fftl.fooddeliveryapi.member.entity.Member;
import fftl.fooddeliveryapi.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Member saveMember(SaveMemberRequest saveMemberRequest){
        Member member = memberRepository.save(saveMemberRequest.toEntity());
        return member;
    }

    public Member loginMember(LoginMemberRequest loginMemberRequest){
        Member member = memberRepository.findByUsername(loginMemberRequest.getUsername()).orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));
        if(member.getDeleted()){
            throw new RuntimeException("올바르지 않은 아이디나 비밀번호 입니다.");
        }

        if(!member.getPassword().equals(loginMemberRequest.getPassword())){
            throw new RuntimeException("올바르지 않은 아이디나 비밀번호 입니다.");
        }

        return member;
    }

    public Member findOneMemberById(Long memberId){
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));
        if(member.getDeleted()){
            throw new RuntimeException("올바르지 않은 아이디나 비밀번호 입니다.");
        }
        return member;
    }

    public List<Member> findAllMember(){
        List<Member> members = new ArrayList<>();
        for(Member m : memberRepository.findAll()){
            if(!m.getDeleted()){
                members.add(m);
            }
        }

        memberRepository.findAll();
        return members;
    }

    @Transactional
    public Member updateMember(Long memberId, SaveMemberRequest saveMemberRequest){
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));
        if(member.getDeleted()){
            throw new RuntimeException("올바르지 않은 아이디나 비밀번호 입니다.");
        }
        member.updateMember(saveMemberRequest);
        return member;
    }

    @Transactional
    public void deleteMember(Long memberId){
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));
        member.deleteMember();
    }
}
