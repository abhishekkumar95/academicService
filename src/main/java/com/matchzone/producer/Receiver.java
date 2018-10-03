package com.matchzone.producer;

import org.aspectj.asm.internal.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Index;
import com.matchzone.model.Indexer;
import com.matchzone.model.RelationshipProperty;
import com.matchzone.model.SourceNodeProperty;
import com.matchzone.model.TargetNodeProperty;

@SuppressWarnings("unused")
@Service
public class Receiver {
@Autowired
	private Producer producer;

	public Indexer studiedAtIndexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	 public RelationshipProperty relationshipProperty = new RelationshipProperty();
	 public SourceNodeProperty sourceNodeProperty = new SourceNodeProperty();
	 AcademicDetails academicDetails =new AcademicDetails();
	 Index index = new Index();
    
    
	 public void consumeJson() {
		
		 
	    	//Target Node Type
	    	studiedAtIndexer.setTargetNodeType("Academic");
	    	
	    	//Source Node Type
	    	studiedAtIndexer.setSourceNodeType("User");
	    	studiedAtIndexer.setRelationshipName("Holds");
	    	
	    	
	    	studiedAtIndexer.setSourceNodeProperty(sourceNodeProperty);
	    	
	    	targetNodeProperty.setProfileId(index.getProfileId());
	    	
	    	studiedAtIndexer.setTargetNodeProperty(targetNodeProperty);
	    	
	    	
	    
   	relationshipProperty.setRelationshipName(relationshipProperty.getRelationshipName());
//	    	RelationshipProperty.setStream(academicDetail.getStream());
//	    	RelationshipProperty.setYearOfCompletion(academicDetail.getYearOfCompletion());
//	    	RelationshipProperty.setYearOfJoining(academicDetail.getYearOfJoining());
	    	
	    
	    	
	    	RelationshipProperty studyRelationship = new RelationshipProperty();
	    	studiedAtIndexer.setRelationshipProperty(studyRelationship);
	    	
	    	
	    	
	    	//Operations
	    	
//	    	studiedAtIndexer.setWeightage("5");
//	    	studiedAtIndexer.setOperation(qualification.getMessage());
	    	
	    index.setCourse(academicDetails.getCourse());
	    index.setEducation(academicDetails.getEducation());
	    index.setGradingSystem(academicDetails.getGradingSystem());
	    index.setHighDuration(academicDetails.getHighDuration());
	    index.setHigherSecondary(academicDetails.getHigherSecondary());
	    index.setHighLocation(academicDetails.getHighLocation());
	    index.setPassingYear(academicDetails.getPassingYear());
	    index.setSenDuration(academicDetails.getSenDuration());
	    index.setSeniorSecondary(academicDetails.getSeniorSecondary());
	    index.setSenLocation(academicDetails.getSenLocation());
	    index.setSpecialisation(academicDetails.getSpecialisation());
	    index.setUniversityInstitute(academicDetails.getUniversityInstitute());
	    index.setProfileId(academicDetails.getProfileId());
	    
	
//	qualificationIndexer.setInstituteName(qualification.getInstituteName());
//	qualificationIndexer.setMessage(qualification.getMessage());
//	qualificationIndexer.setProfileId(qualification.getProfileId());
//	qualificationIndexer.setQualification(qualification.getQualification());   
//	qualificationIndexer.setStream(qualification.getStream());
//	qualificationIndexer.setYearOfCompletion(qualification.getYearOfCompletion());
//	qualificationIndexer.setYearOfJoining(qualification.getYearOfJoining());        
	
	       producer.sendtoindexer(academicDetails);
	        
	    }
}
