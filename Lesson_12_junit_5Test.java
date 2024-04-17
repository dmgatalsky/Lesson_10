import static org.junit.jupiter.api.Assertions.*;

class Lesson_12_junit_5Test {

    @org.junit.jupiter.api.Test
    void factorial()throws Exception {
        Lesson_12_junit_5 J5 =new Lesson_12_junit_5();
        int actual = J5.Factorial(4);
        int expected =24;
        assertEquals(expected,actual);
    }
}