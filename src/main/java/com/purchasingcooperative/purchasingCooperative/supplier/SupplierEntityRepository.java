package com.purchasingcooperative.purchasingCooperative.supplier;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "suppliers", collectionResourceRel = "suppliers")
public interface SupplierEntityRepository extends PagingAndSortingRepository<SupplierEntity, Long> {

    List<SupplierEntity> findAll();


}
