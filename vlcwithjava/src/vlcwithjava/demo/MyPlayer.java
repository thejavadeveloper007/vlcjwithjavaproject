package vlcwithjava.demo;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

//class Player extends Thread{
//	Canvas c;
//	Player(Canvas c){
//		this.c = c;
//	}
//	public void run() {
//		String url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
//        String[] options = { "--network-caching","400" };
//        
//		MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
//        
//        EmbeddedMediaPlayer mediaPlayer = mediaPlayerFactory.newEmbeddedMediaPlayer();
//        mediaPlayer.setVideoSurface(mediaPlayerFactory.newVideoSurface(c));
//        mediaPlayer.playMedia(url, options);
//        mediaPlayer.setVolume(0);
//	}
//}
public class MyPlayer {

	public static void main(String[] args) {
		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Users\\Rakesh Seervi\\Desktop\\vlc");
        Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
        SwingUtilities.invokeLater(() -> {
            MyPlayer vlcPlayer = new MyPlayer();
            try {
				vlcPlayer.playVideo();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });

	}
	
	public void playVideo() throws InterruptedException {

		String url1 = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
        String[] options1 = { "--network-caching","400" };
		//MAXIMIZE TO SCREEN
		
		//java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		
		//1. Live Streaming :-
		
        
		JFrame frame = new JFrame();
        

        Canvas c1 = new Canvas();
        c1.setBackground(Color.black);
     //   c1.setBounds(10, 10, 400, 300);
        c1.setVisible(true);
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(c1);
       // p1.setBounds(10, 10, 400, 300);
        frame.add(p1);
        
        Canvas c2 = new Canvas();
        c2.setBackground(Color.black);
       // c2.setBounds(430, 10, 400, 300);
        c2.setVisible(true);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(c2);
      //  p2.setBounds(430, 10, 400, 300);
      
       // p2.setBorder(BorderFactory.createLineBorder(Color.white,10));
        frame.add(p2);
        
        Canvas c3 = new Canvas();
        c3.setBackground(Color.black);
        c3.setVisible(true);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        p3.add(c3);
        frame.add(p3);
        
        Canvas c4 = new Canvas();
        c3.setBackground(Color.black);
        c3.setVisible(true);
       
        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        p4.add(c4);
        frame.add(p4);
       
        
        Canvas c5 = new Canvas();
        c3.setBackground(Color.black);
        c3.setVisible(true);
        
        JPanel p5 = new JPanel();
        p5.setLayout(new BorderLayout());
        p5.add(c5);
        frame.add(p5);
        
        Canvas c6 = new Canvas();
        c6.setBackground(Color.black);
        c6.setVisible(true);
        
        JPanel p6 = new JPanel();
        p6.setLayout(new BorderLayout());
        p6.add(c6);
        frame.add(p6);
        //7th
		Canvas c7 = new Canvas();
        c7.setBackground(Color.black);
        c7.setVisible(true);
        
        JPanel p7 = new JPanel();
        p7.setLayout(new BorderLayout());
        p7.add(c7);
        frame.add(p7);
        //8th
		Canvas c8 = new Canvas();
        c8.setBackground(Color.black);
        c8.setVisible(true);

		JPanel p8 = new JPanel();
        p8.setLayout(new BorderLayout());
        p8.add(c8);
        frame.add(p8);
        //9th
		Canvas c9 = new Canvas();
        c9.setBackground(Color.black);
        c9.setVisible(true);

		JPanel p9 = new JPanel();
        p9.setLayout(new BorderLayout());
        p9.add(c9);
        frame.add(p9);
        //10th
		Canvas c10 = new Canvas();
        c10.setBackground(Color.black);
        c10.setVisible(true);

		JPanel p10 = new JPanel();
        p10.setLayout(new BorderLayout());
        p10.add(c10);
        frame.add(p10);
        //11th
		Canvas c11 = new Canvas();
        c11.setBackground(Color.black);
        c11.setVisible(true);

		JPanel p11 = new JPanel();
        p11.setLayout(new BorderLayout());
        p11.add(c11);
        frame.add(p11);
        //12th
		Canvas c12 = new Canvas();
        c12.setBackground(Color.black);
        c12.setVisible(true);

		JPanel p12 = new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(c12);
        frame.add(p12);
        //13th
		Canvas c13 = new Canvas();
        c13.setBackground(Color.black);
        c13.setVisible(true);

		JPanel p13 = new JPanel();
        p13.setLayout(new BorderLayout());
        p13.add(c13);
        frame.add(p13);
        //14th
		Canvas c14 = new Canvas();
        c14.setBackground(Color.black);
        c14.setVisible(true);

		JPanel p14 = new JPanel();
        p14.setLayout(new BorderLayout());
        p14.add(c14);
        frame.add(p14);
        //15th
		Canvas c15 = new Canvas();
        c15.setBackground(Color.black);
        c15.setVisible(true);

		JPanel p15 = new JPanel();
        p15.setLayout(new BorderLayout());
        p15.add(c15);
        frame.add(p15);
        //16th
		Canvas c16 = new Canvas();
        c16.setBackground(Color.black);
        c16.setVisible(true);

		JPanel p16 = new JPanel();
        p16.setLayout(new BorderLayout());
        p16.add(c16);
        frame.add(p16);
        
        frame.setLocation(100, 100);
        frame.setSize(1650,1080);
        frame.setLayout(new GridLayout(4, 4, 1, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
        
//        Player player1 = new Player(c1);
//        player1.start();
//        
//        Player player2 = new Player(c2);
//        player2.start();
//        
//        Player player3 = new Player(c3);
//        player3.start();
//        
//        Player player4 = new Player(c4);
//        player4.start();
//        
//        Player player5 = new Player(c5);
//        player5.start();
//        
//        Player player6 = new Player(c6);
//        player6.start();
//        
//        Player player7 = new Player(c7);
//        player7.start();
//        
//        Player player8 = new Player(c8);
//        player8.start();
//        
//        Player player9 = new Player(c9);
//        player9.start();
//        
//        Player player10 = new Player(c10);
//        player10.start();
//        
//        Player player11 = new Player(c11);
//        player11.start();
//        
//        Player player12 = new Player(c12);
//        player12.start();
//        
//        Player player13 = new Player(c13);
//        player13.start();
//        
//        Player player14 = new Player(c14);
//        player14.start();
//        
//        Player player16 = new Player(c16);
//        player16.start();
//        
//        Player player15 = new Player(c15);
//        player15.start();
        
        
        
       
        MediaPlayerFactory mediaPlayerFactory1 = new MediaPlayerFactory();
        
        EmbeddedMediaPlayer mediaPlayer1 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer1.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c1));
        mediaPlayer1.playMedia(url1, options1);
        mediaPlayer1.setVolume(1);
       
        EmbeddedMediaPlayer mediaPlayer2 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer2.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c2));
        mediaPlayer2.playMedia(url1, options1);
        mediaPlayer2.setVolume(0);
        
        EmbeddedMediaPlayer mediaPlayer3 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer3.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c3));
        mediaPlayer3.playMedia(url1, options1);
        mediaPlayer3.setVolume(0);
        
        EmbeddedMediaPlayer mediaPlayer4 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer4.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c4));
        mediaPlayer4.playMedia(url1, options1);
        mediaPlayer4.setVolume(0);
        
        EmbeddedMediaPlayer mediaPlayer5 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer5.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c5));
        mediaPlayer5.playMedia(url1, options1);
        mediaPlayer5.setVolume(0);
        
        EmbeddedMediaPlayer mediaPlayer6 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer6.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c6));
        mediaPlayer6.playMedia(url1, options1);
        mediaPlayer6.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer7 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer7.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c7));
        mediaPlayer7.playMedia(url1, options1);
        mediaPlayer7.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer8 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer8.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c8));
        mediaPlayer8.playMedia(url1, options1);
        mediaPlayer8.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer9 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer9.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c9));
        mediaPlayer9.playMedia(url1, options1);
        mediaPlayer9.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer10 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer10.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c10));
        mediaPlayer10.playMedia(url1, options1);
        mediaPlayer10.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer11 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer11.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c11));
        mediaPlayer11.playMedia(url1, options1);
        mediaPlayer11.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer12 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer12.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c12));
        mediaPlayer12.playMedia(url1, options1);
        mediaPlayer12.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer13 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer13.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c13));
        mediaPlayer13.playMedia(url1, options1);
        mediaPlayer13.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer14 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer14.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c14));
        mediaPlayer14.playMedia(url1, options1);
        mediaPlayer14.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer15 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer15.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c15));
        mediaPlayer15.playMedia(url1, options1);
        mediaPlayer15.setVolume(0);
        
		EmbeddedMediaPlayer mediaPlayer16 = mediaPlayerFactory1.newEmbeddedMediaPlayer();
        mediaPlayer16.setVideoSurface(mediaPlayerFactory1.newVideoSurface(c16));
        mediaPlayer16.playMedia(url1, options1);
        mediaPlayer16.setVolume(0);
  
	}
}
