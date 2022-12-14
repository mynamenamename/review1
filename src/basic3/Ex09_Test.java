package basic3;

/*
1. 다음 문장들 중에서 올바른 메소드 정의는?
	(1)  void method () throw MyException { throws MyException(); }
	(2)  void method () throw MyException { throws new MyException(); }
	(3)  void method () throws MyException { throw MyException(); }
	(4)  void method () throws MyException { throw new MyException(); }   //정답 

2. 다음 프로그램의 출력 결과는?
class Test{
static void method() {
  throw new Exception();
}
public static void main( String [] args ) {   
     try{
         method();
} catch( Exception ex ) {
         System.out.println(“예외처리”);
     } 
}
}
	(1) 컴파일 에러가 발생한다             //정답 >> 예외처리를 하지 않았기 때문에
	(2) “예외처리”가 출력된다
	(3) 실행은 성공하나 아무것도 출력되지 않는다.
	(4) 실행시 예외가 발생하여 프로그램이 비정상적으로 종료한다.

3. 다음 프로그램의 출력 결과는?
class Test{
public static void main( String [] args ) {   
     try{
         return;
} finally {
         System.out.println(“FINALLY”);
     } 
}
}
	(1) 컴파일 에러가 발생한다
	(2) 컴파일 에러는 없으나 실행시 예외가 발생한다.
	(3) 실행은 성공하나 아무것도 출력되지 않는다.
	(4) “FINALLY”라는 문장이 출력된다.    //정답 >> finally는 무조건 출력되기 때문에

4. 다음 프로그램의 출력 결과는?
class Test{
public static void main( String [] args ) {   
     try{
         System.exit(0);
} finally {
         System.out.println(“FINALLY”);
     } 
}
}
	(1) 컴파일 에러가 발생한다
	(2) 컴파일 에러는 없으나 실행시 예외가 발생한다.
	(3) 실행은 성공하나 아무것도 출력되지 않는다.     //정답 >> System.exit(0);이 종료 구문. 
	(4) “FINALLY”라는 문장이 출력된다.

5. 다음 프로그램에서 출력 결과로 “try”라는 단어가 몇 번 출력되나?
class Test{
static void method( int i ) throws Exception {
   if ( i % 2 == 0 ) throw new Exception();
}
public static void main( String [] args ) {
   for( int i=0; i <= 4 ; i++ ) {
     try{
         method( i );
         System.out.println(“try”);
     }catch( Exception ex ) {
         System.out.println(“catch”);
     }
   }
}
}


2번. >> 2의 배수일 때 예외가 찍히기 때문


6. 다음 프로그램의 출력 결과는?
import java.io.IOException;

class Test{
static void method() throws IOException {
  throw new IOException();
}
public static void main( String [] args ) {   
     try{
         method();
         System.out.println(“TRY”);
     } catch( IOException ex ) {
         System.out.println(“IOEXCEPTION”);
     } catch( Exception ex ) {
         System.out.println(“EXCEPTION”);
     } finally {
System.out.println(“FINALLY”);
     }
 System.out.println(“END”);
}
}

	(1) 컴파일 에러
	(2) 실행시 예외발생으로 프로그램 비정상 종료
	(3) IOEXCEPTION – FINALLY – END     //정답 예외 찍히고> finally 차례대로
	(4) EXCEPTION – FINALLY – END
	(5) TRY – IOEXCEPTION – END 

7. 다음 프로그램의 출력 결과는?
import java.io.IOException;

class Test{
static void method() throws IOException {
  throw new IOException();
}
public static void main( String [] args ) {   
     try{
         method();
         System.out.println(“TRY”);
     } catch( Exception ex ) {
         System.out.println(“EXCEPTION”);
     } catch( IOException ex ) {
         System.out.println(“IOEXCEPTION”);
     } finally {
System.out.println(“FINALLY”);
     }
 System.out.println(“END”);
}
}

	(1) 컴파일 에러                            //정답  Excpetion ex 가 IOException 보다 크기 때문에
	(2) 실행시 예외발생으로 프로그램 비정상 종료
	(3) IOEXCEPTION – FINALLY – END
	(4) EXCEPTION – FINALLY – END
	(5) TRY – IOEXCEPTION – END 

8. 다음 프로그램의 출력 결과는?
class Test{
   static String str = “”;
static void method( int i ){
     try{
if ( i == 10 ) throw new Exception();
str += “A”;
     } catch( Exception ex ) {
 str += “B”;
 return;
     } finally {
str += “C”;
     }
str += “D”;
}
public static void main( String [] args ) {   
    method( 5 );
    method( 10);
System.out.println(str);

ACDBC // 5 >> ACD / 10 >> BC (return때문에 D가 나오지 않음) 


}
}
*/