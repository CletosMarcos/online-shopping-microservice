package com.microservices.review.controller;

import com.microservices.review.dto.ReviewDTO;
import com.microservices.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<ReviewDTO> createReview(@RequestBody ReviewDTO ReviewDTO) {
        return new ResponseEntity<>(reviewService.createReview(ReviewDTO), HttpStatus.CREATED);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<ReviewDTO>> getReviewsByProductId(@PathVariable String productId) {
        return new ResponseEntity<>(reviewService.getReviewsByProductId(productId), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReviewDTO updateReview(@PathVariable Long id, @RequestBody ReviewDTO ReviewDTO) {
        return reviewService.updateReview(id, ReviewDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return "Review Deleted Successfully";
    }
}
