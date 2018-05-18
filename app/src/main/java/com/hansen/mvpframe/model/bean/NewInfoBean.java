package com.hansen.mvpframe.model.bean;

import java.util.List;

/**
 * 创建者 by ${HanSir} on 2018/5/18.
 * 版权所有  WELLTRANS.
 * 说明     最新消息
 */

public class NewInfoBean {

    /**
     * date : 20180518
     * stories : [{"images":["https://pic2.zhimg.com/v2-3082532f8c5f95146fae906befcb85a5.jpg"],"type":0,"id":9683187,"ga_prefix":"051811","title":"如果一个人缩小成量子尺度，会发生什么？"},{"images":["https://pic4.zhimg.com/v2-9fe4689cff2502d02e868bd599a60903.jpg"],"type":0,"id":9683074,"ga_prefix":"051810","title":"异地恋，错过了爱的信号最让人遗憾"},{"title":"手机拍照，如何能拍出「大片感」？","ga_prefix":"051810","images":["https://pic3.zhimg.com/v2-5608f118c9e87acb0f090002b7e04c5a.jpg"],"multipic":true,"type":0,"id":9682828},{"images":["https://pic3.zhimg.com/v2-a905024ff202e733006e84bb4c843de2.jpg"],"type":0,"id":9682871,"ga_prefix":"051809","title":"在你醒着的每一天，你都要瞎好几次"},{"images":["https://pic2.zhimg.com/v2-3719327e696c37583f2b2f683b48c8c1.jpg"],"type":0,"id":9682895,"ga_prefix":"051808","title":"一件衣服值不值得买？看完几个细节你就心中有数了"},{"images":["https://pic4.zhimg.com/v2-8ae05e42e2757be7b9c8729d68f59307.jpg"],"type":0,"id":9683057,"ga_prefix":"051807","title":"奥特曼和白娘子飞行时，怎么都要一只手臂向前伸？"},{"images":["https://pic4.zhimg.com/v2-ab81e3b229d40776894744533b05384f.jpg"],"type":0,"id":9682913,"ga_prefix":"051807","title":"三线小城电玩店的普通死亡"},{"images":["https://pic2.zhimg.com/v2-96fb5e40afb0ab125e970474dab8c359.jpg"],"type":0,"id":9682987,"ga_prefix":"051806","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-a41fade91c54e1d2febc8446f1b68128.jpg","type":0,"id":9683074,"ga_prefix":"051810","title":"异地恋，错过了爱的信号最让人遗憾"},{"image":"https://pic1.zhimg.com/v2-52aca104136d8ffc3c56e4a6f7e8b008.jpg","type":0,"id":9683187,"ga_prefix":"051811","title":"如果一个人缩小成量子尺度，会发生什么？"},{"image":"https://pic2.zhimg.com/v2-7eecdf82f2571596ce949bd14155ee99.jpg","type":0,"id":9682913,"ga_prefix":"051807","title":"三线小城电玩店的普通死亡"},{"image":"https://pic4.zhimg.com/v2-99e1123a9415a1cb85c7ac675c4be6e7.jpg","type":0,"id":9682871,"ga_prefix":"051809","title":"在你醒着的每一天，你都要瞎好几次"},{"image":"https://pic4.zhimg.com/v2-0f89034a3076a614ed04eb08c0cacbc7.jpg","type":0,"id":9682828,"ga_prefix":"051810","title":"手机拍照，如何能拍出「大片感」？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-3082532f8c5f95146fae906befcb85a5.jpg"]
         * type : 0
         * id : 9683187
         * ga_prefix : 051811
         * title : 如果一个人缩小成量子尺度，会发生什么？
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-a41fade91c54e1d2febc8446f1b68128.jpg
         * type : 0
         * id : 9683074
         * ga_prefix : 051810
         * title : 异地恋，错过了爱的信号最让人遗憾
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
