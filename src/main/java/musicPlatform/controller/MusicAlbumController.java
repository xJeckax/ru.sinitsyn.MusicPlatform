package musicPlatform.controller;

import musicPlatform.dto.MusicAlbumDto;
import musicPlatform.service.MusicAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/albums")
@Transactional
public class MusicAlbumController {

    private final MusicAlbumService musicAlbumService;

    @Autowired
    public MusicAlbumController(MusicAlbumService musicAlbumService) {
        this.musicAlbumService = musicAlbumService;
    }

    @GetMapping
    @ResponseBody
    public Set<MusicAlbumDto> getAllMusicAlbum(){

        return musicAlbumService.getAllMusicAlbum();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public MusicAlbumDto getMusicAlbumById(@PathVariable(value = "id")Long id ){

        return musicAlbumService.getMusicAlbumDtoById(id);
    }

    @PostMapping
    public void createMusicAlbum(@RequestBody MusicAlbumDto musicAlbumDto){

        musicAlbumService.saveMusicAlbum(musicAlbumDto);
    }

    @PutMapping
    public void updateMusicAlbum(@RequestBody MusicAlbumDto musicAlbumDto) throws Exception {
        musicAlbumService.updateMusicAlbum(musicAlbumDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteMusicAlbum(@PathVariable("id") Long id){
        musicAlbumService.deleteMusicAlbum(id);
    }

}
