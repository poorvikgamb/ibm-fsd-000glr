package MultiCastServer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class ChatBox {

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatBox window = new ChatBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public ChatBox() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea response = new JTextArea();
		response.setBounds(300, 11, 124, 101);
		frame.getContentPane().add(response);
		

		JTextArea request = new JTextArea();
		request.setBounds(60, 11, 99, 101);
		frame.getContentPane().add(request);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int portNumber = 1236;
				 	try {
						MulticastSocket server = new MulticastSocket(portNumber);
						System.out.println("server created");
						InetAddress group = InetAddress.getByName("225.0.0.1");
						server.joinGroup(group);
						System.out.println("joined group");
						boolean infinite = true;
						while(infinite)
						{
							byte buff[  ] = new byte[1024];
							DatagramPacket data = new DatagramPacket(buff, buff.length);
							server.receive(data);							
							 String msg = new String(data.getData()).trim();
							 request.append(msg);
						}
						server.close();
				 	} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnSubmit.setBounds(318, 135, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
	}
}
