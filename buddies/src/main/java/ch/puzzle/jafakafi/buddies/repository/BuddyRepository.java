package ch.puzzle.jafakafi.buddies.repository;

import ch.puzzle.jafakafi.buddies.model.Buddy;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BuddyRepository extends PagingAndSortingRepository<Buddy, String> {
}
