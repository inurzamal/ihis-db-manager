package com.nur.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.entity.CitizenIncomeDtlsEntity;

public interface CitizenIncomeDtlsRepository extends JpaRepository<CitizenIncomeDtlsEntity, Id> {

}
