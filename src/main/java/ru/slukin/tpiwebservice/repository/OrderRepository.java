package ru.slukin.tpiwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.slukin.tpiwebservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
