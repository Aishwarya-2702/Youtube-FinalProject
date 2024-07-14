package com.youtube.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRemote remote;

    @Autowired
    FeignCommunicator feignCommunicator;

    public Profile implementFindByID(int id){
        Profile obj = remote.findById(id).orElse(new Profile());
        if (obj != null) {
            obj.setMyplaylist(feignCommunicator.callPlaylists(obj.getProfileId()));
        }
        return obj;
    }

    public List<Profile> implementFindAll(){
        return remote.findAll();
    }

    public Profile implementSave(Profile profile){
        return remote.save(profile);
    }
}
