package com.example.conferencescheduling.repositories;

import com.example.conferencescheduling.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
