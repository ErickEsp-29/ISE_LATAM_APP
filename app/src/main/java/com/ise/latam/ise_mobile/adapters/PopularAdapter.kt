package com.ise.latam.ise_mobile.adapters

/*
class PopularAdapter(private val context: Context, private val recentsDataList: List<RecentsData>) :
    RecyclerView.Adapter<PopularAdapter.RecentsViewHolder>() {

    private var context: Context? = null

    class ViewHolder(val bindiing:ViewholderRecommendedBinding):RecyclerView.ViewHolder(bindiing.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularAdapter.ViewHolder {
        context = parent.context
            val binding = ViewholderRecommendedBinding.inflate(LayoutInFlater.from(context),parent,false)
            return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {/*  1:35:02
        holder.binding.idTxt.text = items[position].id
        holder.binding.uriTxt.text = items[position].uri

        val requestOptions = RequestOptions().transform(CenterCrop())
        Glide.with(holder.itemView.context)
            .load(items[position].picUrl[0])
            .apply(requestOptions)
            .into(holder.binding.pic)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context)
        }*/
    }

    override fun getItemCount(): Int = items.size

}*/

/*
class PopularAdapter(val items:MutableList<ImageItem>): RecyclerView.Adapter<PopularAdapter. ViewHolder>() {

    private var context: Context? = null

    class ViewHolder(val bindiing:ViewholderRecommendedBinding):RecyclerView.ViewHolder(bindiing.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularAdapter.ViewHolder {
        context = parent.context
            val binding = ViewholderRecommendedBinding.inflate(LayoutInFlater.from(context),parent,false)
            return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {/*  1:35:02
        holder.binding.idTxt.text = items[position].id
        holder.binding.uriTxt.text = items[position].uri

        val requestOptions = RequestOptions().transform(CenterCrop())
        Glide.with(holder.itemView.context)
            .load(items[position].picUrl[0])
            .apply(requestOptions)
            .into(holder.binding.pic)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context)
        }*/
    }

    override fun getItemCount(): Int = items.size

} */