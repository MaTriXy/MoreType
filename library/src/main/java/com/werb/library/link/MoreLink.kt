package com.werb.library.link

import com.werb.library.MoreAdapter
import com.werb.library.MoreViewType
import kotlin.reflect.KClass


/**
 * [MoreLink] link model and view
 * Created by wanbo on 2017/7/2.
 */
interface MoreLink {

    /** [register]  register single link viewType when we use */
    fun register(viewType: MoreViewType<*>): MoreAdapter

    /** [multiRegister]  register multi link like one2more viewType when we use */
    fun multiRegister(clazz: KClass<*> ,link: MultiLink<*>) : MoreAdapter

    /** [multiRegister]  register multi link like one2more viewType when we use */
    fun multiRegister(clazz: Class<*>, link: MultiLink<*>) : MoreAdapter

    /** [attachViewType]  find viewType by item of list */
    fun attachViewType(any: Any) : MoreViewType<Any>

    /** [attachViewTypeLayout]  find viewType layout by item of list */
    fun attachViewTypeLayout(any: Any) : Int

    /** [buildViewType]  find viewType by layout */
    fun buildViewType(type: Int) : MoreViewType<Any>

    /** [userSoleRegister] register sole global viewType */
    fun userSoleRegister(): MoreAdapter

}