package hybernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_gen")
    @SequenceGenerator(name = "id_gen", sequenceName = "base_seq",allocationSize = 1)
    private Long id;

}
