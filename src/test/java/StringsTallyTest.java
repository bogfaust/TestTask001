import org.testng.*;
import org.testng.annotations.*;

public class StringsTallyTest {

	@Test
	public static void stringsTallyTest() {
		/* 	Здесь захардкожены результаты выполнения функции
			При необходимости можно усложнить проверки, распарсив результат выполнения getTally
			и отсортировав по алфавиту (так как при разных реализациях порядок может быть разным)
		*/
		Assert.assertEquals(StringsTally.getTally(new String[] {"qwe","wqe","qwee","a","a"}),"a = 3, 4 eqw = 0, 1", "Incorrect result 1");
		Assert.assertEquals(StringsTally.getTally(new String[] {"qqqwwweee","eeewwwqqq","qweqweqwe","qweqwe","qweqw"}),"eeeqqqwww = 0, 1, 2", "Incorrect result 2");

		System.out.println("Все тесты пройдены!");
	}
}
