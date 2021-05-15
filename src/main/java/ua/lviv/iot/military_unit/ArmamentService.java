package ua.lviv.iot.military_unit;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.military_unit.models.Armament;
import ua.lviv.iot.military_unit.repository.ArmamentRepository;

@Service
public class ArmamentService {

    @Autowired
    private ArmamentRepository repo;

    public List<Armament> listAll() {
        return repo.findAll();
    }

    public void save(Armament armament) {
        repo.save(armament);
    }

    public Optional<Armament> get(int id) {
        return repo.findById(id);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
