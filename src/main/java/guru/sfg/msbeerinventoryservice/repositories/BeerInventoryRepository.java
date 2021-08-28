package guru.sfg.msbeerinventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.sfg.msbeerinventoryservice.domain.BeerInventory;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeerId(UUID beerId);
}
