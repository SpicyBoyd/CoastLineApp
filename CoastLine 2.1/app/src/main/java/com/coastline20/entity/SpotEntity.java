package com.coastline20.entity;

import android.content.res.Resources;
import android.support.v4.app.Fragment;

import com.coastline20.R;
import com.coastline20.fragment.FoodFragment;
import com.coastline20.fragment.InfoFragment;
import com.coastline20.fragment.PhotoFragment;

import java.util.ArrayList;
import java.util.List;

public class SpotEntity {
    private int tabTitle, toolbarImage, spotName, spotNum;
    private String address;
    private List<Fragment> fragmentList = new ArrayList<>();

    // Tab2
    public SpotEntity(Resources resources, int toolbarImage, int spotName, int spotNum,
                      int[] spotImages, int spotInfo, String address) {
        this.tabTitle = R.array.spot_tab2;
        this.toolbarImage = toolbarImage;
        this.spotName = spotName;
        this.spotNum = spotNum - 1;
        this.address = address;

        fragmentList.add(PhotoFragment.newInstance(spotImages));
        fragmentList.add(InfoFragment.newInstance(
                resources.getStringArray(spotInfo)));
    }

    // Tab3
    public SpotEntity(Resources resources, int toolbarImage, int spotName, int spotNum,
                      int[] spotImages, int spotInfo, int spotFood, int spotFoodActivity,
                      String address) {
        this.tabTitle = R.array.spot_tab3;
        this.toolbarImage = toolbarImage;
        this.spotName = spotName;
        this.spotNum = spotNum - 1;
        this.address = address;

        fragmentList.add(PhotoFragment.newInstance(spotImages));
        fragmentList.add(InfoFragment.newInstance(
                resources.getStringArray(spotInfo)));
        fragmentList.add(FoodFragment.newInstance(
                resources.getStringArray(spotFood), resources.getStringArray(spotFoodActivity)));
    }

    public int getTabTitle() {
        return tabTitle;
    }

    public void setTabTitle(int tabTitle) {
        this.tabTitle = tabTitle;
    }

    public int getToolbarImage() {
        return toolbarImage;
    }

    public void setToolbarImage(int toolbarImage) {
        this.toolbarImage = toolbarImage;
    }

    public int getSpotName() {
        return spotName;
    }

    public void setSpotName(int spotName) {
        this.spotName = spotName;
    }

    public int getSpotNum() {
        return spotNum;
    }

    public void setSpotNum(int spotNum) {
        this.spotNum = spotNum;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Fragment> getFragmentList() {
        return fragmentList;
    }

    public void setFragmentList(List<Fragment> fragmentList) {
        this.fragmentList = fragmentList;
    }
}
