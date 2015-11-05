/*
 * Copyright (C) 2015 Brian Lee (@hiBrianLee)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hibrianlee.sample.mvvm.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hibrianlee.mvvmapp.activity.ViewModelActivity;
import com.hibrianlee.mvvmapp.viewmodel.ViewModel;
import com.hibrianlee.sample.mvvm.R;
import com.hibrianlee.sample.mvvm.viewmodel.MainViewModel;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends ViewModelActivity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Nullable
    @Override
    protected ViewModel createViewModel(@Nullable ViewModel.State savedViewModelState) {
        mainViewModel = new MainViewModel(savedViewModelState);
        return mainViewModel;
    }

    @OnClick(R.id.buttonClicks)
    void onClickButtonClicks() {
        mainViewModel.onClickButtonClicks(this);
    }

    @OnClick(R.id.buttonRecyclerView)
    void onClickButtonRecyclerView() {
        mainViewModel.onClickButtonRecyclerView(this);
    }

    @OnClick(R.id.hiBrianLee)
    void onClickHiBrianLee() {
        mainViewModel.onClickHiBrianLee(this);
    }
}
