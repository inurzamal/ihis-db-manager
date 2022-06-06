package com.nur.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.entity.CorrespondenceTriggersEntity;

public interface CoTriggerRepository extends JpaRepository<CorrespondenceTriggersEntity, Id> {

}
