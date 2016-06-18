package ucsp.is2.repository;

import org.springframework.data.repository.Repository;
import antlr.collections.List;
import ucsp.is2.model.Song;

public interface SongRepository extends Repository<Song,Long> {
	public Song save(Song song);
	public Song findById(Long id);
	List findPuntuation (Long puntuation);
}