package com.nur.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.entity.EligibilityDtlsEntity;

public interface EligibilityDtlsRepository extends JpaRepository<EligibilityDtlsEntity, Id> {

}
