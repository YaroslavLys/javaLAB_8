package ua.lviv.iot.military_unit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.military_unit.models.Armament;

public interface ArmamentRepository extends JpaRepository<Armament, Integer> {
}
