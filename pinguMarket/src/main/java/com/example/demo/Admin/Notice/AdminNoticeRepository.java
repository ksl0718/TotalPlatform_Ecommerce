package com.example.demo.Admin.Notice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Notice;

public interface AdminNoticeRepository extends JpaRepository<Notice, Integer> {

}
