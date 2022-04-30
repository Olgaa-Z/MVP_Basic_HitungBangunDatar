package binar.andlima.mvp_basic_hitungbangundatar.presenter

import binar.andlima.mvp_basic_hitungbangundatar.model.Hasil

class PersegiPanjangPresenter(var pView : PersegiPanjangView) {

    fun hitung(panjang : Int, lebar: Int){

        val totalpp = panjang * lebar

        var hasilhitung = Hasil()
        hasilhitung.total = totalpp

        pView.hasilHitung(hasilhitung)
    }
}