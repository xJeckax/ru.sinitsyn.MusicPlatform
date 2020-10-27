package musicPlatform.controller;

import musicPlatform.dto.MusicUserDto;
import musicPlatform.service.impl.MusicUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/users")
public class MusicUserController {

    private final MusicUserServiceImpl musicUserService;

    @Autowired
    public MusicUserController(MusicUserServiceImpl musicUserService) {
        this.musicUserService = musicUserService;
    }

    @GetMapping
    @ResponseBody
    public Set<MusicUserDto> getUsers(){
        return musicUserService.getAllMusicUser();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public MusicUserDto getUserById(@PathVariable(value = "id") Long id){
        return musicUserService.getMusicUserDtoById(id);
    }

    @PostMapping
    public void createUser(@RequestBody MusicUserDto musicUserDto){
        musicUserService.saveMusicUser(musicUserDto);
    }

    @PutMapping
    public void updateUser(@RequestBody MusicUserDto musicUserDto) throws Exception {
        musicUserService.updateMusicUser(musicUserDto);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id){
        musicUserService.deleteMusicUser(id);
    }
}
