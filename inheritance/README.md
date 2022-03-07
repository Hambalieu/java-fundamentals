# Lab 6 Inheritance 

## Created Classes to represent reviews of restaurants.

### Features 

- Created a class to represent a Restaurant. Each Restaurant has a name, a number of stars between 0 and 5, and a price category (i.e. number of dollar signs).

- Wrote a test to create an instance of Restaurant and ensure that its toString is working properly.

- Created a class to represent a Review. Each Review  has a body, an author, and a number of stars.

- Wrote a test to create an instance of Review and ensure that its toString is working properly.

- Restaurant has a review 

- Added an instance method addReview to add review to a specific  restaurant 

- Added test to ensure that when you cal the addReview ,the association is created between the restaurant and the review.

- When you associate a review with a restaurant, that restaurant’s star rating should change.

- Added a test ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.

- Ran gradlew test on my command line to make sure that I can test my code.