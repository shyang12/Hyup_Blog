# Hyup_Blog_Project
## ▶ 나만의 블로그 만들기 프로젝트
 
 - Eclipse에서 Spring boot(Java)를 기반으로 나만의 블로그 서비스를 구현하는 프로젝트
 - Restful API를 사용하여 데이터 생성, 조회, 수정, 삭제하는 실습 (CRUD Opetation)

`Web MVC` `MySQL` `Postman` `MIME Type` `JPA` `JSON`

## 1. Co-Development Environment   
### 1. 1 Environments
- Windows 10
- Eclipse / Java
- Spring Boot
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

### 1. 4 Concept
- 영속성을 프리젠테이션 계층까지 가져간다. 트랜잭션은 Service계층에서 종료된다. Transaction이 종료된 후에도 Controller의 Session이 close되지 않았기 때문에, 영속 객체는 Persistence 상태를 유지할 수 있으며, 따라서 프록시 객체에 대한 Lazy Loading을 수행할 수 있게 된다. -> `더티 체킹`

![영속성](https://github.com/shyang12/Hyup_Blog/assets/85710913/b999af1f-d088-480a-b088-a5ef613bd1f3)

- 연관관계 만들기

  ▶ @ManyToOne
  
  ▶ @OneToMany
  
  ▶ @OneToOne
  
  ▶ @ManyToMany
  
  ▶ ManyToMany는 사용하지 않는다. 그 이유는 서로의 primary key로만 중간 테이블을 생성해주는데, 날짜나 시간 다른 필드들이 필요할 수 있기 때문에, 내가 중간 테이블을 직접만들고
     @OneToMany, @OneToMany를 사용한다.

### 1. 4 Implement
-

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
├── test
│   ├── BlogController.java
│   ├── DummyController.java
│   ├── Member.java
│   └── TempController.java
├── add_image
│   └── add_image.java
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
