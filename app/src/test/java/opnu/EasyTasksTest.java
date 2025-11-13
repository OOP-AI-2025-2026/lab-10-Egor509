package opnu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ua.opnu.EasyTasks;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EasyTasksTest {

    public static EasyTasks task;

    @BeforeAll
    static void setup() {
        task = new EasyTasks();
    }

    @Nested
    @DisplayName("Tests for the task 1")
    class Task1Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<Integer> input, List<Integer> expected) {

            List<Integer> actual = task.doubling(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of(1, 2, 3), List.of(2, 4, 6)),
                    Arguments.of(List.of(6, 8, 6, 8, -1), List.of(12, 16, 12, 16, -2)),
                    Arguments.of(List.of(), List.of()),
                    Arguments.of(List.of(5), List.of(10)),
                    Arguments.of(List.of(5, 10), List.of(10, 20)),
                    Arguments.of(List.of(8, -5, 7, 3, 109), List.of(16, -10, 14, 6, 218)),
                    Arguments.of(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2), List.of(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4)),
                    Arguments.of(List.of(3, 1, 4, 1, 5, 9), List.of(6, 2, 8, 2, 10, 18))
            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 2")
    class Task2Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<Integer> input, List<Integer> expected) {

            List<Integer> actual = task.square(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of(1, 2, 3), List.of(1, 4, 9)),
                    Arguments.of(List.of(6, 8, 6, 8, -1), List.of(36, 64, 36, 64, 1)),
                    Arguments.of(List.of(), List.of()),
                    Arguments.of(List.of(12), List.of(144)),
                    Arguments.of(List.of(5, 10), List.of(25, 100)),
                    Arguments.of(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2), List.of(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4))
            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 3")
    class Task3Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<String> input, List<String> expected) {

            List<String> actual = task.moreY(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of("a", "b", "c"), List.of("yay", "yby", "ycy")),
                    Arguments.of(List.of("hello", "there"), List.of("yhelloy", "ytherey")),
                    Arguments.of(List.of("yay"), List.of("yyayy")),
                    Arguments.of(List.of("", "a", "xx"), List.of("yy", "yay", "yxxy")),
                    Arguments.of(List.of(), List.of()),
                    Arguments.of(List.of("xx", "yy", "zz"), List.of("yxxy", "yyyy", "yzzy"))
            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 4")
    class Task4Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<Integer> input, List<Integer> expected) {

            List<Integer> actual = task.noNeg(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of(1, -2), List.of(1)),
                    Arguments.of(List.of(-3, -3, 3, 3), List.of(3, 3)),
                    Arguments.of(List.of(-1, -1, -1), List.of()),
                    Arguments.of(List.of(), List.of()),
                    Arguments.of(List.of(0, 1, 2), List.of(0, 1, 2)),
                    Arguments.of(List.of(3, -10, 1, -1, 4, -400), List.of(3, 1, 4)),
                    Arguments.of(List.of(-1, 3, 1, -1, -10, -100, -111, 5), List.of(3, 1, 5))

            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 5")
    class Task5Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<Integer> input, List<Integer> expected) {

            List<Integer> actual = task.no9(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of(1, 2, 19), List.of(1, 2)),
                    Arguments.of(List.of(9, 19, 29, 3), List.of(3)),
                    Arguments.of(List.of(1, 2, 3), List.of(1, 2, 3)),
                    Arguments.of(List.of(45, 99, 90, 28, 13, 999, 0), List.of(45, 90, 28, 13, 0)),
                    Arguments.of(List.of(), List.of()),
                    Arguments.of(List.of(9), List.of()),
                    Arguments.of(List.of(0, 9, 0), List.of(0, 0))
            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 6")
    class Task6Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<String> input, List<String> expected) {

            List<String> actual = task.noZ(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of("aaa", "bbb", "aza"), List.of("aaa", "bbb")),
                    Arguments.of(List.of("hziz", "hzello", "hi"), List.of("hi")),
                    Arguments.of(List.of("hello", "howz", "are", "youz"), List.of("hello", "are")),
                    Arguments.of(List.of(), List.of()),
                    Arguments.of(List.of(""), List.of("")),
                    Arguments.of(List.of("x", "y", "z"), List.of("x", "y"))
            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 7")
    class Task7Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<String> input, List<String> expected) {

            List<String> actual = task.refinedStrings(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of("aa", "c", "aa", "bbb"), List.of("bbb", "aa", "c")),
                    Arguments.of(List.of("aa"), List.of("aa")),
                    Arguments.of(List.of(), List.of())
            );
        }
    }

    @Nested
    @DisplayName("Tests for the task 8")
    class Task8Test {

        @ParameterizedTest
        @MethodSource("provider")
        public void test1(List<String> input, List<String> expected) {

            List<String> actual = task.flatten(input);
            assertEquals(expected, actual);
        }

        private static Stream<Arguments> provider() {
            return Stream.of(
                    Arguments.of(List.of("John Wick", "John Snow", "AlexMurphy"), List.of("John", "Wick", "John", "Snow", "AlexMurphy")),
                    Arguments.of(List.of("Peter Parker"), List.of("Peter", "Parker")),
                    Arguments.of(List.of("NeroWolfe"), List.of("NeroWolfe")),
                    Arguments.of(List.of(), List.of())
            );
        }
    }
}