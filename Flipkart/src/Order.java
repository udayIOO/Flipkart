import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Order {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://api.flipkart.net/sellers/v3/shipments?orderIds=OD120522077121951000")
				  .method("GET", null)
				  .addHeader("Content-Type", "application/json")
				  .addHeader("Authorization", "Bearer ee82a40b-88ef-4882-b222-80ca5651ef5c")
				  .build();
				Response response = client.newCall(request).execute();
			    System.out.println(response.body().string());

	}

}
