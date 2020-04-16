package com.dtcc.mp.repository;

import com.dtcc.mp.entities.MessageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MessageDataRepository
    extends JpaRepository<MessageData, Long>, JpaSpecificationExecutor<MessageData> {}
