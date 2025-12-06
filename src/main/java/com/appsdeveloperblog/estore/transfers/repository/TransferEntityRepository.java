package com.appsdeveloperblog.estore.transfers.repository;

import com.appsdeveloperblog.estore.transfers.io.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferEntityRepository extends JpaRepository<TransferEntity, String> {
}
