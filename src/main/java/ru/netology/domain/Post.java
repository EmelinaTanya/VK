package ru.netology.domain;

public class Post {
    private int postId;
    private int userId;
    private int fromId;
    private String name;
    private String text;
    private String picture;
    private int date;
    private LikesInfo likeInfo;
    private CommentsInfo commentsInfo;
    private SharedInfo sharedInfo;
    private ViewInfo viewsInfo;
    private MoreInfo moreInfo;
    private String postType;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int UserId) {
        this.userId = UserId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public LikesInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikesInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public SharedInfo getSharedInfo() {
        return sharedInfo;
    }

    public void setSharedInfo(SharedInfo sharedInfo) {
        this.sharedInfo = sharedInfo;
    }

    public ViewInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }


    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}
