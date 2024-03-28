package ma.xproce.demo.services;

import ma.xproce.demo.entities.Creator;
import ma.xproce.demo.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatorManagerService implements CreatorManager {

    private final CreatorRepository creatorRepository;

    @Autowired
    public CreatorManagerService(CreatorRepository creatorRepository) {
        this.creatorRepository = creatorRepository;
    }

    @Override
    public Creator addCreator(Creator creator) {
        return creatorRepository.save(creator);
    }

    @Override
    public boolean deleteCreator(Creator creator) {
        creatorRepository.delete(creator);
        return true;
    }

    @Override
    public boolean deleteCreatorById(Integer id) {
        creatorRepository.deleteById(Long.valueOf(id));
        return true;
    }

    @Override
    public Creator updateCreator(Creator creator) {
        return creatorRepository.save(creator);
    }

    @Override
    public List<Creator> getAllCreators() {
        return creatorRepository.findAll();
    }
}
