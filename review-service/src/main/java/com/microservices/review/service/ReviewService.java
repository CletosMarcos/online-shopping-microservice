package com.microservices.review.service;

import com.microservices.review.dto.ReviewDTO;
import com.microservices.review.model.Review;
import com.microservices.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public ReviewDTO createReview(ReviewDTO reviewDTO) {
        Review review = Review.builder()
                .productId(reviewDTO.getProductId())
                .rating(reviewDTO.getRating())
                .comment(reviewDTO.getComment())
                .build();

        reviewRepository.save(review);

        return mapToDto(review);
    }

    public List<ReviewDTO> getReviewsByProductId(String productId) {
        return reviewRepository.findByProductId(productId).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public ReviewDTO updateReview(Long id, ReviewDTO updatedReviewDTO) {
        return reviewRepository.findById(id).map(review -> {
            review.setRating(updatedReviewDTO.getRating());
            review.setComment(updatedReviewDTO.getComment());
//            review.setTimestamp(updatedReviewDTO.getTimestamp());
            Review savedReview = reviewRepository.save(review);
            return mapToDto(savedReview);
        }).orElseThrow(() -> new RuntimeException("Review not found"));
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

    private ReviewDTO mapToDto(Review review) {
        return new ReviewDTO(
                review.getId(),
                review.getProductId(),
                review.getRating(),
                review.getComment(),
                review.getTimestamp()
        );
    }
}
