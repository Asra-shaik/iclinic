/**
 * 
 */
package com.river.bend.iclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.river.bend.iclinic.models.Sample;

@Repository
public interface SampleRepository extends CrudRepository<Sample, Long> {

}
