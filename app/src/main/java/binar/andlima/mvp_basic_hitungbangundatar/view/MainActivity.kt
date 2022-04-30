package binar.andlima.mvp_basic_hitungbangundatar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import binar.andlima.mvp_basic_hitungbangundatar.R
import binar.andlima.mvp_basic_hitungbangundatar.model.Hasil
import binar.andlima.mvp_basic_hitungbangundatar.presenter.PersegiPanjangPresenter
import binar.andlima.mvp_basic_hitungbangundatar.presenter.PersegiPanjangView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PersegiPanjangView{

    private var presenter : PersegiPanjangPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PersegiPanjangPresenter(this);

        btnHitung.setOnClickListener {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()

            presenter?.hitung(panjang,lebar)
        }
    }

    override fun hasilHitung(hasil: Hasil) {
        Toast.makeText(this, hasil.total.toString(), Toast.LENGTH_LONG).show()
    }
}
