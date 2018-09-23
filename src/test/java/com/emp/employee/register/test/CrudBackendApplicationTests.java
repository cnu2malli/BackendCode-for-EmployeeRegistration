package com.emp.employee.register.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.emp.employee.register.repositories.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudBackendApplicationTests {

	@Mock
	EmployeeRepository databaseMock;

	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@Test
	public void testQuery() {
		ClassToTest t = new ClassToTest(databaseMock);
		boolean check = t.query("* from employee");
		assertTrue(check);
		verify(databaseMock).query("* from employee");
	}

	@Test
	public void testMoreThanOneReturnValue() {
		Iterator<String> i = mock(Iterator.class);
		when(i.next()).thenReturn("databaseMock").thenReturn("records");
		String result = i.next() + " " + i.next();

		assertEquals(records, result);
	}

}
