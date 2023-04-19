package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//jpa는 인터페이스임
//자바 표준 인터페이스임
//객체와 ORM 기술 즉 어노테이션 으로 한다

@Entity
public class Member { //회원관련 도메인

    //GenerationType.IDENTITY 는 DB가 알아서 ID생성
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
