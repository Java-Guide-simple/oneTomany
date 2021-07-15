package in.stack.oneToMany.model;

import javax.persistence.*;

@Entity
@Table(name = "Answers")
public class Answer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answername;
	private String postedBy;

	public int getId() {
		return id;
	}
	

	public Answer(String answername, String postedBy) {
		
		this.answername = answername;
		this.postedBy = postedBy;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
}