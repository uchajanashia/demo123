package com.example.demo.services;

import com.example.demo.dtos.ApiResponse;
import com.example.demo.dtos.UniversityDto;

public interface UniversityService {
    ApiResponse addUniversity(UniversityDto universityDto);
    ApiResponse updateUniversityName(String name, Long id);
    ApiResponse updateUniversityAddress(String address, Long id);
    ApiResponse deleteUniversity(Long id);
    ApiResponse getUniversity(Long id);
    ApiResponse getUniversityAll();
}
