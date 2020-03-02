package com.homework.note;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Note {
    @Id @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
