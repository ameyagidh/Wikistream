package net.javag.springboot.repository;

import net.javag.springboot.entity.WikistreamData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiStreamDataRepository extends JpaRepository<WikistreamData, Long> {
}
