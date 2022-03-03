package AdapterClasess;

public class GetName implements GetQuery {
	
	private String query;
	
	public GetName(String url) {
		this.query = url + "name";
	}

	
	public String getRequest(boolean async, boolean param2) {
		//implement(async, param2);
		return this.query;
	}

}
