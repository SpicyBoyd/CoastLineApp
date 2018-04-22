package com.coastline20.entity;

public class FoodEntity {
    private int food, info, image1, image2, foodNum, address;
    private int[] images;

    public FoodEntity(int food, int info, int foodNum, int image1, int image2, int address) {
        this.food = food;
        this.info = info;
        this.foodNum = foodNum - 1;
        this.address = address;
        this.image1 = image1;
        this.image2 = image2;
        this.images = new int[]{image1, image2};
    }

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
