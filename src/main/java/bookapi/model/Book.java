package bookapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Book {

    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy ="org.hibernate.id.UUIDGenerator")
////    @Column(length = 25)
//    private UUID bookId;
@GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;

     @Column
    private  String author;

    @Column
    private String title;

    @Column
    private  String content;
}
