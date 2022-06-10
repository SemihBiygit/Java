package com.bilgeadam.boost.java.lesson034.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.bilgeadam.boost.java.lesson034.server.common.Commons;

public class TranslatorServer {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Insufficient number of arguments. The program is closing.");
			System.exit(-10);
		}
		Commons.getInstance().setArguments(args[0], args[1]);

		TranslatorServer server = new TranslatorServer();
		server.communicate();

	}

	private void communicate() {
		try (ServerSocket serverSocket = new ServerSocket(Commons.getInstance().getPort());) {
			System.out.println("Ready to accept new connections via " + Commons.getInstance().getPort() + " port.");

			while (true) {
				Socket socket = serverSocket.accept();
				Translator translator = new Translator(socket);
				Thread thread = new Thread(translator);
				thread.start();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
