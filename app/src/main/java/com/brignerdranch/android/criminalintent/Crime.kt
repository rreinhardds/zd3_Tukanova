package com.brignerdranch.android.criminalintent

import java.util.*


 data class Crime (var id:UUID= UUID.randomUUID()){
    var title:String=""
    var date:Date=Date();
    var isSolved:Boolean=false

     constructor(id:UUID, title:String, date1:Date, isSolved:Boolean):this(id) {
         this.title=title
         this.date=date1
         this.id=id
         this.isSolved=isSolved

     }

     private var mRequestPolice= false

     fun RequiresPolice(): Boolean {
         return mRequestPolice
     }
}
