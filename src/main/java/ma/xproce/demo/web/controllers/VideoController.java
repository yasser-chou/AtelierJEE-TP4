package ma.xproce.demo.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Corrected import
import org.springframework.web.bind.annotation.GetMapping;
import ma.xproce.demo.entities.Video;
import ma.xproce.demo.services.VideoManager;

import java.util.List;

@Controller
public class VideoController {

    @Autowired
    private VideoManager videoManager;

    @GetMapping("/listVideos")
    public String listVideosAction(Model model) {
        List<Video> videoList = videoManager.getAllVideos();
        model.addAttribute("videoList", videoList);
        return "listVideos";
    }
}
