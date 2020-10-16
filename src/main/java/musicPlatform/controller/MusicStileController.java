package musicPlatform.controller;

import musicPlatform.dto.MusicAlbumDto;
import musicPlatform.dto.MusicStileDto;
import musicPlatform.service.MusicStileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/stiles")
public class MusicStileController {

    private final MusicStileService musicStileService;

    @Autowired
    public MusicStileController(MusicStileService musicStileService) {
        this.musicStileService = musicStileService;
    }

    @GetMapping
    @ResponseBody
    public Set<MusicStileDto> getAllMusicStile(){

        return musicStileService.getAllMusicStile();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public MusicStileDto getMusicStileById(@PathVariable(value = "id")Long id ){

        return musicStileService.getMusicStileDtoById(id);
    }

    @PostMapping
    public void createMusicStile(@RequestBody MusicStileDto musicStileDto){

        musicStileService.saveMusicStile(musicStileDto);
    }

    @PutMapping
    public void updateMusicStile(@RequestBody MusicStileDto musicStileDto) throws Exception {
        musicStileService.updateMusicStile(musicStileDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteMusicStile(@PathVariable("id") Long id){
        musicStileService.deleteMusicStile(id);
    }

}
