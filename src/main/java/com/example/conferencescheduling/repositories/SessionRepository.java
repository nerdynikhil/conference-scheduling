package com.example.conferencescheduling.repositories;

import com.example.conferencescheduling.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository <Session, Long> {

}
