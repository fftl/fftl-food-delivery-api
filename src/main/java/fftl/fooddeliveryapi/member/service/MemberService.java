package fftl.fooddeliveryapi.member.service;

import fftl.fooddeliveryapi.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private MemberRepository memberRepository;

}
