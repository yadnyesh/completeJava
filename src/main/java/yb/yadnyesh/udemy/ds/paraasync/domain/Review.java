package yb.yadnyesh.udemy.ds.paraasync.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Review {
    private int noOfReviews;
    private int overallRating;
}
