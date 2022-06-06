package com.nur.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.entity.CitizenPlansEntity;

public interface CitizenPlansRepository extends JpaRepository<CitizenPlansEntity, Id> {

}
