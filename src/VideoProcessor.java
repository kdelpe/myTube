public class VideoProcessor {
    private VideoEncoder encoder;
    private SqlVideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(
            VideoEncoder encoder,
            SqlVideoDatabase database,
            NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}

