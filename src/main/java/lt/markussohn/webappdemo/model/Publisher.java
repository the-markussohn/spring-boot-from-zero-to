package lt.markussohn.webappdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author the-markussohn
 * 2018-07-05.
 */
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();
}
