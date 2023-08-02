package by.repositories;


import by.entities.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class LibraryRepositories implements JpaRepository<Library, Integer> {
}
