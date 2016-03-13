package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.NightQManager;

import com.google.gson.Gson;

import dto.FeedObjects;

@Path("/WebService")
public class FeedService {
	@GET
	@Path("/GetFeeds")
	@Produces("application/json")
	public String feed() {
		
		String feeds = null;
		try {
			ArrayList<FeedObjects> feedData = null;
			NightQManager nightQManager = new NightQManager();
			feedData = nightQManager.GetFeeds();
			Gson gson = new Gson();
			System.out.println(gson.toJson(feedData));
			feeds = gson.toJson(feedData);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return feeds;
	}
//	  @GET
//	  @Produces(MediaType.TEXT_PLAIN)
//	  public String sayPlainTextHello() {
//	    return "Hello Jersey";
//	  }
}
