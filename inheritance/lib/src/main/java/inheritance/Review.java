package inheritance;


public class Review {
    private String body;
    private String author;
    private double stars;
    private Reviewable reviewable;


    //  Constructors
    Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = Math.min(stars, 5.0);
    }

    Review(String body, String author, double stars, Reviewable reviewable) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.reviewable = reviewable;
    }

    //  Methods
    public String getBody() {
        return this.body;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getStars() {
        return this.stars;
    }


    void setReviewable(Reviewable reviewable) {
        this.reviewable = reviewable;
    }

    public Reviewable getReviewable() {
        return this.reviewable;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                ", reviewable=" + reviewable +
                '}';
    }
}