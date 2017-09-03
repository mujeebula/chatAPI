package com.mindfire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfire.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	List<Contact> findByUserId(Long userId);
}
