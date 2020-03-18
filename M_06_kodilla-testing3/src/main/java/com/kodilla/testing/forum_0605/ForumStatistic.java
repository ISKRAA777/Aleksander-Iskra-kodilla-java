package com.kodilla.testing.forum_0605;

public class ForumStatistic {

    private int users;
    private int posts;
    private int comments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        postsPerUser = calculatePostsPerUser();
        commentsPerUser = calculateCommentsPerUser();
        commentsPerPost = calculateCommentsPerPost();
    }

    private double calculatePostsPerUser() {

        if (users > 0) {
            return (double) posts / users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsPerUser() {
        if (users > 0) {
            return (double) comments / users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsPerPost() {
        if (posts > 0) {
            return (double) comments / posts;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println("Users: " + users);
        System.out.println("Posts: " + posts);
        System.out.println("Comments: " + comments);
        System.out.println("Posts average user" + postsPerUser);
        System.out.println("Comments average user" + commentsPerUser);
        System.out.println("Comments average post" + commentsPerPost);
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

}
