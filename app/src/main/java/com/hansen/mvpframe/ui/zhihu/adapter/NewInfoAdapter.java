package com.hansen.mvpframe.ui.zhihu.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.component.ImageLoader;
import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.widget.SquareImageView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 创建者 by ${HanSir} on 2018/5/21.
 * 版权所有  WELLTRANS.
 * 说明      最新消息容器
 */

public class NewInfoAdapter extends  RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<NewInfoBean.TopStoriesBean> mList;
    private LayoutInflater inflater;
    private Context mContext;

    public NewInfoAdapter(List<NewInfoBean.TopStoriesBean> mList,Context context) {
        this.mList = mList;
        this.mContext = context;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContentViewHolder(inflater.inflate(R.layout.item_daily, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ContentViewHolder)holder).title.setText(mList.get(position).getTitle());
        ((ContentViewHolder)holder).title.setTextColor(ContextCompat.getColor(mContext,R.color.news_read));
        ImageLoader.load(mContext,mList.get(position).getImage(),((ContentViewHolder)holder).image);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ContentViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_daily_item_title)
        TextView title;
        @BindView(R.id.iv_daily_item_image)
        SquareImageView image;

        public ContentViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
