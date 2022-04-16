package fftl.fooddeliveryapi.member.repository;

import fftl.fooddeliveryapi.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Long, Member>{
}
