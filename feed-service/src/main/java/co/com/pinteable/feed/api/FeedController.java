package co.com.pinteable.feed.api;


import co.com.pinteable.feed.model.Feed;
import co.com.pinteable.feed.model.Image;
import co.com.pinteable.feed.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class FeedController {

//    @Autowired
//    FeedRepository feedRepository;

//    @RequestMapping("/findAll")
//    public Iterable<Feed> findAll(@RequestParam("page") int page) {
//        return feedRepository.findAll(new PageRequest(page,6));
//    }

//    @RequestMapping("/seach")
//    public Iterable<Feed> seach(@RequestParam("page") int page,@RequestParam("term") String term) {
//        return feedRepository.findByDescription(term,new PageRequest(page,6));
//    }

//    @RequestMapping("/save")
//    public Feed save() {
//        Feed h = new Feed();
//        h.setDescription("hola mundo");
//        h.setUserAvatarUrl("hola mundo");
//        h.setUserName("hola mundo");
//        Image i = new Image("url");
//        List<Image> list = new ArrayList<Image>();
//        list.add(i);
//        h.setImages(list);
//
//        return feedRepository.save(h);
//    }


}