package class1;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inseption = new MovieReview();
        inseption.title = "인셉션";
        inseption.review = "인생은 무한 루프";
        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] reviews = {inseption, aboutTime};

        for (MovieReview review : reviews) {
            review.toString(review);
        }
    }
}
