package org.mgqclub.clubutilbot;

import sx.blah.discord.api.IDiscordClient;

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

}
