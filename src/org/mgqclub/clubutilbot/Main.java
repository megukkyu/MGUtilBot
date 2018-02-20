package org.mgqclub.clubutilbot;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.util.DiscordException;

public class Main {

	private static IDiscordClient client;
	private static String loginToken;
	
	
	public static void main(String[] args) {
		System.out.println("起動開始");
		if (args.length < 2) {
			System.out.println("引数が間違っています");
			System.exit(1);
		}
		
		
	}
	
    public static IDiscordClient createClient(String token) { // Returns a new instance of the Discord client
        ClientBuilder clientBuilder = new ClientBuilder(); // Creates the ClientBuilder instance
        clientBuilder.withToken(token); // Adds the login info to the builder
        try {
        	return clientBuilder.login(); // Creates the client instance and logs the client in
        } catch (DiscordException e) { // This is thrown if there was a problem building the client
            e.printStackTrace();
            return null;
        }
    }

}
