package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.FeedObjects;

public class NightQ {
	public ArrayList<FeedObjects> GetFeeds(Connection connection)
			throws Exception {
		ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT latitude, logitude FROM NOwlStore ;");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FeedObjects feedObject = new FeedObjects();
			//	feedObject.setLocationid("locationid");
				feedObject.setLatitude("latitude");
				feedObject.setLogitude("logitude");
//				feedObject.setMarker("marker");
//				feedObject.setCurrentTym("currentTym");
//				feedObject.setLastupdated("lastupdated");
				feedData.add(feedObject);
			}
			return feedData;
		} catch (Exception e) {
			throw e;
		}
	}
}
