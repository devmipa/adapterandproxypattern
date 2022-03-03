package Proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RealPostmanTest {

	Postman RealPostmanl;

	@Test
	void testMakeRequest() {
		String query = "example.com";
		String expectedeValue = "Processing query: " + query + "\n header: typeJson \n body { name: Katy Jones }";
		String obteniedValue;
		
		// When
		RealPostmanl = new RealPostman();

		// Then
		obteniedValue = RealPostmanl.makeRequest(query);
		assertEquals(expectedeValue, obteniedValue);

	}

}
