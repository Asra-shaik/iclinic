package com.river.bend.iclinic.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.river.bend.iclinic.models.Sample;
import com.river.bend.iclinic.repository.SampleRepository;

@Service
public class SampleService implements ISampleService {

    @Autowired
    private SampleRepository repository;

    @Override
    public List<Sample> findAll() {

        List<Sample> cities = (List<Sample>) repository.findAll();

        return cities;
    }
}