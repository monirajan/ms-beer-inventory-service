package guru.sfg.msbeerinventoryservice.web.mappers;

import org.mapstruct.Mapper;

import guru.sfg.msbeerinventoryservice.domain.BeerInventory;
import guru.sfg.msbeerinventoryservice.web.model.BeerInventoryDto;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
