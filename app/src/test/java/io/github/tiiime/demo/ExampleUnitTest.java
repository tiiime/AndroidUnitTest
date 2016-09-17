package io.github.tiiime.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
	@BeforeClass
	public static void beforeClass() {
		// 一个静态方法，只在最开始执行一次，可以用于数据库
		// 连接等资源消耗严重的操作。
	}

	@Before
	public void setup() {
		// 一般用于初始化测试用例数据，可以有多个 @Before 修饰
		// 的方法，但不能保证它们之间调用的顺序。
	}

	@Test
	public void addition_isCorrect() throws Exception {
		// 测试用例
		assertEquals(4, 2 + 2);
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void addition_args() throws Exception {
		// 可以设定某些参数 timeout/expected
		ArrayList emptyList = new ArrayList();
		Object o = emptyList.get(0);
	}

	@Ignore
	@Test(expected = NullPointerException.class)
	public void hopeException(){
		// @Ignore 可以忽略某个测试用例
		List a = null;
		a.get(0);
	}

	@After
	public void teardown() {
		// 用于释放资源相关操作，和 @Before 一样可以定义多个。
	}

	@AfterClass
	public static void afterClass() {
		// 可以用来释放 @BeforeClass 初始化的资源。
	}
}