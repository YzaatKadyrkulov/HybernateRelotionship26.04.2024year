package hybernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "passports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passport extends BaseEntity {
    private String INN;
    @OneToOne(mappedBy = "passport")
    private Person person;
}
