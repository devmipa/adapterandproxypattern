package AdapterClasessTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

import AdapterClasess.*;


class AdapterQueryTest {
	
	AdapterQuery object = new AdapterQuery("job","https://mydomain.com/");
	
	GetQuery query = mock(GetJob.class);

	
	@Test
	void test() {
		String expectedValue = "https://mydomain.com/job";
		//when(new AdapterQuery("job","https://mydomain.com/")).getMock();
		when(query.getRequest(false, false)).thenReturn("https://mydomain.com/job");
		assertEquals(expectedValue,query.getRequest(false,false));
	}

}
