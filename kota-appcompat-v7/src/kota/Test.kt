package kota

import android.app.AlertDialog
import android.content.Context

interface TestBuilder<D> {

    fun create(): D
    fun show(): D
}

class ASD(context: Context) : AlertDialog.Builder(context), TestBuilder<AlertDialog>

class ABuilder(builder: ASD) : TestBuilder<AlertDialog> by builder

