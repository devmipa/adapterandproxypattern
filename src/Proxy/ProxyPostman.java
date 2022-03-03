package Proxy;

public class ProxyPostman implements Postman {

	private RealPostman postman;
	private String token;
	private String query;
	private static String validator = "2c2e3ef8-e113-45ce-89b0-ca75de1d4ee9";

	public ProxyPostman(String query) {
		this.query = query;
		this.token = validator;
	}

	public String makeRequest(String token) {
		String result;
		if (this.token == token) {
			this.postman = new RealPostman();
			result = this.postman.makeRequest(this.query);
		} else {
			result = "error Token";
		}
		return result;
	}
}
