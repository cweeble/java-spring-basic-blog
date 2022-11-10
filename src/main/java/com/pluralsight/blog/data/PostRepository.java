package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class PostRepository {

    private final List<Post> ALL_POSTS = new ArrayList<>(Arrays.asList(
            new Post(1l, "Earbuds",
                    "You have got to try these in your ears.",
                    "So tiny and can even block the sounds of screaming toddlers.",
                    "Sarah Holderness", new Date()),
            new Post(2l, "Smart Speakers",
                    "Smart speakers listen to you all right.",
                    "Sometimes they get a little snippy but will still order your fav. takeaway.",
                    "Sarah Holderness", new Date()),
            new Post(3l, "Device Charger",
                    "We all do a little too much scrolling in lieu of human interaction.",
                    "This charger will keep you isolated.",
                    "Sarah Holderness", new Date()),
            new Post (4l, "Smart Home Lock",
                    "Want to play tricks on your teenager?",
                    "This smart lock will lock them out when they think they own the place.",
                    "Sarah Holderness", new Date()),
            new Post(5l, "Smart Instant Pot",
                    "This instant pot can do your home shopping for you.",
                    "When it gets home it will also cook your dinner.",
                    "Sarah Holderness", new Date()),
            new Post (6l, "Mobile Tripod",
                    "Best gift for the older adult in your life who can't keep their face in the facetime window.",
                    "Smile !",
                    "Sarah Holderness", new Date()),
            new Post(7l, "Travel Keyboard",
                    "You never know when inspiration for your next novel will strike.",
                    "Meet the perfect travel keyboard for your random thoughts.",
                    "Sarah Holderness", new Date()),
            new Post (8l, "SD Card Reader",
                    "When a stranger passes us a top secret SD card the adventure begins.",
                    "Jason Bourne says \"Hi\".",
                    "Sarah Holderness", new Date())
    ));
    public List<Post> getAllPosts() {
        return ALL_POSTS;
    }

    public Post findById(Long id) {
        for (Post post : ALL_POSTS) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
