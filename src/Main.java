public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Joe's birthday");
        video.setUser(new User("joe@oop.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new SqlVideoDatabase(),
                new EmailService()
        );
        processor.process(video);
    }
}