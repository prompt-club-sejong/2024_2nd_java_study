## Thread Class와 Runnable Interface
Thread는 컴퓨터가 받은 명령어를 수행하는 동안 일어나는 일종의 실행 흐름이다. 독립적이고 하나의 프로그램 내에서 여러개의 Thread가 동시에 실행될 수 있다. 이러한 Thread는 프로세스의 일부로 실행되며, 해당 프로세스의 자원을 공유한다. 다만 스레드를 사용하는 경우에는 하나의 스레드가 다른 스레드에 영향을 끼치지 않도록 동기화(Synchronization)를 해야 한다.  


Thread Class는 Thread 생성을 위해 Java에서 미리 구현해둔 클래스이다. 상속을 받아 사용해야 하기 때문에 다른 클래스를 상속받아 사용할 수 없다는 단점이 있다. 따라서 일반적으로는 Runnable 인터페이스를 구현해서 Thread를 사용한다.Thread는 기본적으로 다음과 같은 메소드들을 제공한다.

1) sleep : 현재 쓰레드 멈춘다. 자원을 놓아주지는 않고, 제어권을 넘겨주므로 데드락이 발생할 수 있음


2) interupt : 다른 쓰레드를 깨워서 interruptedException 을 발생시킨다. Interupt가 발생한 쓰레드는 예외를 catch하여 다른 작업을 할 수 있다.


3) join : 다른 쓰레드의 작업이 끝날 때 까지 기다리게 한다. 쓰레드의 순서를 제어할 때 사용할 수 있다
   
Runnable Interface는 함수형 인터페이스이다. Thread를 구현하기 위한 템플릿에 해당한다. Runnable이 Run을 구현하기에 Thread 클래스는 run 메서드를 구현한다.

Thread는 클래스를 만들어야 돼서 번거롭지만 Runnable은 익명 객체 및 람다로 사용 가능하다. Thread 클래스에 구현된 코드들에 의해 더 많은 자원을 필요로 하기에 Runnable 주로 사용한다.
***
## Thread의 상태
<img Thread State = "./assets/Thread_State.png">
Thread의 상태를 확인하는 방법은 Runnable Interface를 구현하여 Thread를 구성한 경우는 Thread.currentThread().getState() 메서드를 이용해 Thread의 상태를 확인할 수 있다. Thread 클래스를 상속받아 구성하는 경우는 부모의 getState()메서드를 바로 이용할 수도 있다.
<img Thread State_1 = "./assets/Thread_State_1.png">

***
## Thread의 우선 순위
멀티 쓰레드 프로그래밍에서 순위를 정하는 것을 스레드 스케줄링이라고 한다. 스레드 스케줄링 방법에는 우선순위(Priority) 스케줄링과 라운드 로빈(Round-Robin) 이 있다.


1) 우선순위 스케줄링 : 쓰레드의 우선순위가 높은 순으로 실행 상태를 더 많이 차지하는 스케줄링 방식이다. 개발자가 setPriority() 메소드를 사용하여 우선순위를 설정할 수 있다.

2) 라운드 로빈 : Time Slice를 정해서 그 시간만큼만 쓰레드가 실행되도록 하고 이후에는 다른 쓰레드가 실행되는 스케줄링 방식이다. JVM에 의해 결정되기 때문에 개발자가 임의로 수정 불가능하다.
***
## Main Thread
Main Thread는 오직 한개 뿐이며, 나머지는 모두 Background Thread다. 우리가 일반적으로 작성하는 대부분의 코드는 MainThread에서 실행된다. 이 사실을 잘 의식하지 못하는 이유는 우리가 작성한 코드가 Cocoa에서 실행되는데 이 Cocoa가 코드를 main thread에서 호출하기 때문이다. 

Main thread는 interface thread라고도 불린다. 유저가 interface에 접근하면 이벤트는 main thread로 전달되고 우리가 작성한 코드는 이에 반응하게 된다. 이 말은 곧 인터페이스에 관련된 코드는 반드시 main thread에서 작성되어야 함을 의미한다. 

***
## 동기화
멀티스레드를 잘 사용하면 프로그램적으로 좋은 성능을 낼 수 있지만, 멀티스레드 환경에서 반드시 고려해야할 점인 스레드간 동기화라는 문제는 꼭 해결해야 한다. 

자바에서 지원하느 Synchronized 키워드는 여러개의 스레드가 한개의 자원을 사용하고자 할 때, 현재 데이터를 사용하고 있는 해당 스레드를 제외하고 나머지 스레드들은 데이터에 접근 할 수 없도록 막는 개념이다.

Synchronized 키워드는 변수와 함수에 사용해서 동기화 할 수 있다. 하지만 Synchronized 키워드를 너무 남발하면 오히려 프로그램 성능저하를 일으킬 수 있다. 왜냐하면 Synchronized 키워드를 사용하면 자바 내부적으로 메서드나 변수에 동기화를 하기 위해 block과 unblock을 처리하게 되는데  이런 처리들이 만약 너무 많아지게 되면 오히려 프로그램 성능저하를 일으킬 수 있기 때문이다. 

1. 메서드에서 사용하는 경우   
public synchronized void method(){} 

2. 객체 변수에 사용하는 경우(block문)   
private Object obj = new Object();   
public void exampleMethod(){ synchronized(obj){}}
***
## 데드락
컴퓨팅에서 두 개 이상의 동시 작업이 서로 완료되기를 기다리는 경우 데드락이 발생한다. 이러한 상황은 두 Thread가 리소스를 공유하고 둘 다 다른 Thread가 보유한 공유 리소스에 대한 잠금을 얻기 위해 대기할 때 종종 발생한다.

데드락을 피하는 방법은 
1. Threa.join() 사용 : Thread.join()을 사용하여 한 Thread가 다른 Thread를 시작하기 전에 완료할 수 있다.
2. 동기화 개체 사용 : 동기화 및 동기화 프리미티브를 사용하여 교착 상태를 피할 수 있다. 뮤텍스 또는 세마포어와 같은 동기화 개체를 사용하는 것은 교착 상태를 방지하는 또 다른 방법이다. 이는 동일한 리소스에 대한 잠금을 위해 경쟁하는 여러 스레드로 인해 발생하는 교착 상태로부터 보호한다.
3. 중첩 잠금 방지 : 객체에 대한 잠금이 이미 됐을 때 다른 잠금을 획득하지 않음으로써 교착 상태를 피할 수 있다. 또는 잠금 획득을 위한 제한 시간 정책을 구현하고 여러 스레드에서 동일한 순서로 리소스에 액세스 하도록 하여 교착 상태 상황을 방지할 수 있다.
4. 필요하지 않을 때 장금 사용하지 않기
5. 적절한 코드 설계 : 교착 상태가 발생하지 않도록 코드를 설계할 수 있다. 또한 Thread 간에 순환 대기 종속성이 없도록 프로그램을 설계해야 한다. Thread로부터 안전한 클래스 및 데이터 구조를 사용하여 Java 애플리케이션에서 교착 상태의 위험을 줄여야 한다. 작업을 실행할 스레드에 할당된 마스터 작업을 설정하여 작업을 수행한다. 