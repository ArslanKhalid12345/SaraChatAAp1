package com.example.firebasechatapp.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.firebasechatapp.Fragments.CallsFragment;
import com.example.firebasechatapp.Fragments.ChatsFragment;
import com.example.firebasechatapp.Fragments.StatsFragment;

public class TabsAccessorAdapter extends FragmentPagerAdapter
{

    public TabsAccessorAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        switch (i)
        {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                StatsFragment groupsFragment = new StatsFragment();
                return groupsFragment;

            case 2:
                CallsFragment callsFragment = new CallsFragment();
                return callsFragment;


            default:
                return null;
        }
    }


    @Override
    public int getCount()
    {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Chats";

            case 1:
                return "Status";

            case 2:
                return "Calls";

            default:
                return null;
        }
    }
}
