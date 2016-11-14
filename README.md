# 整合一些常用的控件等工具类

####作者：pandakill  
####联系方式：邮箱 306641225@qq.com

## 1、万能的PBaseRecyclerViewAdapter
首期推出的是万能的适配器，在BaseApdater中已经将常用的视图文本、点击事件设置、imageView设置、findViewById等方法进行封装，继承该适配器可以很方便
的进行适配器中常用的设置，也不需要设置冗长的viewHolder 的 findViewById，同时也做到了对viewholder的缓存。
详细可以见源码 [PBaseRecyclerViewAdapter.java](https://github.com/pandakill/BaseAdapterCollection/blob/master/app/src/main/java/org/panda/widget/adapter/base/PBaseRecyclerViewAdapter.java)

下面即为adapter的使用方法：

```
/**
 * 创建人: pandakill
 * 创建时间: 2016/11/14 下午8:22
 * 描述: 简单的实体
 */
public class PSingleTypeAdapter extends PBaseRecyclerViewAdapter<String> {

    public PSingleTypeAdapter(Context context) {
        super(context);
    }
    
    // 在这里只需要设置itemView的资源文件id
    @Override
    public int getItemLayoutID(int viewType) {
        return R.layout.item_view_single_text;
    }

    @Override
    protected void onBindDataToView(MLYBaseViewHolder holder, int position) {
        holder.setText(R.id.item_text, getItem(position));  // 一句代码即可完成findViewById+setText
    }
}
```
