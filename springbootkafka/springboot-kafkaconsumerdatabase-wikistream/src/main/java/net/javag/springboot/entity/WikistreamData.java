package net.javag.springboot.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="WikiStream_recentUpdate")
@Getter
@Setter
public class WikistreamData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikiEventData;
}
