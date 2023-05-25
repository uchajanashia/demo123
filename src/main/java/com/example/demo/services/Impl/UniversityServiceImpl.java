package com.example.demo.services.Impl;

import com.example.demo.dtos.ApiResponse;
import com.example.demo.dtos.UniversityDto;
import com.example.demo.entities.University;
import com.example.demo.repositories.UniversityRepository;
import com.example.demo.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
            return new ApiResponse().addError("Incorrect Parameter", "University is Null");
        }

        if (universityDto.getName() == null) {
            return new ApiResponse().addError("Incorrect Parameter", "University name is Null");
        }

        University savedUniversity = universityRepository.save(new University(universityDto));

        return new ApiResponse("university", savedUniversity);
    }

    @Override
    public ApiResponse updateUniversityName(String name, Long id) {
        if (name == null) {
            return new ApiResponse().addError("Incorrect Parameter", "Name is Null");
        }
        if (id == null) {
            return new ApiResponse().addError("Incorrect Parameter", "Id is Null");
        }
        Optional<University> university = universityRepository.findById(id);

        if(university.isPresent()){
            university.get().setName(name);
            University save = universityRepository.save(university.get());
            return new ApiResponse("University",save);
        }else{
            return new ApiResponse().addData("University not found","Incorrect id");
        }
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
