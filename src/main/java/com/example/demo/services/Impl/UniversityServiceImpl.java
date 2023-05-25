package com.example.demo.services.Impl;

import com.example.demo.dtos.ApiResponse;
import com.example.demo.dtos.UniversityDto;
import com.example.demo.repositories.UniversityRepository;
import com.example.demo.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public ApiResponse addUniversity(UniversityDto universityDto) {

        if (universityDto == null) {
            return  new ApiResponse().addError("Incorrect Parameter","University is Null");
        }

       if(universityDto.getName() == null){
           return new ApiResponse().addError("Incorrect Parameter","University name is Null");
       }

        return null;
    }

    @Override
    public ApiResponse updateUniversityName(String name, Long id) {
        return null;
    }

    @Override
    public ApiResponse updateUniversityAddress(String address, Long id) {
        return null;
    }

    @Override
    public ApiResponse deleteUniversity(Long id) {
        return null;
    }

    @Override
    public ApiResponse getUniversity(Long id) {
        return null;
    }

    @Override
    public ApiResponse getUniversityAll() {
        return null;
    }
}
