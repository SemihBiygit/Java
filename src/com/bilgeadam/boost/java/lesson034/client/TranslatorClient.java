package com.bilgeadam.boost.java.lesson034.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;

import com.bilgeadam.boost.java.lesson034.client.common.Commons;

import util.MyUtil;

public class TranslatorClient {

	public static void main(String[] args) {
		MyUtil.header("Translator CLIENT");

		if (args.length != 2) {
			System.err.println("Insufficient number of arguments. The program is closing.");
			System.exit(-10);
		}

		Commons.getInstance().setArguments(args[0], args[1]);

		TranslatorClient client = new TranslatorClient();
		client.translate();

		MyUtil.footer();
	}

	private void translate() {
		try (Socket socket = new Socket(Commons.getInstance().getServerAdress(), Commons.getInstance().getPort())) {

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			OutputStream output = socket.getOutputStream();
			PrintWriter sender = new PrintWriter(output, true);

			String phrase = null;
			String targetLang = null;

			while (true) {
				phrase = MyUtil.readString("The word you want to translate (EXIT to finish)");
				if (phrase.equalsIgnoreCase("EXIT")) {
					break;
				}
				targetLang = MyUtil.readString("The language you want to translate (EN/DE/JP)");

				sender.println(phrase + "|" + targetLang);

				String line = reader.readLine();
				System.out.println("The word for " + phrase + " is " + line);
			}
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
