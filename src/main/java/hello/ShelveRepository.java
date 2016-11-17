package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "shelve", path = "shelves")
public interface ShelveRepository extends PagingAndSortingRepository<Shelve, Long>
{
	List<Shelve> findByLength(@Param("length") int length);
}
