package AdapterClasess;

public class GetJob implements GetQuery {

	private String query;
	
	public GetJob(String url) {
		this.query = url + "job";
	}

	
	public String getRequest(boolean async, boolean param2) {
		return this.query;
	}

}
