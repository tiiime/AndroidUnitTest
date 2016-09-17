package io.github.tiiime.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by kang on 16-9-17.
 */

public class MockitoSimpleText {

	@Test
	public void mockitoExample() {
		// mock 一个数据
		List list = mock(List.class);
		list.add("one");
		Object o = list.get(0);

		assertNotNull(list);
		assertNull(o);
	}

	@Test
	public void mockitoStub() {
		// stub 方法调用
		List list = mock(List.class);
		when(list.get(0)).thenReturn("hey");

		assertEquals("hey", list.get(0));
	}

	@Test
	public void mockitoVerify() {
		// 验证方法调用
		List list = mock(List.class);
		list.get(0);

		verify(list).get(0);
	}
}
