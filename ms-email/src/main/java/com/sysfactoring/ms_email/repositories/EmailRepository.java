package com.sysfactoring.ms_email.repositories;

import com.sysfactoring.ms_email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
