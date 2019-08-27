package MultiCastServer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class ChatClient {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClient window = new ChatClient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public ChatClient() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea request = new JTextArea();
		request.setBounds(264, 11, 119, 90);
		frame.getContentPane().add(request);
		
		JTextArea response = new JTextArea();
		response.setBounds(33, 11, 97, 90);
		frame.getContentPane().add(response);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int port = 1236;
				try {
					MulticastSocket client = new MulticastSocket(port);
					InetAddress group = InetAddress.getByName("225.0.0.1");
					client.joinGroup(group);
					String msg = response.getText().toString();
					System.out.println("send mseg to server");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					msg = br.readLine();
					DatagramPacket data = new DatagramPacket(msg.getBytes(),0,msg.length(),group,port);
					client.send(data);
					client.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSubmit.setBounds(294, 139, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}

}