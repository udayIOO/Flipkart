import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GenerateLabelForOrder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("application/json");
				RequestBody body = RequestBody.create(mediaType, "{\n  \"orderItems\": [\n    {\n      \"orderItemId\": \"OD120522077121951012\",\n      \"taxRate\": 0,\n      \"serialNumbers\": [\n       \n      ],\n      \"invoiceNumber\": \"1617161711671\",\n      \"invoiceDate\": \"2020-12-23T10:00:00.000+05:30\",\n      \"subItems\": [\n   \n      ]\n    }\n  ]\n}");
				Request request = new Request.Builder()
				  .url("https://api.flipkart.net/sellers/v2/orders/labels")
				  .method("POST", body)
				  .addHeader("Content-Type", "application/json")
				  .addHeader("Authorization", "Bearer ee82a40b-88ef-4882-b222-80ca5651ef5c")
				  .build();
				Response response = client.newCall(request).execute();
				System.out.println(response.body().string());

	}

}
