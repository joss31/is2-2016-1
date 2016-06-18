package ucsp.is2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Song {
	@Id
	@SequenceGenerator(name="SONG_ID_GENERATOR", sequenceName="SONG_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SONG_ID_GENERATOR")
	private long id;
	public Long Play_Counter;
	private Long score;
	private String name;
	
	public Song (long score){
		this.score =score;
	}
	public void Increase_Counter(){
		Play_Counter++;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public void add(Integer i,String name) {}
}