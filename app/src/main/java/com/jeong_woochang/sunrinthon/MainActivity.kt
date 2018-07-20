package com.jeong_woochang.sunrinthon

import android.annotation.SuppressLint
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.Toast
import com.jeong_woochang.sunrinthon.Retrofit.MapFragment
import com.jeong_woochang.sunrinthon.Retrofit.FragmentC2C
import com.jeong_woochang.sunrinthon.Retrofit.FragmentPlay
import com.jeong_woochang.sunrinthon.Retrofit.FragmentTip

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

class MainActivity:BaseActivity(){

    override var viewId: Int = R.layout.activity_main
    override var toolbarId: Int? = R.id.toolbar
    private lateinit var toast: Toast
    private var backKeyPressedTime: Long = 200
    private var mViewPager: ViewPager? = null

    @SuppressLint("ShowToast")
    override fun onCreate() {
        showActionBar()

        toast = Toast.makeText(this, getString(R.string.press_back_button_one_more), Toast.LENGTH_SHORT)

        mViewPager = findViewById(R.id.view_pager)
        mViewPager!!.adapter = PagerAdapter(supportFragmentManager)
        mViewPager!!.currentItem = 0

        val tabLayout = findViewById<View>(R.id.tab_layout) as TabLayout
        tabLayout.setupWithViewPager(mViewPager)

        // set icons
        tabLayout.getTabAt(0)!!.text = "sns"
        tabLayout.getTabAt(1)!!.text = "주변 시설"
        tabLayout.getTabAt(2)!!.text = "Tip!"
        tabLayout.getTabAt(3)!!.text = "유흥"

        mViewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) = tab.select()

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }

    override fun onBackPressed() {

        if (System.currentTimeMillis() > backKeyPressedTime + 500) {
            backKeyPressedTime = System.currentTimeMillis()
            toast.show()
            return
        }

        if (System.currentTimeMillis() <= backKeyPressedTime + 500) {
            toast.cancel()
            this.finish()
        }
    }

    inner class PagerAdapter(supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager) {

        override fun getItem(position: Int): Fragment? {

            return when (position) {
                0 ->
                    FragmentC2C()
                1 ->
                    MapFragment()
                2 ->
                    FragmentTip()
                3 ->
                    FragmentPlay()
                else ->
                    null
            }
        }

        override fun getCount(): Int = 4
    }
}