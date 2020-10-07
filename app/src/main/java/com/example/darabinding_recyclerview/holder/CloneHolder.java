package com.example.darabinding_recyclerview.holder;

import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import com.example.darabinding_recyclerview.data.Clone;
import com.example.darabinding_recyclerview.databinding.ItemBinding;
import com.example.darabinding_recyclerview.tach.ClickHandler;
import com.example.darabinding_recyclerview.tach.ClickHandlerClass;

public class CloneHolder extends RecyclerView.ViewHolder {

    // implements View.OnClickListener - не работает
    Clone clone;

    public ItemBinding binding;

    public CloneHolder(ItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;

        // первый способ, торабатываем нажатие тут
        binding.setHandler(new ClickHandler() {
            @Override
            public void onClickCheckBox() {
                Log.e(this.getClass().getSimpleName(), " " + new Throwable().getStackTrace()[0].getMethodName() + "  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Log.e("", " " + clone.isSex());
            }
        });

        // метод три, выделенный класс
        binding.setHandlerButton(new ClickHandlerClass());
    }

    // метод связывания конкретный экземпляра списка с элементом отображения
    public void bind(Clone clone) {

        Log.e(this.getClass().getSimpleName(), " " + new Throwable().getStackTrace()[0].getMethodName() + "  " + Thread.currentThread().getName() + " " + System.currentTimeMillis()+" "+clone);

        binding.setClone(clone);
        binding.executePendingBindings();
        this.clone = clone;
    }

//  вариант отработки нажатия 2
//    public ItemBinding getBinding(){
//        return binding;
//    }

    //************************
    // не работает
//    @Override
//    public void onClick(View v) {
//        Log.i("PersonHolder ","onClick"+getLayoutPosition());
//    }
}
