# Hyup_Blog_Project
## ▶ 나만의 블로그 만들기 프로젝트
 
 - Eclipse에서 Spring boot(Java)를 기반으로 나만의 블로그 서비스를 구현하는 프로젝트
 - Restful API를 사용하여 데이터 생성, 조회, 수정, 삭제하는 실습 (CRUD Opetation)

`Bootstrap` `Web MVC` `MySQL` `Postman` `MIME Type` `JPA` `JSON` `Ajax`

## 1. Co-Development Environment   
### 1. 1 Environments
- Windows 10
- Eclipse / Java
- Spring Boot
- Bootstrap
- Postman
- Github

![깃](https://github.com/shyang12/Hyup_Blog/assets/85710913/b17fb607-383c-402c-8bf5-74368cc5ff94)


### 1. 2 Dependencies
- Spring Boot DevTools
- Lombok
- Spring Data JPA
- MySQL Driver
- Spring Security
- Spring Web

### 1. 3 Skills
- MySQL
- Rest API
- JPA
- JSON
- Ajax

### 1. 4 Concept
- 영속성을 프리젠테이션 계층까지 가져간다. 트랜잭션은 Service계층에서 종료된다. Transaction이 종료된 후에도 Controller의 Session이 close되지 않았기 때문에, 영속 객체는 Persistence 상태를 유지할 수 있으며, 따라서 프록시 객체에 대한 Lazy Loading을 수행할 수 있게 된다. -> `더티 체킹`

  ▶ 함수 종료시에 자동 commit이 됨.

- 세션의 시작은 서블릿이 시작되는 시점 부터~ (세션은 영속성 컨텍스트를 포함)
- 트랜잭션의 시작은 서비스 레이어부터, JDBC 커넥션도 이 시점부터.
- 트랜잭션의 종료는 서비스 계층에서 종료, JDBC 커넥션도 이 시점 부터 종료.
- 세션은 컨트롤러 영역까지 끌고 가기 때문에 영속성이 보장되어 select가 가능해지고 lazy-loading이 가능해진다.

![영속성](https://github.com/shyang12/Hyup_Blog/assets/85710913/b999af1f-d088-480a-b088-a5ef613bd1f3)

- 연관관계 만들기

  ▶ @ManyToOne
  
  ▶ @OneToMany
  
  ▶ @OneToOne
  
  ▶ @ManyToMany
  
  ▶ ManyToMany는 사용하지 않는다. 그 이유는 서로의 primary key로만 중간 테이블을 생성해주는데, 날짜나 시간 다른 필드들이 필요할 수 있기 때문에, 내가 중간 테이블을 직접만들고
     @OneToMany, @OneToMany를 사용한다.

- Insert -> `@DynamicInsert` insert할때 null 인 필드 제외
- 무한 참조 방지하기
  
  (1) Entity로 받고 Json직렬화 하기 전에 DTO 생성후 복사하기
  
       BeanUtils.copyProperties(A,B)
  
  (2) 처음부터 DTO로 DB에서 받기
  
  (3) @JsonIgnore
  
  (4) @JsonIgnoreProperties({"board"})
  
  (5) @JsonBackReference @JsonManagedReference

- Json 데이터로 통신
  
  1. Get요청 -> 주소에 데이터를 담아 보낸다. 데이터 형태는 key=value
  2. Post, Put, Delete 요청 -> Body에 데이터를 담아 보낸다. 데이터 형태는 json으로 통일하는 것이 좋다.
  3. 스프링 컨트롤러의 파싱 전략 1
 
     스프링 컨트롤러는 key=value 데이터를 자동으로 파싱하여 변수에 담아준다.
     가령 get요청은 key=value이고 post요청중에 x-www-form-urlencoded
     (form태그를 만들어서 데이터 전송) 시에도 key=value 이기 때문에 이러한
     데이터는 아래와 같이 함수의 파라메터로 받을 수 있다.
     
  4. 스프링 컨트롤러의 파싱 전략 2
 
     스프링은 key=value 형태의 데이터를 오브젝트로 파싱해서 받아주는 역할도 한다.
     
     ** 이때 주의 할점은 setter가 없으면 key=value 데이터를 스프링이 파싱해서 넣어주지 못한다.

  6. key=value가 아닌 데이터는 어떻게 파싱할까?
 
     json 데이터나 일반 text데이터는 스프링 컨트롤러에서 받기 위해서는 @RequestBody 어노테이션이 필요하다.
     
     ** 기본전략이 스프링 컨트롤러는 key=value 데이터를 파싱해서 받아주는 일을 하는데 다른 형태의 데이터
        가령 json 같은 데이터는 아래와 같이 생겼다.

     @RequestBody 어노테이션을 붙이면 MessageConverter 클래스를 구현한 Jackson 라이브러리가 발동하면서
     json 데이터를 자바 오브젝트로 파싱하여 받아준다.

  8. form 태그로 json데이터 요청방법
 
![방법](https://github.com/shyang12/Hyup_Blog/assets/85710913/226250bb-0adc-4dcb-951c-e50e4287b153)
     
![방법2](https://github.com/shyang12/Hyup_Blog/assets/85710913/16d33a5f-5f3e-4858-a4c4-10e192100989)


- 회원가입 시 `Ajax` 사용 이유
  
  (1) 요청에 대한 응답을 `HTML`이 아닌 `Data(Json)`를 받기 위해

  (2) 비동기 통신을 하기 위해 -> 사용자 경험을 향상시킨다 (절차적으로 수행하나 순서에 상관없이 수행)

![ajax](https://github.com/shyang12/Hyup_Blog/assets/85710913/dcc8c5b5-7566-4ea5-a58e-a67367f7d730)
 

### 1. 4 Implement
- `Bootstrap 4`를 사용하여 기본적인 홈페이지의 UI를 구성

## 2. Project Architecture   
```bash
├── main
│   ├── HyupBlogApplication.java
│   └── constants.java
├── model
│   ├── Board.java
│   ├── Reply.java
│   ├── RoleType.java
│   └── User.java
├── repository
│   ├── UserRepository.java
│   └── chat_screen.java
├── handler
│   └── GlobalExceptionHandler.java
├── dto
│   └── ResponseDto.java
├── service
│   └── UserService.java
├── controller
│   ├── api
│   │    ├── UserApiController.java
│   ├── BoardController.java
│   └── UserController.java
└── test
│   ├── BlogController.java
│   ├── DummyController.java
│   ├── Member.java
│   └── TempController.java
├── js
│   ├── user.js
├── UI
│   ├── main
│   │    ├── index.jsp
│   │    └── test.jsp
│   ├── layout
│   │    ├── footer.jsp
│   │    └── header.jsp
│   ├── user
│   │    ├── joinForm.jsp
│   │    └── loginForm.jsp
```

## 3. MySQL   
### 3.1 Database
```bash
├── board
│    ├── count
│    ├── id
│    ├── userId
│    ├── createDate
│    ├── title
│    └── content
├── reply
│    ├── boardId
│    ├── id
│    ├── userId
│    ├── creatDate
│    └── content
├── user
│    ├── id
│    ├── createDate
│    ├── email
│    ├── password
│    └── role
```

## 4. Result   
- Spring Boot 실습
  
![실습 1](https://github.com/shyang12/Book_FInd/assets/85710913/a4b41924-ad12-4c5e-b7d6-164023def682)
