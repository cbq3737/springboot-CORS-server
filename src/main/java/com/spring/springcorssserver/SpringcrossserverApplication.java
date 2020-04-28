package com.spring.springcorssserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcrossserverApplication {
    @CrossOrigin(origins = "http://localhost:18080") //client에서 접근을 하기 위함.
    @GetMapping("/hello")//hello를 요청화면 hello를 화면에 뿌려주게 만든다.
    public String hello()
    {
        return "hello";
    }//이렇게하면 간단한rest api가 완성되고 8080포트를 쓰는 서버를 만든것이다.->이제 이것을 요청하는 다른 애플리케이션을 만들어주면 됨(rest api를 사용하는 클라이언트).springclientApplication프로젝트역시 만들어줌.이때 만들어준 8080서버는 계속 실행중
    //->만일 여러 Controlle에 걸쳐 설정을 해야한다면,설정파일을 만들어서 해줄수 있다. -> Webconfig
    public static void main(String[] args){
        SpringApplication.run(SpringcrossserverApplication.class, args);
    }
}
