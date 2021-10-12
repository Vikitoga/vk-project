package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private String title;
    private String date;
    private String description;
    private String imageURL;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private boolean canPin;
    private boolean canDelete;

    //.... + get/set
}
