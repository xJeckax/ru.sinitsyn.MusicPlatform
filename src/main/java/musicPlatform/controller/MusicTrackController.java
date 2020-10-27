package musicPlatform.controller;

import musicPlatform.dto.MusicTrackDto;
import musicPlatform.service.MusicTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/tracks")
public class MusicTrackController {

    private final MusicTrackService musicTrackService;

    @Autowired
    public MusicTrackController(MusicTrackService musicTrackService) {
        this.musicTrackService = musicTrackService;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public MusicTrackDto getTrackById(@PathVariable("id") Long id){
       return musicTrackService.getMusicTrackDtoById(id);
    }

    @GetMapping
    public Set<MusicTrackDto> getAllTracks(){
       return musicTrackService.getAllMusicTrack();
    }

    @PostMapping
    public void saveTrack(@RequestBody MusicTrackDto musicTrackDto){
        musicTrackService.saveMusicTrack(musicTrackDto);
    }

    @PutMapping
    public void updateTrackById(@RequestBody MusicTrackDto musicTrackDto){

        try {
            musicTrackService.updateMusicTrack(musicTrackDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTrack(@PathVariable("id") Long id){
        musicTrackService.deleteMusicTrack(id);
    }
}
