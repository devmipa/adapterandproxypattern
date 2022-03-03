import AdapterClasess.AdapterQuery;
import AdapterClasess.Query;
import AdapterClasessTest.*;
import Proxy.Postman;
import Proxy.ProxyPostman;

public class Main {

	public static void main(String[] args) {
		
		//url endpoint(API) header:typeJson
		
		String endPoint = "job";
		String url = "https://mydomain.com/";
		
		Query adapterQuery = new AdapterQuery(endPoint, url);
		String myToken = "2c2e3ef8-e113-45ce-89b0-ca75de1d4ee9";
		
		//Adapt consult
		String query = adapterQuery.get();
		
		//Create ProxyPostman
		Postman proxyPostman = new ProxyPostman(query);
		//validate ProxyPostman
		String result = proxyPostman.makeRequest(myToken);
		System.out.println(result+"\n "+myToken);
		
	}

}
