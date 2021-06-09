package com.example.convidados.service.repository


import android.content.Context
import com.example.convidados.service.model.GuestModel

class GuestRepository (context: Context) {

    // Acesso ao banco de dados
    private val mDataBase = GuestDataBase.getDatabase(context).guestDAO()

    /**
     * Carrega o convidado
     */
    fun get(id: Int): GuestModel {
        return mDataBase.get(id)
    }

    /**
     * Faz a listagem de todos os convidados
     */
    fun getAll(): List<GuestModel> {
        return mDataBase.getInvited()
    }

    /**
     * Faz a listagem de todos os convidados presentes
     */
    fun getPresent(): List<GuestModel> {
        return mDataBase.getPresent()
    }

    /**
     * Faz a listagem de todos os convidados ausentes
     */
    fun getAbsent(): List<GuestModel> {
        return mDataBase.getAbsent()
    }

    /**
     * Insere o convidado
     */
    fun save(guest: GuestModel): Boolean {
        return mDataBase.save(guest) > 0
    }

    /**
     * Atualiza o convidado
     */
    fun update(guest: GuestModel): Boolean {
        return mDataBase.update(guest) > 0
    }

    /**
     * Deleta o convidado
     */
    fun delete(guest: GuestModel){
        return mDataBase.delete(guest)
    }
}