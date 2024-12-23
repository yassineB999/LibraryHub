package com.libraryhub.msbooks.domain.book.repository;

import com.libraryhub.msbooks.domain.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDomainRepository extends JpaRepository<Book, Long> {
    Boolean existsBookByTitle(String title);
    Boolean existsByIdBook(Long idBook);

    Book findBookByIsbn(String isbn);
}
