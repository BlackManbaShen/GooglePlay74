package com.example.liang.googleplay74.fragment;

import android.support.v4.app.Fragment;

import java.util.HashMap;

/*
生产fragment的工厂
 */
public class FragmentFactory {
    private static HashMap<Integer,BaseFragment>fragmentHashMap=new HashMap<Integer, BaseFragment>();
    public static BaseFragment createFragment(int pos){
        //先从集合中取，如果没有再创建对象
        BaseFragment fragment=fragmentHashMap.get(pos);
        if (fragment==null ){
            switch (pos){
                case 0:
                    fragment=new HomeFragment();
                    break;
                case 1:
                    fragment=new AppFragment();
                    break;
                case 2:
                    fragment=new GameFragment();
                    break;
                case 3:
                    fragment=new SubjectFragment();
                    break;
                case 4:
                    fragment=new RecommendFragment();
                    break;
                case 5:
                    fragment=new CategoryFragment();
                    break;
                case 6:
                    fragment=new HotFragment() ;
                    break;
            }
        }
        fragmentHashMap.put(pos,fragment);//将fragment保存在集合中
        return fragment;
    }
}