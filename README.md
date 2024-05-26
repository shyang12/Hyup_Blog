# Hyup_Blog_Project
## ▶ 나만의 블로그 만들기 프로젝트
 
 - Eclipse에서 Spring boot(Java)를 기반으로 책을 조회, 등록, 삭제 하는 서비스를 구현하는 프로젝트
 - Restful API를 사용하여 데이터 생성, 조회, 수정, 삭제하는 실습 (CRUD Opetation)

`Web MVC` `MySQL` `Postman` `MIME Type`

## 1. Co-Development Environment   
### 1. 1 Environments
- Windows 10
- Java
- Eclipse
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

### 1. 4 Implement
- 영속성을 프리젠테이션 계층까지 가져간다. 트랜잭션은 Service계층에서 종료된다. Transaction이 종료된 후에도 Controller의 Session이 close되지 않았기 때문에, 영속 객체는 Persistence 상태를 유지할 수 있으며, 따라서 프록시 객체에 대한 Lazy Loading을 수행할 수 있게 된다.

![영속성](https://github.com/shyang12/Hyup_Blog/assets/85710913/b999af1f-d088-480a-b088-a5ef613bd1f3)

- 

## 2. Architecture

![기능별로 Path 설정](https://github.com/shyang12/Book_FInd/assets/85710913/9cd9b7b9-2fdd-4700-b3b6-35029863b87a)

![스프링프레임워크 동작](https://github.com/shyang12/Book_FInd/assets/85710913/7f6e7df1-b585-4984-9a14-4e41a431fb01)

![dfdf](https://github.com/shyang12/Book_FInd/assets/85710913/52ebcb61-b71d-4622-9577-7ef01b139d58)

![vfgf](https://github.com/shyang12/Book_FInd/assets/85710913/cde1df59-ca99-43c7-bf67-33aefe897dec)

  
## 3. Result   
- Spring Boot 실습
  
![실습 1](https://github.com/shyang12/Book_FInd/assets/85710913/a4b41924-ad12-4c5e-b7d6-164023def682)
