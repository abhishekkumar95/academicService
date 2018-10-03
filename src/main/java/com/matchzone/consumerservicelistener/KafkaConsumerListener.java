package com.matchzone.consumerservicelistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.matchzone.model.AcademicDetails;
import com.matchzone.producer.Receiver;


@Service
public class KafkaConsumerListener 
{
	
	// Write the name of Service Class for AcademicService
	private Receiver receiver;
	
	@Autowired
	public KafkaConsumerListener(Receiver receiver) {
		this.receiver=receiver;
	}


	@KafkaListener(topics = "upstream_data",groupId="acad_json")
	public void consumeJson(@Payload AcademicDetails academicDetails)
	{
		
		receiver.consumeJson();
	}
}
	