package inheritance;

public class Review {
    private Boolean hasReview;
    private String reviewerNotes;
    private String reviewerName;
    private double stars;


    public Review( Boolean hasReview, String reviewerNotes, String reviewerName,  double stars) {
        this.hasReview = hasReview;
        this.reviewerNotes = reviewerNotes;
        this.reviewerName = reviewerName;
        this.stars = stars;
    }

    public String toString() {
        return  "hasReview: "
                + this.hasReview + " "
                + " reviewerNotes: " + this.reviewerNotes + " "
                + " reviewerName: " + this.reviewerName + " "
                + " Stars: " + this.stars ;
    }


}
