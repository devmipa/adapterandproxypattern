package AdapterClasess;

public class AdapterQuery implements Query{

	private GetQuery query;
	
	public AdapterQuery(String typeQuery, String url) {
		boolean isQueryName = typeQuery.equalsIgnoreCase("name");
		
		if(isQueryName) {
			this.query = new GetName(url);
		} else {
			this.query = new GetJob(url);
		}
		
	}
	public String get() {
		return this.query.getRequest(false, false);
	}

}
