# 상태정보 유지 기술

> 클라이언트와 서버 간에 연결상태가 유지되지 않는 통신 방식을 무상태 라고 합니다.
>
> 즉 처리 결과를 유지할 수 없음, 다른 요청에서도 처리결과를 사용하려면 정보를 유지 시켜야 한다.

* 저장 위치

  * 서버 측에서 저장 기술

    * [ServletContext](ServletContext.md)

    * [Session](HttpSession.md)

      

  * 클라이언트 측에 저장 기술
  
    * [Cookie](Cookie.md)
  * 