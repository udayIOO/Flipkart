import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MarkShipmentDispatch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("application/json");
				RequestBody body = RequestBody.create(mediaType, "{\n  \"shipmentIds\": [\n    \"a104fa8a-e676-43e1-b582-77b7301d8d99\"\n  ],\n  \"locationId\": \"LOC4de54b3efc0c4343a27e559281ec20009\"\n}");
				Request request = new Request.Builder()
				  .url("https://api.flipkart.net/sellers/v3/shipments/dispatch")
				  .method("POST", body)
				  .addHeader("Content-Type", "application/json")
				  .addHeader("Authorization", "Bearer ee82a40b-88ef-4882-b222-80ca5651ef5c")
				  .build();
				Response response = client.newCall(request).execute();
				System.out.println(response.body().string());
	}

}
