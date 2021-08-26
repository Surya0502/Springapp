package com.user.FormApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.FormApplication.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
