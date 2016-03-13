package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.NightQ;
import dao.ConnectDb;
import dto.FeedObjects;

public class NightQManager {
	public ArrayList<FeedObjects> GetFeeds() throws Exception {
		ArrayList<FeedObjects> feeds = null;
		try {
			ConnectDb database = new ConnectDb();
			Connection connection = database.Get_Connection();
			NightQ project = new NightQ();
			feeds = project.GetFeeds(connection);
		} catch (Exception e) {
			throw e;
		}
		return feeds;
	}
}
