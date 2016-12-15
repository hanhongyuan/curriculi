package curri.service

import curri.domain.Identity
import org.springframework.data.mongodb.repository.MongoRepository

trait IdentityRepository extends MongoRepository[Identity, String] {
}