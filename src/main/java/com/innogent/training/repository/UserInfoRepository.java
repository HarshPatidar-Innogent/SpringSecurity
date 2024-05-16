package com.innogent.training.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innogent.training.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	Optional<UserInfo> findByName(String username);

	List<UserInfo> findAllByName(String username);

}