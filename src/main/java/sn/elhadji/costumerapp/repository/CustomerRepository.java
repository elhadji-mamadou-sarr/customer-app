package sn.elhadji.costumerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.elhadji.costumerapp.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
