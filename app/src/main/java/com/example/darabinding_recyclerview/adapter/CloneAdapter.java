package com.example.darabinding_recyclerview.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darabinding_recyclerview.R;
import com.example.darabinding_recyclerview.data.Clone;
import com.example.darabinding_recyclerview.databinding.ItemBinding;
import com.example.darabinding_recyclerview.holder.CloneHolder;
import com.example.darabinding_recyclerview.tach.ClickHandler;

import java.util.LinkedList;
import java.util.List;

public class CloneAdapter extends RecyclerView.Adapter<CloneHolder> {

    private List<Clone> items = new LinkedList<>();

    public CloneAdapter(List<Clone> items) {
        this.items = items;
    }

    //Создаёт пустую вьюшку,оборачивает её в PersonHolder.
    //Дальше забота по наполнению этой вьюшки ложиться именно на объект Holder'а
    @NonNull
    @Override
    public CloneHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e(this.getClass().getSimpleName(), " " + new Throwable().getStackTrace()[0].getMethodName() + "  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // вместо view используем биндинг
        // View view = layoutInflater.inflate(R.layout.list_item_recyclerview, parent, false);
        ItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.item, parent, false);
        return new CloneHolder(binding);
    }

    //Активирует метод холдера при выводе нового элемента списка на экран,
    //передавая ему актуальный объект модели для разбора и представления
    @Override
    public void onBindViewHolder(CloneHolder holder, int position) {
        Log.e(this.getClass().getSimpleName(), " " + new Throwable().getStackTrace()[0].getMethodName() + "  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        final Clone clone = items.get(position);
        holder.bind(clone);

        //  вариант отработки нажатия 2
//        ItemBinding binding = holder.getBinding();
//        binding.setHandler(new ClickHandler() {
//
//            @Override
//            public void onClickBatton() {
//                Log.e("onBindViewHolder", " onClickBatton ");
//                Log.e("", clone.toString());
//            }
//
//            @Override
//            public void onClickCheckBox() {
//                Log.e("onBindViewHolder", " onClickCheckBox ");
//                Log.e("", " " + clone.isSex());
//            }
//        });
    }

    //Возвращает размер хранилища моделей
    @Override
    public int getItemCount() {
        return items.size();
    }


}
