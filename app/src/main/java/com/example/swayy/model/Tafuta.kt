package com.example.swayy.model

class Tafuta {

    private var category: String = ""
    private var subcategory: String = ""
    private var title: String = ""
    private var location: String = ""
    private var type: String = ""
    private var condition: String = ""
    private var description: String = ""
    private var price: String = ""
    private var image: String = ""
    private var uid: String = ""
    private var time: String = ""
    private var postid: String = ""
    private var userimage: String = ""
    private var username :String = ""

    constructor()
    constructor(
        category: String,
        subcategory: String,
        title: String,
        location: String,
        type: String,
        condition: String,
        description: String,
        price: String,
        image: String,
        uid: String,
        time: String,
        postid:String,
        userimage:String,
        username:String
    ) {
        this.category = category
        this.subcategory = subcategory
        this.title = title
        this.location = location
        this.type = type
        this.condition = condition
        this.description = description
        this.price = price
        this.image = image
        this.uid = uid
        this.time = time
        this.postid = postid
        this.userimage = userimage
        this.username = username
    }

    fun getPostid(): String{
        return postid
    }
    fun setPostid(postid: String)
    {
        this.postid = postid
    }
    fun getCategory(): String
    {
        return category
    }

    fun setCategory(category: String)
    {
        this.category = category
    }
    fun getSubcategory(): String
    {
        return subcategory
    }

    fun setSubcategory(subcategory: String)
    {
        this.subcategory = subcategory
    }
    fun getTitle(): String
    {
        return title
    }

    fun setTitle(title: String)
    {
        this.title = title
    }
    fun getLocation(): String
    {
        return location
    }

    fun setLocation(location: String)
    {
        this.location = location
    }
    fun getType(): String
    {
        return type
    }

    fun setType(type: String)
    {
        this.type = type
    }
    fun getCondition(): String
    {
        return condition
    }

    fun setCondition(condition: String)
    {
        this.condition = condition
    }
    fun getDescription(): String
    {
        return description
    }

    fun setDescription(description: String)
    {
        this.description = description
    }
    fun getPrice(): String
    {
        return price
    }

    fun setPrice(price: String)
    {
        this.price = price
    }
    fun getImage(): String
    {
        return image
    }

    fun setImage(image: String)
    {
        this.image = image
    }
    fun getUid(): String
    {
        return uid
    }

    fun setUid(uid: String)
    {
        this.uid = uid
    }
    fun getTime(): String
    {
        return time
    }

    fun setTime(time: String)
    {
        this.time = time
    }
    fun getUserimage():String
    {
        return userimage
    }
    fun setUserimage(userimage: String)
    {
        this.userimage = userimage
    }
    fun getUsername(): String
    {
        return username
    }
    fun setUsername(username: String)
    {
        this.username = username
    }
}