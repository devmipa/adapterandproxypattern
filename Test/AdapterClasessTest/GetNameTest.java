package AdapterClasessTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import AdapterClasess.GetName;

class GetNameTest {
	String url = "https://mydomain.com/";
	GetName object = new GetName(url);

	@Test
	void test() {
		String expected = "https://mydomain.com/name";
		
		assertEquals(expected,object.getRequest(false, false));
	}

}
