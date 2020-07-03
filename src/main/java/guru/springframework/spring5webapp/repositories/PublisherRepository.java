package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by {americo stoppello} on {02/07/2020}
 */
public interface PublisherRepository  extends CrudRepository<Publisher, Long> {
}
