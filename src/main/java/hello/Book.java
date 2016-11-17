package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;

	@ManyToOne
	private Shelve shelve;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Shelve getShelve() {
		return shelve;
	}

	public void setShelve(Shelve shelve) {
		this.shelve = shelve;
	}
}
