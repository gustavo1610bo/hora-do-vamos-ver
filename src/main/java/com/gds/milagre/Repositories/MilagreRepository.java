package com.gds.milagre.Repositories;

import com.gds.milagre.Models.MilagreModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository extends JpaRepository< MilagreModels, Long> {
}
