package main.java.hello.hellospring.repository;

import main.java.hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String Name);
    // Optional은 null을 감싸서 반환
    List<Member> findAll();
    // findAll 모든 회원 리스트 반환
}
