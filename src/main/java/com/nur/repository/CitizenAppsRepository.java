package com.nur.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.entity.CitizenAppsEntity;

public interface CitizenAppsRepository extends JpaRepository<CitizenAppsEntity, Id> {

}
