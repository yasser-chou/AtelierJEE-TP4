package ma.xproce.demo.services;
import java.util.*;
import ma.xproce.demo.entities.Video;
import ma.xproce.demo.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoManagerService implements VideoManager{

    private final VideoRepository videoRepository;

    @Autowired
    public VideoManagerService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public boolean deleteVideo(Video video) {
        videoRepository.delete(video);
        return true;
    }

    @Override
    public boolean deleteVideoByID(Integer id) {
        videoRepository.deleteById(Long.valueOf(id));
        return true;
    }

    @Override
    public Video updateVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }
}

