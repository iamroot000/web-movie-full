package dev.iamroot.movies.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Review {
	
	@Id
	private ObjectId id;
	
	private String body;

	public Review(String body) {
		super();
		this.body = body;
	}
	
	

}
