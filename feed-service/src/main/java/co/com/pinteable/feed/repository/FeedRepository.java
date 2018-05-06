//package co.com.pinteable.feed.repository;
//
//import co.com.pinteable.feed.model.Feed;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

//import java.util.List;


///**
// * {@link Feed} CRUD operations.
// *
// * @author Gunnar Morling
// */

//public interface FeedRepository extends MongoRepository<Feed, Long> {
//	List<Feed> findById(String id) ;
//	@Query("{ 'description' : { $regex: ?0 } }")
//	Page<Feed> findByDescription(String description, Pageable pageable) ;
//}