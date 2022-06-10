package com.bilgeadam.boost.java.lesson034.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import com.bilgeadam.boost.java.lesson034.server.common.Commons;

public class Translator implements Runnable {

	private Socket socket;

	public Translator(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (OutputStream output = socket.getOutputStream(); InputStream input = socket.getInputStream();) {

			PrintWriter sender = new PrintWriter(output, true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			while (true) {
				String text = reader.readLine();
				System.out.println(text);
				StringTokenizer tokenizer = new StringTokenizer(text, "|");
				String textToTranslate = tokenizer.nextToken();
				String targetLanguage = tokenizer.nextToken();

				sender.println(Commons.getInstance().translate(textToTranslate, targetLanguage));
			}
		} catch (IOException e) {
			System.err.println("Something get wrong!!: "+e.getMessage()); 
		}
	}

}
