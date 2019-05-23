package io.javabrain.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("L1", "Java", "Core java is a very good course"),
			new Topic("L2", "C++", "C++ is a very good course"), new Topic("L3", "C", "C is a very good course")));

	public List<Topic> getAllTopics() {
		/* return topics; */
		return topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		/* return topics.stream().filter(t->t.getId().equals(id)).findFirst().get(); */

		/*
		 * Optional<Topic> optionalTopic = topicRepository.findById(id);
		 * if(!optionalTopic.isPresent()) throw new
		 * RuntimeException("String not found"); return optionalTopic.get();
		 */

		return topicRepository.findById(id).get();

	}

	public void addTopic(Topic topic) {
		/* topics.add(topic); */
		topicRepository.save(topic);

	}

	public void updateTopic(Topic tp, String id) {

		/*
		 * for (int i=0;i>topics.size();i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i,tp); return; }
		 * 
		 * }
		 */

		 topicRepository.save(tp); 
	}

	public void deleteTopic(String id) {
		/* topics.removeIf(t->t.getId().equals(id)); */
		topicRepository.deleteById(id);
	}
}
