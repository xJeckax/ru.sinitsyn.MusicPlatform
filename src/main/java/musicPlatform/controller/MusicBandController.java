package musicPlatform.controller;

import musicPlatform.dto.MusicBandDto;
import musicPlatform.service.impl.MusicBandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/bands")
@Transactional
public class MusicBandController {

    private final MusicBandServiceImpl musicBandService;

    @Autowired
    public MusicBandController(MusicBandServiceImpl musicBandService) {
        this.musicBandService = musicBandService;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public MusicBandDto getMusicBandById(@PathVariable(value = "id") Long id){
        return musicBandService.getMusicBandDtoById(id);
    }

    @GetMapping
    @ResponseBody
    public Set<MusicBandDto> getAllBands(){
        return musicBandService.getAllMusicBand();
    }

    @PostMapping
    public void saveMusicBand(@RequestBody MusicBandDto musicBandDto){

        musicBandService.saveMusicBand(musicBandDto);
    }

    @PutMapping
    public void updateMusicAlbum(@RequestBody MusicBandDto musicBandDto){
        musicBandService.updateMusicBand(musicBandDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteMusicAlbum(@PathVariable("id") Long id){
        musicBandService.deleteMusicBand(id);
    }


}
