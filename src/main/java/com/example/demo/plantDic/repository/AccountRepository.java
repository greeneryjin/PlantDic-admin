package com.example.demo.plantDic.repository;

import com.example.demo.plantDic.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findById(String email);

}
